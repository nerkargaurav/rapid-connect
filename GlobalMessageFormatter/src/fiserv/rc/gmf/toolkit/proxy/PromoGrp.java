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
 * <p>Java class for PromoGrp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PromoGrp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}SplFinInd" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}PromoCd" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}PromoPlanCode" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}PromoPlanExpDate" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}PromoAPRFlag" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}PromoAPR" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}AfterPromoFlag" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}AfterPromoAPR" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}PromoDuration" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}PromoDesc" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PromoGrp", propOrder = {
    "splFinInd",
    "promoCd",
    "promoPlanCode",
    "promoPlanExpDate",
    "promoAPRFlag",
    "promoAPR",
    "afterPromoFlag",
    "afterPromoAPR",
    "promoDuration",
    "promoDesc"
})
public class PromoGrp {

    @XmlElement(name = "SplFinInd")
    protected String splFinInd;
    @XmlElement(name = "PromoCd")
    protected String promoCd;
    @XmlElement(name = "PromoPlanCode")
    protected String promoPlanCode;
    @XmlElement(name = "PromoPlanExpDate")
    protected String promoPlanExpDate;
    @XmlElement(name = "PromoAPRFlag")
    protected String promoAPRFlag;
    @XmlElement(name = "PromoAPR")
    protected String promoAPR;
    @XmlElement(name = "AfterPromoFlag")
    protected String afterPromoFlag;
    @XmlElement(name = "AfterPromoAPR")
    protected String afterPromoAPR;
    @XmlElement(name = "PromoDuration")
    protected String promoDuration;
    @XmlElement(name = "PromoDesc")
    protected String promoDesc;

    /**
     * Gets the value of the splFinInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSplFinInd() {
        return splFinInd;
    }

    /**
     * Sets the value of the splFinInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSplFinInd(String value) {
        this.splFinInd = value;
    }

    /**
     * Gets the value of the promoCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromoCd() {
        return promoCd;
    }

    /**
     * Sets the value of the promoCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromoCd(String value) {
        this.promoCd = value;
    }

    /**
     * Gets the value of the promoPlanCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromoPlanCode() {
        return promoPlanCode;
    }

    /**
     * Sets the value of the promoPlanCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromoPlanCode(String value) {
        this.promoPlanCode = value;
    }

    /**
     * Gets the value of the promoPlanExpDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromoPlanExpDate() {
        return promoPlanExpDate;
    }

    /**
     * Sets the value of the promoPlanExpDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromoPlanExpDate(String value) {
        this.promoPlanExpDate = value;
    }

    /**
     * Gets the value of the promoAPRFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromoAPRFlag() {
        return promoAPRFlag;
    }

    /**
     * Sets the value of the promoAPRFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromoAPRFlag(String value) {
        this.promoAPRFlag = value;
    }

    /**
     * Gets the value of the promoAPR property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromoAPR() {
        return promoAPR;
    }

    /**
     * Sets the value of the promoAPR property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromoAPR(String value) {
        this.promoAPR = value;
    }

    /**
     * Gets the value of the afterPromoFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAfterPromoFlag() {
        return afterPromoFlag;
    }

    /**
     * Sets the value of the afterPromoFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAfterPromoFlag(String value) {
        this.afterPromoFlag = value;
    }

    /**
     * Gets the value of the afterPromoAPR property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAfterPromoAPR() {
        return afterPromoAPR;
    }

    /**
     * Sets the value of the afterPromoAPR property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAfterPromoAPR(String value) {
        this.afterPromoAPR = value;
    }

    /**
     * Gets the value of the promoDuration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromoDuration() {
        return promoDuration;
    }

    /**
     * Sets the value of the promoDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromoDuration(String value) {
        this.promoDuration = value;
    }

    /**
     * Gets the value of the promoDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromoDesc() {
        return promoDesc;
    }

    /**
     * Sets the value of the promoDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromoDesc(String value) {
        this.promoDesc = value;
    }

}
