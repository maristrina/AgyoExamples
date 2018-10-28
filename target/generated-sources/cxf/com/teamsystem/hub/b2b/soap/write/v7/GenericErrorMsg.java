
package com.teamsystem.hub.b2b.soap.write.v7;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.1.10
 * 2018-10-28T14:46:12.169+01:00
 * Generated source version: 3.1.10
 */

@WebFault(name = "genericError", targetNamespace = "http://schema.write.b2b.hub.teamsystem.com/v7")
public class GenericErrorMsg extends Exception {
    
    private com.teamsystem.hub.b2b.soap.write.v7.GenericError genericError;

    public GenericErrorMsg() {
        super();
    }
    
    public GenericErrorMsg(String message) {
        super(message);
    }
    
    public GenericErrorMsg(String message, Throwable cause) {
        super(message, cause);
    }

    public GenericErrorMsg(String message, com.teamsystem.hub.b2b.soap.write.v7.GenericError genericError) {
        super(message);
        this.genericError = genericError;
    }

    public GenericErrorMsg(String message, com.teamsystem.hub.b2b.soap.write.v7.GenericError genericError, Throwable cause) {
        super(message, cause);
        this.genericError = genericError;
    }

    public com.teamsystem.hub.b2b.soap.write.v7.GenericError getFaultInfo() {
        return this.genericError;
    }
}
