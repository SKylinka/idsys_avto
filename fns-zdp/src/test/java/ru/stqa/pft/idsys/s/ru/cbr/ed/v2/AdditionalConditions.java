
package ru.stqa.pft.idsys.s.ru.cbr.ed.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Дополнительные условия проведения платежей или осуществления расчетов.
 * 
 * <p>Java class for AdditionalConditions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdditionalConditions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="UrgentPayments" type="{urn:cbr-ru:ed:leaftypes:v2.0}OneDigitCodeType" />
 *       &lt;attribute name="ChangeUrgentPayments" type="{urn:cbr-ru:ed:leaftypes:v2.0}Indicator1Type" />
 *       &lt;attribute name="SuspendedMode" type="{urn:cbr-ru:ed:leaftypes:v2.0}OneDigitCodeType" />
 *       &lt;attribute name="ChangeSuspendedMode" type="{urn:cbr-ru:ed:leaftypes:v2.0}Indicator1Type" />
 *       &lt;attribute name="LimitedMode" type="{urn:cbr-ru:ed:leaftypes:v2.0}OneDigitCodeType" />
 *       &lt;attribute name="ChangeLimitedMode" type="{urn:cbr-ru:ed:leaftypes:v2.0}Indicator1Type" />
 *       &lt;attribute name="LiquidityBfOD" type="{urn:cbr-ru:ed:leaftypes:v2.0}OneDigitCodeType" />
 *       &lt;attribute name="ChangeLiquidityBfOD" type="{urn:cbr-ru:ed:leaftypes:v2.0}Indicator1Type" />
 *       &lt;attribute name="LiquidityInOD" type="{urn:cbr-ru:ed:leaftypes:v2.0}OneDigitCodeType" />
 *       &lt;attribute name="ChangeLiquidityInOD" type="{urn:cbr-ru:ed:leaftypes:v2.0}Indicator1Type" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalConditions")
public class AdditionalConditions {

    @XmlAttribute(name = "UrgentPayments")
    protected String urgentPayments;
    @XmlAttribute(name = "ChangeUrgentPayments")
    protected Boolean changeUrgentPayments;
    @XmlAttribute(name = "SuspendedMode")
    protected String suspendedMode;
    @XmlAttribute(name = "ChangeSuspendedMode")
    protected Boolean changeSuspendedMode;
    @XmlAttribute(name = "LimitedMode")
    protected String limitedMode;
    @XmlAttribute(name = "ChangeLimitedMode")
    protected Boolean changeLimitedMode;
    @XmlAttribute(name = "LiquidityBfOD")
    protected String liquidityBfOD;
    @XmlAttribute(name = "ChangeLiquidityBfOD")
    protected Boolean changeLiquidityBfOD;
    @XmlAttribute(name = "LiquidityInOD")
    protected String liquidityInOD;
    @XmlAttribute(name = "ChangeLiquidityInOD")
    protected Boolean changeLiquidityInOD;

    /**
     * Gets the value of the urgentPayments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrgentPayments() {
        return urgentPayments;
    }

    /**
     * Sets the value of the urgentPayments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrgentPayments(String value) {
        this.urgentPayments = value;
    }

    /**
     * Gets the value of the changeUrgentPayments property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isChangeUrgentPayments() {
        return changeUrgentPayments;
    }

    /**
     * Sets the value of the changeUrgentPayments property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setChangeUrgentPayments(Boolean value) {
        this.changeUrgentPayments = value;
    }

    /**
     * Gets the value of the suspendedMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuspendedMode() {
        return suspendedMode;
    }

    /**
     * Sets the value of the suspendedMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuspendedMode(String value) {
        this.suspendedMode = value;
    }

    /**
     * Gets the value of the changeSuspendedMode property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isChangeSuspendedMode() {
        return changeSuspendedMode;
    }

    /**
     * Sets the value of the changeSuspendedMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setChangeSuspendedMode(Boolean value) {
        this.changeSuspendedMode = value;
    }

    /**
     * Gets the value of the limitedMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLimitedMode() {
        return limitedMode;
    }

    /**
     * Sets the value of the limitedMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLimitedMode(String value) {
        this.limitedMode = value;
    }

    /**
     * Gets the value of the changeLimitedMode property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isChangeLimitedMode() {
        return changeLimitedMode;
    }

    /**
     * Sets the value of the changeLimitedMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setChangeLimitedMode(Boolean value) {
        this.changeLimitedMode = value;
    }

    /**
     * Gets the value of the liquidityBfOD property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLiquidityBfOD() {
        return liquidityBfOD;
    }

    /**
     * Sets the value of the liquidityBfOD property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLiquidityBfOD(String value) {
        this.liquidityBfOD = value;
    }

    /**
     * Gets the value of the changeLiquidityBfOD property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isChangeLiquidityBfOD() {
        return changeLiquidityBfOD;
    }

    /**
     * Sets the value of the changeLiquidityBfOD property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setChangeLiquidityBfOD(Boolean value) {
        this.changeLiquidityBfOD = value;
    }

    /**
     * Gets the value of the liquidityInOD property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLiquidityInOD() {
        return liquidityInOD;
    }

    /**
     * Sets the value of the liquidityInOD property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLiquidityInOD(String value) {
        this.liquidityInOD = value;
    }

    /**
     * Gets the value of the changeLiquidityInOD property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isChangeLiquidityInOD() {
        return changeLiquidityInOD;
    }

    /**
     * Sets the value of the changeLiquidityInOD property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setChangeLiquidityInOD(Boolean value) {
        this.changeLiquidityInOD = value;
    }

}
