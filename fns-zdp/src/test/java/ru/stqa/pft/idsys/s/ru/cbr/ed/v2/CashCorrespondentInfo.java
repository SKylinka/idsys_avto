
package ru.stqa.pft.idsys.s.ru.cbr.ed.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Корреспондент.
 * 
 * <p>Java class for CashCorrespondentInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CashCorrespondentInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="BICCorr" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}BICRUIDType" />
 *       &lt;attribute name="CorrAcc" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}AccountNumberRUIDType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CashCorrespondentInfo")
public class CashCorrespondentInfo {

    @XmlAttribute(name = "BICCorr", required = true)
    protected String bicCorr;
    @XmlAttribute(name = "CorrAcc", required = true)
    protected String corrAcc;

    /**
     * Gets the value of the bicCorr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBICCorr() {
        return bicCorr;
    }

    /**
     * Sets the value of the bicCorr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBICCorr(String value) {
        this.bicCorr = value;
    }

    /**
     * Gets the value of the corrAcc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrAcc() {
        return corrAcc;
    }

    /**
     * Sets the value of the corrAcc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrAcc(String value) {
        this.corrAcc = value;
    }

}
