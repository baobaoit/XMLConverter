package com.hesmantech.ewmxmltool.xml.data.base;

import javax.xml.bind.annotation.XmlElement;

public abstract class AbstractAccount {
    protected String accountId;
    protected String holderId;
    protected String programId;
    protected String currencyIson;
    protected Double availableBalance;
    protected Double settledBalance;
    protected String accountStatus;
    protected String accountStatusChangeSource;
    protected String accountStatusChangeReasonCode;
    protected String accountStatusChangeNote;
    protected String accountStatusChangeOriginatorId;
    protected String dateUpdated;

    @XmlElement(name = "AccountId")
    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    @XmlElement(name = "HolderId")
    public String getHolderId() {
        return holderId;
    }

    public void setHolderId(String holderId) {
        this.holderId = holderId;
    }

    @XmlElement(name = "ProgramId")
    public String getProgramId() {
        return programId;
    }

    public void setProgramId(String programId) {
        this.programId = programId;
    }

    @XmlElement(name = "CurrencyIson")
    public String getCurrencyIson() {
        return currencyIson;
    }

    public void setCurrencyIson(String currencyIson) {
        this.currencyIson = currencyIson;
    }

    @XmlElement(name = "AvailableBalance")
    public Double getAvailableBalance() {
        return availableBalance;
    }

    public void setAvailableBalance(Double availableBalance) {
        this.availableBalance = availableBalance;
    }

    @XmlElement(name = "SettledBalance")
    public Double getSettledBalance() {
        return settledBalance;
    }

    public void setSettledBalance(Double settledBalance) {
        this.settledBalance = settledBalance;
    }

    @XmlElement(name = "AccountStatus")
    public String getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
    }

    @XmlElement(name = "AccountStatusChangeSource")
    public String getAccountStatusChangeSource() {
        return accountStatusChangeSource;
    }

    public void setAccountStatusChangeSource(String accountStatusChangeSource) {
        this.accountStatusChangeSource = accountStatusChangeSource;
    }

    @XmlElement(name = "AccountStatusChangeReasonCode")
    public String getAccountStatusChangeReasonCode() {
        return accountStatusChangeReasonCode;
    }

    public void setAccountStatusChangeReasonCode(String accountStatusChangeReasonCode) {
        this.accountStatusChangeReasonCode = accountStatusChangeReasonCode;
    }

    @XmlElement(name = "AccountStatusChangeNote")
    public String getAccountStatusChangeNote() {
        return accountStatusChangeNote;
    }

    public void setAccountStatusChangeNote(String accountStatusChangeNote) {
        this.accountStatusChangeNote = accountStatusChangeNote;
    }

    @XmlElement(name = "AccountStatusChangeOriginatorId")
    public String getAccountStatusChangeOriginatorId() {
        return accountStatusChangeOriginatorId;
    }

    public void setAccountStatusChangeOriginatorId(String accountStatusChangeOriginatorId) {
        this.accountStatusChangeOriginatorId = accountStatusChangeOriginatorId;
    }

    @XmlElement(name = "DateUpdated")
    public String getDateUpdated() {
        return dateUpdated;
    }

    public void setDateUpdated(String dateUpdated) {
        this.dateUpdated = dateUpdated;
    }
}
