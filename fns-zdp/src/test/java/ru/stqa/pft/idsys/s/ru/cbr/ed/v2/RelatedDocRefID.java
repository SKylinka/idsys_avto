
package ru.stqa.pft.idsys.s.ru.cbr.ed.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Initial Settlement Document Attributes.
 * 
 * <p>Java class for RelatedDocRefID complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RelatedDocRefID">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="RelatedDocNo" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}Max16TextType" />
 *       &lt;attribute name="RelatedDocDate" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}DateType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelatedDocRefID")
public class RelatedDocRefID {

    @XmlAttribute(name = "RelatedDocNo", required = true)
    protected String relatedDocNo;
    @XmlAttribute(name = "RelatedDocDate", required = true)
    protected XMLGregorianCalendar relatedDocDate;

    /**
     * Gets the value of the relatedDocNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelatedDocNo() {
        return relatedDocNo;
    }

    /**
     * Sets the value of the relatedDocNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelatedDocNo(String value) {
        this.relatedDocNo = value;
    }

    /**
     * Gets the value of the relatedDocDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRelatedDocDate() {
        return relatedDocDate;
    }

    /**
     * Sets the value of the relatedDocDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRelatedDocDate(XMLGregorianCalendar value) {
        this.relatedDocDate = value;
    }

}
