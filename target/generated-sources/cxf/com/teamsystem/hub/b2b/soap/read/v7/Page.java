
package com.teamsystem.hub.b2b.soap.read.v7;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per Page complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="Page"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="number" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="size" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="totalElements" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="totalPages" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Page", propOrder = {
    "number",
    "size",
    "totalElements",
    "totalPages"
})
public class Page {

    protected int number;
    protected int size;
    protected long totalElements;
    protected int totalPages;

    /**
     * Recupera il valore della proprietà number.
     * 
     */
    public int getNumber() {
        return number;
    }

    /**
     * Imposta il valore della proprietà number.
     * 
     */
    public void setNumber(int value) {
        this.number = value;
    }

    /**
     * Recupera il valore della proprietà size.
     * 
     */
    public int getSize() {
        return size;
    }

    /**
     * Imposta il valore della proprietà size.
     * 
     */
    public void setSize(int value) {
        this.size = value;
    }

    /**
     * Recupera il valore della proprietà totalElements.
     * 
     */
    public long getTotalElements() {
        return totalElements;
    }

    /**
     * Imposta il valore della proprietà totalElements.
     * 
     */
    public void setTotalElements(long value) {
        this.totalElements = value;
    }

    /**
     * Recupera il valore della proprietà totalPages.
     * 
     */
    public int getTotalPages() {
        return totalPages;
    }

    /**
     * Imposta il valore della proprietà totalPages.
     * 
     */
    public void setTotalPages(int value) {
        this.totalPages = value;
    }

}
