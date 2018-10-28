
package com.teamsystem.hub.b2b.soap.write.v7;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Classe Java per Upload complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="Upload"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="senderId" type="{http://schema.write.b2b.hub.teamsystem.com/v7}Id"/&gt;
 *         &lt;element name="recipientId" type="{http://schema.write.b2b.hub.teamsystem.com/v7}IdExt"/&gt;
 *         &lt;element name="batchId" type="{http://schema.write.b2b.hub.teamsystem.com/v7}Id" minOccurs="0"/&gt;
 *         &lt;element name="files" type="{http://schema.write.b2b.hub.teamsystem.com/v7}Files"/&gt;
 *         &lt;element name="flow" type="{http://schema.write.b2b.hub.teamsystem.com/v7}Flow"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Upload", propOrder = {
    "senderId",
    "recipientId",
    "batchId",
    "files",
    "flow"
})
public class Upload {

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String senderId;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String recipientId;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String batchId;
    @XmlElement(required = true)
    protected Files files;
    @XmlElement(required = true)
    protected Flow flow;

    /**
     * Recupera il valore della proprietà senderId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderId() {
        return senderId;
    }

    /**
     * Imposta il valore della proprietà senderId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderId(String value) {
        this.senderId = value;
    }

    /**
     * Recupera il valore della proprietà recipientId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipientId() {
        return recipientId;
    }

    /**
     * Imposta il valore della proprietà recipientId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipientId(String value) {
        this.recipientId = value;
    }

    /**
     * Recupera il valore della proprietà batchId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBatchId() {
        return batchId;
    }

    /**
     * Imposta il valore della proprietà batchId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBatchId(String value) {
        this.batchId = value;
    }

    /**
     * Recupera il valore della proprietà files.
     * 
     * @return
     *     possible object is
     *     {@link Files }
     *     
     */
    public Files getFiles() {
        return files;
    }

    /**
     * Imposta il valore della proprietà files.
     * 
     * @param value
     *     allowed object is
     *     {@link Files }
     *     
     */
    public void setFiles(Files value) {
        this.files = value;
    }

    /**
     * Recupera il valore della proprietà flow.
     * 
     * @return
     *     possible object is
     *     {@link Flow }
     *     
     */
    public Flow getFlow() {
        return flow;
    }

    /**
     * Imposta il valore della proprietà flow.
     * 
     * @param value
     *     allowed object is
     *     {@link Flow }
     *     
     */
    public void setFlow(Flow value) {
        this.flow = value;
    }

}
