
package ru.stqa.pft.idsys.s.com.triasoft.dev.schemas.eis.eregistry.pppr._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Тип Адрес иностранного юридического лица
 * 
 * <p>Java class for AddressForeignOrganizationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddressForeignOrganizationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CountryCode" type="{http://dev.triasoft.com/schemas/eis/eregistry/pppr/2.0}CountryCodeType"/>
 *         &lt;element name="Country" type="{http://dev.triasoft.com/schemas/eis/eregistry/pppr/2.0}String1-60Type"/>
 *         &lt;element name="AddressRus" type="{http://dev.triasoft.com/schemas/eis/eregistry/pppr/2.0}String1-255Type"/>
 *         &lt;element name="AddressLat" type="{http://dev.triasoft.com/schemas/eis/eregistry/pppr/2.0}String1-255Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressForeignOrganizationType", propOrder = {
    "countryCode",
    "country",
    "addressRus",
    "addressLat"
})
public class AddressForeignOrganizationType {

    @XmlElement(name = "CountryCode", required = true)
    protected String countryCode;
    @XmlElement(name = "Country", required = true)
    protected String country;
    @XmlElement(name = "AddressRus", required = true)
    protected String addressRus;
    @XmlElement(name = "AddressLat")
    protected String addressLat;

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
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the addressRus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressRus() {
        return addressRus;
    }

    /**
     * Sets the value of the addressRus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressRus(String value) {
        this.addressRus = value;
    }

    /**
     * Gets the value of the addressLat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressLat() {
        return addressLat;
    }

    /**
     * Sets the value of the addressLat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressLat(String value) {
        this.addressLat = value;
    }

}
