
package org.bellatrix.services.ws.accounts;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for loadAccountPermissionsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="loadAccountPermissionsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accountPermission" type="{http://services.bellatrix.org/}accountPermissions" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="status" type="{http://services.bellatrix.org/}responseStatus" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "loadAccountPermissionsResponse", propOrder = {
    "accountPermission",
    "status"
})
public class LoadAccountPermissionsResponse {

    @XmlElement(nillable = true)
    protected List<AccountPermissions> accountPermission;
    protected ResponseStatus status;

    /**
     * Gets the value of the accountPermission property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accountPermission property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccountPermission().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountPermissions }
     * 
     * 
     */
    public List<AccountPermissions> getAccountPermission() {
        if (accountPermission == null) {
            accountPermission = new ArrayList<AccountPermissions>();
        }
        return this.accountPermission;
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

}
