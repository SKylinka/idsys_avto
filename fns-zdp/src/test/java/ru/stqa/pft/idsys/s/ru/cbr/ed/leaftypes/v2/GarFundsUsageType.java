
package ru.stqa.pft.idsys.s.ru.cbr.ed.leaftypes.v2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GarFundsUsageType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GarFundsUsageType">
 *   &lt;restriction base="{urn:cbr-ru:ed:basetypes:v2.0}CodeCategory">
 *     &lt;enumeration value="GFCA"/>
 *     &lt;enumeration value="GFCI"/>
 *     &lt;enumeration value="GFNU"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GarFundsUsageType", namespace = "urn:cbr-ru:ed:leaftypes:v2.0")
@XmlEnum
public enum GarFundsUsageType {

    GFCA,
    GFCI,
    GFNU;

    public String value() {
        return name();
    }

    public static GarFundsUsageType fromValue(String v) {
        return valueOf(v);
    }

}
