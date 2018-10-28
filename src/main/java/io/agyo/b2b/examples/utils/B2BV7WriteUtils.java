package io.agyo.b2b.examples.utils;

import com.teamsystem.hub.b2b.soap.write.v7.*;
import it.gov.agenziaentrate.ivaservizi.fatt12.FatturaElettronicaType;

import javax.activation.DataHandler;
import javax.mail.util.ByteArrayDataSource;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.Unmarshaller;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.io.ByteArrayInputStream;
import java.net.URL;

public class B2BV7WriteUtils {
    public static final String b2bWriteLocation = "https://soap-b2bapi-b2bhub-test.agyo.io/B2BWriteApi_v7/B2BWriteApi.ws?wsdl";
    public static final String b2bWriteServiceName = "B2BWriteApi_v7";
    public static final String nameSpaceV5 = "http://b2b.hub.teamsystem.com/v7";

    private B2BWriteApiPortTypeV7 b2b;


    public B2BWriteApiPortTypeV7 getb2bService() throws Exception {
        if (b2b == null) {
            Service service = Service.create(new URL(b2bWriteLocation), new QName(nameSpaceV5, b2bWriteServiceName));
            service.setHandlerResolver(new AgyoWSHandlerResolver());
            b2b = service.getPort(B2BWriteApiPortTypeV7.class);
        }
        return b2b;
    }

    public String uploadFile(String username, String token, String nomeFile, byte[] xml, String flowType) {
        String msg = new String();

        try {
            if (b2b == null)
                b2b = getb2bService();

            FatturaElettronicaType fatt = getFatturaElettronica(xml);

            String transmitter = fatt.getFatturaElettronicaHeader().getDatiTrasmissione().getIdTrasmittente().getIdCodice();
            String sender = fatt.getFatturaElettronicaHeader().getCedentePrestatore().getDatiAnagrafici().getIdFiscaleIVA().getIdCodice();
            String recipient = fatt.getFatturaElettronicaHeader().getCedentePrestatore().getDatiAnagrafici().getCodiceFiscale();
            if (recipient == null && fatt.getFatturaElettronicaHeader().getCessionarioCommittente().getDatiAnagrafici().getIdFiscaleIVA() != null)
                recipient = fatt.getFatturaElettronicaHeader().getCessionarioCommittente().getDatiAnagrafici().getIdFiscaleIVA().getIdCodice();

            XMLGregorianCalendar dataFatt = fatt.getFatturaElettronicaBody().get(0).getDatiGenerali().getDatiGeneraliDocumento().getData();
            String numeroFattura = fatt.getFatturaElettronicaBody().get(0).getDatiGenerali().getDatiGeneraliDocumento().getNumero();


            UploadFiles request = new UploadFiles();

            request.setAuth(new Auth());
            request.getAuth().setAppName("TESTAPI");
            request.getAuth().setId(username);
            request.getAuth().setSecurityToken(token);

            request.setTransmitterId(transmitter);
            Uploads uploads = new Uploads();
            Upload upload = new Upload();
            upload.setSenderId(sender);
            upload.setRecipientId(recipient);
            Files files = new Files();
            File file = new File();
            file.setContent(new DataHandler(new ByteArrayDataSource(xml, "application/octet-stream")));
            file.setDate(dataFatt);
            file.setId(numeroFattura);
            file.setName(nomeFile);

            files.getFile().add(file);
            upload.setFiles(files);
            Flow flow = new Flow();
            flow.setType(flowType);
            upload.setFlow(flow);
            uploads.getUpload().add(upload);
            request.setUploads(uploads);
            b2b.uploadFiles(request);

        } catch (Exception e) {
            e.printStackTrace();
            msg = "Errore di invio file ad AGYO: " + e.getMessage();
        }
        return msg;
    }

    JAXBElement jaxbElement;

    private FatturaElettronicaType getFatturaElettronica(byte[] payload) throws Exception {

        if (jaxbElement == null) {
            JAXBContext jaxbContext = JAXBContext.newInstance("it.gov.agenziaentrate.ivaservizi.fatt12");
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            this.jaxbElement = (JAXBElement) unmarshaller.unmarshal(new ByteArrayInputStream(payload)); // getFileContent()
        }
        return (FatturaElettronicaType) jaxbElement.getValue();
    }


    public static final String act_invio_cct = "CCT_UPLOAD";
    public String sendAction(String username, String token, String action, String hubid, String numeroFattura, String anno, String dataRegistrazione) {
        try {
            if (b2b == null)
                b2b = getb2bService();

            SendAction request = new SendAction();
            request.setAction(action);

            request.setAuth(new Auth());
            request.getAuth().setAppName("TESTAPI");
            request.getAuth().setId(username);
            request.getAuth().setSecurityToken(token);

            request.setHubId(hubid);
            request.setExtraData(new ExtraData());

            //metadati CCT
            request.getExtraData().getEntry().add(newEntry("fatturaRicevuta.numeroRegistrazione", numeroFattura));
            request.getExtraData().getEntry().add(newEntry("fatturaRicevuta.periodoImposta", anno));
            request.getExtraData().getEntry().add(newEntry("fatturaRicevuta.dataRegistrazione", dataRegistrazione));

            SendActionResponse response = b2b.sendAction(request);
            return "invio in CCT: OK";
        } catch (Exception e) {
            e.printStackTrace();
            return "invio in CCT: KO ("+e.getMessage()+")";
        }

    }
    private static Entry newEntry(String name, String value) {
        Entry obj = new Entry();
        obj.setName(name);
        obj.setValue(value);

        return obj;
    }
}
