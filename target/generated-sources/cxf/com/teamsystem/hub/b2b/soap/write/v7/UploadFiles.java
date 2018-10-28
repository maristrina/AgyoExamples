
package com.teamsystem.hub.b2b.soap.write.v7;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Classe Java per UploadFiles complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="UploadFiles"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="auth" type="{http://schema.write.b2b.hub.teamsystem.com/v7}Auth"/&gt;
 *         &lt;element name="transmitterId" type="{http://schema.write.b2b.hub.teamsystem.com/v7}Id"/&gt;
 *         &lt;element name="packageId" type="{http://schema.write.b2b.hub.teamsystem.com/v7}Id" minOccurs="0"/&gt;
 *         &lt;element name="uploads" type="{http://schema.write.b2b.hub.teamsystem.com/v7}Uploads"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UploadFiles", propOrder = {
    "auth",
    "transmitterId",
    "packageId",
    "uploads"
})
public class UploadFiles {

    @XmlElement(required = true)
    protected Auth auth;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String transmitterId;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String packageId;
    @XmlElement(required = true)
    protected Uploads uploads;

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
     * Recupera il valore della proprietà packageId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackageId() {
        return packageId;
    }

    /**
     * Imposta il valore della proprietà packageId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackageId(String value) {
        this.packageId = value;
    }

    /**
     * Recupera il valore della proprietà uploads.
     * 
     * @return
     *     possible object is
     *     {@link Uploads }
     *     
     */
    public Uploads getUploads() {
        return uploads;
    }

    /**
     * Imposta il valore della proprietà uploads.
     * 
     * @param value
     *     allowed object is
     *     {@link Uploads }
     *     
     */
    public void setUploads(Uploads value) {
        this.uploads = value;
    }

}
