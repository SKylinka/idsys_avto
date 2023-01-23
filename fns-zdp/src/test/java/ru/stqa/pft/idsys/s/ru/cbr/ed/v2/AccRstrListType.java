
package ru.stqa.pft.idsys.s.ru.cbr.ed.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import ru.stqa.pft.idsys.s.ru.cbr.ed.leaftypes.v2.RstrType;


/**
 * Account's Restrictions.
 * 
 * <p>Java class for AccRstrListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccRstrListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="AccRstr" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}RstrType" />
 *       &lt;attribute name="AccRstrDate" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}DateType" />
 *       &lt;attribute name="SuccessorBIC" type="{urn:cbr-ru:ed:leaftypes:v2.0}BICRUIDType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccRstrListType")
public class AccRstrListType {

    @XmlAttribute(name = "AccRstr", required = true)
    protected RstrType accRstr;
    @XmlAttribute(name = "AccRstrDate", required = true)
    protected XMLGregorianCalendar accRstrDate;
    @XmlAttribute(name = "SuccessorBIC")
    protected String successorBIC;

    /**
     * Gets the value of the accRstr property.
     * 
     * @return
     *     possible object is
     *     {@link RstrType }
     *     
     */
    public RstrType getAccRstr() {
        return accRstr;
    }

    /**
     * Sets the value of the accRstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link RstrType }
     *     
     */
    public void setAccRstr(RstrType value) {
        this.accRstr = value;
    }

    /**
     * Gets the value of the accRstrDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAccRstrDate() {
        return accRstrDate;
    }

    /**
     * Sets the value of the accRstrDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAccRstrDate(XMLGregorianCalendar value) {
        this.accRstrDate = value;
    }

    /**
     * Gets the value of the successorBIC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuccessorBIC() {
        return successorBIC;
    }

    /**
     * Sets the value of the successorBIC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuccessorBIC(String value) {
        this.successorBIC = value;
    }

}
