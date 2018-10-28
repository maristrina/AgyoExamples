package io.agyo.b2b.examples;

import com.teamsystem.hub.b2b.soap.read.v7.Document;
import io.agyo.b2b.examples.utils.AuthUtils;
import io.agyo.b2b.examples.utils.B2BV7ReadUtils;
import io.agyo.b2b.examples.utils.B2BV7WriteUtils;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ApiSoap {

    private String userid;
    private String password;

    public ApiSoap(String userid, String password) {
        this.userid = userid;
        this.password = password;
    }

    /**
     * lista fatture per stato
     * @param status
     * @throws Exception
     */
    public void listFilesStatus(String status) throws Exception {
        String token = AuthUtils.getToken(userid, password);
        List<Document> documenti = new B2BV7ReadUtils().listFiles(userid, token, "", "", "", status, "", "");
        System.out.println(writeOutput(documenti));
    }

    /**
     * lista fatture per recipientId (destinatario)
     * @param recipient destinatario
     * @throws Exception
     */
    public void listFilesRecipient(String recipient) throws Exception {
        String token = AuthUtils.getToken(userid, password);
        List<Document> documenti = new B2BV7ReadUtils().listFiles(userid, token, "", "", recipient, "", "", "");
        System.out.println(writeOutput(documenti));
    }

    /**
     * lista fatture per HubId (singola fattura)
     * @param hubid     identificativo Agyo fattura
     * @throws Exception
     */
    public void listFilesHubid(String hubid) throws Exception {
        String token = AuthUtils.getToken(userid, password);
        List<Document> documenti = new B2BV7ReadUtils().listFiles(userid, token, "", "", "", "", "", hubid);
        System.out.println(writeOutput(documenti));
    }

    /**
     * lista fatture per SenderId (CF Intestatario fattura su Agyo)
     * @param sender    CF azienda intestataria fattura
     * @throws Exception
     */
    public void listFilesSender(String sender) throws Exception {
        String token = AuthUtils.getToken(userid, password);
        List<Document> documenti = new B2BV7ReadUtils().listFiles(userid, token, "", sender, "", "", "", "");
        System.out.println(writeOutput(documenti));
    }

    /**
     * download fattura per hubid (singola fattura)
     * @param hubid     identificativo Agyo fattura da scaricare
     * @throws Exception
     */
    public void downloadFile(String hubid) throws Exception {
        String token = AuthUtils.getToken(userid, password);
        List<Document> documenti = new B2BV7ReadUtils().downloadFile(userid, token, "", "", "", hubid);
        System.out.println(writeOutput(documenti));
    }

    private String writeOutput(List<Document> documenti) throws Exception {
        String msg = "Recuperati " + documenti.size() + " documenti;\n";
        for (Document doc : documenti) {
            msg += "Name: " + doc.getMetadata().getName();
            msg += " - Recipient: " + doc.getRecipientId();
            msg += " - Sender: " + doc.getSenderId();
            msg += " - Transmitter: " + doc.getTransmitterId();
            msg += " - hubid: " + doc.getIdentifier().getHubId();
            msg += " - flowType: " + doc.getFlowType();
            msg += " - stato: " + doc.getStatus().getItem();
            msg += "\n";
        }
        return msg;
    }

    /**
     * Autenticazione e recupero token
     * @throws Exception
     */
    public void auth() throws Exception {
        String token = AuthUtils.getToken(userid, password);
        System.out.println("Token ottenuto: " + token);
    }

    /**
     * Invio a CCT di una fattura da un hubId
     * @throws Exception
     */
    public void sendAction() throws Exception {
        String hubid = "xxxx"; // hubid della fattura da inviare a CCT
        String token = AuthUtils.getToken(userid, password);
        String msg = new B2BV7WriteUtils().sendAction(userid, token, B2BV7WriteUtils.act_invio_cct, hubid, "V4-333", "2018", "20180101");

        System.out.println(msg);
    }

    /**
     * Invio fattura ad Agyo
     * @throws Exception
     */
    public void upload() throws Exception {
        String token = AuthUtils.getToken(userid, password);
        B2BV7WriteUtils service = new B2BV7WriteUtils();
        String nomeFile = "IT01234567890_FPA01.xml";
        Path resPath = Paths.get(this.getClass().getResource("/" + nomeFile).toURI());
        service.uploadFile(userid, token, nomeFile, Files.readAllBytes(resPath), "SDIPA");
    }

}