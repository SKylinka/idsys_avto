
package ru.stqa.pft.idsys.s.ru.cbr.ed.v2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Foreign Correspondent Organizations.
 * 
 * <p>Java class for ForeignCorrespOrganizationsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ForeignCorrespOrganizationsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SWBICS" type="{urn:cbr-ru:ed:v2.0}SWBICsList" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Name" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}Max160TextType" />
 *       &lt;attribute name="CntrCd" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}Eq2TextType" />
 *       &lt;attribute name="Ind" type="{urn:cbr-ru:ed:leaftypes:v2.0}Max16TextType" />
 *       &lt;attribute name="Tnp" type="{urn:cbr-ru:ed:leaftypes:v2.0}Max5TextType" />
 *       &lt;attribute name="Nnp" type="{urn:cbr-ru:ed:leaftypes:v2.0}Max160TextType" />
 *       &lt;attribute name="Adr" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}Max160TextType" />
 *       &lt;attribute name="EnglName" type="{urn:cbr-ru:ed:leaftypes:v2.0}Max140TextType" />
 *       &lt;attribute name="Number" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}UniversalIDType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ForeignCorrespOrganizationsType", propOrder = {
    "swbics"
})
public class ForeignCorrespOrganizationsType {

    @XmlElement(name = "SWBICS")
    protected List<SWBICsList> swbics;
    @XmlAttribute(name = "Name", required = true)
    protected String name;
    @XmlAttribute(name = "CntrCd", required = true)
    protected String cntrCd;
    @XmlAttribute(name = "Ind")
    protected String ind;
    @XmlAttribute(name = "Tnp")
    protected String tnp;
    @XmlAttribute(name = "Nnp")
    protected String nnp;
    @XmlAttribute(name = "Adr", required = true)
    protected String adr;
    @XmlAttribute(name = "EnglName")
    protected String englName;
    @XmlAttribute(name = "Number", required = true)
    protected String number;

    /**
     * Gets the value of the swbics property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the swbics property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSWBICS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SWBICsList }
     * 
     * 
     */
    public List<SWBICsList> getSWBICS() {
        if (swbics == null) {
            swbics = new ArrayList<SWBICsList>();
        }
        return this.swbics;
    }

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
     * Gets the value of the cntrCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCntrCd() {
        return cntrCd;
    }

    /**
     * Sets the value of the cntrCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCntrCd(String value) {
        this.cntrCd = value;
    }

    /**
     * Gets the value of the ind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInd() {
        return ind;
    }

    /**
     * Sets the value of the ind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInd(String value) {
        this.ind = value;
    }

    /**
     * Gets the value of the tnp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTnp() {
        return tnp;
    }

    /**
     * Sets the value of the tnp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTnp(String value) {
        this.tnp = value;
    }

    /**
     * Gets the value of the nnp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNnp() {
        return nnp;
    }

    /**
     * Sets the value of the nnp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNnp(String value) {
        this.nnp = value;
    }

    /**
     * Gets the value of the adr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdr() {
        return adr;
    }

    /**
     * Sets the value of the adr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdr(String value) {
        this.adr = value;
    }

    /**
     * Gets the value of the englName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnglName() {
        return englName;
    }

    /**
     * Sets the value of the englName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnglName(String value) {
        this.englName = value;
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

}
