
package org.bellatrix.services.ws.virtualaccount;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for reportBillingResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="reportBillingResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="expiredAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="expiredBilling" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="formattedExpiredAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="formattedPaidAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="formattedPendingAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="formattedReverseAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="formattedTotalAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="formattedUnpaidAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paidAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="paidBilling" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="pendingAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="pendingBilling" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="reversedAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="reversedBilling" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="status" type="{http://services.bellatrix.org/}responseStatus" minOccurs="0"/>
 *         &lt;element name="totalAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="totalRecords" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="unpaidAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="unpaidBilling" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="username" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reportBillingResponse", propOrder = {
    "expiredAmount",
    "expiredBilling",
    "formattedExpiredAmount",
    "formattedPaidAmount",
    "formattedPendingAmount",
    "formattedReverseAmount",
    "formattedTotalAmount",
    "formattedUnpaidAmount",
    "paidAmount",
    "paidBilling",
    "pendingAmount",
    "pendingBilling",
    "reversedAmount",
    "reversedBilling",
    "status",
    "totalAmount",
    "totalRecords",
    "unpaidAmount",
    "unpaidBilling",
    "username"
})
public class ReportBillingResponse {

    protected BigDecimal expiredAmount;
    protected Integer expiredBilling;
    protected String formattedExpiredAmount;
    protected String formattedPaidAmount;
    protected String formattedPendingAmount;
    protected String formattedReverseAmount;
    protected String formattedTotalAmount;
    protected String formattedUnpaidAmount;
    protected BigDecimal paidAmount;
    protected Integer paidBilling;
    protected BigDecimal pendingAmount;
    protected Integer pendingBilling;
    protected BigDecimal reversedAmount;
    protected Integer reversedBilling;
    protected ResponseStatus status;
    protected BigDecimal totalAmount;
    protected Integer totalRecords;
    protected BigDecimal unpaidAmount;
    protected Integer unpaidBilling;
    protected String username;

    /**
     * Gets the value of the expiredAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getExpiredAmount() {
        return expiredAmount;
    }

    /**
     * Sets the value of the expiredAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setExpiredAmount(BigDecimal value) {
        this.expiredAmount = value;
    }

    /**
     * Gets the value of the expiredBilling property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getExpiredBilling() {
        return expiredBilling;
    }

    /**
     * Sets the value of the expiredBilling property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setExpiredBilling(Integer value) {
        this.expiredBilling = value;
    }

    /**
     * Gets the value of the formattedExpiredAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormattedExpiredAmount() {
        return formattedExpiredAmount;
    }

    /**
     * Sets the value of the formattedExpiredAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormattedExpiredAmount(String value) {
        this.formattedExpiredAmount = value;
    }

    /**
     * Gets the value of the formattedPaidAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormattedPaidAmount() {
        return formattedPaidAmount;
    }

    /**
     * Sets the value of the formattedPaidAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormattedPaidAmount(String value) {
        this.formattedPaidAmount = value;
    }

    /**
     * Gets the value of the formattedPendingAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormattedPendingAmount() {
        return formattedPendingAmount;
    }

    /**
     * Sets the value of the formattedPendingAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormattedPendingAmount(String value) {
        this.formattedPendingAmount = value;
    }

    /**
     * Gets the value of the formattedReverseAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormattedReverseAmount() {
        return formattedReverseAmount;
    }

    /**
     * Sets the value of the formattedReverseAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormattedReverseAmount(String value) {
        this.formattedReverseAmount = value;
    }

    /**
     * Gets the value of the formattedTotalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormattedTotalAmount() {
        return formattedTotalAmount;
    }

    /**
     * Sets the value of the formattedTotalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormattedTotalAmount(String value) {
        this.formattedTotalAmount = value;
    }

    /**
     * Gets the value of the formattedUnpaidAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormattedUnpaidAmount() {
        return formattedUnpaidAmount;
    }

    /**
     * Sets the value of the formattedUnpaidAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormattedUnpaidAmount(String value) {
        this.formattedUnpaidAmount = value;
    }

    /**
     * Gets the value of the paidAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPaidAmount() {
        return paidAmount;
    }

    /**
     * Sets the value of the paidAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPaidAmount(BigDecimal value) {
        this.paidAmount = value;
    }

    /**
     * Gets the value of the paidBilling property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPaidBilling() {
        return paidBilling;
    }

    /**
     * Sets the value of the paidBilling property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPaidBilling(Integer value) {
        this.paidBilling = value;
    }

    /**
     * Gets the value of the pendingAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPendingAmount() {
        return pendingAmount;
    }

    /**
     * Sets the value of the pendingAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPendingAmount(BigDecimal value) {
        this.pendingAmount = value;
    }

    /**
     * Gets the value of the pendingBilling property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPendingBilling() {
        return pendingBilling;
    }

    /**
     * Sets the value of the pendingBilling property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPendingBilling(Integer value) {
        this.pendingBilling = value;
    }

    /**
     * Gets the value of the reversedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReversedAmount() {
        return reversedAmount;
    }

    /**
     * Sets the value of the reversedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setReversedAmount(BigDecimal value) {
        this.reversedAmount = value;
    }

    /**
     * Gets the value of the reversedBilling property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReversedBilling() {
        return reversedBilling;
    }

    /**
     * Sets the value of the reversedBilling property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReversedBilling(Integer value) {
        this.reversedBilling = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseStatus }
     *     
     */
    public ResponseStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseStatus }
     *     
     */
    public void setStatus(ResponseStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the totalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    /**
     * Sets the value of the totalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalAmount(BigDecimal value) {
        this.totalAmount = value;
    }

    /**
     * Gets the value of the totalRecords property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalRecords() {
        return totalRecords;
    }

    /**
     * Sets the value of the totalRecords property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalRecords(Integer value) {
        this.totalRecords = value;
    }

    /**
     * Gets the value of the unpaidAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUnpaidAmount() {
        return unpaidAmount;
    }

    /**
     * Sets the value of the unpaidAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUnpaidAmount(BigDecimal value) {
        this.unpaidAmount = value;
    }

    /**
     * Gets the value of the unpaidBilling property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUnpaidBilling() {
        return unpaidBilling;
    }

    /**
     * Sets the value of the unpaidBilling property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUnpaidBilling(Integer value) {
        this.unpaidBilling = value;
    }

    /**
     * Gets the value of the username property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the value of the username property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsername(String value) {
        this.username = value;
    }

}
