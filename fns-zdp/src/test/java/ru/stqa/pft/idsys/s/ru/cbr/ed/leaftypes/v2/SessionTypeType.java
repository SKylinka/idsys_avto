
package ru.stqa.pft.idsys.s.ru.cbr.ed.leaftypes.v2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SessionTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SessionTypeType">
 *   &lt;restriction base="{urn:cbr-ru:ed:basetypes:v2.0}IdentifierTextCategory">
 *     &lt;enumeration value="URGN"/>
 *     &lt;enumeration value="NURG"/>
 *     &lt;enumeration value="CONS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SessionTypeType", namespace = "urn:cbr-ru:ed:leaftypes:v2.0")
@XmlEnum
public enum SessionTypeType {

    URGN,
    NURG,
    CONS;

    public String value() {
        return name();
    }

    public static SessionTypeType fromValue(String v) {
        return valueOf(v);
    }

}
