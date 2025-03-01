package com.hesmantech.ewmxmltool.service.report.data;

import java.util.Map;

public class AccountSnapshotItem {
    private String fileDate;
    private String workDate;
    private String accountId;
    private String holderId;
    private String programId;
    private String currencyIson;
    private Double availableBalance;
    private Double settledBalance;
    private String accountStatus;
    private String accountStatusDescription;
    private String accountStatusChangeDate;
    private String accountStatusChangeSource;
    private String accountStatusChangeReasonCode;
    private String accountStatusChangeNote;
    private String accountStatusChangeOriginatorId;
    private String dateUpdated;
    private String dateCreated;
    private Map<String, String> bankAccount;

    public String getFileDate() {
        return fileDate;
    }

    public void setFileDate(String fileDate) {
        this.fileDate = fileDate;
    }

    public String getWorkDate() {
        return workDate;
    }

    public void setWorkDate(String workDate) {
        this.workDate = workDate;
    }

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

    public String getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
    }

    public String getAccountStatusDescription() {
        return accountStatusDescription;
    }

    public void setAccountStatusDescription(String accountStatusDescription) {
        this.accountStatusDescription = accountStatusDescription;
    }

    public String getAccountStatusChangeDate() {
        return accountStatusChangeDate;
    }

    public void setAccountStatusChangeDate(String accountStatusChangeDate) {
        this.accountStatusChangeDate = accountStatusChangeDate;
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

    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Map<String, String> getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(Map<String, String> bankAccount) {
        this.bankAccount = bankAccount;
    }
}
