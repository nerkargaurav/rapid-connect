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
 * <p>Java class for DCCGrp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DCCGrp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}DCCInd" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}DCCTimeZn" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}DCCAmt" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}DCCRate" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}DCCCrncy" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DCCGrp", propOrder = {
    "dccInd",
    "dccTimeZn",
    "dccAmt",
    "dccRate",
    "dccCrncy"
})
public class DCCGrp {

    @XmlElement(name = "DCCInd")
    protected String dccInd;
    @XmlElement(name = "DCCTimeZn")
    protected String dccTimeZn;
    @XmlElement(name = "DCCAmt")
    protected String dccAmt;
    @XmlElement(name = "DCCRate")
    protected String dccRate;
    @XmlElement(name = "DCCCrncy")
    protected String dccCrncy;

    /**
     * Gets the value of the dccInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDCCInd() {
        return dccInd;
    }

    /**
     * Sets the value of the dccInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDCCInd(String value) {
        this.dccInd = value;
    }

    /**
     * Gets the value of the dccTimeZn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDCCTimeZn() {
        return dccTimeZn;
    }

    /**
     * Sets the value of the dccTimeZn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDCCTimeZn(String value) {
        this.dccTimeZn = value;
    }

    /**
     * Gets the value of the dccAmt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDCCAmt() {
        return dccAmt;
    }

    /**
     * Sets the value of the dccAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDCCAmt(String value) {
        this.dccAmt = value;
    }

    /**
     * Gets the value of the dccRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDCCRate() {
        return dccRate;
    }

    /**
     * Sets the value of the dccRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDCCRate(String value) {
        this.dccRate = value;
    }

    /**
     * Gets the value of the dccCrncy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDCCCrncy() {
        return dccCrncy;
    }

    /**
     * Sets the value of the dccCrncy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDCCCrncy(String value) {
        this.dccCrncy = value;
    }

}
