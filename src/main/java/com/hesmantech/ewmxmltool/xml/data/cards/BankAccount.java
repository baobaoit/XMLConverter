package com.hesmantech.ewmxmltool.xml.data.cards;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "BankAccount")
public class BankAccount {
    private String bankAccountNumber;
    private String bankAccountSortCode;
    private String bankAccountIban;
    private String bankAccountBic;
    private String bankAccountStatus;
    private String bankAccountDirectDebitsIn;
    private String bankAccountDirectDebitsOut;
    private String bankAccountInstantPaymentsIn;
    private String bankAccountInstantPaymentsOut;

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

    @XmlElement(name = "BankAccountStatus")
    public String getBankAccountStatus() {
        return bankAccountStatus;
    }

    public void setBankAccountStatus(String bankAccountStatus) {
        this.bankAccountStatus = bankAccountStatus;
    }

    @XmlElement(name = "BankAccountDirectDebitsIn")
    public String getBankAccountDirectDebitsIn() {
        return bankAccountDirectDebitsIn;
    }

    public void setBankAccountDirectDebitsIn(String bankAccountDirectDebitsIn) {
        this.bankAccountDirectDebitsIn = bankAccountDirectDebitsIn;
    }

    @XmlElement(name = "BankAccountDirectDebitsOut")
    public String getBankAccountDirectDebitsOut() {
        return bankAccountDirectDebitsOut;
    }

    public void setBankAccountDirectDebitsOut(String bankAccountDirectDebitsOut) {
        this.bankAccountDirectDebitsOut = bankAccountDirectDebitsOut;
    }

    @XmlElement(name = "BankAccountInstantPaymentsIn")
    public String getBankAccountInstantPaymentsIn() {
        return bankAccountInstantPaymentsIn;
    }

    public void setBankAccountInstantPaymentsIn(String bankAccountInstantPaymentsIn) {
        this.bankAccountInstantPaymentsIn = bankAccountInstantPaymentsIn;
    }

    @XmlElement(name = "BankAccountInstantPaymentsOut")
    public String getBankAccountInstantPaymentsOut() {
        return bankAccountInstantPaymentsOut;
    }

    public void setBankAccountInstantPaymentsOut(String bankAccountInstantPaymentsOut) {
        this.bankAccountInstantPaymentsOut = bankAccountInstantPaymentsOut;
    }
}
