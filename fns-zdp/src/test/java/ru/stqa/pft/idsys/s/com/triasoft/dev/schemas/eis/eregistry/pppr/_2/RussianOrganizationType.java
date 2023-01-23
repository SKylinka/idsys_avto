
package ru.stqa.pft.idsys.s.com.triasoft.dev.schemas.eis.eregistry.pppr._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Тип Описание российского юридического лица
 * 
 * <p>Java class for RussianOrganizationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RussianOrganizationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NameFull" type="{http://dev.triasoft.com/schemas/eis/eregistry/pppr/2.0}OrganizationNameFullType"/>
 *         &lt;element name="OGRN" type="{http://dev.triasoft.com/schemas/eis/eregistry/pppr/2.0}OrganizationOGRNType"/>
 *         &lt;element name="INN" type="{http://dev.triasoft.com/schemas/eis/eregistry/pppr/2.0}OrganizationINNType"/>
 *         &lt;element name="Address" type="{http://dev.triasoft.com/schemas/eis/eregistry/pppr/2.0}AddressRFType"/>
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
@XmlType(name = "RussianOrganizationType", propOrder = {
    "nameFull",
    "ogrn",
    "inn",
    "address",
    "email"
})
public class RussianOrganizationType {

    @XmlElement(name = "NameFull", required = true)
    protected String nameFull;
    @XmlElement(name = "OGRN", required = true)
    protected String ogrn;
    @XmlElement(name = "INN", required = true)
    protected String inn;
    @XmlElement(name = "Address", required = true)
    protected AddressRFType address;
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
     * Gets the value of the ogrn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOGRN() {
        return ogrn;
    }

    /**
     * Sets the value of the ogrn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOGRN(String value) {
        this.ogrn = value;
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
     *     {@link AddressRFType }
     *     
     */
    public AddressRFType getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressRFType }
     *     
     */
    public void setAddress(AddressRFType value) {
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
