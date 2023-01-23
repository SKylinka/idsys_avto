
package ru.stqa.pft.idsys.s.com.triasoft.dev.schemas.eis.eregistry.pppr._2;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Тип Данные нотариуса для свидетельства о регистрации уведомления
 * 
 * <p>Java class for RegistrationCertificateNotaryDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegistrationCertificateNotaryDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IssuePlace" type="{http://dev.triasoft.com/schemas/eis/eregistry/pppr/2.0}String1-255Type" minOccurs="0"/>
 *         &lt;element name="IssueDate" type="{http://dev.triasoft.com/schemas/eis/eregistry/pppr/2.0}DateType"/>
 *         &lt;element name="NotaryName" type="{http://dev.triasoft.com/schemas/eis/eregistry/pppr/2.0}String1-255Type"/>
 *         &lt;element name="NotaryJobTitle" type="{http://dev.triasoft.com/schemas/eis/eregistry/pppr/2.0}String1-255Type"/>
 *         &lt;element name="NotaryJobTitleShort" type="{http://dev.triasoft.com/schemas/eis/eregistry/pppr/2.0}String1-255Type"/>
 *         &lt;element name="NotaryID" type="{http://dev.triasoft.com/schemas/eis/eregistry/pppr/2.0}String8Type"/>
 *         &lt;element name="SignerID" type="{http://dev.triasoft.com/schemas/eis/eregistry/pppr/2.0}String8or12Type"/>
 *         &lt;element name="RegistryNumber" type="{http://dev.triasoft.com/schemas/eis/eregistry/pppr/2.0}String1-25Type" minOccurs="0"/>
 *         &lt;element name="Date_Prikaz" type="{http://dev.triasoft.com/schemas/eis/eregistry/pppr/2.0}DateType" minOccurs="0"/>
 *         &lt;element name="Num_Prikaz" type="{http://dev.triasoft.com/schemas/eis/eregistry/pppr/2.0}String1-16Type" minOccurs="0"/>
 *         &lt;element name="DateOfReceiving" type="{http://dev.triasoft.com/schemas/eis/eregistry/pppr/2.0}DateType" minOccurs="0"/>
 *         &lt;element name="Tariff" type="{http://dev.triasoft.com/schemas/eis/eregistry/pppr/2.0}MoneyType" minOccurs="0"/>
 *         &lt;element name="Recovered" type="{http://dev.triasoft.com/schemas/eis/eregistry/pppr/2.0}MoneyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegistrationCertificateNotaryDataType", propOrder = {
    "issuePlace",
    "issueDate",
    "notaryName",
    "notaryJobTitle",
    "notaryJobTitleShort",
    "notaryID",
    "signerID",
    "registryNumber",
    "datePrikaz",
    "numPrikaz",
    "dateOfReceiving",
    "tariff",
    "recovered"
})
public class RegistrationCertificateNotaryDataType {

    @XmlElement(name = "IssuePlace")
    protected String issuePlace;
    @XmlElement(name = "IssueDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar issueDate;
    @XmlElement(name = "NotaryName", required = true)
    protected String notaryName;
    @XmlElement(name = "NotaryJobTitle", required = true)
    protected String notaryJobTitle;
    @XmlElement(name = "NotaryJobTitleShort", required = true)
    protected String notaryJobTitleShort;
    @XmlElement(name = "NotaryID", required = true)
    protected String notaryID;
    @XmlElement(name = "SignerID", required = true)
    protected String signerID;
    @XmlElement(name = "RegistryNumber")
    protected String registryNumber;
    @XmlElement(name = "Date_Prikaz")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datePrikaz;
    @XmlElement(name = "Num_Prikaz")
    protected String numPrikaz;
    @XmlElement(name = "DateOfReceiving")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateOfReceiving;
    @XmlElement(name = "Tariff")
    protected BigDecimal tariff;
    @XmlElement(name = "Recovered")
    protected BigDecimal recovered;

    /**
     * Gets the value of the issuePlace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuePlace() {
        return issuePlace;
    }

    /**
     * Sets the value of the issuePlace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuePlace(String value) {
        this.issuePlace = value;
    }

    /**
     * Gets the value of the issueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIssueDate() {
        return issueDate;
    }

    /**
     * Sets the value of the issueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIssueDate(XMLGregorianCalendar value) {
        this.issueDate = value;
    }

    /**
     * Gets the value of the notaryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotaryName() {
        return notaryName;
    }

    /**
     * Sets the value of the notaryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotaryName(String value) {
        this.notaryName = value;
    }

    /**
     * Gets the value of the notaryJobTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotaryJobTitle() {
        return notaryJobTitle;
    }

    /**
     * Sets the value of the notaryJobTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotaryJobTitle(String value) {
        this.notaryJobTitle = value;
    }

    /**
     * Gets the value of the notaryJobTitleShort property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotaryJobTitleShort() {
        return notaryJobTitleShort;
    }

    /**
     * Sets the value of the notaryJobTitleShort property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotaryJobTitleShort(String value) {
        this.notaryJobTitleShort = value;
    }

    /**
     * Gets the value of the notaryID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotaryID() {
        return notaryID;
    }

    /**
     * Sets the value of the notaryID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotaryID(String value) {
        this.notaryID = value;
    }

    /**
     * Gets the value of the signerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignerID() {
        return signerID;
    }

    /**
     * Sets the value of the signerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignerID(String value) {
        this.signerID = value;
    }

    /**
     * Gets the value of the registryNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistryNumber() {
        return registryNumber;
    }

    /**
     * Sets the value of the registryNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistryNumber(String value) {
        this.registryNumber = value;
    }

    /**
     * Gets the value of the datePrikaz property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatePrikaz() {
        return datePrikaz;
    }

    /**
     * Sets the value of the datePrikaz property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatePrikaz(XMLGregorianCalendar value) {
        this.datePrikaz = value;
    }

    /**
     * Gets the value of the numPrikaz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumPrikaz() {
        return numPrikaz;
    }

    /**
     * Sets the value of the numPrikaz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumPrikaz(String value) {
        this.numPrikaz = value;
    }

    /**
     * Gets the value of the dateOfReceiving property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOfReceiving() {
        return dateOfReceiving;
    }

    /**
     * Sets the value of the dateOfReceiving property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOfReceiving(XMLGregorianCalendar value) {
        this.dateOfReceiving = value;
    }

    /**
     * Gets the value of the tariff property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTariff() {
        return tariff;
    }

    /**
     * Sets the value of the tariff property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTariff(BigDecimal value) {
        this.tariff = value;
    }

    /**
     * Gets the value of the recovered property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRecovered() {
        return recovered;
    }

    /**
     * Sets the value of the recovered property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRecovered(BigDecimal value) {
        this.recovered = value;
    }

}
