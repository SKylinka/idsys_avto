
package ru.stqa.pft.idsys.s.ru.cbr.dsig.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * Бинарные данные. Значение ЗК
 * 
 * <p>Java class for SigValueType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SigValueType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>base64Binary">
 *       &lt;attribute name="SigId" type="{urn:cbr-ru:dsig:v1.1}SigIdType" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SigValueType", propOrder = {
    "value"
})
public class SigValueType {

    @XmlValue
    protected byte[] value;
    @XmlAttribute(name = "SigId")
    protected String sigId;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setValue(byte[] value) {
        this.value = value;
    }

    /**
     * Gets the value of the sigId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSigId() {
        return sigId;
    }

    /**
     * Sets the value of the sigId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSigId(String value) {
        this.sigId = value;
    }

}
