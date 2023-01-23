
package ru.stqa.pft.idsys.s.ru.id_sys.schemas.idbank.common._2012._0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for termType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="termType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sysname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="require" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="requireReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "termType", propOrder = {
    "sysname",
    "require",
    "requireReason"
})
public class TermType {

    @XmlElement(required = true)
    protected String sysname;
    protected Boolean require;
    protected String requireReason;

    /**
     * Gets the value of the sysname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSysname() {
        return sysname;
    }

    /**
     * Sets the value of the sysname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSysname(String value) {
        this.sysname = value;
    }

    /**
     * Gets the value of the require property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRequire() {
        return require;
    }

    /**
     * Sets the value of the require property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRequire(Boolean value) {
        this.require = value;
    }

    /**
     * Gets the value of the requireReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequireReason() {
        return requireReason;
    }

    /**
     * Sets the value of the requireReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequireReason(String value) {
        this.requireReason = value;
    }

}
