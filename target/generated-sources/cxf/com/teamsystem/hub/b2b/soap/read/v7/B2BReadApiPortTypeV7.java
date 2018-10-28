package com.teamsystem.hub.b2b.soap.read.v7;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.1.10
 * 2018-10-28T14:46:11.670+01:00
 * Generated source version: 3.1.10
 * 
 */
@WebService(targetNamespace = "http://b2b.hub.teamsystem.com/v7", name = "B2BReadApiPortType_v7")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface B2BReadApiPortTypeV7 {

    @WebMethod
    @WebResult(name = "listFiles_response", targetNamespace = "http://schema.read.b2b.hub.teamsystem.com/v7", partName = "parameters")
    public ListFilesResponse listFiles(
        @WebParam(partName = "parameters", name = "listFiles_request", targetNamespace = "http://schema.read.b2b.hub.teamsystem.com/v7")
        ListFiles parameters
    ) throws AuthenticationExceptionMsg, ValidationExceptionMsg, GenericErrorMsg;

    @WebMethod
    @WebResult(name = "downloadFiles_response", targetNamespace = "http://schema.read.b2b.hub.teamsystem.com/v7", partName = "parameters")
    public DownloadFilesResponse downloadFiles(
        @WebParam(partName = "parameters", name = "downloadFiles_request", targetNamespace = "http://schema.read.b2b.hub.teamsystem.com/v7")
        DownloadFiles parameters
    ) throws AuthenticationExceptionMsg, ValidationExceptionMsg, GenericErrorMsg;

    @WebMethod
    @WebResult(name = "health_response", targetNamespace = "http://schema.read.b2b.hub.teamsystem.com/v7", partName = "parameters")
    public java.lang.String health();

    @WebMethod
    @WebResult(name = "listChangesFrom_response", targetNamespace = "http://schema.read.b2b.hub.teamsystem.com/v7", partName = "parameters")
    public ListChangesFromResponse listChangesFrom(
        @WebParam(partName = "parameters", name = "listChangesFrom_request", targetNamespace = "http://schema.read.b2b.hub.teamsystem.com/v7")
        ListChangesFrom parameters
    ) throws AuthenticationExceptionMsg, ValidationExceptionMsg, GenericErrorMsg;
}
