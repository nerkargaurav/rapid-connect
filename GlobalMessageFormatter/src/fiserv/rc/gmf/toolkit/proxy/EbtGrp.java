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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EbtGrp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EbtGrp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}EBTType" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}MerchFNSNum" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}EBTCardSeqNum" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}VoucherNum" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}EBTCaseNum" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EbtGrp", propOrder = {
    "ebtType",
    "merchFNSNum",
    "ebtCardSeqNum",
    "voucherNum",
    "ebtCaseNum"
})
public class EbtGrp {

    @XmlElement(name = "EBTType")
    @XmlSchemaType(name = "string")
    protected EBTTypeType ebtType;
    @XmlElement(name = "MerchFNSNum")
    protected String merchFNSNum;
    @XmlElement(name = "EBTCardSeqNum")
    protected String ebtCardSeqNum;
    @XmlElement(name = "VoucherNum")
    protected String voucherNum;
    @XmlElement(name = "EBTCaseNum")
    protected String ebtCaseNum;

    /**
     * Gets the value of the ebtType property.
     * 
     * @return
     *     possible object is
     *     {@link EBTTypeType }
     *     
     */
    public EBTTypeType getEBTType() {
        return ebtType;
    }

    /**
     * Sets the value of the ebtType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EBTTypeType }
     *     
     */
    public void setEBTType(EBTTypeType value) {
        this.ebtType = value;
    }

    /**
     * Gets the value of the merchFNSNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchFNSNum() {
        return merchFNSNum;
    }

    /**
     * Sets the value of the merchFNSNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchFNSNum(String value) {
        this.merchFNSNum = value;
    }

    /**
     * Gets the value of the ebtCardSeqNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEBTCardSeqNum() {
        return ebtCardSeqNum;
    }

    /**
     * Sets the value of the ebtCardSeqNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEBTCardSeqNum(String value) {
        this.ebtCardSeqNum = value;
    }

    /**
     * Gets the value of the voucherNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVoucherNum() {
        return voucherNum;
    }

    /**
     * Sets the value of the voucherNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVoucherNum(String value) {
        this.voucherNum = value;
    }

    /**
     * Gets the value of the ebtCaseNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEBTCaseNum() {
        return ebtCaseNum;
    }

    /**
     * Sets the value of the ebtCaseNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEBTCaseNum(String value) {
        this.ebtCaseNum = value;
    }

}
