
package ru.stqa.pft.idsys.s.ru.id_sys.schemas.idbank.common._2012._0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Запрос регистрации ТСП
 * 
 * <p>Java class for TSP_Register complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TSP_Register">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UL_Id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TSP_Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MCC" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RegionCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Address" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Contact_Phone" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Capabilities" type="{http://www.id-sys.ru/schemas/idbank/common/2012/0.01/}Capabilities" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TSP_Register", propOrder = {
    "ulId",
    "tspName",
    "mcc",
    "countryCode",
    "regionCode",
    "city",
    "postalCode",
    "address",
    "contactPhone",
    "capabilities"
})
public class TSPRegister {

    @XmlElement(name = "UL_Id", required = true)
    protected String ulId;
    @XmlElement(name = "TSP_Name", required = true)
    protected String tspName;
    @XmlElement(name = "MCC", required = true)
    protected String mcc;
    @XmlElement(name = "CountryCode", required = true)
    protected String countryCode;
    @XmlElement(name = "RegionCode", required = true)
    protected String regionCode;
    @XmlElement(name = "City", required = true)
    protected String city;
    @XmlElement(name = "PostalCode", required = true)
    protected String postalCode;
    @XmlElement(name = "Address", required = true)
    protected String address;
    @XmlElement(name = "Contact_Phone", required = true)
    protected String contactPhone;
    @XmlElement(name = "Capabilities")
    @XmlSchemaType(name = "string")
    protected Capabilities capabilities;

    /**
     * Gets the value of the ulId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getULId() {
        return ulId;
    }

    /**
     * Sets the value of the ulId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setULId(String value) {
        this.ulId = value;
    }

    /**
     * Gets the value of the tspName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSPName() {
        return tspName;
    }

    /**
     * Sets the value of the tspName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSPName(String value) {
        this.tspName = value;
    }

    /**
     * Gets the value of the mcc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMCC() {
        return mcc;
    }

    /**
     * Sets the value of the mcc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMCC(String value) {
        this.mcc = value;
    }

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the regionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegionCode() {
        return regionCode;
    }

    /**
     * Sets the value of the regionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegionCode(String value) {
        this.regionCode = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the postalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Gets the value of the contactPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactPhone() {
        return contactPhone;
    }

    /**
     * Sets the value of the contactPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactPhone(String value) {
        this.contactPhone = value;
    }

    /**
     * Gets the value of the capabilities property.
     * 
     * @return
     *     possible object is
     *     {@link Capabilities }
     *     
     */
    public Capabilities getCapabilities() {
        return capabilities;
    }

    /**
     * Sets the value of the capabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link Capabilities }
     *     
     */
    public void setCapabilities(Capabilities value) {
        this.capabilities = value;
    }

}
