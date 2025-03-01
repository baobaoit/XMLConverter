package com.hesmantech.ewmxmltool.service.report.data;

import java.util.Map;

public class AccountItem {
    private String accountId;
    private String holderId;
    private String programId;
    private String currencyIson;
    private Double availableBalance;
    private Double settledBalance;
    private Double reservedBalance;
    private String accountStatus;
    private String accountStatusDate;
    private String accountStatusChangeSource;
    private String accountStatusChangeReasonCode;
    private String accountStatusChangeNote;
    private String accountStatusChangeOriginatorId;
    private String dateUpdated;
    private Map<String, String> card;

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getHolderId() {
        return holderId;
    }

    public void setHolderId(String holderId) {
        this.holderId = holderId;
    }

    public String getProgramId() {
        return programId;
    }

    public void setProgramId(String programId) {
        this.programId = programId;
    }

    public String getCurrencyIson() {
        return currencyIson;
    }

    public void setCurrencyIson(String currencyIson) {
        this.currencyIson = currencyIson;
    }

    public Double getAvailableBalance() {
        return availableBalance;
    }

    public void setAvailableBalance(Double availableBalance) {
        this.availableBalance = availableBalance;
    }

    public Double getSettledBalance() {
        return settledBalance;
    }

    public void setSettledBalance(Double settledBalance) {
        this.settledBalance = settledBalance;
    }

    public Double getReservedBalance() {
        return reservedBalance;
    }

    public void setReservedBalance(Double reservedBalance) {
        this.reservedBalance = reservedBalance;
    }

    public String getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
    }

    public String getAccountStatusDate() {
        return accountStatusDate;
    }

    public void setAccountStatusDate(String accountStatusDate) {
        this.accountStatusDate = accountStatusDate;
    }

    public String getAccountStatusChangeSource() {
        return accountStatusChangeSource;
    }

    public void setAccountStatusChangeSource(String accountStatusChangeSource) {
        this.accountStatusChangeSource = accountStatusChangeSource;
    }

    public String getAccountStatusChangeReasonCode() {
        return accountStatusChangeReasonCode;
    }

    public void setAccountStatusChangeReasonCode(String accountStatusChangeReasonCode) {
        this.accountStatusChangeReasonCode = accountStatusChangeReasonCode;
    }

    public String getAccountStatusChangeNote() {
        return accountStatusChangeNote;
    }

    public void setAccountStatusChangeNote(String accountStatusChangeNote) {
        this.accountStatusChangeNote = accountStatusChangeNote;
    }

    public String getAccountStatusChangeOriginatorId() {
        return accountStatusChangeOriginatorId;
    }

    public void setAccountStatusChangeOriginatorId(String accountStatusChangeOriginatorId) {
        this.accountStatusChangeOriginatorId = accountStatusChangeOriginatorId;
    }

    public String getDateUpdated() {
        return dateUpdated;
    }

    public void setDateUpdated(String dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    public Map<String, String> getCard() {
        return card;
    }

    public void setCards(Map<String, String> card) {
        this.card = card;
    }
}
