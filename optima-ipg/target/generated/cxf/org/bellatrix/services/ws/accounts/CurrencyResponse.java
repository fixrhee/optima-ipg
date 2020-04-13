
package org.bellatrix.services.ws.accounts;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for currencyResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="currencyResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="currency" type="{http://services.bellatrix.org/}currencies" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "currencyResponse", propOrder = {
    "currency",
    "status"
})
public class CurrencyResponse {

    @XmlElement(nillable = true)
    protected List<Currencies> currency;
    protected ResponseStatus status;

    /**
     * Gets the value of the currency property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the currency property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCurrency().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Currencies }
     * 
     * 
     */
    public List<Currencies> getCurrency() {
        if (currency == null) {
            currency = new ArrayList<Currencies>();
        }
        return this.currency;
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
