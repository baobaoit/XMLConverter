package com.hesmantech.ewmxmltool.xml.data.accountssnapshots;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "BankAccount")
public class BankAccount {
    private String bankAccountId;
    private String bankAccountExternalId;
    private String bankAccountStatus;
    private String bankAccountBankProviderId;
    private String bankAccountAccountName;
    private String bankAccountAccountNumber;
    private String bankAccountSortCode;
    private String bankAccountIban;
    private String bankAccountBic;
    private String bankAccountStatusChangeReasonCode;
    private String bankAccountStatusChangeNote;
    private String bankAccountStatusChangeSource;

    @XmlElement(name = "BankAccountId")
    public String getBankAccountId() {
        return bankAccountId;
    }

    public void setBankAccountId(String bankAccountId) {
        this.bankAccountId = bankAccountId;
    }

    @XmlElement(name = "BankAccountExternalId")
    public String getBankAccountExternalId() {
        return bankAccountExternalId;
    }

    public void setBankAccountExternalId(String bankAccountExternalId) {
        this.bankAccountExternalId = bankAccountExternalId;
    }

    @XmlElement(name = "BankAccountStatus")
    public String getBankAccountStatus() {
        return bankAccountStatus;
    }

    public void setBankAccountStatus(String bankAccountStatus) {
        this.bankAccountStatus = bankAccountStatus;
    }

    @XmlElement(name = "BankAccountBankProviderId")
    public String getBankAccountBankProviderId() {
        return bankAccountBankProviderId;
    }

    public void setBankAccountBankProviderId(String bankAccountBankProviderId) {
        this.bankAccountBankProviderId = bankAccountBankProviderId;
    }

    @XmlElement(name = "BankAccountAccountName")
    public String getBankAccountAccountName() {
        return bankAccountAccountName;
    }

    public void setBankAccountAccountName(String bankAccountAccountName) {
        this.bankAccountAccountName = bankAccountAccountName;
    }

    @XmlElement(name = "BankAccountAccountNumber")
    public String getBankAccountAccountNumber() {
        return bankAccountAccountNumber;
    }

    public void setBankAccountAccountNumber(String bankAccountAccountNumber) {
        this.bankAccountAccountNumber = bankAccountAccountNumber;
    }

    @XmlElement(name = "BankAccountSortCode")
    public String getBankAccountSortCode() {
        return bankAccountSortCode;
    }

    public void setBankAccountSortCode(String bankAccountSortCode) {
        this.bankAccountSortCode = bankAccountSortCode;
    }

    @XmlElement(name = "BankAccountIban")
    public String getBankAccountIban() {
        return bankAccountIban;
    }

    public void setBankAccountIban(String bankAccountIban) {
        this.bankAccountIban = bankAccountIban;
    }

    @XmlElement(name = "BankAccountBic")
    public String getBankAccountBic() {
        return bankAccountBic;
    }

    public void setBankAccountBic(String bankAccountBic) {
        this.bankAccountBic = bankAccountBic;
    }

    @XmlElement(name = "BankAccountStatusChangeReasonCode")
    public String getBankAccountStatusChangeReasonCode() {
        return bankAccountStatusChangeReasonCode;
    }

    public void setBankAccountStatusChangeReasonCode(String bankAccountStatusChangeReasonCode) {
        this.bankAccountStatusChangeReasonCode = bankAccountStatusChangeReasonCode;
    }

    @XmlElement(name = "BankAccountStatusChangeNote")
    public String getBankAccountStatusChangeNote() {
        return bankAccountStatusChangeNote;
    }

    public void setBankAccountStatusChangeNote(String bankAccountStatusChangeNote) {
        this.bankAccountStatusChangeNote = bankAccountStatusChangeNote;
    }

    @XmlElement(name = "BankAccountStatusChangeSource")
    public String getBankAccountStatusChangeSource() {
        return bankAccountStatusChangeSource;
    }

    public void setBankAccountStatusChangeSource(String bankAccountStatusChangeSource) {
        this.bankAccountStatusChangeSource = bankAccountStatusChangeSource;
    }
}
