//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.01.27 at 03:21:12 PM EST 
//


package fiserv.rc.gmf.toolkit.proxy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DebtRepayGrp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DebtRepayGrp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}RcptLastNm" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}RcptPostalCode" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}RcptDateOfBirth" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}RcptAcctNum" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DebtRepayGrp", propOrder = {
    "rcptLastNm",
    "rcptPostalCode",
    "rcptDateOfBirth",
    "rcptAcctNum"
})
public class DebtRepayGrp {

    @XmlElement(name = "RcptLastNm")
    protected String rcptLastNm;
    @XmlElement(name = "RcptPostalCode")
    protected String rcptPostalCode;
    @XmlElement(name = "RcptDateOfBirth")
    protected String rcptDateOfBirth;
    @XmlElement(name = "RcptAcctNum")
    protected String rcptAcctNum;

    /**
     * Gets the value of the rcptLastNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRcptLastNm() {
        return rcptLastNm;
    }

    /**
     * Sets the value of the rcptLastNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRcptLastNm(String value) {
        this.rcptLastNm = value;
    }

    /**
     * Gets the value of the rcptPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRcptPostalCode() {
        return rcptPostalCode;
    }

    /**
     * Sets the value of the rcptPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRcptPostalCode(String value) {
        this.rcptPostalCode = value;
    }

    /**
     * Gets the value of the rcptDateOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRcptDateOfBirth() {
        return rcptDateOfBirth;
    }

    /**
     * Sets the value of the rcptDateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRcptDateOfBirth(String value) {
        this.rcptDateOfBirth = value;
    }

    /**
     * Gets the value of the rcptAcctNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRcptAcctNum() {
        return rcptAcctNum;
    }

    /**
     * Sets the value of the rcptAcctNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRcptAcctNum(String value) {
        this.rcptAcctNum = value;
    }

}
