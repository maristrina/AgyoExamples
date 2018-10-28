
package com.teamsystem.hub.b2b.soap.write.v7;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.teamsystem.hub.b2b.soap.write.v7 package. 
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

    private final static QName _HealthResponse_QNAME = new QName("http://schema.write.b2b.hub.teamsystem.com/v7", "health_response");
    private final static QName _AcceptFilesRequest_QNAME = new QName("http://schema.write.b2b.hub.teamsystem.com/v7", "acceptFiles_request");
    private final static QName _AcceptFilesResponse_QNAME = new QName("http://schema.write.b2b.hub.teamsystem.com/v7", "acceptFiles_response");
    private final static QName _ConfirmDownloadsRequest_QNAME = new QName("http://schema.write.b2b.hub.teamsystem.com/v7", "confirmDownloads_request");
    private final static QName _ConfirmDownloadsResponse_QNAME = new QName("http://schema.write.b2b.hub.teamsystem.com/v7", "confirmDownloads_response");
    private final static QName _RejectFilesRequest_QNAME = new QName("http://schema.write.b2b.hub.teamsystem.com/v7", "rejectFiles_request");
    private final static QName _RejectFilesResponse_QNAME = new QName("http://schema.write.b2b.hub.teamsystem.com/v7", "rejectFiles_response");
    private final static QName _ShareFileRequest_QNAME = new QName("http://schema.write.b2b.hub.teamsystem.com/v7", "shareFile_request");
    private final static QName _ShareFileResponse_QNAME = new QName("http://schema.write.b2b.hub.teamsystem.com/v7", "shareFile_response");
    private final static QName _SendActionRequest_QNAME = new QName("http://schema.write.b2b.hub.teamsystem.com/v7", "sendAction_request");
    private final static QName _SendActionResponse_QNAME = new QName("http://schema.write.b2b.hub.teamsystem.com/v7", "sendAction_response");
    private final static QName _UploadFilesRequest_QNAME = new QName("http://schema.write.b2b.hub.teamsystem.com/v7", "uploadFiles_request");
    private final static QName _UploadFilesResponse_QNAME = new QName("http://schema.write.b2b.hub.teamsystem.com/v7", "uploadFiles_response");
    private final static QName _GenericError_QNAME = new QName("http://schema.write.b2b.hub.teamsystem.com/v7", "genericError");
    private final static QName _ValidationException_QNAME = new QName("http://schema.write.b2b.hub.teamsystem.com/v7", "validationException");
    private final static QName _AuthenticationException_QNAME = new QName("http://schema.write.b2b.hub.teamsystem.com/v7", "authenticationException");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.teamsystem.hub.b2b.soap.write.v7
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AcceptFiles }
     * 
     */
    public AcceptFiles createAcceptFiles() {
        return new AcceptFiles();
    }

    /**
     * Create an instance of {@link AcceptFilesResponse }
     * 
     */
    public AcceptFilesResponse createAcceptFilesResponse() {
        return new AcceptFilesResponse();
    }

    /**
     * Create an instance of {@link ConfirmDownloads }
     * 
     */
    public ConfirmDownloads createConfirmDownloads() {
        return new ConfirmDownloads();
    }

    /**
     * Create an instance of {@link ConfirmDownloadsResponse }
     * 
     */
    public ConfirmDownloadsResponse createConfirmDownloadsResponse() {
        return new ConfirmDownloadsResponse();
    }

    /**
     * Create an instance of {@link RejectFiles }
     * 
     */
    public RejectFiles createRejectFiles() {
        return new RejectFiles();
    }

    /**
     * Create an instance of {@link RejectFilesResponse }
     * 
     */
    public RejectFilesResponse createRejectFilesResponse() {
        return new RejectFilesResponse();
    }

    /**
     * Create an instance of {@link ShareFile }
     * 
     */
    public ShareFile createShareFile() {
        return new ShareFile();
    }

    /**
     * Create an instance of {@link ShareFileResponse }
     * 
     */
    public ShareFileResponse createShareFileResponse() {
        return new ShareFileResponse();
    }

    /**
     * Create an instance of {@link SendAction }
     * 
     */
    public SendAction createSendAction() {
        return new SendAction();
    }

    /**
     * Create an instance of {@link SendActionResponse }
     * 
     */
    public SendActionResponse createSendActionResponse() {
        return new SendActionResponse();
    }

    /**
     * Create an instance of {@link UploadFiles }
     * 
     */
    public UploadFiles createUploadFiles() {
        return new UploadFiles();
    }

    /**
     * Create an instance of {@link UploadFilesResponse }
     * 
     */
    public UploadFilesResponse createUploadFilesResponse() {
        return new UploadFilesResponse();
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
     * Create an instance of {@link Auth }
     * 
     */
    public Auth createAuth() {
        return new Auth();
    }

    /**
     * Create an instance of {@link Entry }
     * 
     */
    public Entry createEntry() {
        return new Entry();
    }

    /**
     * Create an instance of {@link ExtraData }
     * 
     */
    public ExtraData createExtraData() {
        return new ExtraData();
    }

    /**
     * Create an instance of {@link HubIds }
     * 
     */
    public HubIds createHubIds() {
        return new HubIds();
    }

    /**
     * Create an instance of {@link Reason }
     * 
     */
    public Reason createReason() {
        return new Reason();
    }

    /**
     * Create an instance of {@link Reasons }
     * 
     */
    public Reasons createReasons() {
        return new Reasons();
    }

    /**
     * Create an instance of {@link Attachment }
     * 
     */
    public Attachment createAttachment() {
        return new Attachment();
    }

    /**
     * Create an instance of {@link Attachments }
     * 
     */
    public Attachments createAttachments() {
        return new Attachments();
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
     * Create an instance of {@link ExtStatus }
     * 
     */
    public ExtStatus createExtStatus() {
        return new ExtStatus();
    }

    /**
     * Create an instance of {@link File }
     * 
     */
    public File createFile() {
        return new File();
    }

    /**
     * Create an instance of {@link Files }
     * 
     */
    public Files createFiles() {
        return new Files();
    }

    /**
     * Create an instance of {@link Flow }
     * 
     */
    public Flow createFlow() {
        return new Flow();
    }

    /**
     * Create an instance of {@link Hash }
     * 
     */
    public Hash createHash() {
        return new Hash();
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
     * Create an instance of {@link Status }
     * 
     */
    public Status createStatus() {
        return new Status();
    }

    /**
     * Create an instance of {@link Upload }
     * 
     */
    public Upload createUpload() {
        return new Upload();
    }

    /**
     * Create an instance of {@link Uploads }
     * 
     */
    public Uploads createUploads() {
        return new Uploads();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.write.b2b.hub.teamsystem.com/v7", name = "health_response")
    public JAXBElement<String> createHealthResponse(String value) {
        return new JAXBElement<String>(_HealthResponse_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcceptFiles }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.write.b2b.hub.teamsystem.com/v7", name = "acceptFiles_request")
    public JAXBElement<AcceptFiles> createAcceptFilesRequest(AcceptFiles value) {
        return new JAXBElement<AcceptFiles>(_AcceptFilesRequest_QNAME, AcceptFiles.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcceptFilesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.write.b2b.hub.teamsystem.com/v7", name = "acceptFiles_response")
    public JAXBElement<AcceptFilesResponse> createAcceptFilesResponse(AcceptFilesResponse value) {
        return new JAXBElement<AcceptFilesResponse>(_AcceptFilesResponse_QNAME, AcceptFilesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConfirmDownloads }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.write.b2b.hub.teamsystem.com/v7", name = "confirmDownloads_request")
    public JAXBElement<ConfirmDownloads> createConfirmDownloadsRequest(ConfirmDownloads value) {
        return new JAXBElement<ConfirmDownloads>(_ConfirmDownloadsRequest_QNAME, ConfirmDownloads.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConfirmDownloadsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.write.b2b.hub.teamsystem.com/v7", name = "confirmDownloads_response")
    public JAXBElement<ConfirmDownloadsResponse> createConfirmDownloadsResponse(ConfirmDownloadsResponse value) {
        return new JAXBElement<ConfirmDownloadsResponse>(_ConfirmDownloadsResponse_QNAME, ConfirmDownloadsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RejectFiles }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.write.b2b.hub.teamsystem.com/v7", name = "rejectFiles_request")
    public JAXBElement<RejectFiles> createRejectFilesRequest(RejectFiles value) {
        return new JAXBElement<RejectFiles>(_RejectFilesRequest_QNAME, RejectFiles.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RejectFilesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.write.b2b.hub.teamsystem.com/v7", name = "rejectFiles_response")
    public JAXBElement<RejectFilesResponse> createRejectFilesResponse(RejectFilesResponse value) {
        return new JAXBElement<RejectFilesResponse>(_RejectFilesResponse_QNAME, RejectFilesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShareFile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.write.b2b.hub.teamsystem.com/v7", name = "shareFile_request")
    public JAXBElement<ShareFile> createShareFileRequest(ShareFile value) {
        return new JAXBElement<ShareFile>(_ShareFileRequest_QNAME, ShareFile.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShareFileResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.write.b2b.hub.teamsystem.com/v7", name = "shareFile_response")
    public JAXBElement<ShareFileResponse> createShareFileResponse(ShareFileResponse value) {
        return new JAXBElement<ShareFileResponse>(_ShareFileResponse_QNAME, ShareFileResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendAction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.write.b2b.hub.teamsystem.com/v7", name = "sendAction_request")
    public JAXBElement<SendAction> createSendActionRequest(SendAction value) {
        return new JAXBElement<SendAction>(_SendActionRequest_QNAME, SendAction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendActionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.write.b2b.hub.teamsystem.com/v7", name = "sendAction_response")
    public JAXBElement<SendActionResponse> createSendActionResponse(SendActionResponse value) {
        return new JAXBElement<SendActionResponse>(_SendActionResponse_QNAME, SendActionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UploadFiles }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.write.b2b.hub.teamsystem.com/v7", name = "uploadFiles_request")
    public JAXBElement<UploadFiles> createUploadFilesRequest(UploadFiles value) {
        return new JAXBElement<UploadFiles>(_UploadFilesRequest_QNAME, UploadFiles.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UploadFilesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.write.b2b.hub.teamsystem.com/v7", name = "uploadFiles_response")
    public JAXBElement<UploadFilesResponse> createUploadFilesResponse(UploadFilesResponse value) {
        return new JAXBElement<UploadFilesResponse>(_UploadFilesResponse_QNAME, UploadFilesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenericError }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.write.b2b.hub.teamsystem.com/v7", name = "genericError")
    public JAXBElement<GenericError> createGenericError(GenericError value) {
        return new JAXBElement<GenericError>(_GenericError_QNAME, GenericError.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidationException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.write.b2b.hub.teamsystem.com/v7", name = "validationException")
    public JAXBElement<ValidationException> createValidationException(ValidationException value) {
        return new JAXBElement<ValidationException>(_ValidationException_QNAME, ValidationException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticationException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.write.b2b.hub.teamsystem.com/v7", name = "authenticationException")
    public JAXBElement<AuthenticationException> createAuthenticationException(AuthenticationException value) {
        return new JAXBElement<AuthenticationException>(_AuthenticationException_QNAME, AuthenticationException.class, null, value);
    }

}
