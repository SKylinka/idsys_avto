
package ru.stqa.pft.idsys.s.ru.cbr.ed.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Список типов сообщений TSLC
 * 
 * <p>Java class for TSLCTypeList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TSLCTypeList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="TSLCTypeNo" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}Max15TextType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TSLCTypeList")
public class TSLCTypeList {

    @XmlAttribute(name = "TSLCTypeNo", required = true)
    protected String tslcTypeNo;

    /**
     * Gets the value of the tslcTypeNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSLCTypeNo() {
        return tslcTypeNo;
    }

    /**
     * Sets the value of the tslcTypeNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSLCTypeNo(String value) {
        this.tslcTypeNo = value;
    }

}
