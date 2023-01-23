
package ru.stqa.pft.idsys.s.ru.cbr.ed.leaftypes.v2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CMType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CMType">
 *   &lt;restriction base="{urn:cbr-ru:ed:basetypes:v2.0}IdentifierTextCategory">
 *     &lt;enumeration value="ACIN"/>
 *     &lt;enumeration value="BALC"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CMType", namespace = "urn:cbr-ru:ed:leaftypes:v2.0")
@XmlEnum
public enum CMType {

    ACIN,
    BALC;

    public String value() {
        return name();
    }

    public static CMType fromValue(String v) {
        return valueOf(v);
    }

}
