
package ru.stqa.pft.idsys.s.ru.cbr.ed.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Реквизиты заполнения формы
 * 
 * <p>Java class for DataForm complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DataForm">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="ReportID" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}ReportIDType" />
 *       &lt;attribute name="DataCode" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}TwoDigitCodeType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataForm")
public class DataForm {

    @XmlAttribute(name = "ReportID", required = true)
    protected String reportID;
    @XmlAttribute(name = "DataCode", required = true)
    protected String dataCode;

    /**
     * Gets the value of the reportID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportID() {
        return reportID;
    }

    /**
     * Sets the value of the reportID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportID(String value) {
        this.reportID = value;
    }

    /**
     * Gets the value of the dataCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataCode() {
        return dataCode;
    }

    /**
     * Sets the value of the dataCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataCode(String value) {
        this.dataCode = value;
    }

}
