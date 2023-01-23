
package ru.stqa.pft.idsys.s.ru.cbr.ed.leaftypes.v2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ERCControlCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ERCControlCodeType">
 *   &lt;restriction base="{urn:cbr-ru:ed:basetypes:v2.0}IdentifierTextCategory">
 *     &lt;enumeration value="EXEC"/>
 *     &lt;enumeration value="WRNG"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ERCControlCodeType", namespace = "urn:cbr-ru:ed:leaftypes:v2.0")
@XmlEnum
public enum ERCControlCodeType {

    EXEC,
    WRNG;

    public String value() {
        return name();
    }

    public static ERCControlCodeType fromValue(String v) {
        return valueOf(v);
    }

}
