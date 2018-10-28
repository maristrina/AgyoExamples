package io.agyo.b2b.examples.utils;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPMessage;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;
import java.io.ByteArrayOutputStream;
import java.util.Set;


public class AgyoWSSoapHandler<T> implements SOAPHandler<SOAPMessageContext> {

    public boolean handleFault(SOAPMessageContext arg0) {
        SOAPMessage message = arg0.getMessage();
        try {
        	String xml = getMessageAsFormattedString(message);
        	
//       		log.debug("FAULT MESSAGE\n<pre>\n"+new EscapeTool().xml(xml)+"\n</pre>");
       		System.out.println("FAULT MESSAGE\n"+xml+"\n");
        	
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }
 
    public boolean handleMessage(SOAPMessageContext arg0) {
         SOAPMessage message = arg0.getMessage();
         StringBuffer out = new StringBuffer();
        try {
            boolean isOut = (Boolean) arg0.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
            
            String xml = getMessageAsFormattedString(message);
            
           	out.append(isOut?"OUTBOUND MESSAGE (request) \n":"INBOUND MESSAGE (response) \n");
//            out.append("<pre>\n").append(new EscapeTool().xml(xml)).append("\n</pre>");
            out.append("\n").append(xml).append("\n");

            System.out.println(out.toString());

        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }
 
    private String getMessageAsFormattedString(SOAPMessage message) throws Exception {
        Transformer tf = TransformerFactory.newInstance().newTransformer();
        tf.setOutputProperty(OutputKeys.INDENT, "yes");
        tf.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");

        Source sc = message.getSOAPPart().getContent();

        ByteArrayOutputStream streamOut = new ByteArrayOutputStream();
        StreamResult result = new StreamResult(streamOut);
        tf.transform(sc, result);
        String xml = streamOut.toString();
        return xml;
    }
    
    public Set<QName> getHeaders() {
        return null;
    }

    public void close(MessageContext arg0) {
    }
 
}