
package ru.stqa.pft.idsys.s.ru.cbr.ed.leaftypes.v2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ParticipantBusinessScenarioType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ParticipantBusinessScenarioType">
 *   &lt;restriction base="{urn:cbr-ru:ed:basetypes:v2.0}IdentifierTextCategory">
 *     &lt;enumeration value="AWCI"/>
 *     &lt;enumeration value="COVR"/>
 *     &lt;enumeration value="RCPC"/>
 *     &lt;enumeration value="RCPI"/>
 *     &lt;enumeration value="RSRV"/>
 *     &lt;enumeration value="RSOD"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ParticipantBusinessScenarioType", namespace = "urn:cbr-ru:ed:leaftypes:v2.0")
@XmlEnum
public enum ParticipantBusinessScenarioType {

    AWCI,
    COVR,
    RCPC,
    RCPI,
    RSRV,
    RSOD;

    public String value() {
        return name();
    }

    public static ParticipantBusinessScenarioType fromValue(String v) {
        return valueOf(v);
    }

}
