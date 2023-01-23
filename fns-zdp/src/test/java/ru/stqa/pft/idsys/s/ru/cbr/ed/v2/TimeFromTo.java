
package ru.stqa.pft.idsys.s.ru.cbr.ed.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Time range requested EM were sent or received.
 * 
 * <p>Java class for TimeFromTo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimeFromTo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="TimeFrom" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}DateTimeType" />
 *       &lt;attribute name="TimeTo" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}DateTimeType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeFromTo")
public class TimeFromTo {

    @XmlAttribute(name = "TimeFrom", required = true)
    protected XMLGregorianCalendar timeFrom;
    @XmlAttribute(name = "TimeTo", required = true)
    protected XMLGregorianCalendar timeTo;

    /**
     * Gets the value of the timeFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeFrom() {
        return timeFrom;
    }

    /**
     * Sets the value of the timeFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeFrom(XMLGregorianCalendar value) {
        this.timeFrom = value;
    }

    /**
     * Gets the value of the timeTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeTo() {
        return timeTo;
    }

    /**
     * Sets the value of the timeTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeTo(XMLGregorianCalendar value) {
        this.timeTo = value;
    }

}
