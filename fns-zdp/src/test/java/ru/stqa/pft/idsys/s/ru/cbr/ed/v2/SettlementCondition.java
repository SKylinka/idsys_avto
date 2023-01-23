
package ru.stqa.pft.idsys.s.ru.cbr.ed.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ru.stqa.pft.idsys.s.ru.cbr.ed.leaftypes.v2.ConditionCodeType;


/**
 * Payment Settlement Condition Attributes.
 * 
 * <p>Java class for SettlementCondition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SettlementCondition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="LiquidityReservationSchemeParameters" type="{urn:cbr-ru:ed:v2.0}LiquidityReservationSchemeParameters"/>
 *         &lt;element name="CoverFundsSchemeParameters" type="{urn:cbr-ru:ed:v2.0}CoverFundsSchemeParameters"/>
 *         &lt;element name="RCPSchemeParameters" type="{urn:cbr-ru:ed:v2.0}RCPSchemeParameters"/>
 *       &lt;/choice>
 *       &lt;attribute name="ConditionCode" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}ConditionCodeType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementCondition", propOrder = {
    "liquidityReservationSchemeParameters",
    "coverFundsSchemeParameters",
    "rcpSchemeParameters"
})
public class SettlementCondition {

    @XmlElement(name = "LiquidityReservationSchemeParameters")
    protected LiquidityReservationSchemeParameters liquidityReservationSchemeParameters;
    @XmlElement(name = "CoverFundsSchemeParameters")
    protected CoverFundsSchemeParameters coverFundsSchemeParameters;
    @XmlElement(name = "RCPSchemeParameters")
    protected RCPSchemeParameters rcpSchemeParameters;
    @XmlAttribute(name = "ConditionCode", required = true)
    protected ConditionCodeType conditionCode;

    /**
     * Gets the value of the liquidityReservationSchemeParameters property.
     * 
     * @return
     *     possible object is
     *     {@link LiquidityReservationSchemeParameters }
     *     
     */
    public LiquidityReservationSchemeParameters getLiquidityReservationSchemeParameters() {
        return liquidityReservationSchemeParameters;
    }

    /**
     * Sets the value of the liquidityReservationSchemeParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link LiquidityReservationSchemeParameters }
     *     
     */
    public void setLiquidityReservationSchemeParameters(LiquidityReservationSchemeParameters value) {
        this.liquidityReservationSchemeParameters = value;
    }

    /**
     * Gets the value of the coverFundsSchemeParameters property.
     * 
     * @return
     *     possible object is
     *     {@link CoverFundsSchemeParameters }
     *     
     */
    public CoverFundsSchemeParameters getCoverFundsSchemeParameters() {
        return coverFundsSchemeParameters;
    }

    /**
     * Sets the value of the coverFundsSchemeParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoverFundsSchemeParameters }
     *     
     */
    public void setCoverFundsSchemeParameters(CoverFundsSchemeParameters value) {
        this.coverFundsSchemeParameters = value;
    }

    /**
     * Gets the value of the rcpSchemeParameters property.
     * 
     * @return
     *     possible object is
     *     {@link RCPSchemeParameters }
     *     
     */
    public RCPSchemeParameters getRCPSchemeParameters() {
        return rcpSchemeParameters;
    }

    /**
     * Sets the value of the rcpSchemeParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link RCPSchemeParameters }
     *     
     */
    public void setRCPSchemeParameters(RCPSchemeParameters value) {
        this.rcpSchemeParameters = value;
    }

    /**
     * Gets the value of the conditionCode property.
     * 
     * @return
     *     possible object is
     *     {@link ConditionCodeType }
     *     
     */
    public ConditionCodeType getConditionCode() {
        return conditionCode;
    }

    /**
     * Sets the value of the conditionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConditionCodeType }
     *     
     */
    public void setConditionCode(ConditionCodeType value) {
        this.conditionCode = value;
    }

}
