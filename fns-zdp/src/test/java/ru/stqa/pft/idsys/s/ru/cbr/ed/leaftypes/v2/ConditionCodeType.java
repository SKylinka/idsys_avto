
package ru.stqa.pft.idsys.s.ru.cbr.ed.leaftypes.v2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConditionCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ConditionCodeType">
 *   &lt;restriction base="{urn:cbr-ru:ed:basetypes:v2.0}CodeCategory">
 *     &lt;enumeration value="RSRV"/>
 *     &lt;enumeration value="ERCP"/>
 *     &lt;enumeration value="COVR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ConditionCodeType", namespace = "urn:cbr-ru:ed:leaftypes:v2.0")
@XmlEnum
public enum ConditionCodeType {

    RSRV,
    ERCP,
    COVR;

    public String value() {
        return name();
    }

    public static ConditionCodeType fromValue(String v) {
        return valueOf(v);
    }

}
