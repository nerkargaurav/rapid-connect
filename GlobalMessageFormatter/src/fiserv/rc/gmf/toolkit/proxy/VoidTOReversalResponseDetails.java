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
 * <p>Java class for VoidTOReversalResponseDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VoidTOReversalResponseDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CommonGrp" type="{com/fiserv/Merchant/gmfV10.02}CommonGrp" minOccurs="0"/>
 *         &lt;element name="AltMerchNameAndAddrGrp" type="{com/fiserv/Merchant/gmfV10.02}AltMerchNameAndAddrGrp" minOccurs="0"/>
 *         &lt;element name="CardGrp" type="{com/fiserv/Merchant/gmfV10.02}CardGrp" minOccurs="0"/>
 *         &lt;element name="TeleCheckECAGrp" type="{com/fiserv/Merchant/gmfV10.02}TeleCheckECAGrp" minOccurs="0"/>
 *         &lt;element name="TCNFTFGrp" type="{com/fiserv/Merchant/gmfV10.02}TCNFTFGrp" minOccurs="0"/>
 *         &lt;element name="AddtlAmtGrp" type="{com/fiserv/Merchant/gmfV10.02}AddtlAmtGrp" maxOccurs="6" minOccurs="0"/>
 *         &lt;element name="EMVGrp" type="{com/fiserv/Merchant/gmfV10.02}EMVGrp" minOccurs="0"/>
 *         &lt;element name="TAGrp" type="{com/fiserv/Merchant/gmfV10.02}TAGrp" minOccurs="0"/>
 *         &lt;element name="TknGrp" type="{com/fiserv/Merchant/gmfV10.02}TknGrp" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="VisaGrp" type="{com/fiserv/Merchant/gmfV10.02}VisaGrp" minOccurs="0"/>
 *           &lt;element name="MCGrp" type="{com/fiserv/Merchant/gmfV10.02}MCGrp" minOccurs="0"/>
 *           &lt;element name="DSGrp" type="{com/fiserv/Merchant/gmfV10.02}DSGrp" minOccurs="0"/>
 *           &lt;element name="AmexGrp" type="{com/fiserv/Merchant/gmfV10.02}AmexGrp" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element name="PrvLblGrp" type="{com/fiserv/Merchant/gmfV10.02}PrvLblGrp" minOccurs="0"/>
 *         &lt;element name="EbtGrp" type="{com/fiserv/Merchant/gmfV10.02}EbtGrp" maxOccurs="50" minOccurs="0"/>
 *         &lt;element name="EWICDetGrp" type="{com/fiserv/Merchant/gmfV10.02}EWICDetGrp" maxOccurs="50" minOccurs="0"/>
 *         &lt;element name="DebitGrp" type="{com/fiserv/Merchant/gmfV10.02}DebitGrp" minOccurs="0"/>
 *         &lt;element name="CanDebitGrp" type="{com/fiserv/Merchant/gmfV10.02}CanDebitGrp" minOccurs="0"/>
 *         &lt;element name="PurchCardlvl2Grp" type="{com/fiserv/Merchant/gmfV10.02}PurchCardlvl2Grp" minOccurs="0"/>
 *         &lt;element name="CustInfoGrp" type="{com/fiserv/Merchant/gmfV10.02}CustInfoGrp" minOccurs="0"/>
 *         &lt;element name="OrderGrp" type="{com/fiserv/Merchant/gmfV10.02}OrderGrp" minOccurs="0"/>
 *         &lt;element name="StoredValueGrp" type="{com/fiserv/Merchant/gmfV10.02}StoredValueGrp" minOccurs="0"/>
 *         &lt;element name="RespGrp" type="{com/fiserv/Merchant/gmfV10.02}RespGrp" minOccurs="0"/>
 *         &lt;element name="OrigAuthGrp" type="{com/fiserv/Merchant/gmfV10.02}OrigAuthGrp" minOccurs="0"/>
 *         &lt;element name="FileDLGrp" type="{com/fiserv/Merchant/gmfV10.02}FileDLGrp" minOccurs="0"/>
 *         &lt;element name="FltGrp" type="{com/fiserv/Merchant/gmfV10.02}FltGrp" minOccurs="0"/>
 *         &lt;element name="LodgingGrp" type="{com/fiserv/Merchant/gmfV10.02}LodgingGrp" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VoidTOReversalResponseDetails", propOrder = {
    "commonGrp",
    "altMerchNameAndAddrGrp",
    "cardGrp",
    "teleCheckECAGrp",
    "tcnftfGrp",
    "addtlAmtGrp",
    "emvGrp",
    "taGrp",
    "tknGrp",
    "visaGrp",
    "mcGrp",
    "dsGrp",
    "amexGrp",
    "prvLblGrp",
    "ebtGrp",
    "ewicDetGrp",
    "debitGrp",
    "canDebitGrp",
    "purchCardlvl2Grp",
    "custInfoGrp",
    "orderGrp",
    "storedValueGrp",
    "respGrp",
    "origAuthGrp",
    "fileDLGrp",
    "fltGrp",
    "lodgingGrp"
})
public class VoidTOReversalResponseDetails {

    @XmlElement(name = "CommonGrp")
    protected CommonGrp commonGrp;
    @XmlElement(name = "AltMerchNameAndAddrGrp")
    protected AltMerchNameAndAddrGrp altMerchNameAndAddrGrp;
    @XmlElement(name = "CardGrp")
    protected CardGrp cardGrp;
    @XmlElement(name = "TeleCheckECAGrp")
    protected TeleCheckECAGrp teleCheckECAGrp;
    @XmlElement(name = "TCNFTFGrp")
    protected TCNFTFGrp tcnftfGrp;
    @XmlElement(name = "AddtlAmtGrp")
    protected List<AddtlAmtGrp> addtlAmtGrp;
    @XmlElement(name = "EMVGrp")
    protected EMVGrp emvGrp;
    @XmlElement(name = "TAGrp")
    protected TAGrp taGrp;
    @XmlElement(name = "TknGrp")
    protected TknGrp tknGrp;
    @XmlElement(name = "VisaGrp")
    protected VisaGrp visaGrp;
    @XmlElement(name = "MCGrp")
    protected MCGrp mcGrp;
    @XmlElement(name = "DSGrp")
    protected DSGrp dsGrp;
    @XmlElement(name = "AmexGrp")
    protected AmexGrp amexGrp;
    @XmlElement(name = "PrvLblGrp")
    protected PrvLblGrp prvLblGrp;
    @XmlElement(name = "EbtGrp")
    protected List<EbtGrp> ebtGrp;
    @XmlElement(name = "EWICDetGrp")
    protected List<EWICDetGrp> ewicDetGrp;
    @XmlElement(name = "DebitGrp")
    protected DebitGrp debitGrp;
    @XmlElement(name = "CanDebitGrp")
    protected CanDebitGrp canDebitGrp;
    @XmlElement(name = "PurchCardlvl2Grp")
    protected PurchCardlvl2Grp purchCardlvl2Grp;
    @XmlElement(name = "CustInfoGrp")
    protected CustInfoGrp custInfoGrp;
    @XmlElement(name = "OrderGrp")
    protected OrderGrp orderGrp;
    @XmlElement(name = "StoredValueGrp")
    protected StoredValueGrp storedValueGrp;
    @XmlElement(name = "RespGrp")
    protected RespGrp respGrp;
    @XmlElement(name = "OrigAuthGrp")
    protected OrigAuthGrp origAuthGrp;
    @XmlElement(name = "FileDLGrp")
    protected FileDLGrp fileDLGrp;
    @XmlElement(name = "FltGrp")
    protected FltGrp fltGrp;
    @XmlElement(name = "LodgingGrp")
    protected LodgingGrp lodgingGrp;

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
     * Gets the value of the teleCheckECAGrp property.
     * 
     * @return
     *     possible object is
     *     {@link TeleCheckECAGrp }
     *     
     */
    public TeleCheckECAGrp getTeleCheckECAGrp() {
        return teleCheckECAGrp;
    }

    /**
     * Sets the value of the teleCheckECAGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TeleCheckECAGrp }
     *     
     */
    public void setTeleCheckECAGrp(TeleCheckECAGrp value) {
        this.teleCheckECAGrp = value;
    }

    /**
     * Gets the value of the tcnftfGrp property.
     * 
     * @return
     *     possible object is
     *     {@link TCNFTFGrp }
     *     
     */
    public TCNFTFGrp getTCNFTFGrp() {
        return tcnftfGrp;
    }

    /**
     * Sets the value of the tcnftfGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TCNFTFGrp }
     *     
     */
    public void setTCNFTFGrp(TCNFTFGrp value) {
        this.tcnftfGrp = value;
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
     * Gets the value of the ebtGrp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ebtGrp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEbtGrp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EbtGrp }
     * 
     * 
     */
    public List<EbtGrp> getEbtGrp() {
        if (ebtGrp == null) {
            ebtGrp = new ArrayList<EbtGrp>();
        }
        return this.ebtGrp;
    }

    /**
     * Gets the value of the ewicDetGrp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ewicDetGrp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEWICDetGrp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EWICDetGrp }
     * 
     * 
     */
    public List<EWICDetGrp> getEWICDetGrp() {
        if (ewicDetGrp == null) {
            ewicDetGrp = new ArrayList<EWICDetGrp>();
        }
        return this.ewicDetGrp;
    }

    /**
     * Gets the value of the debitGrp property.
     * 
     * @return
     *     possible object is
     *     {@link DebitGrp }
     *     
     */
    public DebitGrp getDebitGrp() {
        return debitGrp;
    }

    /**
     * Sets the value of the debitGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link DebitGrp }
     *     
     */
    public void setDebitGrp(DebitGrp value) {
        this.debitGrp = value;
    }

    /**
     * Gets the value of the canDebitGrp property.
     * 
     * @return
     *     possible object is
     *     {@link CanDebitGrp }
     *     
     */
    public CanDebitGrp getCanDebitGrp() {
        return canDebitGrp;
    }

    /**
     * Sets the value of the canDebitGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CanDebitGrp }
     *     
     */
    public void setCanDebitGrp(CanDebitGrp value) {
        this.canDebitGrp = value;
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
     * Gets the value of the storedValueGrp property.
     * 
     * @return
     *     possible object is
     *     {@link StoredValueGrp }
     *     
     */
    public StoredValueGrp getStoredValueGrp() {
        return storedValueGrp;
    }

    /**
     * Sets the value of the storedValueGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link StoredValueGrp }
     *     
     */
    public void setStoredValueGrp(StoredValueGrp value) {
        this.storedValueGrp = value;
    }

    /**
     * Gets the value of the respGrp property.
     * 
     * @return
     *     possible object is
     *     {@link RespGrp }
     *     
     */
    public RespGrp getRespGrp() {
        return respGrp;
    }

    /**
     * Sets the value of the respGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link RespGrp }
     *     
     */
    public void setRespGrp(RespGrp value) {
        this.respGrp = value;
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
     * Gets the value of the fileDLGrp property.
     * 
     * @return
     *     possible object is
     *     {@link FileDLGrp }
     *     
     */
    public FileDLGrp getFileDLGrp() {
        return fileDLGrp;
    }

    /**
     * Sets the value of the fileDLGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileDLGrp }
     *     
     */
    public void setFileDLGrp(FileDLGrp value) {
        this.fileDLGrp = value;
    }

    /**
     * Gets the value of the fltGrp property.
     * 
     * @return
     *     possible object is
     *     {@link FltGrp }
     *     
     */
    public FltGrp getFltGrp() {
        return fltGrp;
    }

    /**
     * Sets the value of the fltGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link FltGrp }
     *     
     */
    public void setFltGrp(FltGrp value) {
        this.fltGrp = value;
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

}
