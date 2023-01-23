
package ru.stqa.pft.idsys.s.ru.cbr.ed.leaftypes.v2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ED307AccountStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ED307AccountStatusType">
 *   &lt;restriction base="{urn:cbr-ru:ed:basetypes:v2.0}IdentifierTextCategory">
 *     &lt;enumeration value="ACWA"/>
 *     &lt;enumeration value="ACAC"/>
 *     &lt;enumeration value="ACWD"/>
 *     &lt;enumeration value="ACDL"/>
 *     &lt;enumeration value="ACDE"/>
 *     &lt;enumeration value="ACSE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ED307AccountStatusType", namespace = "urn:cbr-ru:ed:leaftypes:v2.0")
@XmlEnum
public enum ED307AccountStatusType {

    ACWA,
    ACAC,
    ACWD,
    ACDL,
    ACDE,
    ACSE;

    public String value() {
        return name();
    }

    public static ED307AccountStatusType fromValue(String v) {
        return valueOf(v);
    }

}
