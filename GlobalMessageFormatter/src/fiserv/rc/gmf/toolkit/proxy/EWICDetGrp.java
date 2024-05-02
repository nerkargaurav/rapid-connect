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
 * <p>Java class for EWICDetGrp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EWICDetGrp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}UPCPLUInd" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}UPCPLUData" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}UPCPrice" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}UPCQty" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}ActionCd" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}OrigPrice" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}OrigQty" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EWICDetGrp", propOrder = {
    "upcpluInd",
    "upcpluData",
    "upcPrice",
    "upcQty",
    "actionCd",
    "origPrice",
    "origQty"
})
public class EWICDetGrp {

    @XmlElement(name = "UPCPLUInd")
    protected String upcpluInd;
    @XmlElement(name = "UPCPLUData")
    protected String upcpluData;
    @XmlElement(name = "UPCPrice")
    protected String upcPrice;
    @XmlElement(name = "UPCQty")
    protected String upcQty;
    @XmlElement(name = "ActionCd")
    protected String actionCd;
    @XmlElement(name = "OrigPrice")
    protected String origPrice;
    @XmlElement(name = "OrigQty")
    protected String origQty;

    /**
     * Gets the value of the upcpluInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUPCPLUInd() {
        return upcpluInd;
    }

    /**
     * Sets the value of the upcpluInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUPCPLUInd(String value) {
        this.upcpluInd = value;
    }

    /**
     * Gets the value of the upcpluData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUPCPLUData() {
        return upcpluData;
    }

    /**
     * Sets the value of the upcpluData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUPCPLUData(String value) {
        this.upcpluData = value;
    }

    /**
     * Gets the value of the upcPrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUPCPrice() {
        return upcPrice;
    }

    /**
     * Sets the value of the upcPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUPCPrice(String value) {
        this.upcPrice = value;
    }

    /**
     * Gets the value of the upcQty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUPCQty() {
        return upcQty;
    }

    /**
     * Sets the value of the upcQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUPCQty(String value) {
        this.upcQty = value;
    }

    /**
     * Gets the value of the actionCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionCd() {
        return actionCd;
    }

    /**
     * Sets the value of the actionCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionCd(String value) {
        this.actionCd = value;
    }

    /**
     * Gets the value of the origPrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigPrice() {
        return origPrice;
    }

    /**
     * Sets the value of the origPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigPrice(String value) {
        this.origPrice = value;
    }

    /**
     * Gets the value of the origQty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigQty() {
        return origQty;
    }

    /**
     * Sets the value of the origQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigQty(String value) {
        this.origQty = value;
    }

}
