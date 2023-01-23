
package ru.stqa.pft.idsys.s.ru.cbr.ed.leaftypes.v2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ParticipantStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ParticipantStatusType">
 *   &lt;restriction base="{urn:cbr-ru:ed:basetypes:v2.0}IdentifierTextCategory">
 *     &lt;enumeration value="PSAC"/>
 *     &lt;enumeration value="PSDL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ParticipantStatusType", namespace = "urn:cbr-ru:ed:leaftypes:v2.0")
@XmlEnum
public enum ParticipantStatusType {

    PSAC,
    PSDL;

    public String value() {
        return name();
    }

    public static ParticipantStatusType fromValue(String v) {
        return valueOf(v);
    }

}
