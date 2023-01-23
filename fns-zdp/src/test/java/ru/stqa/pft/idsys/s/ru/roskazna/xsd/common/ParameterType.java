
package ru.stqa.pft.idsys.s.ru.roskazna.xsd.common;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Parameter_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Parameter_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="supplierSrvCode">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;maxLength value="40"/>
 *             &lt;minLength value="1"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="supplierID" type="{http://roskazna.ru/xsd/Common}UUID" />
 *       &lt;attribute name="isId" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Parameter_Type")
@XmlSeeAlso({
    ComplexParameterType.class,
    SimpleParameterType.class
})
public class ParameterType {

    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "supplierSrvCode")
    protected String supplierSrvCode;
    @XmlAttribute(name = "supplierID")
    protected String supplierID;
    @XmlAttribute(name = "isId")
    protected BigInteger isId;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the supplierSrvCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplierSrvCode() {
        return supplierSrvCode;
    }

    /**
     * Sets the value of the supplierSrvCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplierSrvCode(String value) {
        this.supplierSrvCode = value;
    }

    /**
     * Gets the value of the supplierID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplierID() {
        return supplierID;
    }

    /**
     * Sets the value of the supplierID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplierID(String value) {
        this.supplierID = value;
    }

    /**
     * Gets the value of the isId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIsId() {
        return isId;
    }

    /**
     * Sets the value of the isId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIsId(BigInteger value) {
        this.isId = value;
    }

}
