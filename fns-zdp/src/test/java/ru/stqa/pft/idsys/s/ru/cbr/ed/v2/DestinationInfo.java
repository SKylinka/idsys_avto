
package ru.stqa.pft.idsys.s.ru.cbr.ed.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Destination Account.
 * 
 * <p>Java class for DestinationInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DestinationInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="DestinationBIC" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}BICRUIDType" />
 *       &lt;attribute name="DestinationAccount" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}AccountNumberRUIDType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DestinationInfo")
public class DestinationInfo {

    @XmlAttribute(name = "DestinationBIC", required = true)
    protected String destinationBIC;
    @XmlAttribute(name = "DestinationAccount", required = true)
    protected String destinationAccount;

    /**
     * Gets the value of the destinationBIC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationBIC() {
        return destinationBIC;
    }

    /**
     * Sets the value of the destinationBIC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationBIC(String value) {
        this.destinationBIC = value;
    }

    /**
     * Gets the value of the destinationAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationAccount() {
        return destinationAccount;
    }

    /**
     * Sets the value of the destinationAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationAccount(String value) {
        this.destinationAccount = value;
    }

}
