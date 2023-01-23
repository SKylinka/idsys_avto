
package ru.stqa.pft.idsys.s.ru.cbr.ed.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ru.stqa.pft.idsys.s.ru.cbr.ed.leaftypes.v2.PerfomanceSchemaType;


/**
 * A mandatory list of clearing circuits.
 * 
 * <p>Java class for ClearingCircuits complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClearingCircuits">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GarFunds" type="{urn:cbr-ru:ed:v2.0}GarFunds"/>
 *         &lt;element name="ClearingAccount" type="{urn:cbr-ru:ed:v2.0}ClearingAccount"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ClearingCircuit" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}ClearingCircuitType" />
 *       &lt;attribute name="ClearingCircuitShortName" type="{urn:cbr-ru:ed:leaftypes:v2.0}Max40TextType" />
 *       &lt;attribute name="ClearingCircuitFullName" type="{urn:cbr-ru:ed:leaftypes:v2.0}Max140TextType" />
 *       &lt;attribute name="PerfomanceSchema" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}PerfomanceSchemaType" />
 *       &lt;attribute name="DefaultSchema" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}IndicatorType" />
 *       &lt;attribute name="ClaimLimitsAllowed" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}IndicatorType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClearingCircuits", propOrder = {
    "garFunds",
    "clearingAccount"
})
public class ClearingCircuits {

    @XmlElement(name = "GarFunds", required = true)
    protected GarFunds garFunds;
    @XmlElement(name = "ClearingAccount", required = true)
    protected ClearingAccount clearingAccount;
    @XmlAttribute(name = "ClearingCircuit", required = true)
    protected String clearingCircuit;
    @XmlAttribute(name = "ClearingCircuitShortName")
    protected String clearingCircuitShortName;
    @XmlAttribute(name = "ClearingCircuitFullName")
    protected String clearingCircuitFullName;
    @XmlAttribute(name = "PerfomanceSchema", required = true)
    protected PerfomanceSchemaType perfomanceSchema;
    @XmlAttribute(name = "DefaultSchema", required = true)
    protected boolean defaultSchema;
    @XmlAttribute(name = "ClaimLimitsAllowed", required = true)
    protected boolean claimLimitsAllowed;

    /**
     * Gets the value of the garFunds property.
     * 
     * @return
     *     possible object is
     *     {@link GarFunds }
     *     
     */
    public GarFunds getGarFunds() {
        return garFunds;
    }

    /**
     * Sets the value of the garFunds property.
     * 
     * @param value
     *     allowed object is
     *     {@link GarFunds }
     *     
     */
    public void setGarFunds(GarFunds value) {
        this.garFunds = value;
    }

    /**
     * Gets the value of the clearingAccount property.
     * 
     * @return
     *     possible object is
     *     {@link ClearingAccount }
     *     
     */
    public ClearingAccount getClearingAccount() {
        return clearingAccount;
    }

    /**
     * Sets the value of the clearingAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClearingAccount }
     *     
     */
    public void setClearingAccount(ClearingAccount value) {
        this.clearingAccount = value;
    }

    /**
     * Gets the value of the clearingCircuit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClearingCircuit() {
        return clearingCircuit;
    }

    /**
     * Sets the value of the clearingCircuit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClearingCircuit(String value) {
        this.clearingCircuit = value;
    }

    /**
     * Gets the value of the clearingCircuitShortName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClearingCircuitShortName() {
        return clearingCircuitShortName;
    }

    /**
     * Sets the value of the clearingCircuitShortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClearingCircuitShortName(String value) {
        this.clearingCircuitShortName = value;
    }

    /**
     * Gets the value of the clearingCircuitFullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClearingCircuitFullName() {
        return clearingCircuitFullName;
    }

    /**
     * Sets the value of the clearingCircuitFullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClearingCircuitFullName(String value) {
        this.clearingCircuitFullName = value;
    }

    /**
     * Gets the value of the perfomanceSchema property.
     * 
     * @return
     *     possible object is
     *     {@link PerfomanceSchemaType }
     *     
     */
    public PerfomanceSchemaType getPerfomanceSchema() {
        return perfomanceSchema;
    }

    /**
     * Sets the value of the perfomanceSchema property.
     * 
     * @param value
     *     allowed object is
     *     {@link PerfomanceSchemaType }
     *     
     */
    public void setPerfomanceSchema(PerfomanceSchemaType value) {
        this.perfomanceSchema = value;
    }

    /**
     * Gets the value of the defaultSchema property.
     * 
     */
    public boolean isDefaultSchema() {
        return defaultSchema;
    }

    /**
     * Sets the value of the defaultSchema property.
     * 
     */
    public void setDefaultSchema(boolean value) {
        this.defaultSchema = value;
    }

    /**
     * Gets the value of the claimLimitsAllowed property.
     * 
     */
    public boolean isClaimLimitsAllowed() {
        return claimLimitsAllowed;
    }

    /**
     * Sets the value of the claimLimitsAllowed property.
     * 
     */
    public void setClaimLimitsAllowed(boolean value) {
        this.claimLimitsAllowed = value;
    }

}
