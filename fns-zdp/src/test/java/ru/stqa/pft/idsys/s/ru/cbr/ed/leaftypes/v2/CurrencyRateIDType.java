
package ru.stqa.pft.idsys.s.ru.cbr.ed.leaftypes.v2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CurrencyRateIDType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CurrencyRateIDType">
 *   &lt;restriction base="{urn:cbr-ru:ed:basetypes:v2.0}IdentifierTextCategory">
 *     &lt;enumeration value="CBRF"/>
 *     &lt;enumeration value="MARKET"/>
 *     &lt;enumeration value="CBRMET"/>
 *     &lt;enumeration value="CLCMET"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CurrencyRateIDType", namespace = "urn:cbr-ru:ed:leaftypes:v2.0")
@XmlEnum
public enum CurrencyRateIDType {

    CBRF,
    MARKET,
    CBRMET,
    CLCMET;

    public String value() {
        return name();
    }

    public static CurrencyRateIDType fromValue(String v) {
        return valueOf(v);
    }

}
