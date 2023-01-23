
package ru.stqa.pft.idsys.s.ru.cbr.ed.leaftypes.v2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChangeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ChangeType">
 *   &lt;restriction base="{urn:cbr-ru:ed:basetypes:v2.0}IdentifierTextCategory">
 *     &lt;enumeration value="ADDD"/>
 *     &lt;enumeration value="CHGD"/>
 *     &lt;enumeration value="NCNG"/>
 *     &lt;enumeration value="DLTD"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ChangeType", namespace = "urn:cbr-ru:ed:leaftypes:v2.0")
@XmlEnum
public enum ChangeType {

    ADDD,
    CHGD,
    NCNG,
    DLTD;

    public String value() {
        return name();
    }

    public static ChangeType fromValue(String v) {
        return valueOf(v);
    }

}
