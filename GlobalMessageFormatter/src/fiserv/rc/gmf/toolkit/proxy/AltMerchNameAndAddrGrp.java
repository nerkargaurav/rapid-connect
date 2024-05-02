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
 * <p>Java class for AltMerchNameAndAddrGrp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AltMerchNameAndAddrGrp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}MerchName" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}MerchAddr" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}MerchCity" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}MerchState" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}MerchCnty" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}MerchPostalCode" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}MerchCtry" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}MerchEmail" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AltMerchNameAndAddrGrp", propOrder = {
    "merchName",
    "merchAddr",
    "merchCity",
    "merchState",
    "merchCnty",
    "merchPostalCode",
    "merchCtry",
    "merchEmail"
})
public class AltMerchNameAndAddrGrp {

    @XmlElement(name = "MerchName")
    protected String merchName;
    @XmlElement(name = "MerchAddr")
    protected String merchAddr;
    @XmlElement(name = "MerchCity")
    protected String merchCity;
    @XmlElement(name = "MerchState")
    protected String merchState;
    @XmlElement(name = "MerchCnty")
    protected String merchCnty;
    @XmlElement(name = "MerchPostalCode")
    protected String merchPostalCode;
    @XmlElement(name = "MerchCtry")
    protected String merchCtry;
    @XmlElement(name = "MerchEmail")
    protected String merchEmail;

    /**
     * Gets the value of the merchName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchName() {
        return merchName;
    }

    /**
     * Sets the value of the merchName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchName(String value) {
        this.merchName = value;
    }

    /**
     * Gets the value of the merchAddr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchAddr() {
        return merchAddr;
    }

    /**
     * Sets the value of the merchAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchAddr(String value) {
        this.merchAddr = value;
    }

    /**
     * Gets the value of the merchCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchCity() {
        return merchCity;
    }

    /**
     * Sets the value of the merchCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchCity(String value) {
        this.merchCity = value;
    }

    /**
     * Gets the value of the merchState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchState() {
        return merchState;
    }

    /**
     * Sets the value of the merchState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchState(String value) {
        this.merchState = value;
    }

    /**
     * Gets the value of the merchCnty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchCnty() {
        return merchCnty;
    }

    /**
     * Sets the value of the merchCnty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchCnty(String value) {
        this.merchCnty = value;
    }

    /**
     * Gets the value of the merchPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchPostalCode() {
        return merchPostalCode;
    }

    /**
     * Sets the value of the merchPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchPostalCode(String value) {
        this.merchPostalCode = value;
    }

    /**
     * Gets the value of the merchCtry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchCtry() {
        return merchCtry;
    }

    /**
     * Sets the value of the merchCtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchCtry(String value) {
        this.merchCtry = value;
    }

    /**
     * Gets the value of the merchEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchEmail() {
        return merchEmail;
    }

    /**
     * Sets the value of the merchEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchEmail(String value) {
        this.merchEmail = value;
    }

}
