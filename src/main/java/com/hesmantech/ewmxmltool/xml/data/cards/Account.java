package com.hesmantech.ewmxmltool.xml.data.cards;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Account")
public class Account {
    private String accountId;
    private String accountStatus;
    private String accountStatusDate;
    private String accountStatusChangeSource;
    private String accountStatusChangeReasonCode;
    private String accountStatusChangeNote;
    private String accountStatusChangeOriginatorId;
    private String accountLimitsGroupName;
    private String accountLimitsGroupId;
    private String accountFeeGroupName;
    private String accountFeeGroupId;
    private BankAccounts bankAccounts;
    private String availableBalance;
    private String blockedAmount;
    private String currentBalance;
    private String reservedBalance;
    private String accountCurrency;

    @XmlElement(name = "AccountId")
    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    @XmlElement(name = "AccountStatus")
    public String getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
    }

    @XmlElement(name = "AccountStatusDate")
    public String getAccountStatusDate() {
        return accountStatusDate;
    }

    public void setAccountStatusDate(String accountStatusDate) {
        this.accountStatusDate = accountStatusDate;
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

    @XmlElement(name = "AccountLimitsGroupName")
    public String getAccountLimitsGroupName() {
        return accountLimitsGroupName;
    }

    public void setAccountLimitsGroupName(String accountLimitsGroupName) {
        this.accountLimitsGroupName = accountLimitsGroupName;
    }

    @XmlElement(name = "AccountLimitsGroupId")
    public String getAccountLimitsGroupId() {
        return accountLimitsGroupId;
    }

    public void setAccountLimitsGroupId(String accountLimitsGroupId) {
        this.accountLimitsGroupId = accountLimitsGroupId;
    }

    @XmlElement(name = "AccountFeeGroupName")
    public String getAccountFeeGroupName() {
        return accountFeeGroupName;
    }

    public void setAccountFeeGroupName(String accountFeeGroupName) {
        this.accountFeeGroupName = accountFeeGroupName;
    }

    @XmlElement(name = "AccountFeeGroupId")
    public String getAccountFeeGroupId() {
        return accountFeeGroupId;
    }

    public void setAccountFeeGroupId(String accountFeeGroupId) {
        this.accountFeeGroupId = accountFeeGroupId;
    }

    @XmlElement(name = "BankAccounts")
    public BankAccounts getBankAccounts() {
        return bankAccounts;
    }

    public void setBankAccounts(BankAccounts bankAccounts) {
        this.bankAccounts = bankAccounts;
    }

    @XmlElement(name = "AvailableBalance")
    public String getAvailableBalance() {
        return availableBalance;
    }

    public void setAvailableBalance(String availableBalance) {
        this.availableBalance = availableBalance;
    }

    @XmlElement(name = "BlockedAmount")
    public String getBlockedAmount() {
        return blockedAmount;
    }

    public void setBlockedAmount(String blockedAmount) {
        this.blockedAmount = blockedAmount;
    }

    @XmlElement(name = "CurrentBalance")
    public String getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(String currentBalance) {
        this.currentBalance = currentBalance;
    }

    @XmlElement(name = "ReservedBalance")
    public String getReservedBalance() {
        return reservedBalance;
    }

    public void setReservedBalance(String reservedBalance) {
        this.reservedBalance = reservedBalance;
    }

    @XmlElement(name = "AccountCurrency")
    public String getAccountCurrency() {
        return accountCurrency;
    }

    public void setAccountCurrency(String accountCurrency) {
        this.accountCurrency = accountCurrency;
    }
}
