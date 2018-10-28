package io.agyo.b2b.examples.utils;

import com.teamsystem.hub.b2b.soap.read.v7.*;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.URL;
import java.util.List;

public class B2BV7ReadUtils {
    public static final String b2bReadLocation = "https://soap-b2bapi-b2bhub-test.agyo.io/B2BReadApi_v7/B2BReadApi.ws?wsdl";
    public static final String b2bReadServiceName = "B2BReadApi_v7";
    public static final String nameSpaceV5 = "http://b2b.hub.teamsystem.com/v7";

    private B2BReadApiPortTypeV7 b2b;


    public B2BReadApiPortTypeV7 getb2bReadService() throws Exception {
        if (b2b == null) {
            Service service = Service.create(new URL(b2bReadLocation), new QName(nameSpaceV5, b2bReadServiceName));
            service.setHandlerResolver(new AgyoWSHandlerResolver());
            b2b = service.getPort(B2BReadApiPortTypeV7.class);
        }
        return b2b;
    }

    public List<Document> listFiles(String username, String token, String trasmitter, String sender, String recipient, String status, String instradamento, String hubid) {

        try {
            if (b2b == null)
                b2b = getb2bReadService();

            String msg = new String();

            ListFiles request = new ListFiles();
            request.setAuth(new Auth());
            request.getAuth().setAppName("TESTAPI");
            request.getAuth().setId(username);
            request.getAuth().setSecurityToken(token);

            request.setFilter(new Filter());
            if (!Utils.isBlankOrNull(recipient)) request.getFilter().getRecipientIds().add(recipient);
            if (!Utils.isBlankOrNull(trasmitter)) request.getFilter().setTransmitterId(trasmitter);
            if (!Utils.isBlankOrNull(sender)) request.getFilter().getSenderIds().add(sender);
            if (!Utils.isBlankOrNull(status)) request.getFilter().setStatusName(status);
            if (!Utils.isBlankOrNull(instradamento)) request.getFilter().setFlowType(instradamento);
            if (!Utils.isBlankOrNull(hubid)) {
                Identifier id = new Identifier();
                id.setHubId(hubid);
                request.getFilter().getIdentifiers().add(id);
            }
            request.setPagination(new Pagination());
            request.getPagination().setPage(0);
            request.getPagination().setSize(100);

            ListFilesResponse response = b2b.listFiles(request);
            return response.getDocuments().getDocument();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<Document> downloadFile(String username, String token, String trasmitter, String sender, String recipient, String hubid) {

        try {
            if (b2b == null)
                b2b = getb2bReadService();

            String msg = new String();

            DownloadFiles request = new DownloadFiles();
            request.setAuth(new Auth());
            request.getAuth().setAppName("TESTAPI");
            request.getAuth().setId(username);
            request.getAuth().setSecurityToken(token);

            request.setFilter(new Filter());
            if (!Utils.isBlankOrNull(recipient)) request.getFilter().getRecipientIds().add(recipient);
            if (!Utils.isBlankOrNull(trasmitter)) request.getFilter().setTransmitterId(trasmitter);
            if (!Utils.isBlankOrNull(sender)) request.getFilter().getSenderIds().add(sender);
            if (!Utils.isBlankOrNull(hubid)) {
                Identifier id = new Identifier();
                id.setHubId(hubid);
                request.getFilter().getIdentifiers().add(id);
            }
            request.setPagination(new Pagination());
            request.getPagination().setPage(0);
            request.getPagination().setSize(100);

            DownloadFilesResponse response = b2b.downloadFiles(request);
            return response.getDocuments().getDocument();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
