
package ru.stqa.pft.idsys.s.ru.id_sys.schemas.idbank.common._2012._0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QrcType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="QrcType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="QRStat"/>
 *     &lt;enumeration value="QRDyn"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "QrcType")
@XmlEnum
public enum QrcType {


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
    QR_DYN("QRDyn");
    private final String value;

    QrcType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static QrcType fromValue(String v) {
        for (QrcType c: QrcType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
