package com.hesmantech.ewmxmltool.xml.data.base;

import javax.xml.bind.annotation.XmlElement;

public abstract class AbstractActivityTransaction extends AbstractTransaction {
    protected String fileDate;
    protected String workDate;
    protected String issuerIdentificationNumber;
    protected String programName;
    protected String programId;
    protected String productName;
    protected String productId;
    protected String subProductId;
    protected String holderId;
    protected String bankAccountId;
    protected String cardNumber;
    protected String cardNumberId;
    protected String cardRequestId;
    protected String bin;
    protected String transactionCode;
    protected String transactionCodeDescription;
    protected String transactionDateTime;
    protected Double aaTransactionAmount;
    protected String transactionCurrencyCode;
    protected String transactionCurrencyAlpha;
    protected String traceId;
    protected String transactionCodeIdentifier;
    protected Double holderAmount;
    protected String holderCurrencyCode;
    protected String holderCurrencyAlpha;
    protected Double fxRate;
    protected String feeGroupId;
    protected String feeGroupName;
    protected String fxFeeName;
    protected Double fxFeeAmount;
    protected String fxFeeCurrency;
    protected String fxFeeReason;
    protected String f0FeeName;
    protected Double f0FeeAmount;
    protected String f0FeeCurrency;
    protected String f0FeeReason;
    protected Double billRateAmount;
    protected String billingDate;
    protected Double aaBillingAmount;
    protected String billingCurrencyCode;
    protected String billingCurrencyAlpha;
    protected Double aaSettlementAmount;
    protected String settlementCurrencyCode;
    protected String settlementCurrencyAlpha;
    protected Double settlementConversionRate;
    protected String cardPresent;
    protected String action;
    protected String network;
    protected String entryModeCode;
    protected String entryModeCodeDescription;

    @XmlElement(name = "FileDate")
    public String getFileDate() {
        return fileDate;
    }

    public void setFileDate(String fileDate) {
        this.fileDate = fileDate;
    }

    @XmlElement(name = "WorkDate")
    public String getWorkDate() {
        return workDate;
    }

    public void setWorkDate(String workDate) {
        this.workDate = workDate;
    }

    @XmlElement(name = "IssuerIdentificationNumber")
    public String getIssuerIdentificationNumber() {
        return issuerIdentificationNumber;
    }

    public void setIssuerIdentificationNumber(String issuerIdentificationNumber) {
        this.issuerIdentificationNumber = issuerIdentificationNumber;
    }

    @XmlElement(name = "ProgramName")
    public String getProgramName() {
        return programName;
    }

    public void setProgramName(String programName) {
        this.programName = programName;
    }

    @XmlElement(name = "ProgramId")
    public String getProgramId() {
        return programId;
    }

    public void setProgramId(String programId) {
        this.programId = programId;
    }

    @XmlElement(name = "ProductName")
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @XmlElement(name = "ProductId")
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    @XmlElement(name = "SubProductId")
    public String getSubProductId() {
        return subProductId;
    }

    public void setSubProductId(String subProductId) {
        this.subProductId = subProductId;
    }

    @XmlElement(name = "HolderId")
    public String getHolderId() {
        return holderId;
    }

    public void setHolderId(String holderId) {
        this.holderId = holderId;
    }

    @XmlElement(name = "BankAccountId")
    public String getBankAccountId() {
        return bankAccountId;
    }

    public void setBankAccountId(String bankAccountId) {
        this.bankAccountId = bankAccountId;
    }

    @XmlElement(name = "CardNumber")
    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @XmlElement(name = "CardNumberId")
    public String getCardNumberId() {
        return cardNumberId;
    }

    public void setCardNumberId(String cardNumberId) {
        this.cardNumberId = cardNumberId;
    }

    @XmlElement(name = "CardRequestId")
    public String getCardRequestId() {
        return cardRequestId;
    }

    public void setCardRequestId(String cardRequestId) {
        this.cardRequestId = cardRequestId;
    }

    @XmlElement(name = "Bin")
    public String getBin() {
        return bin;
    }

    public void setBin(String bin) {
        this.bin = bin;
    }

    @XmlElement(name = "TransactionCode")
    public String getTransactionCode() {
        return transactionCode;
    }

    public void setTransactionCode(String transactionCode) {
        this.transactionCode = transactionCode;
    }

    @XmlElement(name = "TransactionCodeDescription")
    public String getTransactionCodeDescription() {
        return transactionCodeDescription;
    }

    public void setTransactionCodeDescription(String transactionCodeDescription) {
        this.transactionCodeDescription = transactionCodeDescription;
    }

    @XmlElement(name = "TransactionDateTime")
    public String getTransactionDateTime() {
        return transactionDateTime;
    }

    public void setTransactionDateTime(String transactionDateTime) {
        this.transactionDateTime = transactionDateTime;
    }

    @XmlElement(name = "TransactionAmount")
    public Double getAaTransactionAmount() {
        return aaTransactionAmount;
    }

    public void setAaTransactionAmount(Double aaTransactionAmount) {
        this.aaTransactionAmount = aaTransactionAmount;
    }

    @XmlElement(name = "TransactionCurrencyCode")
    public String getTransactionCurrencyCode() {
        return transactionCurrencyCode;
    }

    public void setTransactionCurrencyCode(String transactionCurrencyCode) {
        this.transactionCurrencyCode = transactionCurrencyCode;
    }

    @XmlElement(name = "TransactionCurrencyAlpha")
    public String getTransactionCurrencyAlpha() {
        return transactionCurrencyAlpha;
    }

    public void setTransactionCurrencyAlpha(String transactionCurrencyAlpha) {
        this.transactionCurrencyAlpha = transactionCurrencyAlpha;
    }

    @XmlElement(name = "TraceId")
    public String getTraceId() {
        return traceId;
    }

    public void setTraceId(String traceId) {
        this.traceId = traceId;
    }

    @XmlElement(name = "TransactionCodeIdentifier")
    public String getTransactionCodeIdentifier() {
        return transactionCodeIdentifier;
    }

    public void setTransactionCodeIdentifier(String transactionCodeIdentifier) {
        this.transactionCodeIdentifier = transactionCodeIdentifier;
    }

    @XmlElement(name = "HolderAmount")
    public Double getHolderAmount() {
        return holderAmount;
    }

    public void setHolderAmount(Double holderAmount) {
        this.holderAmount = holderAmount;
    }

    @XmlElement(name = "HolderCurrencyCode")
    public String getHolderCurrencyCode() {
        return holderCurrencyCode;
    }

    public void setHolderCurrencyCode(String holderCurrencyCode) {
        this.holderCurrencyCode = holderCurrencyCode;
    }

    @XmlElement(name = "HolderCurrencyAlpha")
    public String getHolderCurrencyAlpha() {
        return holderCurrencyAlpha;
    }

    public void setHolderCurrencyAlpha(String holderCurrencyAlpha) {
        this.holderCurrencyAlpha = holderCurrencyAlpha;
    }

    @XmlElement(name = "FxRate")
    public Double getFxRate() {
        return fxRate;
    }

    public void setFxRate(Double fxRate) {
        this.fxRate = fxRate;
    }

    @XmlElement(name = "FeeGroupId")
    public String getFeeGroupId() {
        return feeGroupId;
    }

    public void setFeeGroupId(String feeGroupId) {
        this.feeGroupId = feeGroupId;
    }

    @XmlElement(name = "FeeGroupName")
    public String getFeeGroupName() {
        return feeGroupName;
    }

    public void setFeeGroupName(String feeGroupName) {
        this.feeGroupName = feeGroupName;
    }

    @XmlElement(name = "FxFeeName")
    public String getFxFeeName() {
        return fxFeeName;
    }

    public void setFxFeeName(String fxFeeName) {
        this.fxFeeName = fxFeeName;
    }

    @XmlElement(name = "FxFeeAmount")
    public Double getFxFeeAmount() {
        return fxFeeAmount;
    }

    public void setFxFeeAmount(Double fxFeeAmount) {
        this.fxFeeAmount = fxFeeAmount;
    }

    @XmlElement(name = "FxFeeCurrency")
    public String getFxFeeCurrency() {
        return fxFeeCurrency;
    }

    public void setFxFeeCurrency(String fxFeeCurrency) {
        this.fxFeeCurrency = fxFeeCurrency;
    }

    @XmlElement(name = "FxFeeReason")
    public String getFxFeeReason() {
        return fxFeeReason;
    }

    public void setFxFeeReason(String fxFeeReason) {
        this.fxFeeReason = fxFeeReason;
    }

    @XmlElement(name = "F0FeeName")
    public String getF0FeeName() {
        return f0FeeName;
    }

    public void setF0FeeName(String f0FeeName) {
        this.f0FeeName = f0FeeName;
    }

    @XmlElement(name = "F0FeeAmount")
    public Double getF0FeeAmount() {
        return f0FeeAmount;
    }

    public void setF0FeeAmount(Double f0FeeAmount) {
        this.f0FeeAmount = f0FeeAmount;
    }

    @XmlElement(name = "F0FeeCurrency")
    public String getF0FeeCurrency() {
        return f0FeeCurrency;
    }

    public void setF0FeeCurrency(String f0FeeCurrency) {
        this.f0FeeCurrency = f0FeeCurrency;
    }

    @XmlElement(name = "F0FeeReason")
    public String getF0FeeReason() {
        return f0FeeReason;
    }

    public void setF0FeeReason(String f0FeeReason) {
        this.f0FeeReason = f0FeeReason;
    }

    @XmlElement(name = "BillRateAmount")
    public Double getBillRateAmount() {
        return billRateAmount;
    }

    public void setBillRateAmount(Double billRateAmount) {
        this.billRateAmount = billRateAmount;
    }

    @XmlElement(name = "BillingDate")
    public String getBillingDate() {
        return billingDate;
    }

    public void setBillingDate(String billingDate) {
        this.billingDate = billingDate;
    }

    @XmlElement(name = "BillingAmount")
    public Double getAaBillingAmount() {
        return aaBillingAmount;
    }

    public void setAaBillingAmount(Double aaBillingAmount) {
        this.aaBillingAmount = aaBillingAmount;
    }

    @XmlElement(name = "billingCurrencyCode")
    public String getBillingCurrencyCode() {
        return billingCurrencyCode;
    }

    public void setBillingCurrencyCode(String billingCurrencyCode) {
        this.billingCurrencyCode = billingCurrencyCode;
    }

    @XmlElement(name = "BillingCurrencyAlpha")
    public String getBillingCurrencyAlpha() {
        return billingCurrencyAlpha;
    }

    public void setBillingCurrencyAlpha(String billingCurrencyAlpha) {
        this.billingCurrencyAlpha = billingCurrencyAlpha;
    }

    @XmlElement(name = "SettlementAmount")
    public Double getAaSettlementAmount() {
        return aaSettlementAmount;
    }

    public void setAaSettlementAmount(Double aaSettlementAmount) {
        this.aaSettlementAmount = aaSettlementAmount;
    }

    @XmlElement(name = "SettlementCurrencyCode")
    public String getSettlementCurrencyCode() {
        return settlementCurrencyCode;
    }

    public void setSettlementCurrencyCode(String settlementCurrencyCode) {
        this.settlementCurrencyCode = settlementCurrencyCode;
    }

    @XmlElement(name = "SettlementCurrencyAlpha")
    public String getSettlementCurrencyAlpha() {
        return settlementCurrencyAlpha;
    }

    public void setSettlementCurrencyAlpha(String settlementCurrencyAlpha) {
        this.settlementCurrencyAlpha = settlementCurrencyAlpha;
    }

    @XmlElement(name = "SettlementConversionRate")
    public Double getSettlementConversionRate() {
        return settlementConversionRate;
    }

    public void setSettlementConversionRate(Double settlementConversionRate) {
        this.settlementConversionRate = settlementConversionRate;
    }

    @XmlElement(name = "CardPresent")
    public String getCardPresent() {
        return cardPresent;
    }

    public void setCardPresent(String cardPresent) {
        this.cardPresent = cardPresent;
    }

    @XmlElement(name = "Action")
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    @XmlElement(name = "Network")
    public String getNetwork() {
        return network;
    }

    public void setNetwork(String network) {
        this.network = network;
    }

    @XmlElement(name = "EntryModeCode")
    public String getEntryModeCode() {
        return entryModeCode;
    }

    public void setEntryModeCode(String entryModeCode) {
        this.entryModeCode = entryModeCode;
    }

    @XmlElement(name = "EntryModeCodeDescription")
    public String getEntryModeCodeDescription() {
        return entryModeCodeDescription;
    }

    public void setEntryModeCodeDescription(String entryModeCodeDescription) {
        this.entryModeCodeDescription = entryModeCodeDescription;
    }
}
