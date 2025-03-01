package com.hesmantech.ewmxmltool.xml.data.cards;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "Accounts")
public class Accounts {
    private List<Account> accounts;

    @XmlElement(name = "Account")
    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }
}
