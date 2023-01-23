
package ru.stqa.pft.idsys.s.ru.cbr.ed.leaftypes.v2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LimitChangeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LimitChangeType">
 *   &lt;restriction base="{urn:cbr-ru:ed:basetypes:v2.0}CodeCategory">
 *     &lt;enumeration value="SETL"/>
 *     &lt;enumeration value="DELL"/>
 *     &lt;enumeration value="STND"/>
 *     &lt;enumeration value="DLND"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LimitChangeType", namespace = "urn:cbr-ru:ed:leaftypes:v2.0")
@XmlEnum
public enum LimitChangeType {

    SETL,
    DELL,
    STND,
    DLND;

    public String value() {
        return name();
    }

    public static LimitChangeType fromValue(String v) {
        return valueOf(v);
    }

}
