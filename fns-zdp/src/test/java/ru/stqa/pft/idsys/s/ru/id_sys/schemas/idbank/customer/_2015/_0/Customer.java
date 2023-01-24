
package ru.stqa.pft.idsys.s.ru.id_sys.schemas.idbank.customer._2015._0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import ru.stqa.pft.idsys.s.ru.id_sys.schemas.idbank.common._2012._0.ContactInfo;
import ru.stqa.pft.idsys.s.ru.id_sys.schemas.idbank.common._2012._0.FioType;
import ru.stqa.pft.idsys.s.ru.id_sys.schemas.idbank.common._2012._0.IdentificationEx;
import ru.stqa.pft.idsys.s.ru.id_sys.schemas.idbank.common._2012._0.OMSEx;
import ru.stqa.pft.idsys.s.ru.id_sys.schemas.idbank.common._2012._0.Object;
import ru.stqa.pft.idsys.s.ru.roskazna.xsd.organization.AccountType;


/**
 * Клиент
 * 
 * <p>Java class for Customer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Customer">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.id-sys.ru/schemas/idbank/common/2012/0.01/}Object">
 *       &lt;sequence>
 *         &lt;element name="FullName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ShortName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="500"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FIO" type="{http://www.id-sys.ru/schemas/idbank/common/2012/0.01/}FioType" minOccurs="0"/>
 *         &lt;element name="BirthDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="BirthPlace" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INN" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="12"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="OGRN" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="15"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SNILS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Gender" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="M"/>
 *               &lt;enumeration value="F"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Citizenship" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Identification" type="{http://www.id-sys.ru/schemas/idbank/common/2012/0.01/}IdentificationEx" minOccurs="0"/>
 *         &lt;element name="queryID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="OMS" type="{http://www.id-sys.ru/schemas/idbank/common/2012/0.01/}OMSEx" minOccurs="0"/>
 *         &lt;element name="ContactInfo" type="{http://www.id-sys.ru/schemas/idbank/common/2012/0.01/}ContactInfo" minOccurs="0"/>
 *         &lt;element name="OperatorSnils" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ra" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="oid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Account" type="{http://roskazna.ru/xsd/Organization}AccountType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Customer", propOrder = {
    "fullName",
    "shortName",
    "fio",
    "birthDate",
    "birthPlace",
    "inn",
    "ogrn",
    "snils",
    "gender",
    "citizenship",
    "identification",
    "queryID",
    "oms",
    "contactInfo",
    "operatorSnils",
    "ra",
    "oid",
    "account"
})
public class Customer
    extends Object
{

    @XmlElement(name = "FullName")
    protected String fullName;
    @XmlElement(name = "ShortName")
    protected String shortName;
    @XmlElement(name = "FIO")
    protected FioType fio;
    @XmlElement(name = "BirthDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar birthDate;
    @XmlElement(name = "BirthPlace")
    protected String birthPlace;
    @XmlElement(name = "INN")
    protected String inn;
    @XmlElement(name = "OGRN")
    protected String ogrn;
    @XmlElement(name = "SNILS")
    protected String snils;
    @XmlElement(name = "Gender")
    protected String gender;
    @XmlElement(name = "Citizenship")
    protected String citizenship;
    @XmlElement(name = "Identification")
    protected IdentificationEx identification;
    protected Long queryID;
    @XmlElement(name = "OMS")
    protected OMSEx oms;
    @XmlElement(name = "ContactInfo")
    protected ContactInfo contactInfo;
    @XmlElement(name = "OperatorSnils")
    protected String operatorSnils;
    protected Long ra;
    protected String oid;
    @XmlElement(name = "Account")
    protected AccountType account;

    /**
     * Gets the value of the fullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Sets the value of the fullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullName(String value) {
        this.fullName = value;
    }

    /**
     * Gets the value of the shortName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortName() {
        return shortName;
    }

    /**
     * Sets the value of the shortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortName(String value) {
        this.shortName = value;
    }

    /**
     * Gets the value of the fio property.
     * 
     * @return
     *     possible object is
     *     {@link FioType }
     *     
     */
    public FioType getFIO() {
        return fio;
    }

    /**
     * Sets the value of the fio property.
     * 
     * @param value
     *     allowed object is
     *     {@link FioType }
     *     
     */
    public void setFIO(FioType value) {
        this.fio = value;
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
     * Gets the value of the birthPlace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthPlace() {
        return birthPlace;
    }

    /**
     * Sets the value of the birthPlace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthPlace(String value) {
        this.birthPlace = value;
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
     * Gets the value of the snils property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSNILS() {
        return snils;
    }

    /**
     * Sets the value of the snils property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSNILS(String value) {
        this.snils = value;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGender(String value) {
        this.gender = value;
    }

    /**
     * Gets the value of the citizenship property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCitizenship() {
        return citizenship;
    }

    /**
     * Sets the value of the citizenship property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCitizenship(String value) {
        this.citizenship = value;
    }

    /**
     * Gets the value of the identification property.
     * 
     * @return
     *     possible object is
     *     {@link IdentificationEx }
     *     
     */
    public IdentificationEx getIdentification() {
        return identification;
    }

    /**
     * Sets the value of the identification property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentificationEx }
     *     
     */
    public void setIdentification(IdentificationEx value) {
        this.identification = value;
    }

    /**
     * Gets the value of the queryID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getQueryID() {
        return queryID;
    }

    /**
     * Sets the value of the queryID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setQueryID(Long value) {
        this.queryID = value;
    }

    /**
     * Gets the value of the oms property.
     * 
     * @return
     *     possible object is
     *     {@link OMSEx }
     *     
     */
    public OMSEx getOMS() {
        return oms;
    }

    /**
     * Sets the value of the oms property.
     * 
     * @param value
     *     allowed object is
     *     {@link OMSEx }
     *     
     */
    public void setOMS(OMSEx value) {
        this.oms = value;
    }

    /**
     * Gets the value of the contactInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ContactInfo }
     *     
     */
    public ContactInfo getContactInfo() {
        return contactInfo;
    }

    /**
     * Sets the value of the contactInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactInfo }
     *     
     */
    public void setContactInfo(ContactInfo value) {
        this.contactInfo = value;
    }

    /**
     * Gets the value of the operatorSnils property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatorSnils() {
        return operatorSnils;
    }

    /**
     * Sets the value of the operatorSnils property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperatorSnils(String value) {
        this.operatorSnils = value;
    }

    /**
     * Gets the value of the ra property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRa() {
        return ra;
    }

    /**
     * Sets the value of the ra property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRa(Long value) {
        this.ra = value;
    }

    /**
     * Gets the value of the oid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOid() {
        return oid;
    }

    /**
     * Sets the value of the oid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOid(String value) {
        this.oid = value;
    }

    /**
     * Gets the value of the account property.
     * 
     * @return
     *     possible object is
     *     {@link AccountType }
     *     
     */
    public AccountType getAccount() {
        return account;
    }

    /**
     * Sets the value of the account property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountType }
     *     
     */
    public void setAccount(AccountType value) {
        this.account = value;
    }

}
