
package com.teamsystem.hub.auth.soap.v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.teamsystem.hub.auth.soap.v1 package. 
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

    private final static QName _HealthResponse_QNAME = new QName("http://schema.auth.hub.teamsystem.com/v1", "health_response");
    private final static QName _GetNonceRequest_QNAME = new QName("http://schema.auth.hub.teamsystem.com/v1", "getNonce_request");
    private final static QName _GetNonceResponse_QNAME = new QName("http://schema.auth.hub.teamsystem.com/v1", "getNonce_response");
    private final static QName _VerifyDigestRequest_QNAME = new QName("http://schema.auth.hub.teamsystem.com/v1", "verifyDigest_request");
    private final static QName _VerifyDigestResponse_QNAME = new QName("http://schema.auth.hub.teamsystem.com/v1", "verifyDigest_response");
    private final static QName _VerifyTokenRequest_QNAME = new QName("http://schema.auth.hub.teamsystem.com/v1", "verifyToken_request");
    private final static QName _VerifyTokenResponse_QNAME = new QName("http://schema.auth.hub.teamsystem.com/v1", "verifyToken_response");
    private final static QName _AuthenticationException_QNAME = new QName("http://schema.auth.hub.teamsystem.com/v1", "authenticationException");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.teamsystem.hub.auth.soap.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetNonce }
     * 
     */
    public GetNonce createGetNonce() {
        return new GetNonce();
    }

    /**
     * Create an instance of {@link GetNonceResponse }
     * 
     */
    public GetNonceResponse createGetNonceResponse() {
        return new GetNonceResponse();
    }

    /**
     * Create an instance of {@link VerifyDigest }
     * 
     */
    public VerifyDigest createVerifyDigest() {
        return new VerifyDigest();
    }

    /**
     * Create an instance of {@link VerifyDigestResponse }
     * 
     */
    public VerifyDigestResponse createVerifyDigestResponse() {
        return new VerifyDigestResponse();
    }

    /**
     * Create an instance of {@link VerifyToken }
     * 
     */
    public VerifyToken createVerifyToken() {
        return new VerifyToken();
    }

    /**
     * Create an instance of {@link VerifyTokenResponse }
     * 
     */
    public VerifyTokenResponse createVerifyTokenResponse() {
        return new VerifyTokenResponse();
    }

    /**
     * Create an instance of {@link AuthenticationException }
     * 
     */
    public AuthenticationException createAuthenticationException() {
        return new AuthenticationException();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.auth.hub.teamsystem.com/v1", name = "health_response")
    public JAXBElement<String> createHealthResponse(String value) {
        return new JAXBElement<String>(_HealthResponse_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNonce }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.auth.hub.teamsystem.com/v1", name = "getNonce_request")
    public JAXBElement<GetNonce> createGetNonceRequest(GetNonce value) {
        return new JAXBElement<GetNonce>(_GetNonceRequest_QNAME, GetNonce.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNonceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.auth.hub.teamsystem.com/v1", name = "getNonce_response")
    public JAXBElement<GetNonceResponse> createGetNonceResponse(GetNonceResponse value) {
        return new JAXBElement<GetNonceResponse>(_GetNonceResponse_QNAME, GetNonceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerifyDigest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.auth.hub.teamsystem.com/v1", name = "verifyDigest_request")
    public JAXBElement<VerifyDigest> createVerifyDigestRequest(VerifyDigest value) {
        return new JAXBElement<VerifyDigest>(_VerifyDigestRequest_QNAME, VerifyDigest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerifyDigestResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.auth.hub.teamsystem.com/v1", name = "verifyDigest_response")
    public JAXBElement<VerifyDigestResponse> createVerifyDigestResponse(VerifyDigestResponse value) {
        return new JAXBElement<VerifyDigestResponse>(_VerifyDigestResponse_QNAME, VerifyDigestResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerifyToken }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.auth.hub.teamsystem.com/v1", name = "verifyToken_request")
    public JAXBElement<VerifyToken> createVerifyTokenRequest(VerifyToken value) {
        return new JAXBElement<VerifyToken>(_VerifyTokenRequest_QNAME, VerifyToken.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerifyTokenResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.auth.hub.teamsystem.com/v1", name = "verifyToken_response")
    public JAXBElement<VerifyTokenResponse> createVerifyTokenResponse(VerifyTokenResponse value) {
        return new JAXBElement<VerifyTokenResponse>(_VerifyTokenResponse_QNAME, VerifyTokenResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticationException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.auth.hub.teamsystem.com/v1", name = "authenticationException")
    public JAXBElement<AuthenticationException> createAuthenticationException(AuthenticationException value) {
        return new JAXBElement<AuthenticationException>(_AuthenticationException_QNAME, AuthenticationException.class, null, value);
    }

}
