package com.hesmantech.ewmxmltool.xml.data.cards;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "BankAccounts")
public class BankAccounts {
    private List<BankAccount> bankAccounts;

    @XmlElement(name = "BankAccount")
    public List<BankAccount> getBankAccounts() {
        return bankAccounts;
    }

    public void setBankAccounts(List<BankAccount> bankAccounts) {
        this.bankAccounts = bankAccounts;
    }
}
