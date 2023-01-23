
package ru.stqa.pft.idsys.s.ru.cbr.ed.leaftypes.v2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OperationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OperationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CCPH"/>
 *     &lt;enumeration value="CCRC"/>
 *     &lt;enumeration value="CCRB"/>
 *     &lt;enumeration value="CCPL"/>
 *     &lt;enumeration value="CBPH"/>
 *     &lt;enumeration value="CBPP"/>
 *     &lt;enumeration value="CBRC"/>
 *     &lt;enumeration value="CBRB"/>
 *     &lt;enumeration value="CCRD"/>
 *     &lt;enumeration value="CCRT"/>
 *     &lt;enumeration value="CCRN"/>
 *     &lt;enumeration value="CBRD"/>
 *     &lt;enumeration value="CBRT"/>
 *     &lt;enumeration value="CBRN"/>
 *     &lt;enumeration value="BCPH"/>
 *     &lt;enumeration value="BCRC"/>
 *     &lt;enumeration value="BCRB"/>
 *     &lt;enumeration value="BCRD"/>
 *     &lt;enumeration value="BCRT"/>
 *     &lt;enumeration value="BCRN"/>
 *     &lt;enumeration value="BBPH"/>
 *     &lt;enumeration value="BBRT"/>
 *     &lt;enumeration value="BBRN"/>
 *     &lt;enumeration value="BBRB"/>
 *     &lt;enumeration value="BBRD"/>
 *     &lt;enumeration value="BBRC"/>
 *     &lt;enumeration value="CGPH"/>
 *     &lt;enumeration value="CGRT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OperationType", namespace = "urn:cbr-ru:ed:leaftypes:v2.0")
@XmlEnum
public enum OperationType {

    CCPH,
    CCRC,
    CCRB,
    CCPL,
    CBPH,
    CBPP,
    CBRC,
    CBRB,
    CCRD,
    CCRT,
    CCRN,
    CBRD,
    CBRT,
    CBRN,
    BCPH,
    BCRC,
    BCRB,
    BCRD,
    BCRT,
    BCRN,
    BBPH,
    BBRT,
    BBRN,
    BBRB,
    BBRD,
    BBRC,
    CGPH,
    CGRT;

    public String value() {
        return name();
    }

    public static OperationType fromValue(String v) {
        return valueOf(v);
    }

}
