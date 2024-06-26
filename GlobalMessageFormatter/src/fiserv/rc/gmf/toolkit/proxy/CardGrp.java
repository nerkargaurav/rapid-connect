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
 * <p>Java class for CardGrp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CardGrp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}AcctNum" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}CardActivDate" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}CardExpiryDate" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}Track1Data" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}Track2Data" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}CardType" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}AVSResultCode" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}CCVInd" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}CCVData" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}CCVResultCode" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}MVVMAID" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}InfoReqInd" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}FndAcctNum" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}PymtAcctRefReqInd" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}PymtAcctRef" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardGrp", propOrder = {
    "acctNum",
    "cardActivDate",
    "cardExpiryDate",
    "track1Data",
    "track2Data",
    "cardType",
    "avsResultCode",
    "ccvInd",
    "ccvData",
    "ccvResultCode",
    "mvvmaid",
    "infoReqInd",
    "fndAcctNum",
    "pymtAcctRefReqInd",
    "pymtAcctRef"
})
public class CardGrp {

    @XmlElement(name = "AcctNum")
    protected String acctNum;
    @XmlElement(name = "CardActivDate")
    protected String cardActivDate;
    @XmlElement(name = "CardExpiryDate")
    protected String cardExpiryDate;
    @XmlElement(name = "Track1Data")
    protected String track1Data;
    @XmlElement(name = "Track2Data")
    protected String track2Data;
    @XmlElement(name = "CardType")
    @XmlSchemaType(name = "string")
    protected CardTypeType cardType;
    @XmlElement(name = "AVSResultCode")
    protected String avsResultCode;
    @XmlElement(name = "CCVInd")
    @XmlSchemaType(name = "string")
    protected CCVIndType ccvInd;
    @XmlElement(name = "CCVData")
    protected String ccvData;
    @XmlElement(name = "CCVResultCode")
    @XmlSchemaType(name = "string")
    protected CCVResultCodeType ccvResultCode;
    @XmlElement(name = "MVVMAID")
    protected String mvvmaid;
    @XmlElement(name = "InfoReqInd")
    @XmlSchemaType(name = "string")
    protected InfoReqIndType infoReqInd;
    @XmlElement(name = "FndAcctNum")
    protected String fndAcctNum;
    @XmlElement(name = "PymtAcctRefReqInd")
    @XmlSchemaType(name = "string")
    protected Max3ANYes pymtAcctRefReqInd;
    @XmlElement(name = "PymtAcctRef")
    protected String pymtAcctRef;

    /**
     * Gets the value of the acctNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctNum() {
        return acctNum;
    }

    /**
     * Sets the value of the acctNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctNum(String value) {
        this.acctNum = value;
    }

    /**
     * Gets the value of the cardActivDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardActivDate() {
        return cardActivDate;
    }

    /**
     * Sets the value of the cardActivDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardActivDate(String value) {
        this.cardActivDate = value;
    }

    /**
     * Gets the value of the cardExpiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardExpiryDate() {
        return cardExpiryDate;
    }

    /**
     * Sets the value of the cardExpiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardExpiryDate(String value) {
        this.cardExpiryDate = value;
    }

    /**
     * Gets the value of the track1Data property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrack1Data() {
        return track1Data;
    }

    /**
     * Sets the value of the track1Data property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrack1Data(String value) {
        this.track1Data = value;
    }

    /**
     * Gets the value of the track2Data property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrack2Data() {
        return track2Data;
    }

    /**
     * Sets the value of the track2Data property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrack2Data(String value) {
        this.track2Data = value;
    }

    /**
     * Gets the value of the cardType property.
     * 
     * @return
     *     possible object is
     *     {@link CardTypeType }
     *     
     */
    public CardTypeType getCardType() {
        return cardType;
    }

    /**
     * Sets the value of the cardType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardTypeType }
     *     
     */
    public void setCardType(CardTypeType value) {
        this.cardType = value;
    }

    /**
     * Gets the value of the avsResultCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAVSResultCode() {
        return avsResultCode;
    }

    /**
     * Sets the value of the avsResultCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAVSResultCode(String value) {
        this.avsResultCode = value;
    }

    /**
     * Gets the value of the ccvInd property.
     * 
     * @return
     *     possible object is
     *     {@link CCVIndType }
     *     
     */
    public CCVIndType getCCVInd() {
        return ccvInd;
    }

    /**
     * Sets the value of the ccvInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCVIndType }
     *     
     */
    public void setCCVInd(CCVIndType value) {
        this.ccvInd = value;
    }

    /**
     * Gets the value of the ccvData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCVData() {
        return ccvData;
    }

    /**
     * Sets the value of the ccvData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCVData(String value) {
        this.ccvData = value;
    }

    /**
     * Gets the value of the ccvResultCode property.
     * 
     * @return
     *     possible object is
     *     {@link CCVResultCodeType }
     *     
     */
    public CCVResultCodeType getCCVResultCode() {
        return ccvResultCode;
    }

    /**
     * Sets the value of the ccvResultCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCVResultCodeType }
     *     
     */
    public void setCCVResultCode(CCVResultCodeType value) {
        this.ccvResultCode = value;
    }

    /**
     * Gets the value of the mvvmaid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMVVMAID() {
        return mvvmaid;
    }

    /**
     * Sets the value of the mvvmaid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMVVMAID(String value) {
        this.mvvmaid = value;
    }

    /**
     * Gets the value of the infoReqInd property.
     * 
     * @return
     *     possible object is
     *     {@link InfoReqIndType }
     *     
     */
    public InfoReqIndType getInfoReqInd() {
        return infoReqInd;
    }

    /**
     * Sets the value of the infoReqInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link InfoReqIndType }
     *     
     */
    public void setInfoReqInd(InfoReqIndType value) {
        this.infoReqInd = value;
    }

    /**
     * Gets the value of the fndAcctNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFndAcctNum() {
        return fndAcctNum;
    }

    /**
     * Sets the value of the fndAcctNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFndAcctNum(String value) {
        this.fndAcctNum = value;
    }

    /**
     * Gets the value of the pymtAcctRefReqInd property.
     * 
     * @return
     *     possible object is
     *     {@link Max3ANYes }
     *     
     */
    public Max3ANYes getPymtAcctRefReqInd() {
        return pymtAcctRefReqInd;
    }

    /**
     * Sets the value of the pymtAcctRefReqInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Max3ANYes }
     *     
     */
    public void setPymtAcctRefReqInd(Max3ANYes value) {
        this.pymtAcctRefReqInd = value;
    }

    /**
     * Gets the value of the pymtAcctRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPymtAcctRef() {
        return pymtAcctRef;
    }

    /**
     * Sets the value of the pymtAcctRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPymtAcctRef(String value) {
        this.pymtAcctRef = value;
    }

}
