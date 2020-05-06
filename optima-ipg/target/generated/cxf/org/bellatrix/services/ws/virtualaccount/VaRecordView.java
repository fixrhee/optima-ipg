
package org.bellatrix.services.ws.virtualaccount;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for vaRecordView complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="vaRecordView">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="bankCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bankID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="bankName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="billingCycle" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="callbackURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="createdDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="expiredAt" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="formattedAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="formattedCreatedDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="formattedExpiredAt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="formattedTransactionDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fullPayment" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="membershipID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="minimumPayment" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parentUsername" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paymentCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="persistent" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="referenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subscribed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ticketID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transactionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="transactionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transferType" type="{http://services.bellatrix.org/}transferTypes" minOccurs="0"/>
 *         &lt;element name="vaEvent" type="{http://services.bellatrix.org/}vaEvent" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vaRecordView", propOrder = {
    "amount",
    "bankCode",
    "bankID",
    "bankName",
    "billingCycle",
    "callbackURL",
    "createdDate",
    "description",
    "expiredAt",
    "formattedAmount",
    "formattedCreatedDate",
    "formattedExpiredAt",
    "formattedTransactionDate",
    "fullPayment",
    "id",
    "membershipID",
    "minimumPayment",
    "name",
    "parentUsername",
    "paymentCode",
    "persistent",
    "referenceNumber",
    "status",
    "subscribed",
    "ticketID",
    "transactionDate",
    "transactionNumber",
    "transferType",
    "vaEvent"
})
public class VaRecordView {

    protected BigDecimal amount;
    protected String bankCode;
    protected Integer bankID;
    protected String bankName;
    protected Integer billingCycle;
    protected String callbackURL;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    protected String description;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expiredAt;
    protected String formattedAmount;
    protected String formattedCreatedDate;
    protected String formattedExpiredAt;
    protected String formattedTransactionDate;
    protected boolean fullPayment;
    protected String id;
    protected Integer membershipID;
    protected BigDecimal minimumPayment;
    protected String name;
    protected String parentUsername;
    protected String paymentCode;
    protected boolean persistent;
    protected String referenceNumber;
    protected String status;
    protected boolean subscribed;
    protected String ticketID;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar transactionDate;
    protected String transactionNumber;
    protected TransferTypes transferType;
    protected VaEvent vaEvent;

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
    }

    /**
     * Gets the value of the bankCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankCode() {
        return bankCode;
    }

    /**
     * Sets the value of the bankCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankCode(String value) {
        this.bankCode = value;
    }

    /**
     * Gets the value of the bankID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBankID() {
        return bankID;
    }

    /**
     * Sets the value of the bankID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBankID(Integer value) {
        this.bankID = value;
    }

    /**
     * Gets the value of the bankName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * Sets the value of the bankName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankName(String value) {
        this.bankName = value;
    }

    /**
     * Gets the value of the billingCycle property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBillingCycle() {
        return billingCycle;
    }

    /**
     * Sets the value of the billingCycle property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBillingCycle(Integer value) {
        this.billingCycle = value;
    }

    /**
     * Gets the value of the callbackURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallbackURL() {
        return callbackURL;
    }

    /**
     * Sets the value of the callbackURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallbackURL(String value) {
        this.callbackURL = value;
    }

    /**
     * Gets the value of the createdDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreatedDate() {
        return createdDate;
    }

    /**
     * Sets the value of the createdDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreatedDate(XMLGregorianCalendar value) {
        this.createdDate = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the expiredAt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpiredAt() {
        return expiredAt;
    }

    /**
     * Sets the value of the expiredAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpiredAt(XMLGregorianCalendar value) {
        this.expiredAt = value;
    }

    /**
     * Gets the value of the formattedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormattedAmount() {
        return formattedAmount;
    }

    /**
     * Sets the value of the formattedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormattedAmount(String value) {
        this.formattedAmount = value;
    }

    /**
     * Gets the value of the formattedCreatedDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormattedCreatedDate() {
        return formattedCreatedDate;
    }

    /**
     * Sets the value of the formattedCreatedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormattedCreatedDate(String value) {
        this.formattedCreatedDate = value;
    }

    /**
     * Gets the value of the formattedExpiredAt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormattedExpiredAt() {
        return formattedExpiredAt;
    }

    /**
     * Sets the value of the formattedExpiredAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormattedExpiredAt(String value) {
        this.formattedExpiredAt = value;
    }

    /**
     * Gets the value of the formattedTransactionDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormattedTransactionDate() {
        return formattedTransactionDate;
    }

    /**
     * Sets the value of the formattedTransactionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormattedTransactionDate(String value) {
        this.formattedTransactionDate = value;
    }

    /**
     * Gets the value of the fullPayment property.
     * 
     */
    public boolean isFullPayment() {
        return fullPayment;
    }

    /**
     * Sets the value of the fullPayment property.
     * 
     */
    public void setFullPayment(boolean value) {
        this.fullPayment = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the membershipID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMembershipID() {
        return membershipID;
    }

    /**
     * Sets the value of the membershipID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMembershipID(Integer value) {
        this.membershipID = value;
    }

    /**
     * Gets the value of the minimumPayment property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinimumPayment() {
        return minimumPayment;
    }

    /**
     * Sets the value of the minimumPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinimumPayment(BigDecimal value) {
        this.minimumPayment = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the parentUsername property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentUsername() {
        return parentUsername;
    }

    /**
     * Sets the value of the parentUsername property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentUsername(String value) {
        this.parentUsername = value;
    }

    /**
     * Gets the value of the paymentCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentCode() {
        return paymentCode;
    }

    /**
     * Sets the value of the paymentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentCode(String value) {
        this.paymentCode = value;
    }

    /**
     * Gets the value of the persistent property.
     * 
     */
    public boolean isPersistent() {
        return persistent;
    }

    /**
     * Sets the value of the persistent property.
     * 
     */
    public void setPersistent(boolean value) {
        this.persistent = value;
    }

    /**
     * Gets the value of the referenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceNumber() {
        return referenceNumber;
    }

    /**
     * Sets the value of the referenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceNumber(String value) {
        this.referenceNumber = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the subscribed property.
     * 
     */
    public boolean isSubscribed() {
        return subscribed;
    }

    /**
     * Sets the value of the subscribed property.
     * 
     */
    public void setSubscribed(boolean value) {
        this.subscribed = value;
    }

    /**
     * Gets the value of the ticketID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketID() {
        return ticketID;
    }

    /**
     * Sets the value of the ticketID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketID(String value) {
        this.ticketID = value;
    }

    /**
     * Gets the value of the transactionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTransactionDate() {
        return transactionDate;
    }

    /**
     * Sets the value of the transactionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTransactionDate(XMLGregorianCalendar value) {
        this.transactionDate = value;
    }

    /**
     * Gets the value of the transactionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionNumber() {
        return transactionNumber;
    }

    /**
     * Sets the value of the transactionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionNumber(String value) {
        this.transactionNumber = value;
    }

    /**
     * Gets the value of the transferType property.
     * 
     * @return
     *     possible object is
     *     {@link TransferTypes }
     *     
     */
    public TransferTypes getTransferType() {
        return transferType;
    }

    /**
     * Sets the value of the transferType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferTypes }
     *     
     */
    public void setTransferType(TransferTypes value) {
        this.transferType = value;
    }

    /**
     * Gets the value of the vaEvent property.
     * 
     * @return
     *     possible object is
     *     {@link VaEvent }
     *     
     */
    public VaEvent getVaEvent() {
        return vaEvent;
    }

    /**
     * Sets the value of the vaEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link VaEvent }
     *     
     */
    public void setVaEvent(VaEvent value) {
        this.vaEvent = value;
    }

}
