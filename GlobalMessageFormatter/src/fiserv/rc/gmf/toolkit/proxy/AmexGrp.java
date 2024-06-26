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
 * <p>Java class for AmexGrp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AmexGrp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}AmExPOSData" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}AmExTranID" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}GdSoldCd" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}ReAuthInd" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}AmexAuthInd" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}StoredCrdInd" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AmexGrp", propOrder = {
    "amExPOSData",
    "amExTranID",
    "gdSoldCd",
    "reAuthInd",
    "amexAuthInd",
    "storedCrdInd"
})
public class AmexGrp {

    @XmlElement(name = "AmExPOSData")
    protected String amExPOSData;
    @XmlElement(name = "AmExTranID")
    protected String amExTranID;
    @XmlElement(name = "GdSoldCd")
    protected String gdSoldCd;
    @XmlElement(name = "ReAuthInd")
    @XmlSchemaType(name = "string")
    protected ReAuthIndType reAuthInd;
    @XmlElement(name = "AmexAuthInd")
    @XmlSchemaType(name = "string")
    protected AmexAuthIndType amexAuthInd;
    @XmlElement(name = "StoredCrdInd")
    @XmlSchemaType(name = "string")
    protected StoredCrdIndType storedCrdInd;

    /**
     * Gets the value of the amExPOSData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmExPOSData() {
        return amExPOSData;
    }

    /**
     * Sets the value of the amExPOSData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmExPOSData(String value) {
        this.amExPOSData = value;
    }

    /**
     * Gets the value of the amExTranID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmExTranID() {
        return amExTranID;
    }

    /**
     * Sets the value of the amExTranID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmExTranID(String value) {
        this.amExTranID = value;
    }

    /**
     * Gets the value of the gdSoldCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGdSoldCd() {
        return gdSoldCd;
    }

    /**
     * Sets the value of the gdSoldCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGdSoldCd(String value) {
        this.gdSoldCd = value;
    }

    /**
     * Gets the value of the reAuthInd property.
     * 
     * @return
     *     possible object is
     *     {@link ReAuthIndType }
     *     
     */
    public ReAuthIndType getReAuthInd() {
        return reAuthInd;
    }

    /**
     * Sets the value of the reAuthInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReAuthIndType }
     *     
     */
    public void setReAuthInd(ReAuthIndType value) {
        this.reAuthInd = value;
    }

    /**
     * Gets the value of the amexAuthInd property.
     * 
     * @return
     *     possible object is
     *     {@link AmexAuthIndType }
     *     
     */
    public AmexAuthIndType getAmexAuthInd() {
        return amexAuthInd;
    }

    /**
     * Sets the value of the amexAuthInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmexAuthIndType }
     *     
     */
    public void setAmexAuthInd(AmexAuthIndType value) {
        this.amexAuthInd = value;
    }

    /**
     * Gets the value of the storedCrdInd property.
     * 
     * @return
     *     possible object is
     *     {@link StoredCrdIndType }
     *     
     */
    public StoredCrdIndType getStoredCrdInd() {
        return storedCrdInd;
    }

    /**
     * Sets the value of the storedCrdInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link StoredCrdIndType }
     *     
     */
    public void setStoredCrdInd(StoredCrdIndType value) {
        this.storedCrdInd = value;
    }

}
