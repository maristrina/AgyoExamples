package io.agyo.b2b.examples.test;

import io.agyo.b2b.examples.ApiSoap;
import org.junit.Ignore;
import org.junit.Test;

//@Ignore
public class AgyoB2BApiTest {
    String userid = "xxx";
    String password = "xxx";

    @Test
    public void listFiles() throws Exception {
        new ApiSoap(userid, password).listFilesStatus("A_DISPOSIZIONE");
        new ApiSoap(userid, password).listFilesRecipient("0000000");
        new ApiSoap(userid, password).listFilesHubid("xxx-xxx-xxx");
        new ApiSoap(userid, password).listFilesSender("01234567890");
    }

    @Test
    public void auth() throws Exception {
        new ApiSoap(userid, password).auth();
    }

    @Test
    public void sendFatturaCCT() throws Exception {
        new ApiSoap(userid, password).sendAction();
    }

    @Test
    public void upload() throws Exception {
        new ApiSoap(userid, password).upload();
    }

    @Test
    public void download() throws Exception {
        new ApiSoap(userid, password).downloadFile("xxx-xxx-xxx");
    }

}
