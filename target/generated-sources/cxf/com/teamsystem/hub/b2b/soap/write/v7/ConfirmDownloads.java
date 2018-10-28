
package com.teamsystem.hub.b2b.soap.write.v7;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ConfirmDownloads complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ConfirmDownloads"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="auth" type="{http://schema.write.b2b.hub.teamsystem.com/v7}Auth"/&gt;
 *         &lt;element name="hubIds" type="{http://schema.write.b2b.hub.teamsystem.com/v7}HubIds"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConfirmDownloads", propOrder = {
    "auth",
    "hubIds"
})
public class ConfirmDownloads {

    @XmlElement(required = true)
    protected Auth auth;
    @XmlElement(required = true)
    protected HubIds hubIds;

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
     * Recupera il valore della proprietà hubIds.
     * 
     * @return
     *     possible object is
     *     {@link HubIds }
     *     
     */
    public HubIds getHubIds() {
        return hubIds;
    }

    /**
     * Imposta il valore della proprietà hubIds.
     * 
     * @param value
     *     allowed object is
     *     {@link HubIds }
     *     
     */
    public void setHubIds(HubIds value) {
        this.hubIds = value;
    }

}
