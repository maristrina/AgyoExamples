
package com.teamsystem.hub.b2b.soap.read.v7;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per Pagination complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="Pagination"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="page" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="size" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Pagination", propOrder = {
    "page",
    "size"
})
public class Pagination {

    @XmlElement(defaultValue = "0")
    protected int page;
    @XmlElement(defaultValue = "20")
    protected int size;

    /**
     * Recupera il valore della proprietà page.
     * 
     */
    public int getPage() {
        return page;
    }

    /**
     * Imposta il valore della proprietà page.
     * 
     */
    public void setPage(int value) {
        this.page = value;
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

}
