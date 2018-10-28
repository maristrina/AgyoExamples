package io.agyo.b2b.examples.utils;

import javax.xml.ws.handler.Handler;
import javax.xml.ws.handler.HandlerResolver;
import javax.xml.ws.handler.PortInfo;
import javax.xml.ws.handler.soap.SOAPMessageContext;
import java.util.ArrayList;
import java.util.List;

public class AgyoWSHandlerResolver implements HandlerResolver {
 
    public List<Handler> getHandlerChain(PortInfo arg0) {
        List<Handler> hchain = new ArrayList<Handler>();
        hchain.add(new AgyoWSSoapHandler<SOAPMessageContext>());
        return hchain;
    }
 
}
