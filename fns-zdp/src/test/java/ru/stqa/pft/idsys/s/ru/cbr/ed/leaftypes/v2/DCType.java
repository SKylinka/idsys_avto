
package ru.stqa.pft.idsys.s.ru.cbr.ed.leaftypes.v2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DCType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DCType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DEBT"/>
 *     &lt;enumeration value="CRED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DCType", namespace = "urn:cbr-ru:ed:leaftypes:v2.0")
@XmlEnum
public enum DCType {

    DEBT,
    CRED;

    public String value() {
        return name();
    }

    public static DCType fromValue(String v) {
        return valueOf(v);
    }

}
