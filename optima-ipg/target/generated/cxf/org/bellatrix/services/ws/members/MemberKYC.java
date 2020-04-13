
package org.bellatrix.services.ws.members;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for memberKYC complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="memberKYC">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="approvalDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="approvalRequestDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="approved" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="approvedMember" type="{http://services.bellatrix.org/}members" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="formattedApprovalDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="formattedApprovalRequestedDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="formattedRequestedDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="formattedValidateDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fromMember" type="{http://services.bellatrix.org/}members" minOccurs="0"/>
 *         &lt;element name="group" type="{http://services.bellatrix.org/}groups" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="imagePath1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="imagePath2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="imagePath3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requestedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="validateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="validateDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="validated" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="validatedMember" type="{http://services.bellatrix.org/}members" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "memberKYC", propOrder = {
    "approvalDate",
    "approvalRequestDate",
    "approved",
    "approvedMember",
    "description",
    "formattedApprovalDate",
    "formattedApprovalRequestedDate",
    "formattedRequestedDate",
    "formattedValidateDate",
    "fromMember",
    "group",
    "id",
    "imagePath1",
    "imagePath2",
    "imagePath3",
    "requestedDate",
    "status",
    "validateDate",
    "validateDescription",
    "validated",
    "validatedMember"
})
public class MemberKYC {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar approvalDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar approvalRequestDate;
    protected Boolean approved;
    protected Members approvedMember;
    protected String description;
    protected String formattedApprovalDate;
    protected String formattedApprovalRequestedDate;
    protected String formattedRequestedDate;
    protected String formattedValidateDate;
    protected Members fromMember;
    protected Groups group;
    protected Integer id;
    protected String imagePath1;
    protected String imagePath2;
    protected String imagePath3;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar requestedDate;
    protected String status;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar validateDate;
    protected String validateDescription;
    protected Boolean validated;
    protected Members validatedMember;

    /**
     * Gets the value of the approvalDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getApprovalDate() {
        return approvalDate;
    }

    /**
     * Sets the value of the approvalDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setApprovalDate(XMLGregorianCalendar value) {
        this.approvalDate = value;
    }

    /**
     * Gets the value of the approvalRequestDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getApprovalRequestDate() {
        return approvalRequestDate;
    }

    /**
     * Sets the value of the approvalRequestDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setApprovalRequestDate(XMLGregorianCalendar value) {
        this.approvalRequestDate = value;
    }

    /**
     * Gets the value of the approved property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isApproved() {
        return approved;
    }

    /**
     * Sets the value of the approved property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setApproved(Boolean value) {
        this.approved = value;
    }

    /**
     * Gets the value of the approvedMember property.
     * 
     * @return
     *     possible object is
     *     {@link Members }
     *     
     */
    public Members getApprovedMember() {
        return approvedMember;
    }

    /**
     * Sets the value of the approvedMember property.
     * 
     * @param value
     *     allowed object is
     *     {@link Members }
     *     
     */
    public void setApprovedMember(Members value) {
        this.approvedMember = value;
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
     * Gets the value of the formattedApprovalDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormattedApprovalDate() {
        return formattedApprovalDate;
    }

    /**
     * Sets the value of the formattedApprovalDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormattedApprovalDate(String value) {
        this.formattedApprovalDate = value;
    }

    /**
     * Gets the value of the formattedApprovalRequestedDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormattedApprovalRequestedDate() {
        return formattedApprovalRequestedDate;
    }

    /**
     * Sets the value of the formattedApprovalRequestedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormattedApprovalRequestedDate(String value) {
        this.formattedApprovalRequestedDate = value;
    }

    /**
     * Gets the value of the formattedRequestedDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormattedRequestedDate() {
        return formattedRequestedDate;
    }

    /**
     * Sets the value of the formattedRequestedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormattedRequestedDate(String value) {
        this.formattedRequestedDate = value;
    }

    /**
     * Gets the value of the formattedValidateDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormattedValidateDate() {
        return formattedValidateDate;
    }

    /**
     * Sets the value of the formattedValidateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormattedValidateDate(String value) {
        this.formattedValidateDate = value;
    }

    /**
     * Gets the value of the fromMember property.
     * 
     * @return
     *     possible object is
     *     {@link Members }
     *     
     */
    public Members getFromMember() {
        return fromMember;
    }

    /**
     * Sets the value of the fromMember property.
     * 
     * @param value
     *     allowed object is
     *     {@link Members }
     *     
     */
    public void setFromMember(Members value) {
        this.fromMember = value;
    }

    /**
     * Gets the value of the group property.
     * 
     * @return
     *     possible object is
     *     {@link Groups }
     *     
     */
    public Groups getGroup() {
        return group;
    }

    /**
     * Sets the value of the group property.
     * 
     * @param value
     *     allowed object is
     *     {@link Groups }
     *     
     */
    public void setGroup(Groups value) {
        this.group = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setId(Integer value) {
        this.id = value;
    }

    /**
     * Gets the value of the imagePath1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImagePath1() {
        return imagePath1;
    }

    /**
     * Sets the value of the imagePath1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImagePath1(String value) {
        this.imagePath1 = value;
    }

    /**
     * Gets the value of the imagePath2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImagePath2() {
        return imagePath2;
    }

    /**
     * Sets the value of the imagePath2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImagePath2(String value) {
        this.imagePath2 = value;
    }

    /**
     * Gets the value of the imagePath3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImagePath3() {
        return imagePath3;
    }

    /**
     * Sets the value of the imagePath3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImagePath3(String value) {
        this.imagePath3 = value;
    }

    /**
     * Gets the value of the requestedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRequestedDate() {
        return requestedDate;
    }

    /**
     * Sets the value of the requestedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRequestedDate(XMLGregorianCalendar value) {
        this.requestedDate = value;
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
     * Gets the value of the validateDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValidateDate() {
        return validateDate;
    }

    /**
     * Sets the value of the validateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValidateDate(XMLGregorianCalendar value) {
        this.validateDate = value;
    }

    /**
     * Gets the value of the validateDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidateDescription() {
        return validateDescription;
    }

    /**
     * Sets the value of the validateDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidateDescription(String value) {
        this.validateDescription = value;
    }

    /**
     * Gets the value of the validated property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isValidated() {
        return validated;
    }

    /**
     * Sets the value of the validated property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setValidated(Boolean value) {
        this.validated = value;
    }

    /**
     * Gets the value of the validatedMember property.
     * 
     * @return
     *     possible object is
     *     {@link Members }
     *     
     */
    public Members getValidatedMember() {
        return validatedMember;
    }

    /**
     * Sets the value of the validatedMember property.
     * 
     * @param value
     *     allowed object is
     *     {@link Members }
     *     
     */
    public void setValidatedMember(Members value) {
        this.validatedMember = value;
    }

}
