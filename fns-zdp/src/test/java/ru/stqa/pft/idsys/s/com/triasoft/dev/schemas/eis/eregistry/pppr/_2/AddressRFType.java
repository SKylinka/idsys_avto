
package ru.stqa.pft.idsys.s.com.triasoft.dev.schemas.eis.eregistry.pppr._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * “ËÔ ¿‰ÂÒ ‚ –‘ (ÔÓ ‘»¿—)
 * 
 * <p>Java class for AddressRFType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddressRFType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RegionCode" type="{http://dev.triasoft.com/schemas/eis/eregistry/pppr/2.0}RegionCodeType"/>
 *         &lt;element name="Region" type="{http://dev.triasoft.com/schemas/eis/eregistry/pppr/2.0}String1-60Type"/>
 *         &lt;element name="District" type="{http://dev.triasoft.com/schemas/eis/eregistry/pppr/2.0}String1-60Type" minOccurs="0"/>
 *         &lt;element name="City" type="{http://dev.triasoft.com/schemas/eis/eregistry/pppr/2.0}String1-60Type" minOccurs="0"/>
 *         &lt;element name="Locality" type="{http://dev.triasoft.com/schemas/eis/eregistry/pppr/2.0}String1-60Type" minOccurs="0"/>
 *         &lt;element name="Street" type="{http://dev.triasoft.com/schemas/eis/eregistry/pppr/2.0}String1-60Type" minOccurs="0"/>
 *         &lt;element name="House" type="{http://dev.triasoft.com/schemas/eis/eregistry/pppr/2.0}String1-8Type" minOccurs="0"/>
 *         &lt;element name="Building" type="{http://dev.triasoft.com/schemas/eis/eregistry/pppr/2.0}String1-8Type" minOccurs="0"/>
 *         &lt;element name="Apartment" type="{http://dev.triasoft.com/schemas/eis/eregistry/pppr/2.0}String1-8Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressRFType", propOrder = {
    "regionCode",
    "region",
    "district",
    "city",
    "locality",
    "street",
    "house",
    "building",
    "apartment"
})
@XmlSeeAlso({
    AddressPrivatePersonRFType.class
})
public class AddressRFType {

    @XmlElement(name = "RegionCode", required = true)
    protected String regionCode;
    @XmlElement(name = "Region", required = true)
    protected String region;
    @XmlElement(name = "District")
    protected String district;
    @XmlElement(name = "City")
    protected String city;
    @XmlElement(name = "Locality")
    protected String locality;
    @XmlElement(name = "Street")
    protected String street;
    @XmlElement(name = "House")
    protected String house;
    @XmlElement(name = "Building")
    protected String building;
    @XmlElement(name = "Apartment")
    protected String apartment;

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
     * Gets the value of the region property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegion() {
        return region;
    }

    /**
     * Sets the value of the region property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegion(String value) {
        this.region = value;
    }

    /**
     * Gets the value of the district property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistrict() {
        return district;
    }

    /**
     * Sets the value of the district property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistrict(String value) {
        this.district = value;
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
     * Gets the value of the locality property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocality() {
        return locality;
    }

    /**
     * Sets the value of the locality property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocality(String value) {
        this.locality = value;
    }

    /**
     * Gets the value of the street property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreet() {
        return street;
    }

    /**
     * Sets the value of the street property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreet(String value) {
        this.street = value;
    }

    /**
     * Gets the value of the house property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHouse() {
        return house;
    }

    /**
     * Sets the value of the house property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHouse(String value) {
        this.house = value;
    }

    /**
     * Gets the value of the building property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuilding() {
        return building;
    }

    /**
     * Sets the value of the building property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuilding(String value) {
        this.building = value;
    }

    /**
     * Gets the value of the apartment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApartment() {
        return apartment;
    }

    /**
     * Sets the value of the apartment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApartment(String value) {
        this.apartment = value;
    }

}
