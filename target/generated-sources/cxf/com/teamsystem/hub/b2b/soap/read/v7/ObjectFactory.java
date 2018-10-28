
package com.teamsystem.hub.b2b.soap.read.v7;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.teamsystem.hub.b2b.soap.read.v7 package. 
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

    private final static QName _HealthResponse_QNAME = new QName("http://schema.read.b2b.hub.teamsystem.com/v7", "health_response");
    private final static QName _ListFilesRequest_QNAME = new QName("http://schema.read.b2b.hub.teamsystem.com/v7", "listFiles_request");
    private final static QName _ListFilesResponse_QNAME = new QName("http://schema.read.b2b.hub.teamsystem.com/v7", "listFiles_response");
    private final static QName _DownloadFilesRequest_QNAME = new QName("http://schema.read.b2b.hub.teamsystem.com/v7", "downloadFiles_request");
    private final static QName _DownloadFilesResponse_QNAME = new QName("http://schema.read.b2b.hub.teamsystem.com/v7", "downloadFiles_response");
    private final static QName _ListChangesFromRequest_QNAME = new QName("http://schema.read.b2b.hub.teamsystem.com/v7", "listChangesFrom_request");
    private final static QName _ListChangesFromResponse_QNAME = new QName("http://schema.read.b2b.hub.teamsystem.com/v7", "listChangesFrom_response");
    private final static QName _GenericError_QNAME = new QName("http://schema.read.b2b.hub.teamsystem.com/v7", "genericError");
    private final static QName _ValidationException_QNAME = new QName("http://schema.read.b2b.hub.teamsystem.com/v7", "validationException");
    private final static QName _AuthenticationException_QNAME = new QName("http://schema.read.b2b.hub.teamsystem.com/v7", "authenticationException");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.teamsystem.hub.b2b.soap.read.v7
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ListFiles }
     * 
     */
    public ListFiles createListFiles() {
        return new ListFiles();
    }

    /**
     * Create an instance of {@link ListFilesResponse }
     * 
     */
    public ListFilesResponse createListFilesResponse() {
        return new ListFilesResponse();
    }

    /**
     * Create an instance of {@link DownloadFiles }
     * 
     */
    public DownloadFiles createDownloadFiles() {
        return new DownloadFiles();
    }

    /**
     * Create an instance of {@link DownloadFilesResponse }
     * 
     */
    public DownloadFilesResponse createDownloadFilesResponse() {
        return new DownloadFilesResponse();
    }

    /**
     * Create an instance of {@link ListChangesFrom }
     * 
     */
    public ListChangesFrom createListChangesFrom() {
        return new ListChangesFrom();
    }

    /**
     * Create an instance of {@link ListChangesFromResponse }
     * 
     */
    public ListChangesFromResponse createListChangesFromResponse() {
        return new ListChangesFromResponse();
    }

    /**
     * Create an instance of {@link GenericError }
     * 
     */
    public GenericError createGenericError() {
        return new GenericError();
    }

    /**
     * Create an instance of {@link ValidationException }
     * 
     */
    public ValidationException createValidationException() {
        return new ValidationException();
    }

    /**
     * Create an instance of {@link AuthenticationException }
     * 
     */
    public AuthenticationException createAuthenticationException() {
        return new AuthenticationException();
    }

    /**
     * Create an instance of {@link Status }
     * 
     */
    public Status createStatus() {
        return new Status();
    }

    /**
     * Create an instance of {@link Identifier }
     * 
     */
    public Identifier createIdentifier() {
        return new Identifier();
    }

    /**
     * Create an instance of {@link Metadata }
     * 
     */
    public Metadata createMetadata() {
        return new Metadata();
    }

    /**
     * Create an instance of {@link StatusList }
     * 
     */
    public StatusList createStatusList() {
        return new StatusList();
    }

    /**
     * Create an instance of {@link MapStatusListItem }
     * 
     */
    public MapStatusListItem createMapStatusListItem() {
        return new MapStatusListItem();
    }

    /**
     * Create an instance of {@link MapStatusList }
     * 
     */
    public MapStatusList createMapStatusList() {
        return new MapStatusList();
    }

    /**
     * Create an instance of {@link Document }
     * 
     */
    public Document createDocument() {
        return new Document();
    }

    /**
     * Create an instance of {@link Documents }
     * 
     */
    public Documents createDocuments() {
        return new Documents();
    }

    /**
     * Create an instance of {@link Pagination }
     * 
     */
    public Pagination createPagination() {
        return new Pagination();
    }

    /**
     * Create an instance of {@link Page }
     * 
     */
    public Page createPage() {
        return new Page();
    }

    /**
     * Create an instance of {@link Filter }
     * 
     */
    public Filter createFilter() {
        return new Filter();
    }

    /**
     * Create an instance of {@link Hash }
     * 
     */
    public Hash createHash() {
        return new Hash();
    }

    /**
     * Create an instance of {@link Auth }
     * 
     */
    public Auth createAuth() {
        return new Auth();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.read.b2b.hub.teamsystem.com/v7", name = "health_response")
    public JAXBElement<String> createHealthResponse(String value) {
        return new JAXBElement<String>(_HealthResponse_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListFiles }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.read.b2b.hub.teamsystem.com/v7", name = "listFiles_request")
    public JAXBElement<ListFiles> createListFilesRequest(ListFiles value) {
        return new JAXBElement<ListFiles>(_ListFilesRequest_QNAME, ListFiles.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListFilesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.read.b2b.hub.teamsystem.com/v7", name = "listFiles_response")
    public JAXBElement<ListFilesResponse> createListFilesResponse(ListFilesResponse value) {
        return new JAXBElement<ListFilesResponse>(_ListFilesResponse_QNAME, ListFilesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DownloadFiles }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.read.b2b.hub.teamsystem.com/v7", name = "downloadFiles_request")
    public JAXBElement<DownloadFiles> createDownloadFilesRequest(DownloadFiles value) {
        return new JAXBElement<DownloadFiles>(_DownloadFilesRequest_QNAME, DownloadFiles.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DownloadFilesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.read.b2b.hub.teamsystem.com/v7", name = "downloadFiles_response")
    public JAXBElement<DownloadFilesResponse> createDownloadFilesResponse(DownloadFilesResponse value) {
        return new JAXBElement<DownloadFilesResponse>(_DownloadFilesResponse_QNAME, DownloadFilesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListChangesFrom }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.read.b2b.hub.teamsystem.com/v7", name = "listChangesFrom_request")
    public JAXBElement<ListChangesFrom> createListChangesFromRequest(ListChangesFrom value) {
        return new JAXBElement<ListChangesFrom>(_ListChangesFromRequest_QNAME, ListChangesFrom.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListChangesFromResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.read.b2b.hub.teamsystem.com/v7", name = "listChangesFrom_response")
    public JAXBElement<ListChangesFromResponse> createListChangesFromResponse(ListChangesFromResponse value) {
        return new JAXBElement<ListChangesFromResponse>(_ListChangesFromResponse_QNAME, ListChangesFromResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenericError }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.read.b2b.hub.teamsystem.com/v7", name = "genericError")
    public JAXBElement<GenericError> createGenericError(GenericError value) {
        return new JAXBElement<GenericError>(_GenericError_QNAME, GenericError.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidationException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.read.b2b.hub.teamsystem.com/v7", name = "validationException")
    public JAXBElement<ValidationException> createValidationException(ValidationException value) {
        return new JAXBElement<ValidationException>(_ValidationException_QNAME, ValidationException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticationException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.read.b2b.hub.teamsystem.com/v7", name = "authenticationException")
    public JAXBElement<AuthenticationException> createAuthenticationException(AuthenticationException value) {
        return new JAXBElement<AuthenticationException>(_AuthenticationException_QNAME, AuthenticationException.class, null, value);
    }

}
