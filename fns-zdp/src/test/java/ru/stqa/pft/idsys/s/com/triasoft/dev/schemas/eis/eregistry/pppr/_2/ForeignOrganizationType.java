
package ru.stqa.pft.idsys.s.com.triasoft.dev.schemas.eis.eregistry.pppr._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Тип Описание иностранного юридического лица
 * 
 * <p>Java class for ForeignOrganizationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ForeignOrganizationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NameFull" type="{http://dev.triasoft.com/schemas/eis/eregistry/pppr/2.0}OrganizationNameFullType"/>
 *         &lt;element name="NameFullLat" type="{http://dev.triasoft.com/schemas/eis/eregistry/pppr/2.0}OrganizationNameFullType" minOccurs="0"/>
 *         &lt;element name="ForeignRegisterName" type="{http://dev.triasoft.com/schemas/eis/eregistry/pppr/2.0}String1-1000Type" minOccurs="0"/>
 *         &lt;element name="RN" type="{http://dev.triasoft.com/schemas/eis/eregistry/pppr/2.0}ForeignOrganizationRNType" minOccurs="0"/>
 *         &lt;element name="INN" type="{http://dev.triasoft.com/schemas/eis/eregistry/pppr/2.0}ForeignOrganizationINNType" minOccurs="0"/>
 *         &lt;element name="Address" type="{http://dev.triasoft.com/schemas/eis/eregistry/pppr/2.0}AddressForeignOrganizationType"/>
 *         &lt;element name="Email" type="{http://dev.triasoft.com/schemas/eis/eregistry/pppr/2.0}EmailType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ForeignOrganizationType", propOrder = {
    "nameFull",
    "nameFullLat",
    "foreignRegisterName",
    "rn",
    "inn",
    "address",
    "email"
})
public class ForeignOrganizationType {

    @XmlElement(name = "NameFull", required = true)
    protected String nameFull;
    @XmlElement(name = "NameFullLat")
    protected String nameFullLat;
    @XmlElement(name = "ForeignRegisterName")
    protected String foreignRegisterName;
    @XmlElement(name = "RN")
    protected String rn;
    @XmlElement(name = "INN")
    protected String inn;
    @XmlElement(name = "Address", required = true)
    protected AddressForeignOrganizationType address;
    @XmlElement(name = "Email")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String email;

    /**
     * Gets the value of the nameFull property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameFull() {
        return nameFull;
    }

    /**
     * Sets the value of the nameFull property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameFull(String value) {
        this.nameFull = value;
    }

    /**
     * Gets the value of the nameFullLat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameFullLat() {
        return nameFullLat;
    }

    /**
     * Sets the value of the nameFullLat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameFullLat(String value) {
        this.nameFullLat = value;
    }

    /**
     * Gets the value of the foreignRegisterName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForeignRegisterName() {
        return foreignRegisterName;
    }

    /**
     * Sets the value of the foreignRegisterName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForeignRegisterName(String value) {
        this.foreignRegisterName = value;
    }

    /**
     * Gets the value of the rn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRN() {
        return rn;
    }

    /**
     * Sets the value of the rn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRN(String value) {
        this.rn = value;
    }

    /**
     * Gets the value of the inn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINN() {
        return inn;
    }

    /**
     * Sets the value of the inn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINN(String value) {
        this.inn = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link AddressForeignOrganizationType }
     *     
     */
    public AddressForeignOrganizationType getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressForeignOrganizationType }
     *     
     */
    public void setAddress(AddressForeignOrganizationType value) {
        this.address = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

}
