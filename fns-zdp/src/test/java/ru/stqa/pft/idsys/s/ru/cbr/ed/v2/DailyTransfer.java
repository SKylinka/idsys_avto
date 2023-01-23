
package ru.stqa.pft.idsys.s.ru.cbr.ed.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Balance Sweeping Event.
 * 
 * <p>Java class for DailyTransfer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DailyTransfer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="TimeTransfer" type="{urn:cbr-ru:ed:leaftypes:v2.0}TimeType"/>
 *         &lt;element name="EventTransfer" type="{urn:cbr-ru:ed:v2.0}EventTransfer"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DailyTransfer", propOrder = {
    "timeTransfer",
    "eventTransfer"
})
public class DailyTransfer {

    @XmlElement(name = "TimeTransfer")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar timeTransfer;
    @XmlElement(name = "EventTransfer")
    protected EventTransfer eventTransfer;

    /**
     * Gets the value of the timeTransfer property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeTransfer() {
        return timeTransfer;
    }

    /**
     * Sets the value of the timeTransfer property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeTransfer(XMLGregorianCalendar value) {
        this.timeTransfer = value;
    }

    /**
     * Gets the value of the eventTransfer property.
     * 
     * @return
     *     possible object is
     *     {@link EventTransfer }
     *     
     */
    public EventTransfer getEventTransfer() {
        return eventTransfer;
    }

    /**
     * Sets the value of the eventTransfer property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventTransfer }
     *     
     */
    public void setEventTransfer(EventTransfer value) {
        this.eventTransfer = value;
    }

}
