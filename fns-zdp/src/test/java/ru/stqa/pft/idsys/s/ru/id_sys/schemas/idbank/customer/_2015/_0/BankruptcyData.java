
package ru.stqa.pft.idsys.s.ru.id_sys.schemas.idbank.customer._2015._0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import ru.id_sys.schemas.idbank.common._2012._0.FioType;
import ru.id_sys.schemas.idbank.common._2012._0.ObjectStatus;


/**
 * Запись реестра должников
 * 
 * <p>Java class for BankruptcyData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BankruptcyData">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.id-sys.ru/schemas/idbank/common/2012/0.01/}ObjectStatus">
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
 *         &lt;element name="INN" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="15"/>
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
 *         &lt;element name="SNILS" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="11"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="BirthDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BirthPlace" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NameHistory" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="NameHistoryItem" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DateLastModif" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Region" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Category" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CategoryCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LastMessageDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LastReportDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BankruptcyData", propOrder = {
    "fullName",
    "shortName",
    "fio",
    "inn",
    "ogrn",
    "snils",
    "birthDate",
    "birthPlace",
    "nameHistory",
    "address",
    "dateLastModif",
    "region",
    "category",
    "categoryCode",
    "lastMessageDate",
    "lastReportDate"
})
public class BankruptcyData
    extends ObjectStatus
{

    @XmlElement(name = "FullName")
    protected String fullName;
    @XmlElement(name = "ShortName")
    protected String shortName;
    @XmlElement(name = "FIO")
    protected FioType fio;
    @XmlElement(name = "INN")
    protected String inn;
    @XmlElement(name = "OGRN")
    protected String ogrn;
    @XmlElement(name = "SNILS")
    protected String snils;
    @XmlElement(name = "BirthDate")
    protected String birthDate;
    @XmlElement(name = "BirthPlace")
    protected String birthPlace;
    @XmlElement(name = "NameHistory")
    protected BankruptcyData.NameHistory nameHistory;
    @XmlElement(name = "Address")
    protected String address;
    @XmlElement(name = "DateLastModif", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateLastModif;
    @XmlElement(name = "Region", required = true)
    protected String region;
    @XmlElement(name = "Category", required = true)
    protected String category;
    @XmlElement(name = "CategoryCode", required = true)
    protected String categoryCode;
    @XmlElement(name = "LastMessageDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastMessageDate;
    @XmlElement(name = "LastReportDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastReportDate;

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
     * Gets the value of the birthDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthDate() {
        return birthDate;
    }

    /**
     * Sets the value of the birthDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthDate(String value) {
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
     * Gets the value of the nameHistory property.
     * 
     * @return
     *     possible object is
     *     {@link BankruptcyData.NameHistory }
     *     
     */
    public BankruptcyData.NameHistory getNameHistory() {
        return nameHistory;
    }

    /**
     * Sets the value of the nameHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankruptcyData.NameHistory }
     *     
     */
    public void setNameHistory(BankruptcyData.NameHistory value) {
        this.nameHistory = value;
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
     * Gets the value of the dateLastModif property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateLastModif() {
        return dateLastModif;
    }

    /**
     * Sets the value of the dateLastModif property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateLastModif(XMLGregorianCalendar value) {
        this.dateLastModif = value;
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
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategory(String value) {
        this.category = value;
    }

    /**
     * Gets the value of the categoryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoryCode() {
        return categoryCode;
    }

    /**
     * Sets the value of the categoryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoryCode(String value) {
        this.categoryCode = value;
    }

    /**
     * Gets the value of the lastMessageDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastMessageDate() {
        return lastMessageDate;
    }

    /**
     * Sets the value of the lastMessageDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastMessageDate(XMLGregorianCalendar value) {
        this.lastMessageDate = value;
    }

    /**
     * Gets the value of the lastReportDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastReportDate() {
        return lastReportDate;
    }

    /**
     * Sets the value of the lastReportDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastReportDate(XMLGregorianCalendar value) {
        this.lastReportDate = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="NameHistoryItem" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "nameHistoryItem"
    })
    public static class NameHistory {

        @XmlElement(name = "NameHistoryItem", required = true)
        protected List<String> nameHistoryItem;

        /**
         * Gets the value of the nameHistoryItem property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the nameHistoryItem property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNameHistoryItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getNameHistoryItem() {
            if (nameHistoryItem == null) {
                nameHistoryItem = new ArrayList<String>();
            }
            return this.nameHistoryItem;
        }

    }

}
