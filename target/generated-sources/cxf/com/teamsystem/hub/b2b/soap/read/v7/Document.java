
package com.teamsystem.hub.b2b.soap.read.v7;

import javax.activation.DataHandler;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlMimeType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="transmitterId" type="{http://schema.read.b2b.hub.teamsystem.com/v7}Id"/&gt;
 *         &lt;element name="senderId" type="{http://schema.read.b2b.hub.teamsystem.com/v7}Id"/&gt;
 *         &lt;element name="recipientId" type="{http://schema.read.b2b.hub.teamsystem.com/v7}IdExt"/&gt;
 *         &lt;element name="identifier" type="{http://schema.read.b2b.hub.teamsystem.com/v7}Identifier"/&gt;
 *         &lt;element name="metadata" type="{http://schema.read.b2b.hub.teamsystem.com/v7}Metadata"/&gt;
 *         &lt;element name="flowType" type="{http://schema.read.b2b.hub.teamsystem.com/v7}FlowType"/&gt;
 *         &lt;element name="status" type="{http://schema.read.b2b.hub.teamsystem.com/v7}MapStatusList"/&gt;
 *         &lt;element name="content" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="senderName" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="recipientName" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="receiptDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
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
    "flowType",
    "status",
    "content",
    "senderName",
    "recipientName",
    "receiptDate"
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
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String flowType;
    @XmlElement(required = true)
    protected MapStatusList status;
    @XmlMimeType("application/octet-stream")
    protected DataHandler content;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String senderName;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String recipientName;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar receiptDate;

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
     * Recupera il valore della proprietà flowType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlowType() {
        return flowType;
    }

    /**
     * Imposta il valore della proprietà flowType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlowType(String value) {
        this.flowType = value;
    }

    /**
     * Recupera il valore della proprietà status.
     * 
     * @return
     *     possible object is
     *     {@link MapStatusList }
     *     
     */
    public MapStatusList getStatus() {
        return status;
    }

    /**
     * Imposta il valore della proprietà status.
     * 
     * @param value
     *     allowed object is
     *     {@link MapStatusList }
     *     
     */
    public void setStatus(MapStatusList value) {
        this.status = value;
    }

    /**
     * Recupera il valore della proprietà content.
     * 
     * @return
     *     possible object is
     *     {@link DataHandler }
     *     
     */
    public DataHandler getContent() {
        return content;
    }

    /**
     * Imposta il valore della proprietà content.
     * 
     * @param value
     *     allowed object is
     *     {@link DataHandler }
     *     
     */
    public void setContent(DataHandler value) {
        this.content = value;
    }

    /**
     * Recupera il valore della proprietà senderName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderName() {
        return senderName;
    }

    /**
     * Imposta il valore della proprietà senderName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderName(String value) {
        this.senderName = value;
    }

    /**
     * Recupera il valore della proprietà recipientName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipientName() {
        return recipientName;
    }

    /**
     * Imposta il valore della proprietà recipientName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipientName(String value) {
        this.recipientName = value;
    }

    /**
     * Recupera il valore della proprietà receiptDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReceiptDate() {
        return receiptDate;
    }

    /**
     * Imposta il valore della proprietà receiptDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReceiptDate(XMLGregorianCalendar value) {
        this.receiptDate = value;
    }

}
