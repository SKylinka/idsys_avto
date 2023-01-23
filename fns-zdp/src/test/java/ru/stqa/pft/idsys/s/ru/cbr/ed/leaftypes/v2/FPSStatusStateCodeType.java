
package ru.stqa.pft.idsys.s.ru.cbr.ed.leaftypes.v2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FPSStatusStateCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FPSStatusStateCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SETL"/>
 *     &lt;enumeration value="WAIT"/>
 *     &lt;enumeration value="RJCT"/>
 *     &lt;enumeration value="NTEX"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FPSStatusStateCodeType", namespace = "urn:cbr-ru:ed:leaftypes:v2.0")
@XmlEnum
public enum FPSStatusStateCodeType {


    /**
     * Распоряжение исполнено.
     * 
     */
    SETL,

    /**
     * Распоряжение ожидает обработки.
     * 
     */
    WAIT,

    /**
     * Распоряжение забраковано.
     * 
     */
    RJCT,

    /**
     * Распоряжение не найдено.
     * 
     */
    NTEX;

    public String value() {
        return name();
    }

    public static FPSStatusStateCodeType fromValue(String v) {
        return valueOf(v);
    }

}
