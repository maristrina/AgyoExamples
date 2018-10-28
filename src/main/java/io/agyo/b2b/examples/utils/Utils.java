package io.agyo.b2b.examples.utils;

import com.sun.org.apache.xerces.internal.jaxp.datatype.XMLGregorianCalendarImpl;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class Utils {
    public static boolean isBlankOrNull(String str) {
        return (str == null || str.trim().length() == 0);
    }

    public static XMLGregorianCalendar getXmlGregorianCalendarFrom(Date data) throws Exception {
        GregorianCalendar cal = new GregorianCalendar();
        cal.setTime(data);
        return DatatypeFactory.newInstance().newXMLGregorianCalendar(cal);
    }

    public static XMLGregorianCalendar getXmlGregorianCalendarFrom(int anno, int mese, int giorno) {
        XMLGregorianCalendar data = new XMLGregorianCalendarImpl();
        data.setYear(anno);
        data.setMonth(mese);
        data.setDay(giorno);
        return data;
    }
    public static XMLGregorianCalendar getXmlGregorianCalendarFrom(String data, String formato) throws Exception {
        Date dob=new SimpleDateFormat(formato).parse(data);
        return getXmlGregorianCalendarFrom(dob);
    }

}
