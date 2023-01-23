
package ru.stqa.pft.idsys.s.ru.id_sys.schemas.idbank.common._2012._0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Извещение об изменении в УЗ пользователя ЕСИА
 * 
 * <p>Java class for DataChange complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DataChange">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="personalDataCategory" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="snils" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="oid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataChange", propOrder = {
    "personalDataCategory",
    "snils",
    "oid"
})
public class DataChange {

    @XmlElement(required = true)
    protected String personalDataCategory;
    @XmlElement(required = true)
    protected String snils;
    @XmlElement(required = true)
    protected String oid;

    /**
     * Gets the value of the personalDataCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonalDataCategory() {
        return personalDataCategory;
    }

    /**
     * Sets the value of the personalDataCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonalDataCategory(String value) {
        this.personalDataCategory = value;
    }

    /**
     * Gets the value of the snils property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSnils() {
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
    public void setSnils(String value) {
        this.snils = value;
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

}
