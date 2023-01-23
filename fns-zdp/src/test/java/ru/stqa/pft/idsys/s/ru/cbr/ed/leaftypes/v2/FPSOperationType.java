
package ru.stqa.pft.idsys.s.ru.cbr.ed.leaftypes.v2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FPSOperationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FPSOperationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INSR"/>
 *     &lt;enumeration value="DELT"/>
 *     &lt;enumeration value="UPDT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FPSOperationType", namespace = "urn:cbr-ru:ed:leaftypes:v2.0")
@XmlEnum
public enum FPSOperationType {


    /**
     * Добавить запись в таблицу (INSERT).
     * 
     */
    INSR,

    /**
     * Удалить запись из таблицы (DELETE).
     * 
     */
    DELT,

    /**
     * Изменить запись в таблице (UPDATE).
     * 
     */
    UPDT;

    public String value() {
        return name();
    }

    public static FPSOperationType fromValue(String v) {
        return valueOf(v);
    }

}
