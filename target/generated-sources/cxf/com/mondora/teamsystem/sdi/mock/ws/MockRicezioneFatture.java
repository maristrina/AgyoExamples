package com.mondora.teamsystem.sdi.mock.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.1.10
 * 2018-10-28T14:46:12.921+01:00
 * Generated source version: 3.1.10
 * 
 */
@WebService(targetNamespace = "http://mondora.com/teamsystem/sdi/mock/ws", name = "MockRicezioneFatture")
@XmlSeeAlso({com.mondora.teamsystem.sdi.mock.ws.types.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface MockRicezioneFatture {

    @WebMethod(operationName = "DecorrenzaTermini", action = "http://mondora.com/teamsystem/sdi/MockRicezioneFatture/DecorrenzaTermini")
    @WebResult(name = "decorrenzaTerminiResponse", targetNamespace = "http://mondora.com/teamsystem/sdi/mock/ws/types", partName = "parametersOut")
    public com.mondora.teamsystem.sdi.mock.ws.types.DecorrenzaTerminiResponseType decorrenzaTermini(
        @WebParam(partName = "parametersNotifica", name = "decorrenzaTerminiRequest", targetNamespace = "http://mondora.com/teamsystem/sdi/mock/ws/types")
        com.mondora.teamsystem.sdi.mock.ws.types.DecorrenzaTerminiRequestType parametersNotifica
    );

    @WebMethod(operationName = "UploadFatture", action = "http://mondora.com/sdi/MockRicezioneFatture/UploadFatture")
    @WebResult(name = "uploadFattureResponse", targetNamespace = "http://mondora.com/teamsystem/sdi/mock/ws/types", partName = "parametersOut")
    public com.mondora.teamsystem.sdi.mock.ws.types.UploadFattureResponseType uploadFatture(
        @WebParam(partName = "parametersIn", name = "uploadFattureRequest", targetNamespace = "http://mondora.com/teamsystem/sdi/mock/ws/types")
        com.mondora.teamsystem.sdi.mock.ws.types.UploadFattureRequestType parametersIn
    );
}