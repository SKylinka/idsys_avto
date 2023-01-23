
package ru.stqa.pft.idsys.s.ru.cbr.ed.leaftypes.v2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OpCodeIDType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OpCodeIDType">
 *   &lt;restriction base="{urn:cbr-ru:ed:basetypes:v2.0}IdentifierTextCategory">
 *     &lt;enumeration value="EXCH"/>
 *     &lt;enumeration value="REMTN"/>
 *     &lt;enumeration value="CANCL"/>
 *     &lt;enumeration value="OTHERS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OpCodeIDType", namespace = "urn:cbr-ru:ed:leaftypes:v2.0")
@XmlEnum
public enum OpCodeIDType {

    EXCH,
    REMTN,
    CANCL,
    OTHERS;

    public String value() {
        return name();
    }

    public static OpCodeIDType fromValue(String v) {
        return valueOf(v);
    }

}
