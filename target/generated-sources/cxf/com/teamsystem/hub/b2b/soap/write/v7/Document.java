
package com.teamsystem.hub.b2b.soap.write.v7;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Classe Java per Document complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="Document"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="transmitterId" type="{http://schema.write.b2b.hub.teamsystem.com/v7}Id"/&gt;
 *         &lt;element name="senderId" type="{http://schema.write.b2b.hub.teamsystem.com/v7}Id"/&gt;
 *         &lt;element name="recipientId" type="{http://schema.write.b2b.hub.teamsystem.com/v7}IdExt"/&gt;
 *         &lt;element name="identifier" type="{http://schema.write.b2b.hub.teamsystem.com/v7}Identifier"/&gt;
 *         &lt;element name="metadata" type="{http://schema.write.b2b.hub.teamsystem.com/v7}Metadata"/&gt;
 *         &lt;element name="flow" type="{http://schema.write.b2b.hub.teamsystem.com/v7}Flow"/&gt;
 *         &lt;element name="status" type="{http://schema.write.b2b.hub.teamsystem.com/v7}Status"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "transmitterId",
    "senderId",
    "recipientId",
    "identifier",
    "metadata",
    "flow",
    "status"
})
public class Document {

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String transmitterId;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String senderId;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String recipientId;
    @XmlElement(required = true)
    protected Identifier identifier;
    @XmlElement(required = true)
    protected Metadata metadata;
    @XmlElement(required = true)
    protected Flow flow;
    @XmlElement(required = true)
    protected Status status;

    /**
     * Recupera il valore della proprietà transmitterId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransmitterId() {
        return transmitterId;
    }

    /**
     * Imposta il valore della proprietà transmitterId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransmitterId(String value) {
        this.transmitterId = value;
    }

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
     * Recupera il valore della proprietà identifier.
     * 
     * @return
     *     possible object is
     *     {@link Identifier }
     *     
     */
    public Identifier getIdentifier() {
        return identifier;
    }

    /**
     * Imposta il valore della proprietà identifier.
     * 
     * @param value
     *     allowed object is
     *     {@link Identifier }
     *     
     */
    public void setIdentifier(Identifier value) {
        this.identifier = value;
    }

    /**
     * Recupera il valore della proprietà metadata.
     * 
     * @return
     *     possible object is
     *     {@link Metadata }
     *     
     */
    public Metadata getMetadata() {
        return metadata;
    }

    /**
     * Imposta il valore della proprietà metadata.
     * 
     * @param value
     *     allowed object is
     *     {@link Metadata }
     *     
     */
    public void setMetadata(Metadata value) {
        this.metadata = value;
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

    /**
     * Recupera il valore della proprietà status.
     * 
     * @return
     *     possible object is
     *     {@link Status }
     *     
     */
    public Status getStatus() {
        return status;
    }

    /**
     * Imposta il valore della proprietà status.
     * 
     * @param value
     *     allowed object is
     *     {@link Status }
     *     
     */
    public void setStatus(Status value) {
        this.status = value;
    }

}
