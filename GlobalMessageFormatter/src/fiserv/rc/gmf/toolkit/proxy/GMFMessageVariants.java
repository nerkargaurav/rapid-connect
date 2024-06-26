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

// Added manually
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * <p>Java class for GMFMessageVariants complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GMFMessageVariants">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="CreditRequest" type="{com/fiserv/Merchant/gmfV10.02}CreditRequestDetails"/>
 *           &lt;element name="DebitRequest" type="{com/fiserv/Merchant/gmfV10.02}DebitRequestDetails"/>
 *           &lt;element name="PinlessDebitRequest" type="{com/fiserv/Merchant/gmfV10.02}PinlessDebitRequestDetails"/>
 *           &lt;element name="CheckRequest" type="{com/fiserv/Merchant/gmfV10.02}CheckRequestDetails"/>
 *           &lt;element name="EBTRequest" type="{com/fiserv/Merchant/gmfV10.02}EBTRequestDetails"/>
 *           &lt;element name="PrepaidRequest" type="{com/fiserv/Merchant/gmfV10.02}PrepaidRequestDetails"/>
 *           &lt;element name="GenPrepaidRequest" type="{com/fiserv/Merchant/gmfV10.02}GenPrepaidRequestDetails"/>
 *           &lt;element name="PrivateLabelRequest" type="{com/fiserv/Merchant/gmfV10.02}PrivateLabelRequestDetails"/>
 *           &lt;element name="FleetRequest" type="{com/fiserv/Merchant/gmfV10.02}FleetRequestDetails"/>
 *           &lt;element name="TransArmorRequest" type="{com/fiserv/Merchant/gmfV10.02}TARequestDetails"/>
 *           &lt;element name="AdminRequest" type="{com/fiserv/Merchant/gmfV10.02}AdminRequestDetails"/>
 *           &lt;element name="ReversalRequest" type="{com/fiserv/Merchant/gmfV10.02}VoidTOReversalRequestDetails"/>
 *           &lt;element name="BatchRequest" type="{com/fiserv/Merchant/gmfV10.02}BatchRequestDetails"/>
 *           &lt;element name="AltCNPRequest" type="{com/fiserv/Merchant/gmfV10.02}AltCNPRequestDetails"/>
 *           &lt;element name="MTRequest" type="{com/fiserv/Merchant/gmfV10.02}MTRequestDetails"/>
 *           &lt;element name="CreditResponse" type="{com/fiserv/Merchant/gmfV10.02}CreditResponseDetails"/>
 *           &lt;element name="DebitResponse" type="{com/fiserv/Merchant/gmfV10.02}DebitResponseDetails"/>
 *           &lt;element name="PinlessDebitResponse" type="{com/fiserv/Merchant/gmfV10.02}PinlessDebitResponseDetails"/>
 *           &lt;element name="CheckResponse" type="{com/fiserv/Merchant/gmfV10.02}CheckResponseDetails"/>
 *           &lt;element name="EBTResponse" type="{com/fiserv/Merchant/gmfV10.02}EBTResponseDetails"/>
 *           &lt;element name="PrepaidResponse" type="{com/fiserv/Merchant/gmfV10.02}PrepaidResponseDetails"/>
 *           &lt;element name="GenPrepaidResponse" type="{com/fiserv/Merchant/gmfV10.02}GenPrepaidResponseDetails"/>
 *           &lt;element name="PrivateLabelResponse" type="{com/fiserv/Merchant/gmfV10.02}PrivateLabelResponseDetails"/>
 *           &lt;element name="FleetResponse" type="{com/fiserv/Merchant/gmfV10.02}FleetResponseDetails"/>
 *           &lt;element name="TransArmorResponse" type="{com/fiserv/Merchant/gmfV10.02}TAResponseDetails"/>
 *           &lt;element name="AdminResponse" type="{com/fiserv/Merchant/gmfV10.02}AdminResponseDetails"/>
 *           &lt;element name="RejectResponse" type="{com/fiserv/Merchant/gmfV10.02}RejectResponseDetails"/>
 *           &lt;element name="ReversalResponse" type="{com/fiserv/Merchant/gmfV10.02}VoidTOReversalResponseDetails"/>
 *           &lt;element name="BatchResponse" type="{com/fiserv/Merchant/gmfV10.02}BatchResponseDetails"/>
 *           &lt;element name="AltCNPResponse" type="{com/fiserv/Merchant/gmfV10.02}AltCNPResponseDetails"/>
 *           &lt;element name="MTResponse" type="{com/fiserv/Merchant/gmfV10.02}MTResponseDetails"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
 // Added manually
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GMFMessageVariants", namespace = "com/fiserv/Merchant/gmfV10.02", propOrder = {
    "creditRequest",
    "debitRequest",
    "pinlessDebitRequest",
    "checkRequest",
    "ebtRequest",
    "prepaidRequest",
    "genPrepaidRequest",
    "privateLabelRequest",
    "fleetRequest",
    "transArmorRequest",
    "adminRequest",
    "reversalRequest",
    "batchRequest",
    "altCNPRequest",
    "mtRequest",
    "creditResponse",
    "debitResponse",
    "pinlessDebitResponse",
    "checkResponse",
    "ebtResponse",
    "prepaidResponse",
    "genPrepaidResponse",
    "privateLabelResponse",
    "fleetResponse",
    "transArmorResponse",
    "adminResponse",
    "rejectResponse",
    "reversalResponse",
    "batchResponse",
    "altCNPResponse",
    "mtResponse"
})
public class GMFMessageVariants {

    @XmlElement(name = "CreditRequest")
    protected CreditRequestDetails creditRequest;
    @XmlElement(name = "DebitRequest")
    protected DebitRequestDetails debitRequest;
    @XmlElement(name = "PinlessDebitRequest")
    protected PinlessDebitRequestDetails pinlessDebitRequest;
    @XmlElement(name = "CheckRequest")
    protected CheckRequestDetails checkRequest;
    @XmlElement(name = "EBTRequest")
    protected EBTRequestDetails ebtRequest;
    @XmlElement(name = "PrepaidRequest")
    protected PrepaidRequestDetails prepaidRequest;
    @XmlElement(name = "GenPrepaidRequest")
    protected GenPrepaidRequestDetails genPrepaidRequest;
    @XmlElement(name = "PrivateLabelRequest")
    protected PrivateLabelRequestDetails privateLabelRequest;
    @XmlElement(name = "FleetRequest")
    protected FleetRequestDetails fleetRequest;
    @XmlElement(name = "TransArmorRequest")
    protected TARequestDetails transArmorRequest;
    @XmlElement(name = "AdminRequest")
    protected AdminRequestDetails adminRequest;
    @XmlElement(name = "ReversalRequest")
    protected VoidTOReversalRequestDetails reversalRequest;
    @XmlElement(name = "BatchRequest")
    protected BatchRequestDetails batchRequest;
    @XmlElement(name = "AltCNPRequest")
    protected AltCNPRequestDetails altCNPRequest;
    @XmlElement(name = "MTRequest")
    protected MTRequestDetails mtRequest;
    @XmlElement(name = "CreditResponse")
    protected CreditResponseDetails creditResponse;
    @XmlElement(name = "DebitResponse")
    protected DebitResponseDetails debitResponse;
    @XmlElement(name = "PinlessDebitResponse")
    protected PinlessDebitResponseDetails pinlessDebitResponse;
    @XmlElement(name = "CheckResponse")
    protected CheckResponseDetails checkResponse;
    @XmlElement(name = "EBTResponse")
    protected EBTResponseDetails ebtResponse;
    @XmlElement(name = "PrepaidResponse")
    protected PrepaidResponseDetails prepaidResponse;
    @XmlElement(name = "GenPrepaidResponse")
    protected GenPrepaidResponseDetails genPrepaidResponse;
    @XmlElement(name = "PrivateLabelResponse")
    protected PrivateLabelResponseDetails privateLabelResponse;
    @XmlElement(name = "FleetResponse")
    protected FleetResponseDetails fleetResponse;
    @XmlElement(name = "TransArmorResponse")
    protected TAResponseDetails transArmorResponse;
    @XmlElement(name = "AdminResponse")
    protected AdminResponseDetails adminResponse;
    @XmlElement(name = "RejectResponse")
    protected RejectResponseDetails rejectResponse;
    @XmlElement(name = "ReversalResponse")
    protected VoidTOReversalResponseDetails reversalResponse;
    @XmlElement(name = "BatchResponse")
    protected BatchResponseDetails batchResponse;
    @XmlElement(name = "AltCNPResponse")
    protected AltCNPResponseDetails altCNPResponse;
    @XmlElement(name = "MTResponse")
    protected MTResponseDetails mtResponse;

    /**
     * Gets the value of the creditRequest property.
     * 
     * @return
     *     possible object is
     *     {@link CreditRequestDetails }
     *     
     */
    public CreditRequestDetails getCreditRequest() {
        return creditRequest;
    }

    /**
     * Sets the value of the creditRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditRequestDetails }
     *     
     */
    public void setCreditRequest(CreditRequestDetails value) {
        this.creditRequest = value;
    }

    /**
     * Gets the value of the debitRequest property.
     * 
     * @return
     *     possible object is
     *     {@link DebitRequestDetails }
     *     
     */
    public DebitRequestDetails getDebitRequest() {
        return debitRequest;
    }

    /**
     * Sets the value of the debitRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link DebitRequestDetails }
     *     
     */
    public void setDebitRequest(DebitRequestDetails value) {
        this.debitRequest = value;
    }

    /**
     * Gets the value of the pinlessDebitRequest property.
     * 
     * @return
     *     possible object is
     *     {@link PinlessDebitRequestDetails }
     *     
     */
    public PinlessDebitRequestDetails getPinlessDebitRequest() {
        return pinlessDebitRequest;
    }

    /**
     * Sets the value of the pinlessDebitRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link PinlessDebitRequestDetails }
     *     
     */
    public void setPinlessDebitRequest(PinlessDebitRequestDetails value) {
        this.pinlessDebitRequest = value;
    }

    /**
     * Gets the value of the checkRequest property.
     * 
     * @return
     *     possible object is
     *     {@link CheckRequestDetails }
     *     
     */
    public CheckRequestDetails getCheckRequest() {
        return checkRequest;
    }

    /**
     * Sets the value of the checkRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckRequestDetails }
     *     
     */
    public void setCheckRequest(CheckRequestDetails value) {
        this.checkRequest = value;
    }

    /**
     * Gets the value of the ebtRequest property.
     * 
     * @return
     *     possible object is
     *     {@link EBTRequestDetails }
     *     
     */
    public EBTRequestDetails getEBTRequest() {
        return ebtRequest;
    }

    /**
     * Sets the value of the ebtRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link EBTRequestDetails }
     *     
     */
    public void setEBTRequest(EBTRequestDetails value) {
        this.ebtRequest = value;
    }

    /**
     * Gets the value of the prepaidRequest property.
     * 
     * @return
     *     possible object is
     *     {@link PrepaidRequestDetails }
     *     
     */
    public PrepaidRequestDetails getPrepaidRequest() {
        return prepaidRequest;
    }

    /**
     * Sets the value of the prepaidRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrepaidRequestDetails }
     *     
     */
    public void setPrepaidRequest(PrepaidRequestDetails value) {
        this.prepaidRequest = value;
    }

    /**
     * Gets the value of the genPrepaidRequest property.
     * 
     * @return
     *     possible object is
     *     {@link GenPrepaidRequestDetails }
     *     
     */
    public GenPrepaidRequestDetails getGenPrepaidRequest() {
        return genPrepaidRequest;
    }

    /**
     * Sets the value of the genPrepaidRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenPrepaidRequestDetails }
     *     
     */
    public void setGenPrepaidRequest(GenPrepaidRequestDetails value) {
        this.genPrepaidRequest = value;
    }

    /**
     * Gets the value of the privateLabelRequest property.
     * 
     * @return
     *     possible object is
     *     {@link PrivateLabelRequestDetails }
     *     
     */
    public PrivateLabelRequestDetails getPrivateLabelRequest() {
        return privateLabelRequest;
    }

    /**
     * Sets the value of the privateLabelRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrivateLabelRequestDetails }
     *     
     */
    public void setPrivateLabelRequest(PrivateLabelRequestDetails value) {
        this.privateLabelRequest = value;
    }

    /**
     * Gets the value of the fleetRequest property.
     * 
     * @return
     *     possible object is
     *     {@link FleetRequestDetails }
     *     
     */
    public FleetRequestDetails getFleetRequest() {
        return fleetRequest;
    }

    /**
     * Sets the value of the fleetRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link FleetRequestDetails }
     *     
     */
    public void setFleetRequest(FleetRequestDetails value) {
        this.fleetRequest = value;
    }

    /**
     * Gets the value of the transArmorRequest property.
     * 
     * @return
     *     possible object is
     *     {@link TARequestDetails }
     *     
     */
    public TARequestDetails getTransArmorRequest() {
        return transArmorRequest;
    }

    /**
     * Sets the value of the transArmorRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link TARequestDetails }
     *     
     */
    public void setTransArmorRequest(TARequestDetails value) {
        this.transArmorRequest = value;
    }

    /**
     * Gets the value of the adminRequest property.
     * 
     * @return
     *     possible object is
     *     {@link AdminRequestDetails }
     *     
     */
    public AdminRequestDetails getAdminRequest() {
        return adminRequest;
    }

    /**
     * Sets the value of the adminRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdminRequestDetails }
     *     
     */
    public void setAdminRequest(AdminRequestDetails value) {
        this.adminRequest = value;
    }

    /**
     * Gets the value of the reversalRequest property.
     * 
     * @return
     *     possible object is
     *     {@link VoidTOReversalRequestDetails }
     *     
     */
    public VoidTOReversalRequestDetails getReversalRequest() {
        return reversalRequest;
    }

    /**
     * Sets the value of the reversalRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link VoidTOReversalRequestDetails }
     *     
     */
    public void setReversalRequest(VoidTOReversalRequestDetails value) {
        this.reversalRequest = value;
    }

    /**
     * Gets the value of the batchRequest property.
     * 
     * @return
     *     possible object is
     *     {@link BatchRequestDetails }
     *     
     */
    public BatchRequestDetails getBatchRequest() {
        return batchRequest;
    }

    /**
     * Sets the value of the batchRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link BatchRequestDetails }
     *     
     */
    public void setBatchRequest(BatchRequestDetails value) {
        this.batchRequest = value;
    }

    /**
     * Gets the value of the altCNPRequest property.
     * 
     * @return
     *     possible object is
     *     {@link AltCNPRequestDetails }
     *     
     */
    public AltCNPRequestDetails getAltCNPRequest() {
        return altCNPRequest;
    }

    /**
     * Sets the value of the altCNPRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link AltCNPRequestDetails }
     *     
     */
    public void setAltCNPRequest(AltCNPRequestDetails value) {
        this.altCNPRequest = value;
    }

    /**
     * Gets the value of the mtRequest property.
     * 
     * @return
     *     possible object is
     *     {@link MTRequestDetails }
     *     
     */
    public MTRequestDetails getMTRequest() {
        return mtRequest;
    }

    /**
     * Sets the value of the mtRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link MTRequestDetails }
     *     
     */
    public void setMTRequest(MTRequestDetails value) {
        this.mtRequest = value;
    }

    /**
     * Gets the value of the creditResponse property.
     * 
     * @return
     *     possible object is
     *     {@link CreditResponseDetails }
     *     
     */
    public CreditResponseDetails getCreditResponse() {
        return creditResponse;
    }

    /**
     * Sets the value of the creditResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditResponseDetails }
     *     
     */
    public void setCreditResponse(CreditResponseDetails value) {
        this.creditResponse = value;
    }

    /**
     * Gets the value of the debitResponse property.
     * 
     * @return
     *     possible object is
     *     {@link DebitResponseDetails }
     *     
     */
    public DebitResponseDetails getDebitResponse() {
        return debitResponse;
    }

    /**
     * Sets the value of the debitResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link DebitResponseDetails }
     *     
     */
    public void setDebitResponse(DebitResponseDetails value) {
        this.debitResponse = value;
    }

    /**
     * Gets the value of the pinlessDebitResponse property.
     * 
     * @return
     *     possible object is
     *     {@link PinlessDebitResponseDetails }
     *     
     */
    public PinlessDebitResponseDetails getPinlessDebitResponse() {
        return pinlessDebitResponse;
    }

    /**
     * Sets the value of the pinlessDebitResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link PinlessDebitResponseDetails }
     *     
     */
    public void setPinlessDebitResponse(PinlessDebitResponseDetails value) {
        this.pinlessDebitResponse = value;
    }

    /**
     * Gets the value of the checkResponse property.
     * 
     * @return
     *     possible object is
     *     {@link CheckResponseDetails }
     *     
     */
    public CheckResponseDetails getCheckResponse() {
        return checkResponse;
    }

    /**
     * Sets the value of the checkResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckResponseDetails }
     *     
     */
    public void setCheckResponse(CheckResponseDetails value) {
        this.checkResponse = value;
    }

    /**
     * Gets the value of the ebtResponse property.
     * 
     * @return
     *     possible object is
     *     {@link EBTResponseDetails }
     *     
     */
    public EBTResponseDetails getEBTResponse() {
        return ebtResponse;
    }

    /**
     * Sets the value of the ebtResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link EBTResponseDetails }
     *     
     */
    public void setEBTResponse(EBTResponseDetails value) {
        this.ebtResponse = value;
    }

    /**
     * Gets the value of the prepaidResponse property.
     * 
     * @return
     *     possible object is
     *     {@link PrepaidResponseDetails }
     *     
     */
    public PrepaidResponseDetails getPrepaidResponse() {
        return prepaidResponse;
    }

    /**
     * Sets the value of the prepaidResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrepaidResponseDetails }
     *     
     */
    public void setPrepaidResponse(PrepaidResponseDetails value) {
        this.prepaidResponse = value;
    }

    /**
     * Gets the value of the genPrepaidResponse property.
     * 
     * @return
     *     possible object is
     *     {@link GenPrepaidResponseDetails }
     *     
     */
    public GenPrepaidResponseDetails getGenPrepaidResponse() {
        return genPrepaidResponse;
    }

    /**
     * Sets the value of the genPrepaidResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenPrepaidResponseDetails }
     *     
     */
    public void setGenPrepaidResponse(GenPrepaidResponseDetails value) {
        this.genPrepaidResponse = value;
    }

    /**
     * Gets the value of the privateLabelResponse property.
     * 
     * @return
     *     possible object is
     *     {@link PrivateLabelResponseDetails }
     *     
     */
    public PrivateLabelResponseDetails getPrivateLabelResponse() {
        return privateLabelResponse;
    }

    /**
     * Sets the value of the privateLabelResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrivateLabelResponseDetails }
     *     
     */
    public void setPrivateLabelResponse(PrivateLabelResponseDetails value) {
        this.privateLabelResponse = value;
    }

    /**
     * Gets the value of the fleetResponse property.
     * 
     * @return
     *     possible object is
     *     {@link FleetResponseDetails }
     *     
     */
    public FleetResponseDetails getFleetResponse() {
        return fleetResponse;
    }

    /**
     * Sets the value of the fleetResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link FleetResponseDetails }
     *     
     */
    public void setFleetResponse(FleetResponseDetails value) {
        this.fleetResponse = value;
    }

    /**
     * Gets the value of the transArmorResponse property.
     * 
     * @return
     *     possible object is
     *     {@link TAResponseDetails }
     *     
     */
    public TAResponseDetails getTransArmorResponse() {
        return transArmorResponse;
    }

    /**
     * Sets the value of the transArmorResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link TAResponseDetails }
     *     
     */
    public void setTransArmorResponse(TAResponseDetails value) {
        this.transArmorResponse = value;
    }

    /**
     * Gets the value of the adminResponse property.
     * 
     * @return
     *     possible object is
     *     {@link AdminResponseDetails }
     *     
     */
    public AdminResponseDetails getAdminResponse() {
        return adminResponse;
    }

    /**
     * Sets the value of the adminResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdminResponseDetails }
     *     
     */
    public void setAdminResponse(AdminResponseDetails value) {
        this.adminResponse = value;
    }

    /**
     * Gets the value of the rejectResponse property.
     * 
     * @return
     *     possible object is
     *     {@link RejectResponseDetails }
     *     
     */
    public RejectResponseDetails getRejectResponse() {
        return rejectResponse;
    }

    /**
     * Sets the value of the rejectResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link RejectResponseDetails }
     *     
     */
    public void setRejectResponse(RejectResponseDetails value) {
        this.rejectResponse = value;
    }

    /**
     * Gets the value of the reversalResponse property.
     * 
     * @return
     *     possible object is
     *     {@link VoidTOReversalResponseDetails }
     *     
     */
    public VoidTOReversalResponseDetails getReversalResponse() {
        return reversalResponse;
    }

    /**
     * Sets the value of the reversalResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link VoidTOReversalResponseDetails }
     *     
     */
    public void setReversalResponse(VoidTOReversalResponseDetails value) {
        this.reversalResponse = value;
    }

    /**
     * Gets the value of the batchResponse property.
     * 
     * @return
     *     possible object is
     *     {@link BatchResponseDetails }
     *     
     */
    public BatchResponseDetails getBatchResponse() {
        return batchResponse;
    }

    /**
     * Sets the value of the batchResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link BatchResponseDetails }
     *     
     */
    public void setBatchResponse(BatchResponseDetails value) {
        this.batchResponse = value;
    }

    /**
     * Gets the value of the altCNPResponse property.
     * 
     * @return
     *     possible object is
     *     {@link AltCNPResponseDetails }
     *     
     */
    public AltCNPResponseDetails getAltCNPResponse() {
        return altCNPResponse;
    }

    /**
     * Sets the value of the altCNPResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link AltCNPResponseDetails }
     *     
     */
    public void setAltCNPResponse(AltCNPResponseDetails value) {
        this.altCNPResponse = value;
    }

    /**
     * Gets the value of the mtResponse property.
     * 
     * @return
     *     possible object is
     *     {@link MTResponseDetails }
     *     
     */
    public MTResponseDetails getMTResponse() {
        return mtResponse;
    }

    /**
     * Sets the value of the mtResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link MTResponseDetails }
     *     
     */
    public void setMTResponse(MTResponseDetails value) {
        this.mtResponse = value;
    }

}
