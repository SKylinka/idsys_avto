
package ru.stqa.pft.idsys.s.ru.cbr.ed.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Список типов сообщений ISO
 * 
 * <p>Java class for ISOTypeList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ISOTypeList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="ISOTypeNo" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}Max15TextType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ISOTypeList")
public class ISOTypeList {

    @XmlAttribute(name = "ISOTypeNo", required = true)
    protected String isoTypeNo;

    /**
     * Gets the value of the isoTypeNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISOTypeNo() {
        return isoTypeNo;
    }

    /**
     * Sets the value of the isoTypeNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISOTypeNo(String value) {
        this.isoTypeNo = value;
    }

}
