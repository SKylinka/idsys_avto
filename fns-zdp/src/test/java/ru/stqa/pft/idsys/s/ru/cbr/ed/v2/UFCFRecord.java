
package ru.stqa.pft.idsys.s.ru.cbr.ed.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * ������ ����������� ��-��.
 * 
 * <p>Java class for UFCFRecord complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UFCFRecord">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UFBIC" type="{urn:cbr-ru:ed:leaftypes:v2.0}BICRUIDType"/>
 *         &lt;element name="CFBICList" type="{urn:cbr-ru:ed:v2.0}CFBICList"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UFCFRecord", propOrder = {
    "ufbic",
    "cfbicList"
})
public class UFCFRecord {

    @XmlElement(name = "UFBIC", required = true)
    protected String ufbic;
    @XmlElement(name = "CFBICList", required = true)
    protected CFBICList cfbicList;

    /**
     * Gets the value of the ufbic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUFBIC() {
        return ufbic;
    }

    /**
     * Sets the value of the ufbic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUFBIC(String value) {
        this.ufbic = value;
    }

    /**
     * Gets the value of the cfbicList property.
     * 
     * @return
     *     possible object is
     *     {@link CFBICList }
     *     
     */
    public CFBICList getCFBICList() {
        return cfbicList;
    }

    /**
     * Sets the value of the cfbicList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CFBICList }
     *     
     */
    public void setCFBICList(CFBICList value) {
        this.cfbicList = value;
    }

}
