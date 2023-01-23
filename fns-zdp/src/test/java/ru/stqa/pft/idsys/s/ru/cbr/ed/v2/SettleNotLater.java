
package ru.stqa.pft.idsys.s.ru.cbr.ed.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * "Execute not later than".
 * 
 * <p>Java class for SettleNotLater complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SettleNotLater">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SettlementTime" type="{urn:cbr-ru:ed:leaftypes:v2.0}TimeType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettleNotLater", propOrder = {
    "settlementTime"
})
public class SettleNotLater {

    @XmlElement(name = "SettlementTime", required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar settlementTime;

    /**
     * Gets the value of the settlementTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSettlementTime() {
        return settlementTime;
    }

    /**
     * Sets the value of the settlementTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSettlementTime(XMLGregorianCalendar value) {
        this.settlementTime = value;
    }

}
