
package ru.stqa.pft.idsys.s.ru.cbr.ed.leaftypes.v2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClearingCodeListType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ClearingCodeListType">
 *   &lt;restriction base="{urn:cbr-ru:ed:basetypes:v2.0}IdentifierTextCategory">
 *     &lt;enumeration value="VISA"/>
 *     &lt;enumeration value="MASC"/>
 *     &lt;enumeration value="MIRC"/>
 *     &lt;enumeration value="UPAY"/>
 *     &lt;enumeration value="JCBC"/>
 *     &lt;enumeration value="AMES"/>
 *     &lt;enumeration value="FSSC"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ClearingCodeListType", namespace = "urn:cbr-ru:ed:leaftypes:v2.0")
@XmlEnum
public enum ClearingCodeListType {

    VISA,
    MASC,
    MIRC,
    UPAY,
    JCBC,
    AMES,
    FSSC;

    public String value() {
        return name();
    }

    public static ClearingCodeListType fromValue(String v) {
        return valueOf(v);
    }

}
