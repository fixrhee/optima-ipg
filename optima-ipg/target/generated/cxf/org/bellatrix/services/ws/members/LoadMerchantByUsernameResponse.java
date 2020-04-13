
package org.bellatrix.services.ws.members;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for loadMerchantByUsernameResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="loadMerchantByUsernameResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="merchants" type="{http://services.bellatrix.org/}merchants" minOccurs="0"/>
 *         &lt;element name="status" type="{http://services.bellatrix.org/}responseStatus" minOccurs="0"/>
 *         &lt;element name="totalRecords" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "loadMerchantByUsernameResponse", propOrder = {
    "merchants",
    "status",
    "totalRecords"
})
public class LoadMerchantByUsernameResponse {

    protected Merchants merchants;
    protected ResponseStatus status;
    protected Integer totalRecords;

    /**
     * Gets the value of the merchants property.
     * 
     * @return
     *     possible object is
     *     {@link Merchants }
     *     
     */
    public Merchants getMerchants() {
        return merchants;
    }

    /**
     * Sets the value of the merchants property.
     * 
     * @param value
     *     allowed object is
     *     {@link Merchants }
     *     
     */
    public void setMerchants(Merchants value) {
        this.merchants = value;
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

}
