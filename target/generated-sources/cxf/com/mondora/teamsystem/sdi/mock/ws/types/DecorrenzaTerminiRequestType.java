
package com.mondora.teamsystem.sdi.mock.ws.types;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per decorrenzaTerminiRequest_Type complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="decorrenzaTerminiRequest_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IdentificativoSdI" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="NomeFile" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "decorrenzaTerminiRequest_Type", propOrder = {
    "identificativoSdI",
    "nomeFile"
})
public class DecorrenzaTerminiRequestType {

    @XmlElement(name = "IdentificativoSdI", required = true)
    protected BigInteger identificativoSdI;
    @XmlElement(name = "NomeFile", required = true)
    protected String nomeFile;

    /**
     * Recupera il valore della proprietà identificativoSdI.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIdentificativoSdI() {
        return identificativoSdI;
    }

    /**
     * Imposta il valore della proprietà identificativoSdI.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIdentificativoSdI(BigInteger value) {
        this.identificativoSdI = value;
    }

    /**
     * Recupera il valore della proprietà nomeFile.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeFile() {
        return nomeFile;
    }

    /**
     * Imposta il valore della proprietà nomeFile.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeFile(String value) {
        this.nomeFile = value;
    }

}
