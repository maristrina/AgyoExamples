//
// Questo file Ŕ stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrÓ persa durante la ricompilazione dello schema di origine. 
// Generato il: 2018.10.28 alle 02:46:16 PM CET 
//


package it.gov.agenziaentrate.ivaservizi.fatt12;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per DettaglioPagamentoType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DettaglioPagamentoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Beneficiario" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}String200LatinType" minOccurs="0"/&gt;
 *         &lt;element name="ModalitaPagamento" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}ModalitaPagamentoType"/&gt;
 *         &lt;element name="DataRiferimentoTerminiPagamento" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="GiorniTerminiPagamento" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}GiorniTerminePagamentoType" minOccurs="0"/&gt;
 *         &lt;element name="DataScadenzaPagamento" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="ImportoPagamento" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}Amount2DecimalType"/&gt;
 *         &lt;element name="CodUfficioPostale" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}String20Type" minOccurs="0"/&gt;
 *         &lt;element name="CognomeQuietanzante" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}String60LatinType" minOccurs="0"/&gt;
 *         &lt;element name="NomeQuietanzante" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}String60LatinType" minOccurs="0"/&gt;
 *         &lt;element name="CFQuietanzante" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}CodiceFiscalePFType" minOccurs="0"/&gt;
 *         &lt;element name="TitoloQuietanzante" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}TitoloType" minOccurs="0"/&gt;
 *         &lt;element name="IstitutoFinanziario" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}String80LatinType" minOccurs="0"/&gt;
 *         &lt;element name="IBAN" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}IBANType" minOccurs="0"/&gt;
 *         &lt;element name="ABI" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}ABIType" minOccurs="0"/&gt;
 *         &lt;element name="CAB" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}CABType" minOccurs="0"/&gt;
 *         &lt;element name="BIC" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}BICType" minOccurs="0"/&gt;
 *         &lt;element name="ScontoPagamentoAnticipato" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}Amount2DecimalType" minOccurs="0"/&gt;
 *         &lt;element name="DataLimitePagamentoAnticipato" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="PenalitaPagamentiRitardati" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}Amount2DecimalType" minOccurs="0"/&gt;
 *         &lt;element name="DataDecorrenzaPenale" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="CodicePagamento" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}String60Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DettaglioPagamentoType", propOrder = {
    "beneficiario",
    "modalitaPagamento",
    "dataRiferimentoTerminiPagamento",
    "giorniTerminiPagamento",
    "dataScadenzaPagamento",
    "importoPagamento",
    "codUfficioPostale",
    "cognomeQuietanzante",
    "nomeQuietanzante",
    "cfQuietanzante",
    "titoloQuietanzante",
    "istitutoFinanziario",
    "iban",
    "abi",
    "cab",
    "bic",
    "scontoPagamentoAnticipato",
    "dataLimitePagamentoAnticipato",
    "penalitaPagamentiRitardati",
    "dataDecorrenzaPenale",
    "codicePagamento"
})
public class DettaglioPagamentoType {

    @XmlElement(name = "Beneficiario")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String beneficiario;
    @XmlElement(name = "ModalitaPagamento", required = true)
    @XmlSchemaType(name = "string")
    protected ModalitaPagamentoType modalitaPagamento;
    @XmlElement(name = "DataRiferimentoTerminiPagamento")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataRiferimentoTerminiPagamento;
    @XmlElement(name = "GiorniTerminiPagamento")
    @XmlSchemaType(name = "integer")
    protected Integer giorniTerminiPagamento;
    @XmlElement(name = "DataScadenzaPagamento")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataScadenzaPagamento;
    @XmlElement(name = "ImportoPagamento", required = true)
    protected BigDecimal importoPagamento;
    @XmlElement(name = "CodUfficioPostale")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String codUfficioPostale;
    @XmlElement(name = "CognomeQuietanzante")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String cognomeQuietanzante;
    @XmlElement(name = "NomeQuietanzante")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String nomeQuietanzante;
    @XmlElement(name = "CFQuietanzante")
    protected String cfQuietanzante;
    @XmlElement(name = "TitoloQuietanzante")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String titoloQuietanzante;
    @XmlElement(name = "IstitutoFinanziario")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String istitutoFinanziario;
    @XmlElement(name = "IBAN")
    protected String iban;
    @XmlElement(name = "ABI")
    protected String abi;
    @XmlElement(name = "CAB")
    protected String cab;
    @XmlElement(name = "BIC")
    protected String bic;
    @XmlElement(name = "ScontoPagamentoAnticipato")
    protected BigDecimal scontoPagamentoAnticipato;
    @XmlElement(name = "DataLimitePagamentoAnticipato")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataLimitePagamentoAnticipato;
    @XmlElement(name = "PenalitaPagamentiRitardati")
    protected BigDecimal penalitaPagamentiRitardati;
    @XmlElement(name = "DataDecorrenzaPenale")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataDecorrenzaPenale;
    @XmlElement(name = "CodicePagamento")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String codicePagamento;

    /**
     * Recupera il valore della proprietÓ beneficiario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeneficiario() {
        return beneficiario;
    }

    /**
     * Imposta il valore della proprietÓ beneficiario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeneficiario(String value) {
        this.beneficiario = value;
    }

    /**
     * Recupera il valore della proprietÓ modalitaPagamento.
     * 
     * @return
     *     possible object is
     *     {@link ModalitaPagamentoType }
     *     
     */
    public ModalitaPagamentoType getModalitaPagamento() {
        return modalitaPagamento;
    }

    /**
     * Imposta il valore della proprietÓ modalitaPagamento.
     * 
     * @param value
     *     allowed object is
     *     {@link ModalitaPagamentoType }
     *     
     */
    public void setModalitaPagamento(ModalitaPagamentoType value) {
        this.modalitaPagamento = value;
    }

    /**
     * Recupera il valore della proprietÓ dataRiferimentoTerminiPagamento.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataRiferimentoTerminiPagamento() {
        return dataRiferimentoTerminiPagamento;
    }

    /**
     * Imposta il valore della proprietÓ dataRiferimentoTerminiPagamento.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataRiferimentoTerminiPagamento(XMLGregorianCalendar value) {
        this.dataRiferimentoTerminiPagamento = value;
    }

    /**
     * Recupera il valore della proprietÓ giorniTerminiPagamento.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGiorniTerminiPagamento() {
        return giorniTerminiPagamento;
    }

    /**
     * Imposta il valore della proprietÓ giorniTerminiPagamento.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGiorniTerminiPagamento(Integer value) {
        this.giorniTerminiPagamento = value;
    }

    /**
     * Recupera il valore della proprietÓ dataScadenzaPagamento.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataScadenzaPagamento() {
        return dataScadenzaPagamento;
    }

    /**
     * Imposta il valore della proprietÓ dataScadenzaPagamento.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataScadenzaPagamento(XMLGregorianCalendar value) {
        this.dataScadenzaPagamento = value;
    }

    /**
     * Recupera il valore della proprietÓ importoPagamento.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getImportoPagamento() {
        return importoPagamento;
    }

    /**
     * Imposta il valore della proprietÓ importoPagamento.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setImportoPagamento(BigDecimal value) {
        this.importoPagamento = value;
    }

    /**
     * Recupera il valore della proprietÓ codUfficioPostale.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodUfficioPostale() {
        return codUfficioPostale;
    }

    /**
     * Imposta il valore della proprietÓ codUfficioPostale.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodUfficioPostale(String value) {
        this.codUfficioPostale = value;
    }

    /**
     * Recupera il valore della proprietÓ cognomeQuietanzante.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCognomeQuietanzante() {
        return cognomeQuietanzante;
    }

    /**
     * Imposta il valore della proprietÓ cognomeQuietanzante.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCognomeQuietanzante(String value) {
        this.cognomeQuietanzante = value;
    }

    /**
     * Recupera il valore della proprietÓ nomeQuietanzante.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeQuietanzante() {
        return nomeQuietanzante;
    }

    /**
     * Imposta il valore della proprietÓ nomeQuietanzante.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeQuietanzante(String value) {
        this.nomeQuietanzante = value;
    }

    /**
     * Recupera il valore della proprietÓ cfQuietanzante.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCFQuietanzante() {
        return cfQuietanzante;
    }

    /**
     * Imposta il valore della proprietÓ cfQuietanzante.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCFQuietanzante(String value) {
        this.cfQuietanzante = value;
    }

    /**
     * Recupera il valore della proprietÓ titoloQuietanzante.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitoloQuietanzante() {
        return titoloQuietanzante;
    }

    /**
     * Imposta il valore della proprietÓ titoloQuietanzante.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitoloQuietanzante(String value) {
        this.titoloQuietanzante = value;
    }

    /**
     * Recupera il valore della proprietÓ istitutoFinanziario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIstitutoFinanziario() {
        return istitutoFinanziario;
    }

    /**
     * Imposta il valore della proprietÓ istitutoFinanziario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIstitutoFinanziario(String value) {
        this.istitutoFinanziario = value;
    }

    /**
     * Recupera il valore della proprietÓ iban.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIBAN() {
        return iban;
    }

    /**
     * Imposta il valore della proprietÓ iban.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIBAN(String value) {
        this.iban = value;
    }

    /**
     * Recupera il valore della proprietÓ abi.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getABI() {
        return abi;
    }

    /**
     * Imposta il valore della proprietÓ abi.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setABI(String value) {
        this.abi = value;
    }

    /**
     * Recupera il valore della proprietÓ cab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCAB() {
        return cab;
    }

    /**
     * Imposta il valore della proprietÓ cab.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCAB(String value) {
        this.cab = value;
    }

    /**
     * Recupera il valore della proprietÓ bic.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBIC() {
        return bic;
    }

    /**
     * Imposta il valore della proprietÓ bic.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBIC(String value) {
        this.bic = value;
    }

    /**
     * Recupera il valore della proprietÓ scontoPagamentoAnticipato.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getScontoPagamentoAnticipato() {
        return scontoPagamentoAnticipato;
    }

    /**
     * Imposta il valore della proprietÓ scontoPagamentoAnticipato.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setScontoPagamentoAnticipato(BigDecimal value) {
        this.scontoPagamentoAnticipato = value;
    }

    /**
     * Recupera il valore della proprietÓ dataLimitePagamentoAnticipato.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataLimitePagamentoAnticipato() {
        return dataLimitePagamentoAnticipato;
    }

    /**
     * Imposta il valore della proprietÓ dataLimitePagamentoAnticipato.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataLimitePagamentoAnticipato(XMLGregorianCalendar value) {
        this.dataLimitePagamentoAnticipato = value;
    }

    /**
     * Recupera il valore della proprietÓ penalitaPagamentiRitardati.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPenalitaPagamentiRitardati() {
        return penalitaPagamentiRitardati;
    }

    /**
     * Imposta il valore della proprietÓ penalitaPagamentiRitardati.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPenalitaPagamentiRitardati(BigDecimal value) {
        this.penalitaPagamentiRitardati = value;
    }

    /**
     * Recupera il valore della proprietÓ dataDecorrenzaPenale.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataDecorrenzaPenale() {
        return dataDecorrenzaPenale;
    }

    /**
     * Imposta il valore della proprietÓ dataDecorrenzaPenale.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataDecorrenzaPenale(XMLGregorianCalendar value) {
        this.dataDecorrenzaPenale = value;
    }

    /**
     * Recupera il valore della proprietÓ codicePagamento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodicePagamento() {
        return codicePagamento;
    }

    /**
     * Imposta il valore della proprietÓ codicePagamento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodicePagamento(String value) {
        this.codicePagamento = value;
    }

}
