
package ru.stqa.pft.idsys.s.ru.cbr.ed.leaftypes.v2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReasonCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReasonCodeType">
 *   &lt;restriction base="{urn:cbr-ru:ed:basetypes:v2.0}CodeCategory">
 *     &lt;enumeration value="ACCH"/>
 *     &lt;enumeration value="AICH"/>
 *     &lt;enumeration value="ALCH"/>
 *     &lt;enumeration value="ANTC"/>
 *     &lt;enumeration value="APPA"/>
 *     &lt;enumeration value="RIRA"/>
 *     &lt;enumeration value="RIRP"/>
 *     &lt;enumeration value="RMAA"/>
 *     &lt;enumeration value="RMVA"/>
 *     &lt;enumeration value="RQST"/>
 *     &lt;enumeration value="SMON"/>
 *     &lt;enumeration value="SOBD"/>
 *     &lt;enumeration value="SPOF"/>
 *     &lt;enumeration value="UIRA"/>
 *     &lt;enumeration value="UIRP"/>
 *     &lt;enumeration value="ARRD"/>
 *     &lt;enumeration value="ARRM"/>
 *     &lt;enumeration value="ARRS"/>
 *     &lt;enumeration value="EOBD"/>
 *     &lt;enumeration value="EOCC"/>
 *     &lt;enumeration value="ICLD"/>
 *     &lt;enumeration value="ICLM"/>
 *     &lt;enumeration value="ICLS"/>
 *     &lt;enumeration value="PCHD"/>
 *     &lt;enumeration value="CSCH"/>
 *     &lt;enumeration value="NSCH"/>
 *     &lt;enumeration value="FCBD"/>
 *     &lt;enumeration value="CIBD"/>
 *     &lt;enumeration value="PPAD"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ReasonCodeType", namespace = "urn:cbr-ru:ed:leaftypes:v2.0")
@XmlEnum
public enum ReasonCodeType {

    ACCH,
    AICH,
    ALCH,
    ANTC,
    APPA,
    RIRA,
    RIRP,
    RMAA,
    RMVA,
    RQST,
    SMON,
    SOBD,
    SPOF,
    UIRA,
    UIRP,
    ARRD,
    ARRM,
    ARRS,
    EOBD,
    EOCC,
    ICLD,
    ICLM,
    ICLS,
    PCHD,
    CSCH,
    NSCH,
    FCBD,
    CIBD,
    PPAD;

    public String value() {
        return name();
    }

    public static ReasonCodeType fromValue(String v) {
        return valueOf(v);
    }

}
