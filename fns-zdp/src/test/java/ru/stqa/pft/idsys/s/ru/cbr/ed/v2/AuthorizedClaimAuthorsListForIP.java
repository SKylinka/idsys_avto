
package ru.stqa.pft.idsys.s.ru.cbr.ed.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Authorized Claim Author.
 * 
 * <p>Java class for AuthorizedClaimAuthorsListForIP complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AuthorizedClaimAuthorsListForIP">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="BIC" type="{urn:cbr-ru:ed:leaftypes:v2.0}BICRUIDType"/>
 *         &lt;element name="UID" type="{urn:cbr-ru:ed:leaftypes:v2.0}EDDrawerIDType"/>
 *       &lt;/choice>
 *       &lt;attribute name="AggrementID" type="{urn:cbr-ru:ed:leaftypes:v2.0}TwoDigitIdentifierType" />
 *       &lt;attribute name="DateTo" type="{urn:cbr-ru:ed:leaftypes:v2.0}DateType" />
 *       &lt;attribute name="IPAccount" type="{urn:cbr-ru:ed:leaftypes:v2.0}AccountNumberRUIDType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuthorizedClaimAuthorsListForIP", propOrder = {
    "bic",
    "uid"
})
public class AuthorizedClaimAuthorsListForIP {

    @XmlElement(name = "BIC")
    protected String bic;
    @XmlElement(name = "UID")
    protected String uid;
    @XmlAttribute(name = "AggrementID")
    protected String aggrementID;
    @XmlAttribute(name = "DateTo")
    protected XMLGregorianCalendar dateTo;
    @XmlAttribute(name = "IPAccount")
    protected String ipAccount;

    /**
     * Gets the value of the bic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBIC() {
        return bic;
    }

    /**
     * Sets the value of the bic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBIC(String value) {
        this.bic = value;
    }

    /**
     * Gets the value of the uid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUID() {
        return uid;
    }

    /**
     * Sets the value of the uid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUID(String value) {
        this.uid = value;
    }

    /**
     * Gets the value of the aggrementID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAggrementID() {
        return aggrementID;
    }

    /**
     * Sets the value of the aggrementID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAggrementID(String value) {
        this.aggrementID = value;
    }

    /**
     * Gets the value of the dateTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateTo() {
        return dateTo;
    }

    /**
     * Sets the value of the dateTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateTo(XMLGregorianCalendar value) {
        this.dateTo = value;
    }

    /**
     * Gets the value of the ipAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPAccount() {
        return ipAccount;
    }

    /**
     * Sets the value of the ipAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPAccount(String value) {
        this.ipAccount = value;
    }

}
