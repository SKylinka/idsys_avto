
package ru.stqa.pft.idsys.s.ru.cbr.ed.leaftypes.v2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionIDType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TransactionIDType">
 *   &lt;restriction base="{urn:cbr-ru:ed:basetypes:v2.0}IdentifierTextCategory">
 *     &lt;enumeration value="DIRECT"/>
 *     &lt;enumeration value="RECALL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TransactionIDType", namespace = "urn:cbr-ru:ed:leaftypes:v2.0")
@XmlEnum
public enum TransactionIDType {

    DIRECT,
    RECALL;

    public String value() {
        return name();
    }

    public static TransactionIDType fromValue(String v) {
        return valueOf(v);
    }

}
