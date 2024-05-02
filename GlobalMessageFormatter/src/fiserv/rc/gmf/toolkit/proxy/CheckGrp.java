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
 * <p>Java class for CheckGrp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CheckGrp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}MICR" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}DrvLic" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}StateCode" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}DLDateOfBirth" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}ChkSvcPvdr" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}ChkEntryMethod" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckGrp", propOrder = {
    "micr",
    "drvLic",
    "stateCode",
    "dlDateOfBirth",
    "chkSvcPvdr",
    "chkEntryMethod"
})
public class CheckGrp {

    @XmlElement(name = "MICR")
    protected String micr;
    @XmlElement(name = "DrvLic")
    protected String drvLic;
    @XmlElement(name = "StateCode")
    protected String stateCode;
    @XmlElement(name = "DLDateOfBirth")
    protected String dlDateOfBirth;
    @XmlElement(name = "ChkSvcPvdr")
    @XmlSchemaType(name = "string")
    protected ChkSvcPvdrType chkSvcPvdr;
    @XmlElement(name = "ChkEntryMethod")
    protected String chkEntryMethod;

    /**
     * Gets the value of the micr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMICR() {
        return micr;
    }

    /**
     * Sets the value of the micr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMICR(String value) {
        this.micr = value;
    }

    /**
     * Gets the value of the drvLic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrvLic() {
        return drvLic;
    }

    /**
     * Sets the value of the drvLic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDrvLic(String value) {
        this.drvLic = value;
    }

    /**
     * Gets the value of the stateCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateCode() {
        return stateCode;
    }

    /**
     * Sets the value of the stateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateCode(String value) {
        this.stateCode = value;
    }

    /**
     * Gets the value of the dlDateOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDLDateOfBirth() {
        return dlDateOfBirth;
    }

    /**
     * Sets the value of the dlDateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDLDateOfBirth(String value) {
        this.dlDateOfBirth = value;
    }

    /**
     * Gets the value of the chkSvcPvdr property.
     * 
     * @return
     *     possible object is
     *     {@link ChkSvcPvdrType }
     *     
     */
    public ChkSvcPvdrType getChkSvcPvdr() {
        return chkSvcPvdr;
    }

    /**
     * Sets the value of the chkSvcPvdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChkSvcPvdrType }
     *     
     */
    public void setChkSvcPvdr(ChkSvcPvdrType value) {
        this.chkSvcPvdr = value;
    }

    /**
     * Gets the value of the chkEntryMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChkEntryMethod() {
        return chkEntryMethod;
    }

    /**
     * Sets the value of the chkEntryMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChkEntryMethod(String value) {
        this.chkEntryMethod = value;
    }

}