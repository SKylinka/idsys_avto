
package ru.stqa.pft.idsys.s.ru.cbr.ed.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import ru.stqa.pft.idsys.s.ru.cbr.ed.leaftypes.v2.ParticipantBusinessScenarioType;


/**
 * Customer Credit Transfer
 * 
 * <p>Java class for ED101 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ED101">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:cbr-ru:ed:v2.0}EPDComplete">
 *       &lt;sequence>
 *         &lt;element name="IndirectParticipantInfo" type="{urn:cbr-ru:ed:v2.0}IndirectParticipantInfoType" minOccurs="0"/>
 *         &lt;element name="ParticipantBusinessScenario" type="{urn:cbr-ru:ed:leaftypes:v2.0}ParticipantBusinessScenarioType" minOccurs="0"/>
 *         &lt;element name="SettlementCondition" type="{urn:cbr-ru:ed:v2.0}SettlementCondition" minOccurs="0"/>
 *         &lt;element name="Purpose" type="{urn:cbr-ru:ed:leaftypes:v2.0}Max210TextType"/>
 *         &lt;element name="DepartmentalInfo" type="{urn:cbr-ru:ed:v2.0}DepartmentalInfo" minOccurs="0"/>
 *         &lt;element name="InitialED" type="{urn:cbr-ru:ed:v2.0}EDRefID" minOccurs="0"/>
 *         &lt;element name="ProcessingDetails" type="{urn:cbr-ru:ed:v2.0}ProcessingDetails" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="TransKind" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}TwoDigitCodeType" fixed="01" />
 *       &lt;attribute name="Priority" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}PaytPriorityCodeType" />
 *       &lt;attribute name="ReceiptDate" type="{urn:cbr-ru:ed:leaftypes:v2.0}DateType" />
 *       &lt;attribute name="FileDate" type="{urn:cbr-ru:ed:leaftypes:v2.0}DateType" />
 *       &lt;attribute name="ChargeOffDate" type="{urn:cbr-ru:ed:leaftypes:v2.0}DateType" />
 *       &lt;attribute name="SystemCode" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}SystemCodeType" />
 *       &lt;attribute name="PaymentID" type="{urn:cbr-ru:ed:leaftypes:v2.0}PaymentIDType" />
 *       &lt;attribute name="ResField" type="{urn:cbr-ru:ed:leaftypes:v2.0}Max35TextType" />
 *       &lt;attribute name="OperationID" type="{urn:cbr-ru:ed:leaftypes:v2.0}OperationIDType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ED101", propOrder = {
    "indirectParticipantInfo",
    "participantBusinessScenario",
    "settlementCondition",
    "purpose",
    "departmentalInfo",
    "initialED",
    "processingDetails"
})
public class ED101
    extends EPDComplete
{

    @XmlElement(name = "IndirectParticipantInfo")
    protected IndirectParticipantInfoType indirectParticipantInfo;
    @XmlElement(name = "ParticipantBusinessScenario")
    @XmlSchemaType(name = "string")
    protected ParticipantBusinessScenarioType participantBusinessScenario;
    @XmlElement(name = "SettlementCondition")
    protected SettlementCondition settlementCondition;
    @XmlElement(name = "Purpose", required = true)
    protected String purpose;
    @XmlElement(name = "DepartmentalInfo")
    protected DepartmentalInfo departmentalInfo;
    @XmlElement(name = "InitialED")
    protected EDRefID initialED;
    @XmlElement(name = "ProcessingDetails")
    protected ProcessingDetails processingDetails;
    @XmlAttribute(name = "TransKind", required = true)
    protected String transKind;
    @XmlAttribute(name = "Priority", required = true)
    protected String priority;
    @XmlAttribute(name = "ReceiptDate")
    protected XMLGregorianCalendar receiptDate;
    @XmlAttribute(name = "FileDate")
    protected XMLGregorianCalendar fileDate;
    @XmlAttribute(name = "ChargeOffDate")
    protected XMLGregorianCalendar chargeOffDate;
    @XmlAttribute(name = "SystemCode", required = true)
    protected String systemCode;
    @XmlAttribute(name = "PaymentID")
    protected String paymentID;
    @XmlAttribute(name = "ResField")
    protected String resField;
    @XmlAttribute(name = "OperationID")
    protected String operationID;

    /**
     * Gets the value of the indirectParticipantInfo property.
     * 
     * @return
     *     possible object is
     *     {@link IndirectParticipantInfoType }
     *     
     */
    public IndirectParticipantInfoType getIndirectParticipantInfo() {
        return indirectParticipantInfo;
    }

    /**
     * Sets the value of the indirectParticipantInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndirectParticipantInfoType }
     *     
     */
    public void setIndirectParticipantInfo(IndirectParticipantInfoType value) {
        this.indirectParticipantInfo = value;
    }

    /**
     * Gets the value of the participantBusinessScenario property.
     * 
     * @return
     *     possible object is
     *     {@link ParticipantBusinessScenarioType }
     *     
     */
    public ParticipantBusinessScenarioType getParticipantBusinessScenario() {
        return participantBusinessScenario;
    }

    /**
     * Sets the value of the participantBusinessScenario property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParticipantBusinessScenarioType }
     *     
     */
    public void setParticipantBusinessScenario(ParticipantBusinessScenarioType value) {
        this.participantBusinessScenario = value;
    }

    /**
     * Gets the value of the settlementCondition property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementCondition }
     *     
     */
    public SettlementCondition getSettlementCondition() {
        return settlementCondition;
    }

    /**
     * Sets the value of the settlementCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementCondition }
     *     
     */
    public void setSettlementCondition(SettlementCondition value) {
        this.settlementCondition = value;
    }

    /**
     * Gets the value of the purpose property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurpose() {
        return purpose;
    }

    /**
     * Sets the value of the purpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurpose(String value) {
        this.purpose = value;
    }

    /**
     * Gets the value of the departmentalInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DepartmentalInfo }
     *     
     */
    public DepartmentalInfo getDepartmentalInfo() {
        return departmentalInfo;
    }

    /**
     * Sets the value of the departmentalInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepartmentalInfo }
     *     
     */
    public void setDepartmentalInfo(DepartmentalInfo value) {
        this.departmentalInfo = value;
    }

    /**
     * Gets the value of the initialED property.
     * 
     * @return
     *     possible object is
     *     {@link EDRefID }
     *     
     */
    public EDRefID getInitialED() {
        return initialED;
    }

    /**
     * Sets the value of the initialED property.
     * 
     * @param value
     *     allowed object is
     *     {@link EDRefID }
     *     
     */
    public void setInitialED(EDRefID value) {
        this.initialED = value;
    }

    /**
     * Gets the value of the processingDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessingDetails }
     *     
     */
    public ProcessingDetails getProcessingDetails() {
        return processingDetails;
    }

    /**
     * Sets the value of the processingDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessingDetails }
     *     
     */
    public void setProcessingDetails(ProcessingDetails value) {
        this.processingDetails = value;
    }

    /**
     * Gets the value of the transKind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransKind() {
        if (transKind == null) {
            return "01";
        } else {
            return transKind;
        }
    }

    /**
     * Sets the value of the transKind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransKind(String value) {
        this.transKind = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriority(String value) {
        this.priority = value;
    }

    /**
     * Gets the value of the receiptDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReceiptDate() {
        return receiptDate;
    }

    /**
     * Sets the value of the receiptDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReceiptDate(XMLGregorianCalendar value) {
        this.receiptDate = value;
    }

    /**
     * Gets the value of the fileDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFileDate() {
        return fileDate;
    }

    /**
     * Sets the value of the fileDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFileDate(XMLGregorianCalendar value) {
        this.fileDate = value;
    }

    /**
     * Gets the value of the chargeOffDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getChargeOffDate() {
        return chargeOffDate;
    }

    /**
     * Sets the value of the chargeOffDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setChargeOffDate(XMLGregorianCalendar value) {
        this.chargeOffDate = value;
    }

    /**
     * Gets the value of the systemCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystemCode() {
        return systemCode;
    }

    /**
     * Sets the value of the systemCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystemCode(String value) {
        this.systemCode = value;
    }

    /**
     * Gets the value of the paymentID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentID() {
        return paymentID;
    }

    /**
     * Sets the value of the paymentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentID(String value) {
        this.paymentID = value;
    }

    /**
     * Gets the value of the resField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResField() {
        return resField;
    }

    /**
     * Sets the value of the resField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResField(String value) {
        this.resField = value;
    }

    /**
     * Gets the value of the operationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperationID() {
        return operationID;
    }

    /**
     * Sets the value of the operationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperationID(String value) {
        this.operationID = value;
    }

}
