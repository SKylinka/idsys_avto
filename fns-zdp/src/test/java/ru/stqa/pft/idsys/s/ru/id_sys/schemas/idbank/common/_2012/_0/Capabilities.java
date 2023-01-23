
package ru.stqa.pft.idsys.s.ru.id_sys.schemas.idbank.common._2012._0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Capabilities.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Capabilities">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="QRStat"/>
 *     &lt;enumeration value="QRDyn"/>
 *     &lt;enumeration value="QRStatDyn"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Capabilities")
@XmlEnum
public enum Capabilities {


    /**
     * Только QR-наклейка
     * 
     */
    @XmlEnumValue("QRStat")
    QR_STAT("QRStat"),

    /**
     * Только QR на кассе
     * 
     */
    @XmlEnumValue("QRDyn")
    QR_DYN("QRDyn"),

    /**
     * QR-наклейка и QR на кассе
     * 
     */
    @XmlEnumValue("QRStatDyn")
    QR_STAT_DYN("QRStatDyn");
    private final String value;

    Capabilities(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Capabilities fromValue(String v) {
        for (Capabilities c: Capabilities.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
