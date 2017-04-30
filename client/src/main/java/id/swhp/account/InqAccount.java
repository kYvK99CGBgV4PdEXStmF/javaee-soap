
package id.swhp.account;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for inqAccount complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="inqAccount">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="inqAccount" type="{http://account.swhp.id}account" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "inqAccount", propOrder = {
    "inqAccount"
})
public class InqAccount {

    protected Account inqAccount;

    /**
     * Gets the value of the inqAccount property.
     * 
     * @return
     *     possible object is
     *     {@link Account }
     *     
     */
    public Account getInqAccount() {
        return inqAccount;
    }

    /**
     * Sets the value of the inqAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Account }
     *     
     */
    public void setInqAccount(Account value) {
        this.inqAccount = value;
    }

}
