
package ru.stqa.pft.idsys.s.ru.cbr.ed.leaftypes.v2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocIDType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DocIDType">
 *   &lt;restriction base="{urn:cbr-ru:ed:basetypes:v2.0}IdentifierTextCategory">
 *     &lt;enumeration value="DECLREF"/>
 *     &lt;enumeration value="LETTER"/>
 *     &lt;enumeration value="MEMO"/>
 *     &lt;enumeration value="SWIFT"/>
 *     &lt;enumeration value="UNDEF"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DocIDType", namespace = "urn:cbr-ru:ed:leaftypes:v2.0")
@XmlEnum
public enum DocIDType {

    DECLREF,
    LETTER,
    MEMO,
    SWIFT,
    UNDEF;

    public String value() {
        return name();
    }

    public static DocIDType fromValue(String v) {
        return valueOf(v);
    }

}
