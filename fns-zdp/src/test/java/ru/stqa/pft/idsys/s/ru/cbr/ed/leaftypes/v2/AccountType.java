
package ru.stqa.pft.idsys.s.ru.cbr.ed.leaftypes.v2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AccountType">
 *   &lt;restriction base="{urn:cbr-ru:ed:basetypes:v2.0}IdentifierTextCategory">
 *     &lt;enumeration value="BANA"/>
 *     &lt;enumeration value="CBRA"/>
 *     &lt;enumeration value="CRSA"/>
 *     &lt;enumeration value="TRSA"/>
 *     &lt;enumeration value="CLRA"/>
 *     &lt;enumeration value="EPGA"/>
 *     &lt;enumeration value="EPSA"/>
 *     &lt;enumeration value="GARA"/>
 *     &lt;enumeration value="TRUA"/>
 *     &lt;enumeration value="UTRA"/>
 *     &lt;enumeration value="CLAC"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AccountType", namespace = "urn:cbr-ru:ed:leaftypes:v2.0")
@XmlEnum
public enum AccountType {

    BANA,
    CBRA,
    CRSA,
    TRSA,
    CLRA,
    EPGA,
    EPSA,
    GARA,
    TRUA,
    UTRA,
    CLAC;

    public String value() {
        return name();
    }

    public static AccountType fromValue(String v) {
        return valueOf(v);
    }

}
