
package org.bellatrix.services.ws.members;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updateMerchantRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateMerchantRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="averageTrxValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="categoryID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="groupID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="msisdn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="owner" type="{http://services.bellatrix.org/}merchantOwner" minOccurs="0"/>
 *         &lt;element name="permissionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="scaleID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="storePhotoPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subCategoryID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
@XmlType(name = "updateMerchantRequest", propOrder = {
    "address",
    "averageTrxValue",
    "categoryID",
    "email",
    "groupID",
    "id",
    "msisdn",
    "name",
    "owner",
    "permissionNumber",
    "scaleID",
    "storePhotoPath",
    "subCategoryID",
    "taxCardNumber",
    "username"
})
public class UpdateMerchantRequest {

    protected String address;
    protected BigDecimal averageTrxValue;
    protected Integer categoryID;
    protected String email;
    protected Integer groupID;
    protected Integer id;
    protected String msisdn;
    protected String name;
    protected MerchantOwner owner;
    protected String permissionNumber;
    protected Integer scaleID;
    protected String storePhotoPath;
    protected Integer subCategoryID;
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
     * Gets the value of the categoryID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCategoryID() {
        return categoryID;
    }

    /**
     * Sets the value of the categoryID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCategoryID(Integer value) {
        this.categoryID = value;
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
     * Gets the value of the groupID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGroupID() {
        return groupID;
    }

    /**
     * Sets the value of the groupID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGroupID(Integer value) {
        this.groupID = value;
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
     * Gets the value of the scaleID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getScaleID() {
        return scaleID;
    }

    /**
     * Sets the value of the scaleID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setScaleID(Integer value) {
        this.scaleID = value;
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
     * Gets the value of the subCategoryID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSubCategoryID() {
        return subCategoryID;
    }

    /**
     * Sets the value of the subCategoryID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSubCategoryID(Integer value) {
        this.subCategoryID = value;
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
