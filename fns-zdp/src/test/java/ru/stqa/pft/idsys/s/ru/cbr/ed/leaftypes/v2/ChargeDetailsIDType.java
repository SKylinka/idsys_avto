
package ru.stqa.pft.idsys.s.ru.cbr.ed.leaftypes.v2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChargeDetailsIDType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ChargeDetailsIDType">
 *   &lt;restriction base="{urn:cbr-ru:ed:basetypes:v2.0}IdentifierTextCategory">
 *     &lt;enumeration value="OUR"/>
 *     &lt;enumeration value="BEN"/>
 *     &lt;enumeration value="CHA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ChargeDetailsIDType", namespace = "urn:cbr-ru:ed:leaftypes:v2.0")
@XmlEnum
public enum ChargeDetailsIDType {

    OUR,
    BEN,
    CHA;

    public String value() {
        return name();
    }

    public static ChargeDetailsIDType fromValue(String v) {
        return valueOf(v);
    }

}
