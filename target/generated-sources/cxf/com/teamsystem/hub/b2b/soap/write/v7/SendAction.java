
package com.teamsystem.hub.b2b.soap.write.v7;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Classe Java per SendAction complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="SendAction"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="auth" type="{http://schema.write.b2b.hub.teamsystem.com/v7}Auth"/&gt;
 *         &lt;element name="hubId" type="{http://schema.write.b2b.hub.teamsystem.com/v7}Id"/&gt;
 *         &lt;element name="action" type="{http://schema.write.b2b.hub.teamsystem.com/v7}StatusName"/&gt;
 *         &lt;element name="extraData" type="{http://schema.write.b2b.hub.teamsystem.com/v7}ExtraData" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SendAction", propOrder = {
    "auth",
    "hubId",
    "action",
    "extraData"
})
public class SendAction {

    @XmlElement(required = true)
    protected Auth auth;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String hubId;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String action;
    protected ExtraData extraData;

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
     * Recupera il valore della proprietà hubId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHubId() {
        return hubId;
    }

    /**
     * Imposta il valore della proprietà hubId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHubId(String value) {
        this.hubId = value;
    }

    /**
     * Recupera il valore della proprietà action.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAction() {
        return action;
    }

    /**
     * Imposta il valore della proprietà action.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAction(String value) {
        this.action = value;
    }

    /**
     * Recupera il valore della proprietà extraData.
     * 
     * @return
     *     possible object is
     *     {@link ExtraData }
     *     
     */
    public ExtraData getExtraData() {
        return extraData;
    }

    /**
     * Imposta il valore della proprietà extraData.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtraData }
     *     
     */
    public void setExtraData(ExtraData value) {
        this.extraData = value;
    }

}
