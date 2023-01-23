
package ru.stqa.pft.idsys.s.ru.cbr.ed.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Реквизиты исходного документа.
 * 
 * <p>Java class for InitialAccDoc complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InitialAccDoc">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="AccDocNo" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}AccountDocIDType" />
 *       &lt;attribute name="AccDocDate" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}DateType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InitialAccDoc")
public class InitialAccDoc {

    @XmlAttribute(name = "AccDocNo", required = true)
    protected String accDocNo;
    @XmlAttribute(name = "AccDocDate", required = true)
    protected XMLGregorianCalendar accDocDate;

    /**
     * Gets the value of the accDocNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccDocNo() {
        return accDocNo;
    }

    /**
     * Sets the value of the accDocNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccDocNo(String value) {
        this.accDocNo = value;
    }

    /**
     * Gets the value of the accDocDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAccDocDate() {
        return accDocDate;
    }

    /**
     * Sets the value of the accDocDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAccDocDate(XMLGregorianCalendar value) {
        this.accDocDate = value;
    }

}
