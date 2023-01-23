
package ru.stqa.pft.idsys.s.ru.cbr.ed.leaftypes.v2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UFCFPropType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UFCFPropType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MAIN"/>
 *     &lt;enumeration value="SLVE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UFCFPropType", namespace = "urn:cbr-ru:ed:leaftypes:v2.0")
@XmlEnum
public enum UFCFPropType {

    MAIN,
    SLVE;

    public String value() {
        return name();
    }

    public static UFCFPropType fromValue(String v) {
        return valueOf(v);
    }

}
