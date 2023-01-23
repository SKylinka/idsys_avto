
package ru.stqa.pft.idsys.s.com.triasoft.dev.schemas.eis.eregistry.pppr._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Тип Залогодержатели для облигаций
 * 
 * <p>Java class for BondObligationPledgeeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BondObligationPledgeeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IssueNumber" type="{http://dev.triasoft.com/schemas/eis/eregistry/pppr/2.0}String1-60Type"/>
 *         &lt;element name="IssueDate" type="{http://dev.triasoft.com/schemas/eis/eregistry/pppr/2.0}DateType"/>
 *         &lt;element name="BondHolders" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="OtherPersons" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BondObligationPledgeeType", propOrder = {
    "issueNumber",
    "issueDate",
    "bondHolders",
    "otherPersons"
})
public class BondObligationPledgeeType {

    @XmlElement(name = "IssueNumber", required = true)
    protected String issueNumber;
    @XmlElement(name = "IssueDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar issueDate;
    @XmlElement(name = "BondHolders")
    protected boolean bondHolders;
    @XmlElement(name = "OtherPersons")
    protected boolean otherPersons;

    /**
     * Gets the value of the issueNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssueNumber() {
        return issueNumber;
    }

    /**
     * Sets the value of the issueNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssueNumber(String value) {
        this.issueNumber = value;
    }

    /**
     * Gets the value of the issueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIssueDate() {
        return issueDate;
    }

    /**
     * Sets the value of the issueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIssueDate(XMLGregorianCalendar value) {
        this.issueDate = value;
    }

    /**
     * Gets the value of the bondHolders property.
     * 
     */
    public boolean isBondHolders() {
        return bondHolders;
    }

    /**
     * Sets the value of the bondHolders property.
     * 
     */
    public void setBondHolders(boolean value) {
        this.bondHolders = value;
    }

    /**
     * Gets the value of the otherPersons property.
     * 
     */
    public boolean isOtherPersons() {
        return otherPersons;
    }

    /**
     * Sets the value of the otherPersons property.
     * 
     */
    public void setOtherPersons(boolean value) {
        this.otherPersons = value;
    }

}
