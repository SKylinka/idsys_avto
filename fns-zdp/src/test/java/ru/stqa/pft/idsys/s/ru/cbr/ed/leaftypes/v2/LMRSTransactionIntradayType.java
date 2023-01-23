
package ru.stqa.pft.idsys.s.ru.cbr.ed.leaftypes.v2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LMRSTransactionIntradayType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LMRSTransactionIntradayType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EDTR"/>
 *     &lt;enumeration value="IDTR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LMRSTransactionIntradayType", namespace = "urn:cbr-ru:ed:leaftypes:v2.0")
@XmlEnum
public enum LMRSTransactionIntradayType {

    EDTR,
    IDTR;

    public String value() {
        return name();
    }

    public static LMRSTransactionIntradayType fromValue(String v) {
        return valueOf(v);
    }

}
