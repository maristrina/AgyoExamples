
package com.teamsystem.hub.b2b.soap.read.v7;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Classe Java per ListChangesFrom complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ListChangesFrom"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="auth" type="{http://schema.read.b2b.hub.teamsystem.com/v7}Auth"/&gt;
 *         &lt;element name="timestampFrom" type="{http://schema.read.b2b.hub.teamsystem.com/v7}Timestamp"/&gt;
 *         &lt;element name="timestampTo" type="{http://schema.read.b2b.hub.teamsystem.com/v7}Timestamp" minOccurs="0"/&gt;
 *         &lt;element name="statusName" type="{http://schema.read.b2b.hub.teamsystem.com/v7}StatusName" minOccurs="0"/&gt;
 *         &lt;element name="transmitterId" type="{http://schema.read.b2b.hub.teamsystem.com/v7}Id" minOccurs="0"/&gt;
 *         &lt;element name="senderIds" type="{http://schema.read.b2b.hub.teamsystem.com/v7}Id" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="recipientIds" type="{http://schema.read.b2b.hub.teamsystem.com/v7}IdExt" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="pagination" type="{http://schema.read.b2b.hub.teamsystem.com/v7}Pagination"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListChangesFrom", propOrder = {
    "auth",
    "timestampFrom",
    "timestampTo",
    "statusName",
    "transmitterId",
    "senderIds",
    "recipientIds",
    "pagination"
})
public class ListChangesFrom {

    @XmlElement(required = true)
    protected Auth auth;
    protected long timestampFrom;
    protected Long timestampTo;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String statusName;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String transmitterId;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> senderIds;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> recipientIds;
    @XmlElement(required = true)
    protected Pagination pagination;

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
     * Recupera il valore della proprietà timestampFrom.
     * 
     */
    public long getTimestampFrom() {
        return timestampFrom;
    }

    /**
     * Imposta il valore della proprietà timestampFrom.
     * 
     */
    public void setTimestampFrom(long value) {
        this.timestampFrom = value;
    }

    /**
     * Recupera il valore della proprietà timestampTo.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTimestampTo() {
        return timestampTo;
    }

    /**
     * Imposta il valore della proprietà timestampTo.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTimestampTo(Long value) {
        this.timestampTo = value;
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
     * Recupera il valore della proprietà pagination.
     * 
     * @return
     *     possible object is
     *     {@link Pagination }
     *     
     */
    public Pagination getPagination() {
        return pagination;
    }

    /**
     * Imposta il valore della proprietà pagination.
     * 
     * @param value
     *     allowed object is
     *     {@link Pagination }
     *     
     */
    public void setPagination(Pagination value) {
        this.pagination = value;
    }

}
