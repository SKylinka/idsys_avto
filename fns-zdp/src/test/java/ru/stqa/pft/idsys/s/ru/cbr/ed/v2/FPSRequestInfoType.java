
package ru.stqa.pft.idsys.s.ru.cbr.ed.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Информация по запросу потранзакционного реестра.
 * 
 * <p>Java class for FPSRequestInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FPSRequestInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="DateTimeInterval" type="{urn:cbr-ru:ed:v2.0}DateTimeInterval"/>
 *         &lt;element name="BusinessDay" type="{urn:cbr-ru:ed:v2.0}BusinessDay"/>
 *       &lt;/choice>
 *       &lt;attribute name="BIC" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}BICRUIDType" />
 *       &lt;attribute name="CorrespAcc" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}AccountNumberRUIDType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FPSRequestInfoType", propOrder = {
    "dateTimeInterval",
    "businessDay"
})
public class FPSRequestInfoType {

    @XmlElement(name = "DateTimeInterval")
    protected DateTimeInterval dateTimeInterval;
    @XmlElement(name = "BusinessDay")
    protected BusinessDay businessDay;
    @XmlAttribute(name = "BIC", required = true)
    protected String bic;
    @XmlAttribute(name = "CorrespAcc", required = true)
    protected String correspAcc;

    /**
     * Gets the value of the dateTimeInterval property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeInterval }
     *     
     */
    public DateTimeInterval getDateTimeInterval() {
        return dateTimeInterval;
    }

    /**
     * Sets the value of the dateTimeInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeInterval }
     *     
     */
    public void setDateTimeInterval(DateTimeInterval value) {
        this.dateTimeInterval = value;
    }

    /**
     * Gets the value of the businessDay property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessDay }
     *     
     */
    public BusinessDay getBusinessDay() {
        return businessDay;
    }

    /**
     * Sets the value of the businessDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDay }
     *     
     */
    public void setBusinessDay(BusinessDay value) {
        this.businessDay = value;
    }

    /**
     * Gets the value of the bic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBIC() {
        return bic;
    }

    /**
     * Sets the value of the bic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBIC(String value) {
        this.bic = value;
    }

    /**
     * Gets the value of the correspAcc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrespAcc() {
        return correspAcc;
    }

    /**
     * Sets the value of the correspAcc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrespAcc(String value) {
        this.correspAcc = value;
    }

}
