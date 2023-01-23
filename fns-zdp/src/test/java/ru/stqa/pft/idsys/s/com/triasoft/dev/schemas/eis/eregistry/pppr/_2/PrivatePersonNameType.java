
package ru.stqa.pft.idsys.s.com.triasoft.dev.schemas.eis.eregistry.pppr._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Тип ФИО по элементам
 * 
 * <p>Java class for PrivatePersonNameType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrivatePersonNameType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Last" type="{http://dev.triasoft.com/schemas/eis/eregistry/pppr/2.0}String1-60Type"/>
 *         &lt;element name="First" type="{http://dev.triasoft.com/schemas/eis/eregistry/pppr/2.0}String1-60Type"/>
 *         &lt;element name="Middle" type="{http://dev.triasoft.com/schemas/eis/eregistry/pppr/2.0}String1-60Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrivatePersonNameType", propOrder = {
    "last",
    "first",
    "middle"
})
public class PrivatePersonNameType {

    @XmlElement(name = "Last", required = true)
    protected String last;
    @XmlElement(name = "First", required = true)
    protected String first;
    @XmlElement(name = "Middle")
    protected String middle;

    /**
     * Gets the value of the last property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLast() {
        return last;
    }

    /**
     * Sets the value of the last property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLast(String value) {
        this.last = value;
    }

    /**
     * Gets the value of the first property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirst() {
        return first;
    }

    /**
     * Sets the value of the first property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirst(String value) {
        this.first = value;
    }

    /**
     * Gets the value of the middle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddle() {
        return middle;
    }

    /**
     * Sets the value of the middle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddle(String value) {
        this.middle = value;
    }

}
