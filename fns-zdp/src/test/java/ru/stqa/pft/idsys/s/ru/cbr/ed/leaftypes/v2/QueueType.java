
package ru.stqa.pft.idsys.s.ru.cbr.ed.leaftypes.v2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueueType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="QueueType">
 *   &lt;restriction base="{urn:cbr-ru:ed:basetypes:v2.0}CodeCategory">
 *     &lt;enumeration value="QINT"/>
 *     &lt;enumeration value="QSPC"/>
 *     &lt;enumeration value="QWAP"/>
 *     &lt;enumeration value="QWCH"/>
 *     &lt;enumeration value="QWRH"/>
 *     &lt;enumeration value="QWEC"/>
 *     &lt;enumeration value="QWAC"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "QueueType", namespace = "urn:cbr-ru:ed:leaftypes:v2.0")
@XmlEnum
public enum QueueType {

    QINT,
    QSPC,
    QWAP,
    QWCH,
    QWRH,
    QWEC,
    QWAC;

    public String value() {
        return name();
    }

    public static QueueType fromValue(String v) {
        return valueOf(v);
    }

}
