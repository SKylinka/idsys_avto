
package ru.stqa.pft.idsys.s.ru.cbr.ed.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Information about requesting (requested) Attrubute.
 * 
 * <p>Java class for FieldInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FieldInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FieldNo" type="{urn:cbr-ru:ed:leaftypes:v2.0}Max70TextType"/>
 *         &lt;element name="FieldValue" type="{urn:cbr-ru:ed:leaftypes:v2.0}Max210TextType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FieldInfo", propOrder = {
    "fieldNo",
    "fieldValue"
})
public class FieldInfo {

    @XmlElement(name = "FieldNo", required = true)
    protected String fieldNo;
    @XmlElement(name = "FieldValue")
    protected String fieldValue;

    /**
     * Gets the value of the fieldNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldNo() {
        return fieldNo;
    }

    /**
     * Sets the value of the fieldNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldNo(String value) {
        this.fieldNo = value;
    }

    /**
     * Gets the value of the fieldValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldValue() {
        return fieldValue;
    }

    /**
     * Sets the value of the fieldValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldValue(String value) {
        this.fieldValue = value;
    }

}
