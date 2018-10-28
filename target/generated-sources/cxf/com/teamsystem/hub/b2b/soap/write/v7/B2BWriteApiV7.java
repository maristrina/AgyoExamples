package com.teamsystem.hub.b2b.soap.write.v7;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.10
 * 2018-10-28T14:46:12.186+01:00
 * Generated source version: 3.1.10
 * 
 */
@WebServiceClient(name = "B2BWriteApi_v7", 
                  wsdlLocation = "classpath:wsdl/B2BWriteApiV7.wsdl",
                  targetNamespace = "http://b2b.hub.teamsystem.com/v7") 
public class B2BWriteApiV7 extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://b2b.hub.teamsystem.com/v7", "B2BWriteApi_v7");
    public final static QName B2BWriteApiPortTypeV7 = new QName("http://b2b.hub.teamsystem.com/v7", "B2BWriteApiPortType_v7");
    static {
        URL url = B2BWriteApiV7.class.getClassLoader().getResource("wsdl/B2BWriteApiV7.wsdl");
        if (url == null) {
            java.util.logging.Logger.getLogger(B2BWriteApiV7.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "classpath:wsdl/B2BWriteApiV7.wsdl");
        }       
        WSDL_LOCATION = url;   
    }

    public B2BWriteApiV7(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public B2BWriteApiV7(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public B2BWriteApiV7() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public B2BWriteApiV7(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public B2BWriteApiV7(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public B2BWriteApiV7(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns B2BWriteApiPortTypeV7
     */
    @WebEndpoint(name = "B2BWriteApiPortType_v7")
    public B2BWriteApiPortTypeV7 getB2BWriteApiPortTypeV7() {
        return super.getPort(B2BWriteApiPortTypeV7, B2BWriteApiPortTypeV7.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns B2BWriteApiPortTypeV7
     */
    @WebEndpoint(name = "B2BWriteApiPortType_v7")
    public B2BWriteApiPortTypeV7 getB2BWriteApiPortTypeV7(WebServiceFeature... features) {
        return super.getPort(B2BWriteApiPortTypeV7, B2BWriteApiPortTypeV7.class, features);
    }

}
