
package ru.stqa.pft.idsys.s.ru.cbr.ed.v2;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * List of Arrests/Limitations.
 * 
 * <p>Java class for ArrestDetailedInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrestDetailedInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RestrictionBasisDoc" type="{urn:cbr-ru:ed:v2.0}RestrictionBasisDocument" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ArrestID" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}Max10TextType" />
 *       &lt;attribute name="IndeterminateAmountFlag" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}IndicatorType" />
 *       &lt;attribute name="ArrestAmount" type="{urn:cbr-ru:ed:leaftypes:v2.0}NotNegativeKopeckAmountType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrestDetailedInfo", propOrder = {
    "restrictionBasisDoc"
})
public class ArrestDetailedInfo {

    @XmlElement(name = "RestrictionBasisDoc")
    protected RestrictionBasisDocument restrictionBasisDoc;
    @XmlAttribute(name = "ArrestID", required = true)
    protected String arrestID;
    @XmlAttribute(name = "IndeterminateAmountFlag", required = true)
    protected boolean indeterminateAmountFlag;
    @XmlAttribute(name = "ArrestAmount")
    protected BigInteger arrestAmount;

    /**
     * Gets the value of the restrictionBasisDoc property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictionBasisDocument }
     *     
     */
    public RestrictionBasisDocument getRestrictionBasisDoc() {
        return restrictionBasisDoc;
    }

    /**
     * Sets the value of the restrictionBasisDoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictionBasisDocument }
     *     
     */
    public void setRestrictionBasisDoc(RestrictionBasisDocument value) {
        this.restrictionBasisDoc = value;
    }

    /**
     * Gets the value of the arrestID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrestID() {
        return arrestID;
    }

    /**
     * Sets the value of the arrestID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrestID(String value) {
        this.arrestID = value;
    }

    /**
     * Gets the value of the indeterminateAmountFlag property.
     * 
     */
    public boolean isIndeterminateAmountFlag() {
        return indeterminateAmountFlag;
    }

    /**
     * Sets the value of the indeterminateAmountFlag property.
     * 
     */
    public void setIndeterminateAmountFlag(boolean value) {
        this.indeterminateAmountFlag = value;
    }

    /**
     * Gets the value of the arrestAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getArrestAmount() {
        return arrestAmount;
    }

    /**
     * Sets the value of the arrestAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setArrestAmount(BigInteger value) {
        this.arrestAmount = value;
    }

}
