
package ru.stqa.pft.idsys.s.ru.cbr.ed.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Список счетов
 * 
 * <p>Java class for AccModifList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccModifList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="Acc" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}AccountNumberRUIDType" />
 *       &lt;attribute name="AccOperationType" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}OneDigitCodeType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccModifList")
public class AccModifList {

    @XmlAttribute(name = "Acc", required = true)
    protected String acc;
    @XmlAttribute(name = "AccOperationType", required = true)
    protected String accOperationType;

    /**
     * Gets the value of the acc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcc() {
        return acc;
    }

    /**
     * Sets the value of the acc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcc(String value) {
        this.acc = value;
    }

    /**
     * Gets the value of the accOperationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccOperationType() {
        return accOperationType;
    }

    /**
     * Sets the value of the accOperationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccOperationType(String value) {
        this.accOperationType = value;
    }

}
