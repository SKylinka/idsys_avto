
package ru.stqa.pft.idsys.s.ru.cbr.ed.v2;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * EM referenced group attributes.
 * 
 * <p>Java class for EDRefID complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EDRefID">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="EDNo" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}EDNumberType" />
 *       &lt;attribute name="EDDate" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}DateType" />
 *       &lt;attribute name="EDAuthor" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}EDDrawerIDType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EDRefID")
@XmlSeeAlso({
    ED.class
})
public class EDRefID {

    @XmlAttribute(name = "EDNo", required = true)
    protected BigInteger edNo;
    @XmlAttribute(name = "EDDate", required = true)
    protected XMLGregorianCalendar edDate;
    @XmlAttribute(name = "EDAuthor", required = true)
    protected String edAuthor;

    /**
     * Gets the value of the edNo property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEDNo() {
        return edNo;
    }

    /**
     * Sets the value of the edNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEDNo(BigInteger value) {
        this.edNo = value;
    }

    /**
     * Gets the value of the edDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEDDate() {
        return edDate;
    }

    /**
     * Sets the value of the edDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEDDate(XMLGregorianCalendar value) {
        this.edDate = value;
    }

    /**
     * Gets the value of the edAuthor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEDAuthor() {
        return edAuthor;
    }

    /**
     * Sets the value of the edAuthor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEDAuthor(String value) {
        this.edAuthor = value;
    }

}
