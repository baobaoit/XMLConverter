package com.hesmantech.ewmxmltool.service.report.data;

public class AuthorizeItem {
    private String transactionType;
    private String entryModeType;
    private String authorizeId;
    private String transLink;
    private String transactionDateTime;
    private String settlementDate;
    private String cardProductId;
    private String cardProgramId;
    private String cardId;
    private String accountId;
    private Double transactionAmount;
    private String transactionAmountCurrency;
    private Double billingAmount;
    private String billingAmountCurrency;
    private Double billingAmountRate;
    private Double cardholderAmount;
    private String cardholderAmountCurrency;
    private Double cardholderAmountRate;
    private Double cashBackAmount;
    private String cashBackAmountCurrency;
    private String authCode;
    private String retrievalReferenceNumber;
    private String merchantId;
    private String merchantName;
    private String merchantTerminalId;
    private String schemeId;
    private Double transactionFee;
    private String transactionFeeCurrency;
    private Double settlementAmount;
    private String settlementAmountCurrency;
    private Double settlementAmountRate;
    private String issuerId;
    private String acquirerId;
    private String forwarderId;
    private String mcc;
    private String countryIson;
    private String suspicious;
    private String reversal;
    private String authorisedViaTai;
    private String riskRuleCodes;
    private String markTransactionAsSuspicious;
    private String notifyCardholderBySendingTAIsNotification;
    private String changeCardStatusToRisk;
    private String changeAccountStatusToSuspended;
    private String rejectTransaction;
    private String cardExpirationDatePresent;
    private String onlinePIN;
    private String offlinePIN;
    private String threeDomainSecure;
    private String cvv2;
    private String magneticStripe;
    private String chipData;
    private String AVS;
    private String phoneNumber;
    private String signature;
    private String adviceDetailCode;
    private String adviceReasonCode;
    private String authorisationType;
    private String cardPresent;
    private Double cumulativePaddingAmount;
    private Double appliedPaddingAmount;
    private String avsResult;
    private String cvc2Result;
    private String cvmResult;
    private String eciIndicator;
    private String limitError;
    private String mti;
    private String note;
    private String posEntryMode;
    private String posData;
    private String processingCode;
    private String responseCode;
    private String responseCodeDescription;
    private String stan;
    private String traceNumber;
    private String dateCreated;

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public String getEntryModeType() {
        return entryModeType;
    }

    public void setEntryModeType(String entryModeType) {
        this.entryModeType = entryModeType;
    }

    public String getAuthorizeId() {
        return authorizeId;
    }

    public void setAuthorizeId(String authorizeId) {
        this.authorizeId = authorizeId;
    }

    public String getTransLink() {
        return transLink;
    }

    public void setTransLink(String transLink) {
        this.transLink = transLink;
    }

    public String getTransactionDateTime() {
        return transactionDateTime;
    }

    public void setTransactionDateTime(String transactionDateTime) {
        this.transactionDateTime = transactionDateTime;
    }

    public String getSettlementDate() {
        return settlementDate;
    }

    public void setSettlementDate(String settlementDate) {
        this.settlementDate = settlementDate;
    }

    public String getCardProductId() {
        return cardProductId;
    }

    public void setCardProductId(String cardProductId) {
        this.cardProductId = cardProductId;
    }

    public String getCardProgramId() {
        return cardProgramId;
    }

    public void setCardProgramId(String cardProgramId) {
        this.cardProgramId = cardProgramId;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public Double getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(Double transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    public String getTransactionAmountCurrency() {
        return transactionAmountCurrency;
    }

    public void setTransactionAmountCurrency(String transactionAmountCurrency) {
        this.transactionAmountCurrency = transactionAmountCurrency;
    }

    public Double getBillingAmount() {
        return billingAmount;
    }

    public void setBillingAmount(Double billingAmount) {
        this.billingAmount = billingAmount;
    }

    public String getBillingAmountCurrency() {
        return billingAmountCurrency;
    }

    public void setBillingAmountCurrency(String billingAmountCurrency) {
        this.billingAmountCurrency = billingAmountCurrency;
    }

    public Double getBillingAmountRate() {
        return billingAmountRate;
    }

    public void setBillingAmountRate(Double billingAmountRate) {
        this.billingAmountRate = billingAmountRate;
    }

    public Double getCardholderAmount() {
        return cardholderAmount;
    }

    public void setCardholderAmount(Double cardholderAmount) {
        this.cardholderAmount = cardholderAmount;
    }

    public String getCardholderAmountCurrency() {
        return cardholderAmountCurrency;
    }

    public void setCardholderAmountCurrency(String cardholderAmountCurrency) {
        this.cardholderAmountCurrency = cardholderAmountCurrency;
    }

    public Double getCardholderAmountRate() {
        return cardholderAmountRate;
    }

    public void setCardholderAmountRate(Double cardholderAmountRate) {
        this.cardholderAmountRate = cardholderAmountRate;
    }

    public Double getCashBackAmount() {
        return cashBackAmount;
    }

    public void setCashBackAmount(Double cashBackAmount) {
        this.cashBackAmount = cashBackAmount;
    }

    public String getCashBackAmountCurrency() {
        return cashBackAmountCurrency;
    }

    public void setCashBackAmountCurrency(String cashBackAmountCurrency) {
        this.cashBackAmountCurrency = cashBackAmountCurrency;
    }

    public String getAuthCode() {
        return authCode;
    }

    public void setAuthCode(String authCode) {
        this.authCode = authCode;
    }

    public String getRetrievalReferenceNumber() {
        return retrievalReferenceNumber;
    }

    public void setRetrievalReferenceNumber(String retrievalReferenceNumber) {
        this.retrievalReferenceNumber = retrievalReferenceNumber;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    public String getMerchantTerminalId() {
        return merchantTerminalId;
    }

    public void setMerchantTerminalId(String merchantTerminalId) {
        this.merchantTerminalId = merchantTerminalId;
    }

    public String getSchemeId() {
        return schemeId;
    }

    public void setSchemeId(String schemeId) {
        this.schemeId = schemeId;
    }

    public Double getTransactionFee() {
        return transactionFee;
    }

    public void setTransactionFee(Double transactionFee) {
        this.transactionFee = transactionFee;
    }

    public String getTransactionFeeCurrency() {
        return transactionFeeCurrency;
    }

    public void setTransactionFeeCurrency(String transactionFeeCurrency) {
        this.transactionFeeCurrency = transactionFeeCurrency;
    }

    public Double getSettlementAmount() {
        return settlementAmount;
    }

    public void setSettlementAmount(Double settlementAmount) {
        this.settlementAmount = settlementAmount;
    }

    public String getSettlementAmountCurrency() {
        return settlementAmountCurrency;
    }

    public void setSettlementAmountCurrency(String settlementAmountCurrency) {
        this.settlementAmountCurrency = settlementAmountCurrency;
    }

    public Double getSettlementAmountRate() {
        return settlementAmountRate;
    }

    public void setSettlementAmountRate(Double settlementAmountRate) {
        this.settlementAmountRate = settlementAmountRate;
    }

    public String getIssuerId() {
        return issuerId;
    }

    public void setIssuerId(String issuerId) {
        this.issuerId = issuerId;
    }

    public String getAcquirerId() {
        return acquirerId;
    }

    public void setAcquirerId(String acquirerId) {
        this.acquirerId = acquirerId;
    }

    public String getForwarderId() {
        return forwarderId;
    }

    public void setForwarderId(String forwarderId) {
        this.forwarderId = forwarderId;
    }

    public String getMcc() {
        return mcc;
    }

    public void setMcc(String mcc) {
        this.mcc = mcc;
    }

    public String getCountryIson() {
        return countryIson;
    }

    public void setCountryIson(String countryIson) {
        this.countryIson = countryIson;
    }

    public String getSuspicious() {
        return suspicious;
    }

    public void setSuspicious(String suspicious) {
        this.suspicious = suspicious;
    }

    public String getReversal() {
        return reversal;
    }

    public void setReversal(String reversal) {
        this.reversal = reversal;
    }

    public String getAuthorisedViaTai() {
        return authorisedViaTai;
    }

    public void setAuthorisedViaTai(String authorisedViaTai) {
        this.authorisedViaTai = authorisedViaTai;
    }

    public String getRiskRuleCodes() {
        return riskRuleCodes;
    }

    public void setRiskRuleCodes(String riskRuleCodes) {
        this.riskRuleCodes = riskRuleCodes;
    }

    public String getMarkTransactionAsSuspicious() {
        return markTransactionAsSuspicious;
    }

    public void setMarkTransactionAsSuspicious(String markTransactionAsSuspicious) {
        this.markTransactionAsSuspicious = markTransactionAsSuspicious;
    }

    public String getNotifyCardholderBySendingTAIsNotification() {
        return notifyCardholderBySendingTAIsNotification;
    }

    public void setNotifyCardholderBySendingTAIsNotification(String notifyCardholderBySendingTAIsNotification) {
        this.notifyCardholderBySendingTAIsNotification = notifyCardholderBySendingTAIsNotification;
    }

    public String getChangeCardStatusToRisk() {
        return changeCardStatusToRisk;
    }

    public void setChangeCardStatusToRisk(String changeCardStatusToRisk) {
        this.changeCardStatusToRisk = changeCardStatusToRisk;
    }

    public String getChangeAccountStatusToSuspended() {
        return changeAccountStatusToSuspended;
    }

    public void setChangeAccountStatusToSuspended(String changeAccountStatusToSuspended) {
        this.changeAccountStatusToSuspended = changeAccountStatusToSuspended;
    }

    public String getRejectTransaction() {
        return rejectTransaction;
    }

    public void setRejectTransaction(String rejectTransaction) {
        this.rejectTransaction = rejectTransaction;
    }

    public String getCardExpirationDatePresent() {
        return cardExpirationDatePresent;
    }

    public void setCardExpirationDatePresent(String cardExpirationDatePresent) {
        this.cardExpirationDatePresent = cardExpirationDatePresent;
    }

    public String getOnlinePIN() {
        return onlinePIN;
    }

    public void setOnlinePIN(String onlinePIN) {
        this.onlinePIN = onlinePIN;
    }

    public String getOfflinePIN() {
        return offlinePIN;
    }

    public void setOfflinePIN(String offlinePIN) {
        this.offlinePIN = offlinePIN;
    }

    public String getThreeDomainSecure() {
        return threeDomainSecure;
    }

    public void setThreeDomainSecure(String threeDomainSecure) {
        this.threeDomainSecure = threeDomainSecure;
    }

    public String getCvv2() {
        return cvv2;
    }

    public void setCvv2(String cvv2) {
        this.cvv2 = cvv2;
    }

    public String getMagneticStripe() {
        return magneticStripe;
    }

    public void setMagneticStripe(String magneticStripe) {
        this.magneticStripe = magneticStripe;
    }

    public String getChipData() {
        return chipData;
    }

    public void setChipData(String chipData) {
        this.chipData = chipData;
    }

    public String getAVS() {
        return AVS;
    }

    public void setAVS(String AVS) {
        this.AVS = AVS;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public String getAdviceDetailCode() {
        return adviceDetailCode;
    }

    public void setAdviceDetailCode(String adviceDetailCode) {
        this.adviceDetailCode = adviceDetailCode;
    }

    public String getAdviceReasonCode() {
        return adviceReasonCode;
    }

    public void setAdviceReasonCode(String adviceReasonCode) {
        this.adviceReasonCode = adviceReasonCode;
    }

    public String getAuthorisationType() {
        return authorisationType;
    }

    public void setAuthorisationType(String authorisationType) {
        this.authorisationType = authorisationType;
    }

    public String getCardPresent() {
        return cardPresent;
    }

    public void setCardPresent(String cardPresent) {
        this.cardPresent = cardPresent;
    }

    public Double getCumulativePaddingAmount() {
        return cumulativePaddingAmount;
    }

    public void setCumulativePaddingAmount(Double cumulativePaddingAmount) {
        this.cumulativePaddingAmount = cumulativePaddingAmount;
    }

    public Double getAppliedPaddingAmount() {
        return appliedPaddingAmount;
    }

    public void setAppliedPaddingAmount(Double appliedPaddingAmount) {
        this.appliedPaddingAmount = appliedPaddingAmount;
    }

    public String getAvsResult() {
        return avsResult;
    }

    public void setAvsResult(String avsResult) {
        this.avsResult = avsResult;
    }

    public String getCvc2Result() {
        return cvc2Result;
    }

    public void setCvc2Result(String cvc2Result) {
        this.cvc2Result = cvc2Result;
    }

    public String getCvmResult() {
        return cvmResult;
    }

    public void setCvmResult(String cvmResult) {
        this.cvmResult = cvmResult;
    }

    public String getEciIndicator() {
        return eciIndicator;
    }

    public void setEciIndicator(String eciIndicator) {
        this.eciIndicator = eciIndicator;
    }

    public String getLimitError() {
        return limitError;
    }

    public void setLimitError(String limitError) {
        this.limitError = limitError;
    }

    public String getMti() {
        return mti;
    }

    public void setMti(String mti) {
        this.mti = mti;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getPosEntryMode() {
        return posEntryMode;
    }

    public void setPosEntryMode(String posEntryMode) {
        this.posEntryMode = posEntryMode;
    }

    public String getPosData() {
        return posData;
    }

    public void setPosData(String posData) {
        this.posData = posData;
    }

    public String getProcessingCode() {
        return processingCode;
    }

    public void setProcessingCode(String processingCode) {
        this.processingCode = processingCode;
    }

    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    public String getResponseCodeDescription() {
        return responseCodeDescription;
    }

    public void setResponseCodeDescription(String responseCodeDescription) {
        this.responseCodeDescription = responseCodeDescription;
    }

    public String getStan() {
        return stan;
    }

    public void setStan(String stan) {
        this.stan = stan;
    }

    public String getTraceNumber() {
        return traceNumber;
    }

    public void setTraceNumber(String traceNumber) {
        this.traceNumber = traceNumber;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }
}
