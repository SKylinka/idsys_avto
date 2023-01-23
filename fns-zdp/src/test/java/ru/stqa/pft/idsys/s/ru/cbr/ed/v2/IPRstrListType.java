
package ru.stqa.pft.idsys.s.ru.cbr.ed.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import ru.stqa.pft.idsys.s.ru.cbr.ed.leaftypes.v2.RstrType;


/**
 * Indirect Participant's Restrictions.
 * 
 * <p>Java class for IPRstrListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IPRstrListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="IPRstr" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}RstrType" />
 *       &lt;attribute name="RstrDate" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}DateType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IPRstrListType")
public class IPRstrListType {

    @XmlAttribute(name = "IPRstr", required = true)
    protected RstrType ipRstr;
    @XmlAttribute(name = "RstrDate", required = true)
    protected XMLGregorianCalendar rstrDate;

    /**
     * Gets the value of the ipRstr property.
     * 
     * @return
     *     possible object is
     *     {@link RstrType }
     *     
     */
    public RstrType getIPRstr() {
        return ipRstr;
    }

    /**
     * Sets the value of the ipRstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link RstrType }
     *     
     */
    public void setIPRstr(RstrType value) {
        this.ipRstr = value;
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
