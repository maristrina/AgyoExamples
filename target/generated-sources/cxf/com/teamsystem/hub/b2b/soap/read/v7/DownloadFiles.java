
package com.teamsystem.hub.b2b.soap.read.v7;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per DownloadFiles complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DownloadFiles"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="auth" type="{http://schema.read.b2b.hub.teamsystem.com/v7}Auth"/&gt;
 *         &lt;element name="filter" type="{http://schema.read.b2b.hub.teamsystem.com/v7}Filter" minOccurs="0"/&gt;
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
@XmlType(name = "DownloadFiles", propOrder = {
    "auth",
    "filter",
    "pagination"
})
public class DownloadFiles {

    @XmlElement(required = true)
    protected Auth auth;
    protected Filter filter;
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
     * Recupera il valore della proprietà filter.
     * 
     * @return
     *     possible object is
     *     {@link Filter }
     *     
     */
    public Filter getFilter() {
        return filter;
    }

    /**
     * Imposta il valore della proprietà filter.
     * 
     * @param value
     *     allowed object is
     *     {@link Filter }
     *     
     */
    public void setFilter(Filter value) {
        this.filter = value;
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
