
package ru.stqa.pft.idsys.s.ru.cbr.ed.leaftypes.v2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BusinessScenarioType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BusinessScenarioType">
 *   &lt;restriction base="{urn:cbr-ru:ed:basetypes:v2.0}IdentifierTextCategory">
 *     &lt;enumeration value="ANNL"/>
 *     &lt;enumeration value="BLSW"/>
 *     &lt;enumeration value="CAPE"/>
 *     &lt;enumeration value="CLWD"/>
 *     &lt;enumeration value="CAWC"/>
 *     &lt;enumeration value="COLE"/>
 *     &lt;enumeration value="GFUT"/>
 *     &lt;enumeration value="LEVL"/>
 *     &lt;enumeration value="LNOV"/>
 *     &lt;enumeration value="LOAN"/>
 *     &lt;enumeration value="SPEC"/>
 *     &lt;enumeration value="WCNF"/>
 *     &lt;enumeration value="PART"/>
 *     &lt;enumeration value="PRSP"/>
 *     &lt;enumeration value="NSPK"/>
 *     &lt;enumeration value="OPKC"/>
 *     &lt;enumeration value="NMPS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BusinessScenarioType", namespace = "urn:cbr-ru:ed:leaftypes:v2.0")
@XmlEnum
public enum BusinessScenarioType {

    ANNL,
    BLSW,
    CAPE,
    CLWD,
    CAWC,
    COLE,
    GFUT,
    LEVL,
    LNOV,
    LOAN,
    SPEC,
    WCNF,
    PART,
    PRSP,
    NSPK,
    OPKC,
    NMPS;

    public String value() {
        return name();
    }

    public static BusinessScenarioType fromValue(String v) {
        return valueOf(v);
    }

}
