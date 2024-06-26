//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.01.27 at 03:21:12 PM EST 
//


package fiserv.rc.gmf.toolkit.proxy;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreditRequestDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditRequestDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CommonGrp" type="{com/fiserv/Merchant/gmfV10.02}CommonGrp" minOccurs="0"/>
 *         &lt;element name="BillPayGrp" type="{com/fiserv/Merchant/gmfV10.02}BillPayGrp" minOccurs="0"/>
 *         &lt;element name="AltMerchNameAndAddrGrp" type="{com/fiserv/Merchant/gmfV10.02}AltMerchNameAndAddrGrp" minOccurs="0"/>
 *         &lt;element name="PFGrp" type="{com/fiserv/Merchant/gmfV10.02}PFGrp" minOccurs="0"/>
 *         &lt;element name="CardGrp" type="{com/fiserv/Merchant/gmfV10.02}CardGrp" minOccurs="0"/>
 *         &lt;element name="RealTimeAcctUpdGrp" type="{com/fiserv/Merchant/gmfV10.02}RealTimeAcctUpdGrp" minOccurs="0"/>
 *         &lt;element name="MEXCardGrp" type="{com/fiserv/Merchant/gmfV10.02}MEXCardGrp" minOccurs="0"/>
 *         &lt;element name="PINGrp" type="{com/fiserv/Merchant/gmfV10.02}PINGrp" minOccurs="0"/>
 *         &lt;element name="AddtlAmtGrp" type="{com/fiserv/Merchant/gmfV10.02}AddtlAmtGrp" maxOccurs="6" minOccurs="0"/>
 *         &lt;element name="EMVGrp" type="{com/fiserv/Merchant/gmfV10.02}EMVGrp" minOccurs="0"/>
 *         &lt;element name="TAGrp" type="{com/fiserv/Merchant/gmfV10.02}TAGrp" minOccurs="0"/>
 *         &lt;element name="TknGrp" type="{com/fiserv/Merchant/gmfV10.02}TknGrp" minOccurs="0"/>
 *         &lt;element name="EcommGrp" type="{com/fiserv/Merchant/gmfV10.02}EcommGrp" minOccurs="0"/>
 *         &lt;element name="SecrTxnGrp" type="{com/fiserv/Merchant/gmfV10.02}SecrTxnGrp" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="VisaGrp" type="{com/fiserv/Merchant/gmfV10.02}VisaGrp" minOccurs="0"/>
 *           &lt;element name="MCGrp" type="{com/fiserv/Merchant/gmfV10.02}MCGrp" minOccurs="0"/>
 *           &lt;element name="DSGrp" type="{com/fiserv/Merchant/gmfV10.02}DSGrp" minOccurs="0"/>
 *           &lt;element name="AmexGrp" type="{com/fiserv/Merchant/gmfV10.02}AmexGrp" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element name="UnionPayGrp" type="{com/fiserv/Merchant/gmfV10.02}UnionPayGrp" minOccurs="0"/>
 *         &lt;element name="PrvLblGrp" type="{com/fiserv/Merchant/gmfV10.02}PrvLblGrp" minOccurs="0"/>
 *         &lt;element name="PurchCardlvl2Grp" type="{com/fiserv/Merchant/gmfV10.02}PurchCardlvl2Grp" minOccurs="0"/>
 *         &lt;element name="PurchCardlvl3Grp" type="{com/fiserv/Merchant/gmfV10.02}PurchCardlvl3Grp" maxOccurs="999" minOccurs="0"/>
 *         &lt;element name="CustInfoGrp" type="{com/fiserv/Merchant/gmfV10.02}CustInfoGrp" minOccurs="0"/>
 *         &lt;element name="DebtRepayGrp" type="{com/fiserv/Merchant/gmfV10.02}DebtRepayGrp" minOccurs="0"/>
 *         &lt;element name="OrderGrp" type="{com/fiserv/Merchant/gmfV10.02}OrderGrp" minOccurs="0"/>
 *         &lt;element name="ShipGrp" type="{com/fiserv/Merchant/gmfV10.02}ShipGrp" minOccurs="0"/>
 *         &lt;element name="SAGrp" type="{com/fiserv/Merchant/gmfV10.02}SAGrp" minOccurs="0"/>
 *         &lt;element name="OrigAuthGrp" type="{com/fiserv/Merchant/gmfV10.02}OrigAuthGrp" minOccurs="0"/>
 *         &lt;element name="DCCGrp" type="{com/fiserv/Merchant/gmfV10.02}DCCGrp" minOccurs="0"/>
 *         &lt;element name="ProdCodeGrp" type="{com/fiserv/Merchant/gmfV10.02}ProdCodeGrp" minOccurs="0"/>
 *         &lt;element name="ProdCodeDetGrp" type="{com/fiserv/Merchant/gmfV10.02}ProdCodeDetGrp" maxOccurs="10" minOccurs="0"/>
 *         &lt;element name="LodgingGrp" type="{com/fiserv/Merchant/gmfV10.02}LodgingGrp" minOccurs="0"/>
 *         &lt;element name="AutoRentalGrp" type="{com/fiserv/Merchant/gmfV10.02}AutoRentalGrp" minOccurs="0"/>
 *         &lt;element name="FraudMitGrp" type="{com/fiserv/Merchant/gmfV10.02}FraudMitGrp" minOccurs="0"/>
 *         &lt;element name="RestGrp" type="{com/fiserv/Merchant/gmfV10.02}RestGrp" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditRequestDetails", propOrder = {
    "commonGrp",
    "billPayGrp",
    "altMerchNameAndAddrGrp",
    "pfGrp",
    "cardGrp",
    "realTimeAcctUpdGrp",
    "mexCardGrp",
    "pinGrp",
    "addtlAmtGrp",
    "emvGrp",
    "taGrp",
    "tknGrp",
    "ecommGrp",
    "secrTxnGrp",
    "visaGrp",
    "mcGrp",
    "dsGrp",
    "amexGrp",
    "unionPayGrp",
    "prvLblGrp",
    "purchCardlvl2Grp",
    "purchCardlvl3Grp",
    "custInfoGrp",
    "debtRepayGrp",
    "orderGrp",
    "shipGrp",
    "saGrp",
    "origAuthGrp",
    "dccGrp",
    "prodCodeGrp",
    "prodCodeDetGrp",
    "lodgingGrp",
    "autoRentalGrp",
    "fraudMitGrp",
    "restGrp"
})
public class CreditRequestDetails {

    @XmlElement(name = "CommonGrp")
    protected CommonGrp commonGrp;
    @XmlElement(name = "BillPayGrp")
    protected BillPayGrp billPayGrp;
    @XmlElement(name = "AltMerchNameAndAddrGrp")
    protected AltMerchNameAndAddrGrp altMerchNameAndAddrGrp;
    @XmlElement(name = "PFGrp")
    protected PFGrp pfGrp;
    @XmlElement(name = "CardGrp")
    protected CardGrp cardGrp;
    @XmlElement(name = "RealTimeAcctUpdGrp")
    protected RealTimeAcctUpdGrp realTimeAcctUpdGrp;
    @XmlElement(name = "MEXCardGrp")
    protected MEXCardGrp mexCardGrp;
    @XmlElement(name = "PINGrp")
    protected PINGrp pinGrp;
    @XmlElement(name = "AddtlAmtGrp")
    protected List<AddtlAmtGrp> addtlAmtGrp;
    @XmlElement(name = "EMVGrp")
    protected EMVGrp emvGrp;
    @XmlElement(name = "TAGrp")
    protected TAGrp taGrp;
    @XmlElement(name = "TknGrp")
    protected TknGrp tknGrp;
    @XmlElement(name = "EcommGrp")
    protected EcommGrp ecommGrp;
    @XmlElement(name = "SecrTxnGrp")
    protected SecrTxnGrp secrTxnGrp;
    @XmlElement(name = "VisaGrp")
    protected VisaGrp visaGrp;
    @XmlElement(name = "MCGrp")
    protected MCGrp mcGrp;
    @XmlElement(name = "DSGrp")
    protected DSGrp dsGrp;
    @XmlElement(name = "AmexGrp")
    protected AmexGrp amexGrp;
    @XmlElement(name = "UnionPayGrp")
    protected UnionPayGrp unionPayGrp;
    @XmlElement(name = "PrvLblGrp")
    protected PrvLblGrp prvLblGrp;
    @XmlElement(name = "PurchCardlvl2Grp")
    protected PurchCardlvl2Grp purchCardlvl2Grp;
    @XmlElement(name = "PurchCardlvl3Grp")
    protected List<PurchCardlvl3Grp> purchCardlvl3Grp;
    @XmlElement(name = "CustInfoGrp")
    protected CustInfoGrp custInfoGrp;
    @XmlElement(name = "DebtRepayGrp")
    protected DebtRepayGrp debtRepayGrp;
    @XmlElement(name = "OrderGrp")
    protected OrderGrp orderGrp;
    @XmlElement(name = "ShipGrp")
    protected ShipGrp shipGrp;
    @XmlElement(name = "SAGrp")
    protected SAGrp saGrp;
    @XmlElement(name = "OrigAuthGrp")
    protected OrigAuthGrp origAuthGrp;
    @XmlElement(name = "DCCGrp")
    protected DCCGrp dccGrp;
    @XmlElement(name = "ProdCodeGrp")
    protected ProdCodeGrp prodCodeGrp;
    @XmlElement(name = "ProdCodeDetGrp")
    protected List<ProdCodeDetGrp> prodCodeDetGrp;
    @XmlElement(name = "LodgingGrp")
    protected LodgingGrp lodgingGrp;
    @XmlElement(name = "AutoRentalGrp")
    protected AutoRentalGrp autoRentalGrp;
    @XmlElement(name = "FraudMitGrp")
    protected FraudMitGrp fraudMitGrp;
    @XmlElement(name = "RestGrp")
    protected RestGrp restGrp;

    /**
     * Gets the value of the commonGrp property.
     * 
     * @return
     *     possible object is
     *     {@link CommonGrp }
     *     
     */
    public CommonGrp getCommonGrp() {
        return commonGrp;
    }

    /**
     * Sets the value of the commonGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommonGrp }
     *     
     */
    public void setCommonGrp(CommonGrp value) {
        this.commonGrp = value;
    }

    /**
     * Gets the value of the billPayGrp property.
     * 
     * @return
     *     possible object is
     *     {@link BillPayGrp }
     *     
     */
    public BillPayGrp getBillPayGrp() {
        return billPayGrp;
    }

    /**
     * Sets the value of the billPayGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillPayGrp }
     *     
     */
    public void setBillPayGrp(BillPayGrp value) {
        this.billPayGrp = value;
    }

    /**
     * Gets the value of the altMerchNameAndAddrGrp property.
     * 
     * @return
     *     possible object is
     *     {@link AltMerchNameAndAddrGrp }
     *     
     */
    public AltMerchNameAndAddrGrp getAltMerchNameAndAddrGrp() {
        return altMerchNameAndAddrGrp;
    }

    /**
     * Sets the value of the altMerchNameAndAddrGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link AltMerchNameAndAddrGrp }
     *     
     */
    public void setAltMerchNameAndAddrGrp(AltMerchNameAndAddrGrp value) {
        this.altMerchNameAndAddrGrp = value;
    }

    /**
     * Gets the value of the pfGrp property.
     * 
     * @return
     *     possible object is
     *     {@link PFGrp }
     *     
     */
    public PFGrp getPFGrp() {
        return pfGrp;
    }

    /**
     * Sets the value of the pfGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link PFGrp }
     *     
     */
    public void setPFGrp(PFGrp value) {
        this.pfGrp = value;
    }

    /**
     * Gets the value of the cardGrp property.
     * 
     * @return
     *     possible object is
     *     {@link CardGrp }
     *     
     */
    public CardGrp getCardGrp() {
        return cardGrp;
    }

    /**
     * Sets the value of the cardGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardGrp }
     *     
     */
    public void setCardGrp(CardGrp value) {
        this.cardGrp = value;
    }

    /**
     * Gets the value of the realTimeAcctUpdGrp property.
     * 
     * @return
     *     possible object is
     *     {@link RealTimeAcctUpdGrp }
     *     
     */
    public RealTimeAcctUpdGrp getRealTimeAcctUpdGrp() {
        return realTimeAcctUpdGrp;
    }

    /**
     * Sets the value of the realTimeAcctUpdGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link RealTimeAcctUpdGrp }
     *     
     */
    public void setRealTimeAcctUpdGrp(RealTimeAcctUpdGrp value) {
        this.realTimeAcctUpdGrp = value;
    }

    /**
     * Gets the value of the mexCardGrp property.
     * 
     * @return
     *     possible object is
     *     {@link MEXCardGrp }
     *     
     */
    public MEXCardGrp getMEXCardGrp() {
        return mexCardGrp;
    }

    /**
     * Sets the value of the mexCardGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link MEXCardGrp }
     *     
     */
    public void setMEXCardGrp(MEXCardGrp value) {
        this.mexCardGrp = value;
    }

    /**
     * Gets the value of the pinGrp property.
     * 
     * @return
     *     possible object is
     *     {@link PINGrp }
     *     
     */
    public PINGrp getPINGrp() {
        return pinGrp;
    }

    /**
     * Sets the value of the pinGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link PINGrp }
     *     
     */
    public void setPINGrp(PINGrp value) {
        this.pinGrp = value;
    }

    /**
     * Gets the value of the addtlAmtGrp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addtlAmtGrp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlAmtGrp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AddtlAmtGrp }
     * 
     * 
     */
    public List<AddtlAmtGrp> getAddtlAmtGrp() {
        if (addtlAmtGrp == null) {
            addtlAmtGrp = new ArrayList<AddtlAmtGrp>();
        }
        return this.addtlAmtGrp;
    }

    /**
     * Gets the value of the emvGrp property.
     * 
     * @return
     *     possible object is
     *     {@link EMVGrp }
     *     
     */
    public EMVGrp getEMVGrp() {
        return emvGrp;
    }

    /**
     * Sets the value of the emvGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link EMVGrp }
     *     
     */
    public void setEMVGrp(EMVGrp value) {
        this.emvGrp = value;
    }

    /**
     * Gets the value of the taGrp property.
     * 
     * @return
     *     possible object is
     *     {@link TAGrp }
     *     
     */
    public TAGrp getTAGrp() {
        return taGrp;
    }

    /**
     * Sets the value of the taGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TAGrp }
     *     
     */
    public void setTAGrp(TAGrp value) {
        this.taGrp = value;
    }

    /**
     * Gets the value of the tknGrp property.
     * 
     * @return
     *     possible object is
     *     {@link TknGrp }
     *     
     */
    public TknGrp getTknGrp() {
        return tknGrp;
    }

    /**
     * Sets the value of the tknGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TknGrp }
     *     
     */
    public void setTknGrp(TknGrp value) {
        this.tknGrp = value;
    }

    /**
     * Gets the value of the ecommGrp property.
     * 
     * @return
     *     possible object is
     *     {@link EcommGrp }
     *     
     */
    public EcommGrp getEcommGrp() {
        return ecommGrp;
    }

    /**
     * Sets the value of the ecommGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link EcommGrp }
     *     
     */
    public void setEcommGrp(EcommGrp value) {
        this.ecommGrp = value;
    }

    /**
     * Gets the value of the secrTxnGrp property.
     * 
     * @return
     *     possible object is
     *     {@link SecrTxnGrp }
     *     
     */
    public SecrTxnGrp getSecrTxnGrp() {
        return secrTxnGrp;
    }

    /**
     * Sets the value of the secrTxnGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecrTxnGrp }
     *     
     */
    public void setSecrTxnGrp(SecrTxnGrp value) {
        this.secrTxnGrp = value;
    }

    /**
     * Gets the value of the visaGrp property.
     * 
     * @return
     *     possible object is
     *     {@link VisaGrp }
     *     
     */
    public VisaGrp getVisaGrp() {
        return visaGrp;
    }

    /**
     * Sets the value of the visaGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link VisaGrp }
     *     
     */
    public void setVisaGrp(VisaGrp value) {
        this.visaGrp = value;
    }

    /**
     * Gets the value of the mcGrp property.
     * 
     * @return
     *     possible object is
     *     {@link MCGrp }
     *     
     */
    public MCGrp getMCGrp() {
        return mcGrp;
    }

    /**
     * Sets the value of the mcGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link MCGrp }
     *     
     */
    public void setMCGrp(MCGrp value) {
        this.mcGrp = value;
    }

    /**
     * Gets the value of the dsGrp property.
     * 
     * @return
     *     possible object is
     *     {@link DSGrp }
     *     
     */
    public DSGrp getDSGrp() {
        return dsGrp;
    }

    /**
     * Sets the value of the dsGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link DSGrp }
     *     
     */
    public void setDSGrp(DSGrp value) {
        this.dsGrp = value;
    }

    /**
     * Gets the value of the amexGrp property.
     * 
     * @return
     *     possible object is
     *     {@link AmexGrp }
     *     
     */
    public AmexGrp getAmexGrp() {
        return amexGrp;
    }

    /**
     * Sets the value of the amexGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmexGrp }
     *     
     */
    public void setAmexGrp(AmexGrp value) {
        this.amexGrp = value;
    }

    /**
     * Gets the value of the unionPayGrp property.
     * 
     * @return
     *     possible object is
     *     {@link UnionPayGrp }
     *     
     */
    public UnionPayGrp getUnionPayGrp() {
        return unionPayGrp;
    }

    /**
     * Sets the value of the unionPayGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnionPayGrp }
     *     
     */
    public void setUnionPayGrp(UnionPayGrp value) {
        this.unionPayGrp = value;
    }

    /**
     * Gets the value of the prvLblGrp property.
     * 
     * @return
     *     possible object is
     *     {@link PrvLblGrp }
     *     
     */
    public PrvLblGrp getPrvLblGrp() {
        return prvLblGrp;
    }

    /**
     * Sets the value of the prvLblGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrvLblGrp }
     *     
     */
    public void setPrvLblGrp(PrvLblGrp value) {
        this.prvLblGrp = value;
    }

    /**
     * Gets the value of the purchCardlvl2Grp property.
     * 
     * @return
     *     possible object is
     *     {@link PurchCardlvl2Grp }
     *     
     */
    public PurchCardlvl2Grp getPurchCardlvl2Grp() {
        return purchCardlvl2Grp;
    }

    /**
     * Sets the value of the purchCardlvl2Grp property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchCardlvl2Grp }
     *     
     */
    public void setPurchCardlvl2Grp(PurchCardlvl2Grp value) {
        this.purchCardlvl2Grp = value;
    }

    /**
     * Gets the value of the purchCardlvl3Grp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the purchCardlvl3Grp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPurchCardlvl3Grp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PurchCardlvl3Grp }
     * 
     * 
     */
    public List<PurchCardlvl3Grp> getPurchCardlvl3Grp() {
        if (purchCardlvl3Grp == null) {
            purchCardlvl3Grp = new ArrayList<PurchCardlvl3Grp>();
        }
        return this.purchCardlvl3Grp;
    }

    /**
     * Gets the value of the custInfoGrp property.
     * 
     * @return
     *     possible object is
     *     {@link CustInfoGrp }
     *     
     */
    public CustInfoGrp getCustInfoGrp() {
        return custInfoGrp;
    }

    /**
     * Sets the value of the custInfoGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustInfoGrp }
     *     
     */
    public void setCustInfoGrp(CustInfoGrp value) {
        this.custInfoGrp = value;
    }

    /**
     * Gets the value of the debtRepayGrp property.
     * 
     * @return
     *     possible object is
     *     {@link DebtRepayGrp }
     *     
     */
    public DebtRepayGrp getDebtRepayGrp() {
        return debtRepayGrp;
    }

    /**
     * Sets the value of the debtRepayGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link DebtRepayGrp }
     *     
     */
    public void setDebtRepayGrp(DebtRepayGrp value) {
        this.debtRepayGrp = value;
    }

    /**
     * Gets the value of the orderGrp property.
     * 
     * @return
     *     possible object is
     *     {@link OrderGrp }
     *     
     */
    public OrderGrp getOrderGrp() {
        return orderGrp;
    }

    /**
     * Sets the value of the orderGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderGrp }
     *     
     */
    public void setOrderGrp(OrderGrp value) {
        this.orderGrp = value;
    }

    /**
     * Gets the value of the shipGrp property.
     * 
     * @return
     *     possible object is
     *     {@link ShipGrp }
     *     
     */
    public ShipGrp getShipGrp() {
        return shipGrp;
    }

    /**
     * Sets the value of the shipGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipGrp }
     *     
     */
    public void setShipGrp(ShipGrp value) {
        this.shipGrp = value;
    }

    /**
     * Gets the value of the saGrp property.
     * 
     * @return
     *     possible object is
     *     {@link SAGrp }
     *     
     */
    public SAGrp getSAGrp() {
        return saGrp;
    }

    /**
     * Sets the value of the saGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SAGrp }
     *     
     */
    public void setSAGrp(SAGrp value) {
        this.saGrp = value;
    }

    /**
     * Gets the value of the origAuthGrp property.
     * 
     * @return
     *     possible object is
     *     {@link OrigAuthGrp }
     *     
     */
    public OrigAuthGrp getOrigAuthGrp() {
        return origAuthGrp;
    }

    /**
     * Sets the value of the origAuthGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrigAuthGrp }
     *     
     */
    public void setOrigAuthGrp(OrigAuthGrp value) {
        this.origAuthGrp = value;
    }

    /**
     * Gets the value of the dccGrp property.
     * 
     * @return
     *     possible object is
     *     {@link DCCGrp }
     *     
     */
    public DCCGrp getDCCGrp() {
        return dccGrp;
    }

    /**
     * Sets the value of the dccGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link DCCGrp }
     *     
     */
    public void setDCCGrp(DCCGrp value) {
        this.dccGrp = value;
    }

    /**
     * Gets the value of the prodCodeGrp property.
     * 
     * @return
     *     possible object is
     *     {@link ProdCodeGrp }
     *     
     */
    public ProdCodeGrp getProdCodeGrp() {
        return prodCodeGrp;
    }

    /**
     * Sets the value of the prodCodeGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProdCodeGrp }
     *     
     */
    public void setProdCodeGrp(ProdCodeGrp value) {
        this.prodCodeGrp = value;
    }

    /**
     * Gets the value of the prodCodeDetGrp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prodCodeDetGrp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProdCodeDetGrp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProdCodeDetGrp }
     * 
     * 
     */
    public List<ProdCodeDetGrp> getProdCodeDetGrp() {
        if (prodCodeDetGrp == null) {
            prodCodeDetGrp = new ArrayList<ProdCodeDetGrp>();
        }
        return this.prodCodeDetGrp;
    }

    /**
     * Gets the value of the lodgingGrp property.
     * 
     * @return
     *     possible object is
     *     {@link LodgingGrp }
     *     
     */
    public LodgingGrp getLodgingGrp() {
        return lodgingGrp;
    }

    /**
     * Sets the value of the lodgingGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link LodgingGrp }
     *     
     */
    public void setLodgingGrp(LodgingGrp value) {
        this.lodgingGrp = value;
    }

    /**
     * Gets the value of the autoRentalGrp property.
     * 
     * @return
     *     possible object is
     *     {@link AutoRentalGrp }
     *     
     */
    public AutoRentalGrp getAutoRentalGrp() {
        return autoRentalGrp;
    }

    /**
     * Sets the value of the autoRentalGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link AutoRentalGrp }
     *     
     */
    public void setAutoRentalGrp(AutoRentalGrp value) {
        this.autoRentalGrp = value;
    }

    /**
     * Gets the value of the fraudMitGrp property.
     * 
     * @return
     *     possible object is
     *     {@link FraudMitGrp }
     *     
     */
    public FraudMitGrp getFraudMitGrp() {
        return fraudMitGrp;
    }

    /**
     * Sets the value of the fraudMitGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link FraudMitGrp }
     *     
     */
    public void setFraudMitGrp(FraudMitGrp value) {
        this.fraudMitGrp = value;
    }

    /**
     * Gets the value of the restGrp property.
     * 
     * @return
     *     possible object is
     *     {@link RestGrp }
     *     
     */
    public RestGrp getRestGrp() {
        return restGrp;
    }

    /**
     * Sets the value of the restGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestGrp }
     *     
     */
    public void setRestGrp(RestGrp value) {
        this.restGrp = value;
    }

}
