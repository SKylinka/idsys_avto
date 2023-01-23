
package ru.stqa.pft.idsys.s.ru.cbr.ed.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Список кодов ошибок SWIFT
 * 
 * <p>Java class for SWIFTErrCodeList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SWIFTErrCodeList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SWIFTErrAnnotation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="SWIFTErrCode" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}Eq3TextType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SWIFTErrCodeList", propOrder = {
    "swiftErrAnnotation"
})
public class SWIFTErrCodeList {

    @XmlElement(name = "SWIFTErrAnnotation")
    protected String swiftErrAnnotation;
    @XmlAttribute(name = "SWIFTErrCode", required = true)
    protected String swiftErrCode;

    /**
     * Gets the value of the swiftErrAnnotation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSWIFTErrAnnotation() {
        return swiftErrAnnotation;
    }

    /**
     * Sets the value of the swiftErrAnnotation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSWIFTErrAnnotation(String value) {
        this.swiftErrAnnotation = value;
    }

    /**
     * Gets the value of the swiftErrCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSWIFTErrCode() {
        return swiftErrCode;
    }

    /**
     * Sets the value of the swiftErrCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSWIFTErrCode(String value) {
        this.swiftErrCode = value;
    }

}
