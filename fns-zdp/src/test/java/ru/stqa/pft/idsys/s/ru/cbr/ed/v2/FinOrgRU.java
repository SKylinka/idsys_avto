
package ru.stqa.pft.idsys.s.ru.cbr.ed.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Financial Institution Attributes in FTI.
 * 
 * <p>Java class for FinOrgRU complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FinOrgRU">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="BIC" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}BICRUIDType" />
 *       &lt;attribute name="SWBIC" type="{urn:cbr-ru:ed:leaftypes:v2.0}BICSWIFTIDType" />
 *       &lt;attribute name="CorrespAcc" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}AccountNumberRUIDType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinOrgRU")
public class FinOrgRU {

    @XmlAttribute(name = "BIC", required = true)
    protected String bic;
    @XmlAttribute(name = "SWBIC")
    protected String swbic;
    @XmlAttribute(name = "CorrespAcc", required = true)
    protected String correspAcc;

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
     * Gets the value of the swbic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSWBIC() {
        return swbic;
    }

    /**
     * Sets the value of the swbic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSWBIC(String value) {
        this.swbic = value;
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
