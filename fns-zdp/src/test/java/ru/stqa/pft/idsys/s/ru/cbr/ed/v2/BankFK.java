
package ru.stqa.pft.idsys.s.ru.cbr.ed.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Реквизиты банка
 * 
 * <p>Java class for BankFK complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BankFK">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BIC" type="{urn:cbr-ru:ed:leaftypes:v2.0}BICRUIDType"/>
 *         &lt;element name="CorrespAcc" type="{urn:cbr-ru:ed:leaftypes:v2.0}AccountNumberRUIDType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BankFK", propOrder = {
    "bic",
    "correspAcc"
})
public class BankFK {

    @XmlElement(name = "BIC", required = true)
    protected String bic;
    @XmlElement(name = "CorrespAcc")
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
