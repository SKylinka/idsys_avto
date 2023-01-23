
package ru.stqa.pft.idsys.s.ru.cbr.ed.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Request Time Period
 * 
 * <p>Java class for TimePeriod complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimePeriod">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="TimeFromTo" type="{urn:cbr-ru:ed:v2.0}TimeFromTo"/>
 *         &lt;element name="InquiryDate" type="{urn:cbr-ru:ed:leaftypes:v2.0}DateType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimePeriod", propOrder = {
    "timeFromTo",
    "inquiryDate"
})
public class TimePeriod {

    @XmlElement(name = "TimeFromTo")
    protected TimeFromTo timeFromTo;
    @XmlElement(name = "InquiryDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar inquiryDate;

    /**
     * Gets the value of the timeFromTo property.
     * 
     * @return
     *     possible object is
     *     {@link TimeFromTo }
     *     
     */
    public TimeFromTo getTimeFromTo() {
        return timeFromTo;
    }

    /**
     * Sets the value of the timeFromTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeFromTo }
     *     
     */
    public void setTimeFromTo(TimeFromTo value) {
        this.timeFromTo = value;
    }

    /**
     * Gets the value of the inquiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInquiryDate() {
        return inquiryDate;
    }

    /**
     * Sets the value of the inquiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInquiryDate(XMLGregorianCalendar value) {
        this.inquiryDate = value;
    }

}
