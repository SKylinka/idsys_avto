
package ru.stqa.pft.idsys.s.com.triasoft.dev.schemas.eis.eregistry.pppr._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Тип Сведения о договоре залога, иной сделке, на основании которой возникает залог в силу закона
 * 
 * <p>Java class for PledgeContractType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PledgeContractType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://dev.triasoft.com/schemas/eis/eregistry/pppr/2.0}String1-4000Type"/>
 *         &lt;element name="Date" type="{http://dev.triasoft.com/schemas/eis/eregistry/pppr/2.0}DateType"/>
 *         &lt;element name="Number" type="{http://dev.triasoft.com/schemas/eis/eregistry/pppr/2.0}String1-60Type" minOccurs="0"/>
 *         &lt;element name="TermOfContract">
 *           &lt;simpleType>
 *             &lt;union memberTypes=" {http://dev.triasoft.com/schemas/eis/eregistry/pppr/2.0}DateType {http://dev.triasoft.com/schemas/eis/eregistry/pppr/2.0}String1-255Type">
 *             &lt;/union>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PledgeContractType", propOrder = {
    "name",
    "date",
    "number",
    "termOfContract"
})
public class PledgeContractType {

    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "Date", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar date;
    @XmlElement(name = "Number")
    protected String number;
    @XmlElement(name = "TermOfContract", required = true)
    protected String termOfContract;

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
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumber(String value) {
        this.number = value;
    }

    /**
     * Gets the value of the termOfContract property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTermOfContract() {
        return termOfContract;
    }

    /**
     * Sets the value of the termOfContract property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTermOfContract(String value) {
        this.termOfContract = value;
    }

}
