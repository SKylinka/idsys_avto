
package ru.stqa.pft.idsys.s.ru.cbr.ed.leaftypes.v2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccrueScenarioType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AccrueScenarioType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NEWA"/>
 *     &lt;enumeration value="ADDA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AccrueScenarioType", namespace = "urn:cbr-ru:ed:leaftypes:v2.0")
@XmlEnum
public enum AccrueScenarioType {

    NEWA,
    ADDA;

    public String value() {
        return name();
    }

    public static AccrueScenarioType fromValue(String v) {
        return valueOf(v);
    }

}
