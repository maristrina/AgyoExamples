
package com.teamsystem.hub.b2b.soap.write.v7;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per Metadata complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="Metadata"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="name" type="{http://schema.write.b2b.hub.teamsystem.com/v7}FileName"/&gt;
 *         &lt;element name="size" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="hash" type="{http://schema.write.b2b.hub.teamsystem.com/v7}Hash" minOccurs="0"/&gt;
 *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="id" type="{http://schema.write.b2b.hub.teamsystem.com/v7}Id" minOccurs="0"/&gt;
 *         &lt;element name="annotation" type="{http://schema.write.b2b.hub.teamsystem.com/v7}Annotation" minOccurs="0"/&gt;
 *         &lt;element name="category" type="{http://schema.write.b2b.hub.teamsystem.com/v7}FileCategory" minOccurs="0"/&gt;
 *         &lt;element name="hubName" type="{http://schema.write.b2b.hub.teamsystem.com/v7}FileName" minOccurs="0"/&gt;
 *         &lt;element name="format" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Metadata", propOrder = {
    "name",
    "size",
    "hash",
    "date",
    "id",
    "annotation",
    "category",
    "hubName",
    "format"
})
public class Metadata {

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String name;
    protected long size;
    protected Hash hash;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar date;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String id;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String annotation;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String category;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String hubName;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String format;

    /**
     * Recupera il valore della proprietà name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Imposta il valore della proprietà name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Recupera il valore della proprietà size.
     * 
     */
    public long getSize() {
        return size;
    }

    /**
     * Imposta il valore della proprietà size.
     * 
     */
    public void setSize(long value) {
        this.size = value;
    }

    /**
     * Recupera il valore della proprietà hash.
     * 
     * @return
     *     possible object is
     *     {@link Hash }
     *     
     */
    public Hash getHash() {
        return hash;
    }

    /**
     * Imposta il valore della proprietà hash.
     * 
     * @param value
     *     allowed object is
     *     {@link Hash }
     *     
     */
    public void setHash(Hash value) {
        this.hash = value;
    }

    /**
     * Recupera il valore della proprietà date.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Imposta il valore della proprietà date.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

    /**
     * Recupera il valore della proprietà id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Imposta il valore della proprietà id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Recupera il valore della proprietà annotation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnnotation() {
        return annotation;
    }

    /**
     * Imposta il valore della proprietà annotation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnnotation(String value) {
        this.annotation = value;
    }

    /**
     * Recupera il valore della proprietà category.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategory() {
        return category;
    }

    /**
     * Imposta il valore della proprietà category.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategory(String value) {
        this.category = value;
    }

    /**
     * Recupera il valore della proprietà hubName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHubName() {
        return hubName;
    }

    /**
     * Imposta il valore della proprietà hubName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHubName(String value) {
        this.hubName = value;
    }

    /**
     * Recupera il valore della proprietà format.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormat() {
        return format;
    }

    /**
     * Imposta il valore della proprietà format.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormat(String value) {
        this.format = value;
    }

}
