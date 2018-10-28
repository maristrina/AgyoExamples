
package com.teamsystem.hub.b2b.soap.write.v7;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per AcceptFiles complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="AcceptFiles"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="auth" type="{http://schema.write.b2b.hub.teamsystem.com/v7}Auth"/&gt;
 *         &lt;element name="reasons" type="{http://schema.write.b2b.hub.teamsystem.com/v7}Reasons"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcceptFiles", propOrder = {
    "auth",
    "reasons"
})
public class AcceptFiles {

    @XmlElement(required = true)
    protected Auth auth;
    @XmlElement(required = true)
    protected Reasons reasons;

    /**
     * Recupera il valore della proprietà auth.
     * 
     * @return
     *     possible object is
     *     {@link Auth }
     *     
     */
    public Auth getAuth() {
        return auth;
    }

    /**
     * Imposta il valore della proprietà auth.
     * 
     * @param value
     *     allowed object is
     *     {@link Auth }
     *     
     */
    public void setAuth(Auth value) {
        this.auth = value;
    }

    /**
     * Recupera il valore della proprietà reasons.
     * 
     * @return
     *     possible object is
     *     {@link Reasons }
     *     
     */
    public Reasons getReasons() {
        return reasons;
    }

    /**
     * Imposta il valore della proprietà reasons.
     * 
     * @param value
     *     allowed object is
     *     {@link Reasons }
     *     
     */
    public void setReasons(Reasons value) {
        this.reasons = value;
    }

}
