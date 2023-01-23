
package ru.stqa.pft.idsys.s.ru.cbr.ed.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Condition Parameters.
 * 
 * <p>Java class for LiquidityReservationSchemeParameters complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LiquidityReservationSchemeParameters">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="ConfirmationMessageAuthor" type="{urn:cbr-ru:ed:leaftypes:v2.0}EDDrawerIDType" />
 *       &lt;attribute name="CancelIfNotReserved" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}IndicatorType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LiquidityReservationSchemeParameters")
public class LiquidityReservationSchemeParameters {

    @XmlAttribute(name = "ConfirmationMessageAuthor")
    protected String confirmationMessageAuthor;
    @XmlAttribute(name = "CancelIfNotReserved", required = true)
    protected boolean cancelIfNotReserved;

    /**
     * Gets the value of the confirmationMessageAuthor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfirmationMessageAuthor() {
        return confirmationMessageAuthor;
    }

    /**
     * Sets the value of the confirmationMessageAuthor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfirmationMessageAuthor(String value) {
        this.confirmationMessageAuthor = value;
    }

    /**
     * Gets the value of the cancelIfNotReserved property.
     * 
     */
    public boolean isCancelIfNotReserved() {
        return cancelIfNotReserved;
    }

    /**
     * Sets the value of the cancelIfNotReserved property.
     * 
     */
    public void setCancelIfNotReserved(boolean value) {
        this.cancelIfNotReserved = value;
    }

}
