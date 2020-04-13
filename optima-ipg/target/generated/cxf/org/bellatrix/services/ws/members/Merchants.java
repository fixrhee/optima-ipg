
package org.bellatrix.services.ws.members;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for merchants complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="merchants">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="approvalDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="approved" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="approvedBy" type="{http://services.bellatrix.org/}memberView" minOccurs="0"/>
 *         &lt;element name="averageTrxValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="category" type="{http://services.bellatrix.org/}merchantCategory" minOccurs="0"/>
 *         &lt;element name="createdBy" type="{http://services.bellatrix.org/}memberView" minOccurs="0"/>
 *         &lt;element name="createdDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="formattedApprovalDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="formattedCreatedDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="group" type="{http://services.bellatrix.org/}groups" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="msisdn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="owner" type="{http://services.bellatrix.org/}merchantOwner" minOccurs="0"/>
 *         &lt;element name="permissionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="scale" type="{http://services.bellatrix.org/}merchantBusinessScale" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="storePhotoPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subCategory" type="{http://services.bellatrix.org/}merchantSubCategory" minOccurs="0"/>
 *         &lt;element name="taxCardNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "merchants", propOrder = {
    "address",
    "approvalDate",
    "approved",
    "approvedBy",
    "averageTrxValue",
    "category",
    "createdBy",
    "createdDate",
    "description",
    "email",
    "formattedApprovalDate",
    "formattedCreatedDate",
    "group",
    "id",
    "msisdn",
    "name",
    "owner",
    "permissionNumber",
    "scale",
    "status",
    "storePhotoPath",
    "subCategory",
    "taxCardNumber",
    "username"
})
public class Merchants {

    protected String address;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar approvalDate;
    protected Boolean approved;
    protected MemberView approvedBy;
    protected BigDecimal averageTrxValue;
    protected MerchantCategory category;
    protected MemberView createdBy;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    protected String description;
    protected String email;
    protected String formattedApprovalDate;
    protected String formattedCreatedDate;
    protected Groups group;
    protected Integer id;
    protected String msisdn;
    protected String name;
    protected MerchantOwner owner;
    protected String permissionNumber;
    protected MerchantBusinessScale scale;
    protected String status;
    protected String storePhotoPath;
    protected MerchantSubCategory subCategory;
    protected String taxCardNumber;
    protected String username;

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

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
     * Gets the value of the approvedBy property.
     * 
     * @return
     *     possible object is
     *     {@link MemberView }
     *     
     */
    public MemberView getApprovedBy() {
        return approvedBy;
    }

    /**
     * Sets the value of the approvedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link MemberView }
     *     
     */
    public void setApprovedBy(MemberView value) {
        this.approvedBy = value;
    }

    /**
     * Gets the value of the averageTrxValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAverageTrxValue() {
        return averageTrxValue;
    }

    /**
     * Sets the value of the averageTrxValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAverageTrxValue(BigDecimal value) {
        this.averageTrxValue = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link MerchantCategory }
     *     
     */
    public MerchantCategory getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link MerchantCategory }
     *     
     */
    public void setCategory(MerchantCategory value) {
        this.category = value;
    }

    /**
     * Gets the value of the createdBy property.
     * 
     * @return
     *     possible object is
     *     {@link MemberView }
     *     
     */
    public MemberView getCreatedBy() {
        return createdBy;
    }

    /**
     * Sets the value of the createdBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link MemberView }
     *     
     */
    public void setCreatedBy(MemberView value) {
        this.createdBy = value;
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
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
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
     * Gets the value of the msisdn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsisdn() {
        return msisdn;
    }

    /**
     * Sets the value of the msisdn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsisdn(String value) {
        this.msisdn = value;
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
     * Gets the value of the owner property.
     * 
     * @return
     *     possible object is
     *     {@link MerchantOwner }
     *     
     */
    public MerchantOwner getOwner() {
        return owner;
    }

    /**
     * Sets the value of the owner property.
     * 
     * @param value
     *     allowed object is
     *     {@link MerchantOwner }
     *     
     */
    public void setOwner(MerchantOwner value) {
        this.owner = value;
    }

    /**
     * Gets the value of the permissionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPermissionNumber() {
        return permissionNumber;
    }

    /**
     * Sets the value of the permissionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPermissionNumber(String value) {
        this.permissionNumber = value;
    }

    /**
     * Gets the value of the scale property.
     * 
     * @return
     *     possible object is
     *     {@link MerchantBusinessScale }
     *     
     */
    public MerchantBusinessScale getScale() {
        return scale;
    }

    /**
     * Sets the value of the scale property.
     * 
     * @param value
     *     allowed object is
     *     {@link MerchantBusinessScale }
     *     
     */
    public void setScale(MerchantBusinessScale value) {
        this.scale = value;
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
     * Gets the value of the storePhotoPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStorePhotoPath() {
        return storePhotoPath;
    }

    /**
     * Sets the value of the storePhotoPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStorePhotoPath(String value) {
        this.storePhotoPath = value;
    }

    /**
     * Gets the value of the subCategory property.
     * 
     * @return
     *     possible object is
     *     {@link MerchantSubCategory }
     *     
     */
    public MerchantSubCategory getSubCategory() {
        return subCategory;
    }

    /**
     * Sets the value of the subCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link MerchantSubCategory }
     *     
     */
    public void setSubCategory(MerchantSubCategory value) {
        this.subCategory = value;
    }

    /**
     * Gets the value of the taxCardNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxCardNumber() {
        return taxCardNumber;
    }

    /**
     * Sets the value of the taxCardNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxCardNumber(String value) {
        this.taxCardNumber = value;
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
