
package ru.stqa.pft.idsys.s.ru.cbr.ed.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * ������ ���������� ������
 * 
 * <p>Java class for AccBrfModifList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccBrfModifList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="AccBrf" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}AccountNumberRUIDBrfType" />
 *       &lt;attribute name="AccOperationType" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}OneDigitCodeType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccBrfModifList")
public class AccBrfModifList {

    @XmlAttribute(name = "AccBrf", required = true)
    protected String accBrf;
    @XmlAttribute(name = "AccOperationType", required = true)
    protected String accOperationType;

    /**
     * Gets the value of the accBrf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccBrf() {
        return accBrf;
    }

    /**
     * Sets the value of the accBrf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccBrf(String value) {
        this.accBrf = value;
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
