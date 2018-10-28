
package com.mondora.teamsystem.sdi.mock.ws.types;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.mondora.teamsystem.sdi.mock.ws.types package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _DecorrenzaTerminiRequest_QNAME = new QName("http://mondora.com/teamsystem/sdi/mock/ws/types", "decorrenzaTerminiRequest");
    private final static QName _DecorrenzaTerminiResponse_QNAME = new QName("http://mondora.com/teamsystem/sdi/mock/ws/types", "decorrenzaTerminiResponse");
    private final static QName _UploadFattureRequest_QNAME = new QName("http://mondora.com/teamsystem/sdi/mock/ws/types", "uploadFattureRequest");
    private final static QName _UploadFattureResponse_QNAME = new QName("http://mondora.com/teamsystem/sdi/mock/ws/types", "uploadFattureResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.mondora.teamsystem.sdi.mock.ws.types
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DecorrenzaTerminiRequestType }
     * 
     */
    public DecorrenzaTerminiRequestType createDecorrenzaTerminiRequestType() {
        return new DecorrenzaTerminiRequestType();
    }

    /**
     * Create an instance of {@link DecorrenzaTerminiResponseType }
     * 
     */
    public DecorrenzaTerminiResponseType createDecorrenzaTerminiResponseType() {
        return new DecorrenzaTerminiResponseType();
    }

    /**
     * Create an instance of {@link UploadFattureRequestType }
     * 
     */
    public UploadFattureRequestType createUploadFattureRequestType() {
        return new UploadFattureRequestType();
    }

    /**
     * Create an instance of {@link UploadFattureResponseType }
     * 
     */
    public UploadFattureResponseType createUploadFattureResponseType() {
        return new UploadFattureResponseType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DecorrenzaTerminiRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mondora.com/teamsystem/sdi/mock/ws/types", name = "decorrenzaTerminiRequest")
    public JAXBElement<DecorrenzaTerminiRequestType> createDecorrenzaTerminiRequest(DecorrenzaTerminiRequestType value) {
        return new JAXBElement<DecorrenzaTerminiRequestType>(_DecorrenzaTerminiRequest_QNAME, DecorrenzaTerminiRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DecorrenzaTerminiResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mondora.com/teamsystem/sdi/mock/ws/types", name = "decorrenzaTerminiResponse")
    public JAXBElement<DecorrenzaTerminiResponseType> createDecorrenzaTerminiResponse(DecorrenzaTerminiResponseType value) {
        return new JAXBElement<DecorrenzaTerminiResponseType>(_DecorrenzaTerminiResponse_QNAME, DecorrenzaTerminiResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UploadFattureRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mondora.com/teamsystem/sdi/mock/ws/types", name = "uploadFattureRequest")
    public JAXBElement<UploadFattureRequestType> createUploadFattureRequest(UploadFattureRequestType value) {
        return new JAXBElement<UploadFattureRequestType>(_UploadFattureRequest_QNAME, UploadFattureRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UploadFattureResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mondora.com/teamsystem/sdi/mock/ws/types", name = "uploadFattureResponse")
    public JAXBElement<UploadFattureResponseType> createUploadFattureResponse(UploadFattureResponseType value) {
        return new JAXBElement<UploadFattureResponseType>(_UploadFattureResponse_QNAME, UploadFattureResponseType.class, null, value);
    }

}
