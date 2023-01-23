
package ru.stqa.pft.idsys.s.ru.cbr.ed.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Information regarding Participant’s Migration from RABIS.
 * 
 * <p>Java class for AccMigrated complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccMigrated">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="BalanceReceived" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}IndicatorType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccMigrated")
public class AccMigrated {

    @XmlAttribute(name = "BalanceReceived", required = true)
    protected boolean balanceReceived;

    /**
     * Gets the value of the balanceReceived property.
     * 
     */
    public boolean isBalanceReceived() {
        return balanceReceived;
    }

    /**
     * Sets the value of the balanceReceived property.
     * 
     */
    public void setBalanceReceived(boolean value) {
        this.balanceReceived = value;
    }

}
