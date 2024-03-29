
package ru.stqa.pft.idsys.s.com.triasoft.dev.schemas.eis.eregistry.pppr._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * ��� �������� ����������� ����
 * 
 * <p>Java class for PrivatePersonType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrivatePersonType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://dev.triasoft.com/schemas/eis/eregistry/pppr/2.0}PrivatePersonNameType"/>
 *         &lt;element name="NameForeign" type="{http://dev.triasoft.com/schemas/eis/eregistry/pppr/2.0}PrivatePersonNameForeignType" minOccurs="0"/>
 *         &lt;element name="BirthDate" type="{http://dev.triasoft.com/schemas/eis/eregistry/pppr/2.0}DateType"/>
 *         &lt;element name="PersonDocument" type="{http://dev.triasoft.com/schemas/eis/eregistry/pppr/2.0}PrivatePersonDocumentType"/>
 *         &lt;element name="PersonAddress" type="{http://dev.triasoft.com/schemas/eis/eregistry/pppr/2.0}AddressPrivatePersonType"/>
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
@XmlType(name = "PrivatePersonType", propOrder = {
    "name",
    "nameForeign",
    "birthDate",
    "personDocument",
    "personAddress",
    "email"
})
public class PrivatePersonType {

    @XmlElement(name = "Name", required = true)
    protected PrivatePersonNameType name;
    @XmlElement(name = "NameForeign")
    protected PrivatePersonNameForeignType nameForeign;
    @XmlElement(name = "BirthDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar birthDate;
    @XmlElement(name = "PersonDocument", required = true)
    protected PrivatePersonDocumentType personDocument;
    @XmlElement(name = "PersonAddress", required = true)
    protected AddressPrivatePersonType personAddress;
    @XmlElement(name = "Email")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String email;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link PrivatePersonNameType }
     *     
     */
    public PrivatePersonNameType getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrivatePersonNameType }
     *     
     */
    public void setName(PrivatePersonNameType value) {
        this.name = value;
    }

    /**
     * Gets the value of the nameForeign property.
     * 
     * @return
     *     possible object is
     *     {@link PrivatePersonNameForeignType }
     *     
     */
    public PrivatePersonNameForeignType getNameForeign() {
        return nameForeign;
    }

    /**
     * Sets the value of the nameForeign property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrivatePersonNameForeignType }
     *     
     */
    public void setNameForeign(PrivatePersonNameForeignType value) {
        this.nameForeign = value;
    }

    /**
     * Gets the value of the birthDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBirthDate() {
        return birthDate;
    }

    /**
     * Sets the value of the birthDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBirthDate(XMLGregorianCalendar value) {
        this.birthDate = value;
    }

    /**
     * Gets the value of the personDocument property.
     * 
     * @return
     *     possible object is
     *     {@link PrivatePersonDocumentType }
     *     
     */
    public PrivatePersonDocumentType getPersonDocument() {
        return personDocument;
    }

    /**
     * Sets the value of the personDocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrivatePersonDocumentType }
     *     
     */
    public void setPersonDocument(PrivatePersonDocumentType value) {
        this.personDocument = value;
    }

    /**
     * Gets the value of the personAddress property.
     * 
     * @return
     *     possible object is
     *     {@link AddressPrivatePersonType }
     *     
     */
    public AddressPrivatePersonType getPersonAddress() {
        return personAddress;
    }

    /**
     * Sets the value of the personAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressPrivatePersonType }
     *     
     */
    public void setPersonAddress(AddressPrivatePersonType value) {
        this.personAddress = value;
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
