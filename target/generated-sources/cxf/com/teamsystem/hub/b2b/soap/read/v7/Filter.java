
package com.teamsystem.hub.b2b.soap.read.v7;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Classe Java per Filter complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="Filter"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="transmitterId" type="{http://schema.read.b2b.hub.teamsystem.com/v7}Id" minOccurs="0"/&gt;
 *         &lt;element name="senderIds" type="{http://schema.read.b2b.hub.teamsystem.com/v7}Id" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="recipientIds" type="{http://schema.read.b2b.hub.teamsystem.com/v7}IdExt" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="statusName" type="{http://schema.read.b2b.hub.teamsystem.com/v7}StatusName" minOccurs="0"/&gt;
 *         &lt;element name="flowType" type="{http://schema.read.b2b.hub.teamsystem.com/v7}FlowType" minOccurs="0"/&gt;
 *         &lt;element name="fileId" type="{http://schema.read.b2b.hub.teamsystem.com/v7}Id" minOccurs="0"/&gt;
 *         &lt;element name="identifiers" type="{http://schema.read.b2b.hub.teamsystem.com/v7}Identifier" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="fileCategory" type="{http://schema.read.b2b.hub.teamsystem.com/v7}FileCategory" minOccurs="0"/&gt;
 *         &lt;element name="statusActive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Filter", propOrder = {
    "transmitterId",
    "senderIds",
    "recipientIds",
    "statusName",
    "flowType",
    "fileId",
    "identifiers",
    "fileCategory",
    "statusActive"
})
public class Filter {

    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String transmitterId;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> senderIds;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> recipientIds;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String statusName;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String flowType;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String fileId;
    protected List<Identifier> identifiers;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String fileCategory;
    protected Boolean statusActive;

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
     * Gets the value of the senderIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the senderIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSenderIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSenderIds() {
        if (senderIds == null) {
            senderIds = new ArrayList<String>();
        }
        return this.senderIds;
    }

    /**
     * Gets the value of the recipientIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recipientIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecipientIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRecipientIds() {
        if (recipientIds == null) {
            recipientIds = new ArrayList<String>();
        }
        return this.recipientIds;
    }

    /**
     * Recupera il valore della proprietà statusName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusName() {
        return statusName;
    }

    /**
     * Imposta il valore della proprietà statusName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusName(String value) {
        this.statusName = value;
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
     * Recupera il valore della proprietà fileId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileId() {
        return fileId;
    }

    /**
     * Imposta il valore della proprietà fileId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileId(String value) {
        this.fileId = value;
    }

    /**
     * Gets the value of the identifiers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the identifiers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdentifiers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Identifier }
     * 
     * 
     */
    public List<Identifier> getIdentifiers() {
        if (identifiers == null) {
            identifiers = new ArrayList<Identifier>();
        }
        return this.identifiers;
    }

    /**
     * Recupera il valore della proprietà fileCategory.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileCategory() {
        return fileCategory;
    }

    /**
     * Imposta il valore della proprietà fileCategory.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileCategory(String value) {
        this.fileCategory = value;
    }

    /**
     * Recupera il valore della proprietà statusActive.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStatusActive() {
        return statusActive;
    }

    /**
     * Imposta il valore della proprietà statusActive.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStatusActive(Boolean value) {
        this.statusActive = value;
    }

}
