package com.hesmantech.ewmxmltool.xml.data.settlementstransactions;

import com.hesmantech.ewmxmltool.xml.data.base.AbstractActivityTransaction;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "SettlementTransaction")
public class SettlementTransaction extends AbstractActivityTransaction {
    private String mtiCode;
    private String messageReasonCode;
    private String authorizationCode;
    private String settlementFlag;
    private String merchantNumber;
    private String merchant;
    private String merchantAddress;
    private String merchantCity;
    private String merchantPostcode;
    private String merchantCountryCodeAlpha;
    private String merchantCountryName;
    private String cardInputMode;
    private String cardholderAuthenticationMethod;
    private String posDataDe22;
    private String posDataDe61;
    private String acquirerReferenceNumber;
    private Double interchangeFeeAmount;
    private String interchangeFeeCurrency;
    private String interchangeFeeDirection;
    private String interchangeRateDesignator;
    private String cycleNumber;
    private String cycleFileId;
    private String eciIndicator;
    private String transactionCodeQualifier;
    private String businessFormatCode;
    private String cardType;
    private String parentTransactionId;
    private String disputeId;
    private String externalDisputeId;
    private String actualAuthorizationId;
    private String firstAuthorizationDate;

    @XmlElement(name = "MtiCode")
    public String getMtiCode() {
        return mtiCode;
    }

    public void setMtiCode(String mtiCode) {
        this.mtiCode = mtiCode;
    }

    @XmlElement(name = "MessageReasonCode")
    public String getMessageReasonCode() {
        return messageReasonCode;
    }

    public void setMessageReasonCode(String messageReasonCode) {
        this.messageReasonCode = messageReasonCode;
    }

    @XmlElement(name = "AuthorizationCode")
    public String getAuthorizationCode() {
        return authorizationCode;
    }

    public void setAuthorizationCode(String authorizationCode) {
        this.authorizationCode = authorizationCode;
    }

    @XmlElement(name = "SettlementFlag")
    public String getSettlementFlag() {
        return settlementFlag;
    }

    public void setSettlementFlag(String settlementFlag) {
        this.settlementFlag = settlementFlag;
    }

    @XmlElement(name = "MerchantNumber")
    public String getMerchantNumber() {
        return merchantNumber;
    }

    public void setMerchantNumber(String merchantNumber) {
        this.merchantNumber = merchantNumber;
    }

    @XmlElement(name = "Merchant")
    public String getMerchant() {
        return merchant;
    }

    public void setMerchant(String merchant) {
        this.merchant = merchant;
    }

    @XmlElement(name = "MerchantAddress")
    public String getMerchantAddress() {
        return merchantAddress;
    }

    public void setMerchantAddress(String merchantAddress) {
        this.merchantAddress = merchantAddress;
    }

    @XmlElement(name = "MerchantCity")
    public String getMerchantCity() {
        return merchantCity;
    }

    public void setMerchantCity(String merchantCity) {
        this.merchantCity = merchantCity;
    }

    @XmlElement(name = "MerchantPostcode")
    public String getMerchantPostcode() {
        return merchantPostcode;
    }

    public void setMerchantPostcode(String merchantPostcode) {
        this.merchantPostcode = merchantPostcode;
    }

    @XmlElement(name = "MerchantCountryCodeAlpha")
    public String getMerchantCountryCodeAlpha() {
        return merchantCountryCodeAlpha;
    }

    public void setMerchantCountryCodeAlpha(String merchantCountryCodeAlpha) {
        this.merchantCountryCodeAlpha = merchantCountryCodeAlpha;
    }

    @XmlElement(name = "MerchantCountryName")
    public String getMerchantCountryName() {
        return merchantCountryName;
    }

    public void setMerchantCountryName(String merchantCountryName) {
        this.merchantCountryName = merchantCountryName;
    }

    @XmlElement(name = "CardInputMode")
    public String getCardInputMode() {
        return cardInputMode;
    }

    public void setCardInputMode(String cardInputMode) {
        this.cardInputMode = cardInputMode;
    }

    @XmlElement(name = "CardholderAuthenticationMethod")
    public String getCardholderAuthenticationMethod() {
        return cardholderAuthenticationMethod;
    }

    public void setCardholderAuthenticationMethod(String cardholderAuthenticationMethod) {
        this.cardholderAuthenticationMethod = cardholderAuthenticationMethod;
    }

    @XmlElement(name = "PosDataDe22")
    public String getPosDataDe22() {
        return posDataDe22;
    }

    public void setPosDataDe22(String posDataDe22) {
        this.posDataDe22 = posDataDe22;
    }

    @XmlElement(name = "PosDataDe61")
    public String getPosDataDe61() {
        return posDataDe61;
    }

    public void setPosDataDe61(String posDataDe61) {
        this.posDataDe61 = posDataDe61;
    }

    @XmlElement(name = "AcquirerReferenceNumber")
    public String getAcquirerReferenceNumber() {
        return acquirerReferenceNumber;
    }

    public void setAcquirerReferenceNumber(String acquirerReferenceNumber) {
        this.acquirerReferenceNumber = acquirerReferenceNumber;
    }

    @XmlElement(name = "InterchangeFeeAmount")
    public Double getInterchangeFeeAmount() {
        return interchangeFeeAmount;
    }

    public void setInterchangeFeeAmount(Double interchangeFeeAmount) {
        this.interchangeFeeAmount = interchangeFeeAmount;
    }

    @XmlElement(name = "InterchangeFeeCurrency")
    public String getInterchangeFeeCurrency() {
        return interchangeFeeCurrency;
    }

    public void setInterchangeFeeCurrency(String interchangeFeeCurrency) {
        this.interchangeFeeCurrency = interchangeFeeCurrency;
    }

    @XmlElement(name = "InterchangeFeeDirection")
    public String getInterchangeFeeDirection() {
        return interchangeFeeDirection;
    }

    public void setInterchangeFeeDirection(String interchangeFeeDirection) {
        this.interchangeFeeDirection = interchangeFeeDirection;
    }

    @XmlElement(name = "InterchangeRateDesignator")
    public String getInterchangeRateDesignator() {
        return interchangeRateDesignator;
    }

    public void setInterchangeRateDesignator(String interchangeRateDesignator) {
        this.interchangeRateDesignator = interchangeRateDesignator;
    }

    @XmlElement(name = "CycleNumber")
    public String getCycleNumber() {
        return cycleNumber;
    }

    public void setCycleNumber(String cycleNumber) {
        this.cycleNumber = cycleNumber;
    }

    @XmlElement(name = "CycleFileId")
    public String getCycleFileId() {
        return cycleFileId;
    }

    public void setCycleFileId(String cycleFileId) {
        this.cycleFileId = cycleFileId;
    }

    @XmlElement(name = "ECIIndicator")
    public String getEciIndicator() {
        return eciIndicator;
    }

    public void setEciIndicator(String eciIndicator) {
        this.eciIndicator = eciIndicator;
    }

    @XmlElement(name = "TransactionCodeQualifier")
    public String getTransactionCodeQualifier() {
        return transactionCodeQualifier;
    }

    public void setTransactionCodeQualifier(String transactionCodeQualifier) {
        this.transactionCodeQualifier = transactionCodeQualifier;
    }

    @XmlElement(name = "BusinessFormatCode")
    public String getBusinessFormatCode() {
        return businessFormatCode;
    }

    public void setBusinessFormatCode(String businessFormatCode) {
        this.businessFormatCode = businessFormatCode;
    }

    @XmlElement(name = "CardType")
    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    @XmlElement(name = "ParentTransactionId")
    public String getParentTransactionId() {
        return parentTransactionId;
    }

    public void setParentTransactionId(String parentTransactionId) {
        this.parentTransactionId = parentTransactionId;
    }

    @XmlElement(name = "DisputeId")
    public String getDisputeId() {
        return disputeId;
    }

    public void setDisputeId(String disputeId) {
        this.disputeId = disputeId;
    }

    @XmlElement(name = "ExternalDisputeId")
    public String getExternalDisputeId() {
        return externalDisputeId;
    }

    public void setExternalDisputeId(String externalDisputeId) {
        this.externalDisputeId = externalDisputeId;
    }

    @XmlElement(name = "ActualAuthorizationId")
    public String getActualAuthorizationId() {
        return actualAuthorizationId;
    }

    public void setActualAuthorizationId(String actualAuthorizationId) {
        this.actualAuthorizationId = actualAuthorizationId;
    }

    @XmlElement(name = "FirstAuthorizationDate")
    public String getFirstAuthorizationDate() {
        return firstAuthorizationDate;
    }

    public void setFirstAuthorizationDate(String firstAuthorizationDate) {
        this.firstAuthorizationDate = firstAuthorizationDate;
    }
}
