
package ru.stqa.pft.idsys.s.ru.cbr.ed.leaftypes.v2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatementServiceType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StatementServiceType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SBMT"/>
 *     &lt;enumeration value="SEMT"/>
 *     &lt;enumeration value="SNOT"/>
 *     &lt;enumeration value="NORS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "StatementServiceType", namespace = "urn:cbr-ru:ed:leaftypes:v2.0")
@XmlEnum
public enum StatementServiceType {

    SBMT,
    SEMT,
    SNOT,
    NORS;

    public String value() {
        return name();
    }

    public static StatementServiceType fromValue(String v) {
        return valueOf(v);
    }

}
