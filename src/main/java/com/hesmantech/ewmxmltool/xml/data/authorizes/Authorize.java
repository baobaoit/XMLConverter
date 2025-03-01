package com.hesmantech.ewmxmltool.xml.data.authorizes;

import com.hesmantech.ewmxmltool.xml.data.base.AbstractTransaction;
import com.hesmantech.ewmxmltool.xml.data.common.CashBackAmount;
import com.hesmantech.ewmxmltool.xml.data.common.TransactionAmount;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Authorize")
public class Authorize extends AbstractTransaction {
    private String authorizeId;
    private String transactionDateTime;
    private String cardProductId;
    private String cardProgramId;
    private CashBackAmount cashBackAmount;
    private String issuerId;
    private String countryIson;
    private String reversal;
    private String authorisedViaTai;
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

    @XmlElement(name = "AuthorizeId")
    public String getAuthorizeId() {
        return authorizeId;
    }

    public void setAuthorizeId(String authorizeId) {
        this.authorizeId = authorizeId;
    }

    @XmlElement(name = "TransactionDateTime")
    public String getTransactionDateTime() {
        return transactionDateTime;
    }

    public void setTransactionDateTime(String transactionDateTime) {
        this.transactionDateTime = transactionDateTime;
    }

    @XmlElement(name = "CardProductId")
    public String getCardProductId() {
        return cardProductId;
    }

    public void setCardProductId(String cardProductId) {
        this.cardProductId = cardProductId;
    }

    @XmlElement(name = "CardProgramId")
    public String getCardProgramId() {
        return cardProgramId;
    }

    public void setCardProgramId(String cardProgramId) {
        this.cardProgramId = cardProgramId;
    }

    @XmlElement(name = "CashBackAmount")
    public CashBackAmount getCashBackAmount() {
        return cashBackAmount;
    }

    public void setCashBackAmount(CashBackAmount cashBackAmount) {
        this.cashBackAmount = cashBackAmount;
    }

    @XmlElement(name = "IssuerId")
    public String getIssuerId() {
        return issuerId;
    }

    public void setIssuerId(String issuerId) {
        this.issuerId = issuerId;
    }

    @XmlElement(name = "CountryIson")
    public String getCountryIson() {
        return countryIson;
    }

    public void setCountryIson(String countryIson) {
        this.countryIson = countryIson;
    }

    @XmlElement(name = "Reversal")
    public String getReversal() {
        return reversal;
    }

    public void setReversal(String reversal) {
        this.reversal = reversal;
    }

    @XmlElement(name = "AuthorisedViaTai")
    public String getAuthorisedViaTai() {
        return authorisedViaTai;
    }

    public void setAuthorisedViaTai(String authorisedViaTai) {
        this.authorisedViaTai = authorisedViaTai;
    }

    @XmlElement(name = "AdviceDetailCode")
    public String getAdviceDetailCode() {
        return adviceDetailCode;
    }

    public void setAdviceDetailCode(String adviceDetailCode) {
        this.adviceDetailCode = adviceDetailCode;
    }

    @XmlElement(name = "AdviceReasonCode")
    public String getAdviceReasonCode() {
        return adviceReasonCode;
    }

    public void setAdviceReasonCode(String adviceReasonCode) {
        this.adviceReasonCode = adviceReasonCode;
    }

    @XmlElement(name = "AuthorisationType")
    public String getAuthorisationType() {
        return authorisationType;
    }

    public void setAuthorisationType(String authorisationType) {
        this.authorisationType = authorisationType;
    }

    @XmlElement(name = "CardPresent")
    public String getCardPresent() {
        return cardPresent;
    }

    public void setCardPresent(String cardPresent) {
        this.cardPresent = cardPresent;
    }

    @XmlElement(name = "CumulativePaddingAmount")
    public Double getCumulativePaddingAmount() {
        return cumulativePaddingAmount;
    }

    public void setCumulativePaddingAmount(Double cumulativePaddingAmount) {
        this.cumulativePaddingAmount = cumulativePaddingAmount;
    }

    @XmlElement(name = "AppliedPaddingAmount")
    public Double getAppliedPaddingAmount() {
        return appliedPaddingAmount;
    }

    public void setAppliedPaddingAmount(Double appliedPaddingAmount) {
        this.appliedPaddingAmount = appliedPaddingAmount;
    }

    @XmlElement(name = "AvsResult")
    public String getAvsResult() {
        return avsResult;
    }

    public void setAvsResult(String avsResult) {
        this.avsResult = avsResult;
    }

    @XmlElement(name = "Cvc2Result")
    public String getCvc2Result() {
        return cvc2Result;
    }

    public void setCvc2Result(String cvc2Result) {
        this.cvc2Result = cvc2Result;
    }

    @XmlElement(name = "CvmResult")
    public String getCvmResult() {
        return cvmResult;
    }

    public void setCvmResult(String cvmResult) {
        this.cvmResult = cvmResult;
    }

    @XmlElement(name = "EciIndicator")
    public String getEciIndicator() {
        return eciIndicator;
    }

    public void setEciIndicator(String eciIndicator) {
        this.eciIndicator = eciIndicator;
    }

    @XmlElement(name = "LimitError")
    public String getLimitError() {
        return limitError;
    }

    public void setLimitError(String limitError) {
        this.limitError = limitError;
    }

    @XmlElement(name = "Mti")
    public String getMti() {
        return mti;
    }

    public void setMti(String mti) {
        this.mti = mti;
    }

    @XmlElement(name = "Note")
    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @XmlElement(name = "PosEntryMode")
    public String getPosEntryMode() {
        return posEntryMode;
    }

    public void setPosEntryMode(String posEntryMode) {
        this.posEntryMode = posEntryMode;
    }

    @XmlElement(name = "PosData")
    public String getPosData() {
        return posData;
    }

    public void setPosData(String posData) {
        this.posData = posData;
    }

    @XmlElement(name = "ProcessingCode")
    public String getProcessingCode() {
        return processingCode;
    }

    public void setProcessingCode(String processingCode) {
        this.processingCode = processingCode;
    }

    @XmlElement(name = "ResponseCode")
    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    @XmlElement(name = "ResponseCodeDescription")
    public String getResponseCodeDescription() {
        return responseCodeDescription;
    }

    public void setResponseCodeDescription(String responseCodeDescription) {
        this.responseCodeDescription = responseCodeDescription;
    }

    @XmlElement(name = "Stan")
    public String getStan() {
        return stan;
    }

    public void setStan(String stan) {
        this.stan = stan;
    }

    @XmlElement(name = "TraceNumber")
    public String getTraceNumber() {
        return traceNumber;
    }

    public void setTraceNumber(String traceNumber) {
        this.traceNumber = traceNumber;
    }

    @XmlElement(name = "DateCreated")
    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    @XmlElement(name = "TransactionAmount")
    public TransactionAmount getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(TransactionAmount transactionAmount) {
        this.transactionAmount = transactionAmount;
    }
}
