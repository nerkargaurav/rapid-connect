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
 * <p>Java class for FraudMitGrp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FraudMitGrp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}CustMatInd" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}AddChgInd" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}FrdScoreInd" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}NumAttempts" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}MembInd" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}CustID" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}CustStartDate" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}LoyID" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}LoyStartDate" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}FrdTxt" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}FrdPacket" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FraudMitGrp", propOrder = {
    "custMatInd",
    "addChgInd",
    "frdScoreInd",
    "numAttempts",
    "membInd",
    "custID",
    "custStartDate",
    "loyID",
    "loyStartDate",
    "frdTxt",
    "frdPacket"
})
public class FraudMitGrp {

    @XmlElement(name = "CustMatInd")
    @XmlSchemaType(name = "string")
    protected CustMatIndType custMatInd;
    @XmlElement(name = "AddChgInd")
    @XmlSchemaType(name = "string")
    protected AddChgIndType addChgInd;
    @XmlElement(name = "FrdScoreInd")
    @XmlSchemaType(name = "string")
    protected FrdScoreIndType frdScoreInd;
    @XmlElement(name = "NumAttempts")
    @XmlSchemaType(name = "integer")
    protected Integer numAttempts;
    @XmlElement(name = "MembInd")
    @XmlSchemaType(name = "string")
    protected MembIndType membInd;
    @XmlElement(name = "CustID")
    protected String custID;
    @XmlElement(name = "CustStartDate")
    protected String custStartDate;
    @XmlElement(name = "LoyID")
    protected String loyID;
    @XmlElement(name = "LoyStartDate")
    protected String loyStartDate;
    @XmlElement(name = "FrdTxt")
    protected String frdTxt;
    @XmlElement(name = "FrdPacket")
    protected String frdPacket;

    /**
     * Gets the value of the custMatInd property.
     * 
     * @return
     *     possible object is
     *     {@link CustMatIndType }
     *     
     */
    public CustMatIndType getCustMatInd() {
        return custMatInd;
    }

    /**
     * Sets the value of the custMatInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustMatIndType }
     *     
     */
    public void setCustMatInd(CustMatIndType value) {
        this.custMatInd = value;
    }

    /**
     * Gets the value of the addChgInd property.
     * 
     * @return
     *     possible object is
     *     {@link AddChgIndType }
     *     
     */
    public AddChgIndType getAddChgInd() {
        return addChgInd;
    }

    /**
     * Sets the value of the addChgInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddChgIndType }
     *     
     */
    public void setAddChgInd(AddChgIndType value) {
        this.addChgInd = value;
    }

    /**
     * Gets the value of the frdScoreInd property.
     * 
     * @return
     *     possible object is
     *     {@link FrdScoreIndType }
     *     
     */
    public FrdScoreIndType getFrdScoreInd() {
        return frdScoreInd;
    }

    /**
     * Sets the value of the frdScoreInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link FrdScoreIndType }
     *     
     */
    public void setFrdScoreInd(FrdScoreIndType value) {
        this.frdScoreInd = value;
    }

    /**
     * Gets the value of the numAttempts property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumAttempts() {
        return numAttempts;
    }

    /**
     * Sets the value of the numAttempts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumAttempts(Integer value) {
        this.numAttempts = value;
    }

    /**
     * Gets the value of the membInd property.
     * 
     * @return
     *     possible object is
     *     {@link MembIndType }
     *     
     */
    public MembIndType getMembInd() {
        return membInd;
    }

    /**
     * Sets the value of the membInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link MembIndType }
     *     
     */
    public void setMembInd(MembIndType value) {
        this.membInd = value;
    }

    /**
     * Gets the value of the custID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustID() {
        return custID;
    }

    /**
     * Sets the value of the custID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustID(String value) {
        this.custID = value;
    }

    /**
     * Gets the value of the custStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustStartDate() {
        return custStartDate;
    }

    /**
     * Sets the value of the custStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustStartDate(String value) {
        this.custStartDate = value;
    }

    /**
     * Gets the value of the loyID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoyID() {
        return loyID;
    }

    /**
     * Sets the value of the loyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoyID(String value) {
        this.loyID = value;
    }

    /**
     * Gets the value of the loyStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoyStartDate() {
        return loyStartDate;
    }

    /**
     * Sets the value of the loyStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoyStartDate(String value) {
        this.loyStartDate = value;
    }

    /**
     * Gets the value of the frdTxt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrdTxt() {
        return frdTxt;
    }

    /**
     * Sets the value of the frdTxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrdTxt(String value) {
        this.frdTxt = value;
    }

    /**
     * Gets the value of the frdPacket property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrdPacket() {
        return frdPacket;
    }

    /**
     * Sets the value of the frdPacket property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrdPacket(String value) {
        this.frdPacket = value;
    }

}
