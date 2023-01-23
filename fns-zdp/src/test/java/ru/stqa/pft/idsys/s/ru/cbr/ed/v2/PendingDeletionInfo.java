
package ru.stqa.pft.idsys.s.ru.cbr.ed.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Additional information for “Pending deletion” restriction.
 * 
 * <p>Java class for PendingDeletionInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PendingDeletionInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DestinationInfo" type="{urn:cbr-ru:ed:v2.0}DestinationInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="AccountCloseDate" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}DateType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PendingDeletionInfo", propOrder = {
    "destinationInfo"
})
public class PendingDeletionInfo {

    @XmlElement(name = "DestinationInfo")
    protected DestinationInfo destinationInfo;
    @XmlAttribute(name = "AccountCloseDate", required = true)
    protected XMLGregorianCalendar accountCloseDate;

    /**
     * Gets the value of the destinationInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DestinationInfo }
     *     
     */
    public DestinationInfo getDestinationInfo() {
        return destinationInfo;
    }

    /**
     * Sets the value of the destinationInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DestinationInfo }
     *     
     */
    public void setDestinationInfo(DestinationInfo value) {
        this.destinationInfo = value;
    }

    /**
     * Gets the value of the accountCloseDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAccountCloseDate() {
        return accountCloseDate;
    }

    /**
     * Sets the value of the accountCloseDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAccountCloseDate(XMLGregorianCalendar value) {
        this.accountCloseDate = value;
    }

}
