
package ru.stqa.pft.idsys.s.ru.cbr.ed.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ru.stqa.pft.idsys.s.ru.cbr.ed.leaftypes.v2.GarFundsUsageType;


/**
 * Guarantee fund information.
 * 
 * <p>Java class for GarFunds complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GarFunds">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GarFundNumber" type="{urn:cbr-ru:ed:v2.0}GarFundNumber" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="GarFundsUsage" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}GarFundsUsageType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GarFunds", propOrder = {
    "garFundNumber"
})
public class GarFunds {

    @XmlElement(name = "GarFundNumber")
    protected GarFundNumber garFundNumber;
    @XmlAttribute(name = "GarFundsUsage", required = true)
    protected GarFundsUsageType garFundsUsage;

    /**
     * Gets the value of the garFundNumber property.
     * 
     * @return
     *     possible object is
     *     {@link GarFundNumber }
     *     
     */
    public GarFundNumber getGarFundNumber() {
        return garFundNumber;
    }

    /**
     * Sets the value of the garFundNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link GarFundNumber }
     *     
     */
    public void setGarFundNumber(GarFundNumber value) {
        this.garFundNumber = value;
    }

    /**
     * Gets the value of the garFundsUsage property.
     * 
     * @return
     *     possible object is
     *     {@link GarFundsUsageType }
     *     
     */
    public GarFundsUsageType getGarFundsUsage() {
        return garFundsUsage;
    }

    /**
     * Sets the value of the garFundsUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link GarFundsUsageType }
     *     
     */
    public void setGarFundsUsage(GarFundsUsageType value) {
        this.garFundsUsage = value;
    }

}
