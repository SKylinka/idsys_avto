
package ru.stqa.pft.idsys.s.ru.cbr.ed.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Departmental Information (fields 101, 104-110).
 * 
 * <p>Java class for DepartmentalInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DepartmentalInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="DrawerStatus" type="{urn:cbr-ru:ed:leaftypes:v2.0}DrawerStatusCodeTextType" />
 *       &lt;attribute name="CBC" type="{urn:cbr-ru:ed:leaftypes:v2.0}CBCIDTextType" />
 *       &lt;attribute name="OKATO" type="{urn:cbr-ru:ed:leaftypes:v2.0}OKATOIDTextType" />
 *       &lt;attribute name="PaytReason" type="{urn:cbr-ru:ed:leaftypes:v2.0}TaxPaytReasonCodeTextType" />
 *       &lt;attribute name="TaxPeriod" type="{urn:cbr-ru:ed:leaftypes:v2.0}TaxPeriodCodeTextType" />
 *       &lt;attribute name="DocNo" type="{urn:cbr-ru:ed:leaftypes:v2.0}TaxDocIDTextType" />
 *       &lt;attribute name="DocDate" type="{urn:cbr-ru:ed:leaftypes:v2.0}TaxDocDateCodeTextType" />
 *       &lt;attribute name="TaxPaytKind" type="{urn:cbr-ru:ed:leaftypes:v2.0}TaxPaytKindCodeTextType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DepartmentalInfo")
public class DepartmentalInfo {

    @XmlAttribute(name = "DrawerStatus")
    protected String drawerStatus;
    @XmlAttribute(name = "CBC")
    protected String cbc;
    @XmlAttribute(name = "OKATO")
    protected String okato;
    @XmlAttribute(name = "PaytReason")
    protected String paytReason;
    @XmlAttribute(name = "TaxPeriod")
    protected String taxPeriod;
    @XmlAttribute(name = "DocNo")
    protected String docNo;
    @XmlAttribute(name = "DocDate")
    protected String docDate;
    @XmlAttribute(name = "TaxPaytKind")
    protected String taxPaytKind;

    /**
     * Gets the value of the drawerStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrawerStatus() {
        return drawerStatus;
    }

    /**
     * Sets the value of the drawerStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDrawerStatus(String value) {
        this.drawerStatus = value;
    }

    /**
     * Gets the value of the cbc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCBC() {
        return cbc;
    }

    /**
     * Sets the value of the cbc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCBC(String value) {
        this.cbc = value;
    }

    /**
     * Gets the value of the okato property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOKATO() {
        return okato;
    }

    /**
     * Sets the value of the okato property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOKATO(String value) {
        this.okato = value;
    }

    /**
     * Gets the value of the paytReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaytReason() {
        return paytReason;
    }

    /**
     * Sets the value of the paytReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaytReason(String value) {
        this.paytReason = value;
    }

    /**
     * Gets the value of the taxPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxPeriod() {
        return taxPeriod;
    }

    /**
     * Sets the value of the taxPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxPeriod(String value) {
        this.taxPeriod = value;
    }

    /**
     * Gets the value of the docNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocNo() {
        return docNo;
    }

    /**
     * Sets the value of the docNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocNo(String value) {
        this.docNo = value;
    }

    /**
     * Gets the value of the docDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocDate() {
        return docDate;
    }

    /**
     * Sets the value of the docDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocDate(String value) {
        this.docDate = value;
    }

    /**
     * Gets the value of the taxPaytKind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxPaytKind() {
        return taxPaytKind;
    }

    /**
     * Sets the value of the taxPaytKind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxPaytKind(String value) {
        this.taxPaytKind = value;
    }

}
