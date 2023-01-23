
package ru.stqa.pft.idsys.s.ru.cbr.ed.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import ru.stqa.pft.idsys.s.ru.cbr.ed.leaftypes.v2.RstrType;


/**
 * Participant's Restrictions.
 * 
 * <p>Java class for RstrListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RstrListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="Rstr" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}RstrType" />
 *       &lt;attribute name="RstrDate" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}DateType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RstrListType")
public class RstrListType {

    @XmlAttribute(name = "Rstr", required = true)
    protected RstrType rstr;
    @XmlAttribute(name = "RstrDate", required = true)
    protected XMLGregorianCalendar rstrDate;

    /**
     * Gets the value of the rstr property.
     * 
     * @return
     *     possible object is
     *     {@link RstrType }
     *     
     */
    public RstrType getRstr() {
        return rstr;
    }

    /**
     * Sets the value of the rstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link RstrType }
     *     
     */
    public void setRstr(RstrType value) {
        this.rstr = value;
    }

    /**
     * Gets the value of the rstrDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRstrDate() {
        return rstrDate;
    }

    /**
     * Sets the value of the rstrDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRstrDate(XMLGregorianCalendar value) {
        this.rstrDate = value;
    }

}
