
package ru.stqa.pft.idsys.s.com.triasoft.dev.schemas.eis.eregistry.pppr._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Тип Свидетельство о регистрации уведомления 2.0
 * 
 * <p>Java class for RegistrationCertificateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegistrationCertificateType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://dev.triasoft.com/schemas/eis/eregistry/pppr/2.0}BankData" minOccurs="0"/>
 *         &lt;element name="RegistrationCertificateData" type="{http://dev.triasoft.com/schemas/eis/eregistry/pppr/2.0}RegistrationCertificateDataType"/>
 *         &lt;element name="RegistrationCertificateNotaryData" type="{http://dev.triasoft.com/schemas/eis/eregistry/pppr/2.0}RegistrationCertificateNotaryDataType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="version" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="2.0" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegistrationCertificateType", propOrder = {
    "bankData",
    "registrationCertificateData",
    "registrationCertificateNotaryData"
})
public class RegistrationCertificateType {

    @XmlElement(name = "BankData")
    protected BankData bankData;
    @XmlElement(name = "RegistrationCertificateData", required = true)
    protected RegistrationCertificateDataType registrationCertificateData;
    @XmlElement(name = "RegistrationCertificateNotaryData", required = true)
    protected RegistrationCertificateNotaryDataType registrationCertificateNotaryData;
    @XmlAttribute(name = "version", required = true)
    protected String version;

    /**
     * Gets the value of the bankData property.
     * 
     * @return
     *     possible object is
     *     {@link BankData }
     *     
     */
    public BankData getBankData() {
        return bankData;
    }

    /**
     * Sets the value of the bankData property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankData }
     *     
     */
    public void setBankData(BankData value) {
        this.bankData = value;
    }

    /**
     * Gets the value of the registrationCertificateData property.
     * 
     * @return
     *     possible object is
     *     {@link RegistrationCertificateDataType }
     *     
     */
    public RegistrationCertificateDataType getRegistrationCertificateData() {
        return registrationCertificateData;
    }

    /**
     * Sets the value of the registrationCertificateData property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistrationCertificateDataType }
     *     
     */
    public void setRegistrationCertificateData(RegistrationCertificateDataType value) {
        this.registrationCertificateData = value;
    }

    /**
     * Gets the value of the registrationCertificateNotaryData property.
     * 
     * @return
     *     possible object is
     *     {@link RegistrationCertificateNotaryDataType }
     *     
     */
    public RegistrationCertificateNotaryDataType getRegistrationCertificateNotaryData() {
        return registrationCertificateNotaryData;
    }

    /**
     * Sets the value of the registrationCertificateNotaryData property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistrationCertificateNotaryDataType }
     *     
     */
    public void setRegistrationCertificateNotaryData(RegistrationCertificateNotaryDataType value) {
        this.registrationCertificateNotaryData = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        if (version == null) {
            return "2.0";
        } else {
            return version;
        }
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

}
