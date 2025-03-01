package com.hesmantech.ewmxmltool.xml.data.accountsactivities;

import com.hesmantech.ewmxmltool.xml.data.base.AbstractActivityTransaction;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "AccountActivity")
public class AccountActivity extends AbstractActivityTransaction {
    private String externalBankAccountId;
    private String bankAccountNumber;
    private String bankAccountSortCode;
    private String bankAccountIban;
    private String bankAccountBic;
    private String balanceAdjustmentType;
    private String countryIson;
    private String reference;
    private String transactionIdentifier;
    private String endToEndIdentifier;

    @XmlElement(name = "ExternalBankAccountId")
    public String getExternalBankAccountId() {
        return externalBankAccountId;
    }

    public void setExternalBankAccountId(String externalBankAccountId) {
        this.externalBankAccountId = externalBankAccountId;
    }

    @XmlElement(name = "BankAccountNumber")
    public String getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(String bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
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

    @XmlElement(name = "BalanceAdjustmentType")
    public String getBalanceAdjustmentType() {
        return balanceAdjustmentType;
    }

    public void setBalanceAdjustmentType(String balanceAdjustmentType) {
        this.balanceAdjustmentType = balanceAdjustmentType;
    }

    @XmlElement(name = "CountryIson")
    public String getCountryIson() {
        return countryIson;
    }

    public void setCountryIson(String countryIson) {
        this.countryIson = countryIson;
    }

    @XmlElement(name = "Reference")
    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    @XmlElement(name = "TransactionIdentifier")
    public String getTransactionIdentifier() {
        return transactionIdentifier;
    }

    public void setTransactionIdentifier(String transactionIdentifier) {
        this.transactionIdentifier = transactionIdentifier;
    }

    @XmlElement(name = "EndToEndIdentifier")
    public String getEndToEndIdentifier() {
        return endToEndIdentifier;
    }

    public void setEndToEndIdentifier(String endToEndIdentifier) {
        this.endToEndIdentifier = endToEndIdentifier;
    }
}
