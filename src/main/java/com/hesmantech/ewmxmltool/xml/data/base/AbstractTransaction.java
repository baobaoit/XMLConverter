package com.hesmantech.ewmxmltool.xml.data.base;

import com.hesmantech.ewmxmltool.xml.data.common.BillingAmount;
import com.hesmantech.ewmxmltool.xml.data.common.CardholderAmount;
import com.hesmantech.ewmxmltool.xml.data.common.RiskActions;
import com.hesmantech.ewmxmltool.xml.data.common.SecurityChecks;
import com.hesmantech.ewmxmltool.xml.data.common.SettlementAmount;
import com.hesmantech.ewmxmltool.xml.data.common.TransactionAmount;
import com.hesmantech.ewmxmltool.xml.data.common.TransactionExchangeFeeAmount;
import com.hesmantech.ewmxmltool.xml.data.common.TransactionFee;

import javax.xml.bind.annotation.XmlElement;

public abstract class AbstractTransaction {
    protected String transactionType;
    protected String entryModeType;
    protected String transactionId;
    protected String transLink;
    protected String transactionLocalTime;
    protected String reconciliationDate;
    protected String settlementDate;
    protected String dateTimeProcessed;
    protected String cardProduct;
    protected String program;
    protected String cardId;
    protected String accountId;
    protected TransactionAmount transactionAmount;
    protected BillingAmount billingAmount;
    protected CardholderAmount cardholderAmount;
    protected Double baseConversionRate;
    protected String isConversionFeeBlended;
    protected String authCode;
    protected String retrievalReferenceNumber;
    protected String merchantId;
    protected String merchantName;
    protected String merchantState;
    protected String merchantCountry;
    protected String merchantTerminalId;
    protected String schemeId;
    protected TransactionFee transactionFee;
    protected SettlementAmount settlementAmount;
    protected String acquirerId;
    protected String forwarderId;
    protected String mcc;
    protected String reasonCode;
    protected String epmMethodId;
    protected String epmTransactionId;
    protected String externalEpmTransactionId;
    protected String epmTransactionType;
    protected String epmTransactionStatusCode;
    protected String epmTransactionStatus;
    protected String epmTransactionReasonDescription;
    protected String epmTransactionBankProviderReasonCode;
    protected String epmMandateId;
    protected String suspicious;
    protected String riskRuleCodes;
    protected RiskActions riskActions;
    protected String functionCode;
    protected SecurityChecks securityChecks;
    protected String transactionClass;
    protected String referenceNumber;
    protected String transactionDescription;
    protected String loadType;
    protected String loadSource;
    protected TransactionExchangeFeeAmount transactionExchangeFeeAmount;

    @XmlElement(name = "TransactionType")
    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    @XmlElement(name = "EntryModeType")
    public String getEntryModeType() {
        return entryModeType;
    }

    public void setEntryModeType(String entryModeType) {
        this.entryModeType = entryModeType;
    }

    @XmlElement(name = "TransactionId")
    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    @XmlElement(name = "TransLink")
    public String getTransLink() {
        return transLink;
    }

    public void setTransLink(String transLink) {
        this.transLink = transLink;
    }

    @XmlElement(name = "TransactionLocalTime")
    public String getTransactionLocalTime() {
        return transactionLocalTime;
    }

    public void setTransactionLocalTime(String transactionLocalTime) {
        this.transactionLocalTime = transactionLocalTime;
    }

    @XmlElement(name = "ReconciliationDate")
    public String getReconciliationDate() {
        return reconciliationDate;
    }

    public void setReconciliationDate(String reconciliationDate) {
        this.reconciliationDate = reconciliationDate;
    }

    @XmlElement(name = "SettlementDate")
    public String getSettlementDate() {
        return settlementDate;
    }

    public void setSettlementDate(String settlementDate) {
        this.settlementDate = settlementDate;
    }

    @XmlElement(name = "DateTimeProcessed")
    public String getDateTimeProcessed() {
        return dateTimeProcessed;
    }

    public void setDateTimeProcessed(String dateTimeProcessed) {
        this.dateTimeProcessed = dateTimeProcessed;
    }

    @XmlElement(name = "CardProduct")
    public String getCardProduct() {
        return cardProduct;
    }

    public void setCardProduct(String cardProduct) {
        this.cardProduct = cardProduct;
    }

    @XmlElement(name = "Program")
    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    @XmlElement(name = "CardId")
    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    @XmlElement(name = "AccountId")
    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    @XmlElement(name = "BillingAmount")
    public BillingAmount getBillingAmount() {
        return billingAmount;
    }

    public void setBillingAmount(BillingAmount billingAmount) {
        this.billingAmount = billingAmount;
    }

    @XmlElement(name = "CardholderAmount")
    public CardholderAmount getCardholderAmount() {
        return cardholderAmount;
    }

    public void setCardholderAmount(CardholderAmount cardholderAmount) {
        this.cardholderAmount = cardholderAmount;
    }

    @XmlElement(name = "BaseConversionRate")
    public Double getBaseConversionRate() {
        return baseConversionRate;
    }

    public void setBaseConversionRate(Double baseConversionRate) {
        this.baseConversionRate = baseConversionRate;
    }

    @XmlElement(name = "IsConversionFeeBlended")
    public String getIsConversionFeeBlended() {
        return isConversionFeeBlended;
    }

    public void setIsConversionFeeBlended(String isConversionFeeBlended) {
        this.isConversionFeeBlended = isConversionFeeBlended;
    }


    @XmlElement(name = "AuthCode")
    public String getAuthCode() {
        return authCode;
    }

    public void setAuthCode(String authCode) {
        this.authCode = authCode;
    }

    @XmlElement(name = "RetrievalReferenceNumber")
    public String getRetrievalReferenceNumber() {
        return retrievalReferenceNumber;
    }

    public void setRetrievalReferenceNumber(String retrievalReferenceNumber) {
        this.retrievalReferenceNumber = retrievalReferenceNumber;
    }

    @XmlElement(name = "MerchantId")
    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    @XmlElement(name = "MerchantName")
    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    @XmlElement(name = "MerchantState")
    public String getMerchantState() {
        return merchantState;
    }

    public void setMerchantState(String merchantState) {
        this.merchantState = merchantState;
    }

    @XmlElement(name = "MerchantCountry")
    public String getMerchantCountry() {
        return merchantCountry;
    }

    public void setMerchantCountry(String merchantCountry) {
        this.merchantCountry = merchantCountry;
    }

    @XmlElement(name = "MerchantTerminalId")
    public String getMerchantTerminalId() {
        return merchantTerminalId;
    }

    public void setMerchantTerminalId(String merchantTerminalId) {
        this.merchantTerminalId = merchantTerminalId;
    }

    @XmlElement(name = "SchemeId")
    public String getSchemeId() {
        return schemeId;
    }

    public void setSchemeId(String schemeId) {
        this.schemeId = schemeId;
    }

    @XmlElement(name = "TransactionFee")
    public TransactionFee getTransactionFee() {
        return transactionFee;
    }

    public void setTransactionFee(TransactionFee transactionFee) {
        this.transactionFee = transactionFee;
    }

    @XmlElement(name = "SettlementAmount")
    public SettlementAmount getSettlementAmount() {
        return settlementAmount;
    }

    public void setSettlementAmount(SettlementAmount settlementAmount) {
        this.settlementAmount = settlementAmount;
    }

    @XmlElement(name = "AcquirerId")
    public String getAcquirerId() {
        return acquirerId;
    }

    public void setAcquirerId(String acquirerId) {
        this.acquirerId = acquirerId;
    }

    @XmlElement(name = "ForwarderId")
    public String getForwarderId() {
        return forwarderId;
    }

    public void setForwarderId(String forwarderId) {
        this.forwarderId = forwarderId;
    }

    @XmlElement(name = "Mcc")
    public String getMcc() {
        return mcc;
    }

    public void setMcc(String mcc) {
        this.mcc = mcc;
    }

    @XmlElement(name = "ReasonCode")
    public String getReasonCode() {
        return reasonCode;
    }

    public void setReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
    }

    @XmlElement(name = "EpmMethodId")
    public String getEpmMethodId() {
        return epmMethodId;
    }

    public void setEpmMethodId(String epmMethodId) {
        this.epmMethodId = epmMethodId;
    }

    @XmlElement(name = "EpmTransactionId")
    public String getEpmTransactionId() {
        return epmTransactionId;
    }

    public void setEpmTransactionId(String epmTransactionId) {
        this.epmTransactionId = epmTransactionId;
    }

    @XmlElement(name = "ExternalEpmTransactionId")
    public String getExternalEpmTransactionId() {
        return externalEpmTransactionId;
    }

    public void setExternalEpmTransactionId(String externalEpmTransactionId) {
        this.externalEpmTransactionId = externalEpmTransactionId;
    }

    @XmlElement(name = "EpmTransactionType")
    public String getEpmTransactionType() {
        return epmTransactionType;
    }

    public void setEpmTransactionType(String epmTransactionType) {
        this.epmTransactionType = epmTransactionType;
    }

    @XmlElement(name = "EpmTransactionStatusCode")
    public String getEpmTransactionStatusCode() {
        return epmTransactionStatusCode;
    }

    public void setEpmTransactionStatusCode(String epmTransactionStatusCode) {
        this.epmTransactionStatusCode = epmTransactionStatusCode;
    }

    @XmlElement(name = "EpmTransactionStatus")
    public String getEpmTransactionStatus() {
        return epmTransactionStatus;
    }

    public void setEpmTransactionStatus(String epmTransactionStatus) {
        this.epmTransactionStatus = epmTransactionStatus;
    }

    @XmlElement(name = "EpmTransactionReasonDescription")
    public String getEpmTransactionReasonDescription() {
        return epmTransactionReasonDescription;
    }

    public void setEpmTransactionReasonDescription(String epmTransactionReasonDescription) {
        this.epmTransactionReasonDescription = epmTransactionReasonDescription;
    }

    @XmlElement(name = "EpmTransactionBankProviderReasonCode")
    public String getEpmTransactionBankProviderReasonCode() {
        return epmTransactionBankProviderReasonCode;
    }

    public void setEpmTransactionBankProviderReasonCode(String epmTransactionBankProviderReasonCode) {
        this.epmTransactionBankProviderReasonCode = epmTransactionBankProviderReasonCode;
    }

    @XmlElement(name = "EpmMandateId")
    public String getEpmMandateId() {
        return epmMandateId;
    }

    public void setEpmMandateId(String epmMandateId) {
        this.epmMandateId = epmMandateId;
    }

    @XmlElement(name = "Suspicious")
    public String getSuspicious() {
        return suspicious;
    }

    public void setSuspicious(String suspicious) {
        this.suspicious = suspicious;
    }

    @XmlElement(name = "RiskRuleCodes")
    public String getRiskRuleCodes() {
        return riskRuleCodes;
    }

    public void setRiskRuleCodes(String riskRuleCodes) {
        this.riskRuleCodes = riskRuleCodes;
    }

    @XmlElement(name = "RiskActions")
    public RiskActions getRiskActions() {
        return riskActions;
    }

    public void setRiskActions(RiskActions riskActions) {
        this.riskActions = riskActions;
    }

    @XmlElement(name = "FunctionCode")
    public String getFunctionCode() {
        return functionCode;
    }

    public void setFunctionCode(String functionCode) {
        this.functionCode = functionCode;
    }

    @XmlElement(name = "SecurityChecks")
    public SecurityChecks getSecurityChecks() {
        return securityChecks;
    }

    public void setSecurityChecks(SecurityChecks securityChecks) {
        this.securityChecks = securityChecks;
    }

    @XmlElement(name = "TransactionClass")
    public String getTransactionClass() {
        return transactionClass;
    }

    public void setTransactionClass(String transactionClass) {
        this.transactionClass = transactionClass;
    }

    @XmlElement(name = "ReferenceNumber")
    public String getReferenceNumber() {
        return referenceNumber;
    }

    public void setReferenceNumber(String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    @XmlElement(name = "TransactionDescription")
    public String getTransactionDescription() {
        return transactionDescription;
    }

    public void setTransactionDescription(String transactionDescription) {
        this.transactionDescription = transactionDescription;
    }

    @XmlElement(name = "LoadType")
    public String getLoadType() {
        return loadType;
    }

    public void setLoadType(String loadType) {
        this.loadType = loadType;
    }

    @XmlElement(name = "LoadSource")
    public String getLoadSource() {
        return loadSource;
    }

    public void setLoadSource(String loadSource) {
        this.loadSource = loadSource;
    }

    @XmlElement(name = "TransactionExchangeFeeAmount")
    public TransactionExchangeFeeAmount getTransactionExchangeFeeAmount() {
        return transactionExchangeFeeAmount;
    }

    public void setTransactionExchangeFeeAmount(TransactionExchangeFeeAmount transactionExchangeFeeAmount) {
        this.transactionExchangeFeeAmount = transactionExchangeFeeAmount;
    }
}
