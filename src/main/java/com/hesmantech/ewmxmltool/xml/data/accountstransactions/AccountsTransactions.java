package com.hesmantech.ewmxmltool.xml.data.accountstransactions;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "AccountsTransactions")
public class AccountsTransactions {
    private List<AccountTransaction> accountTransactions;

    @XmlElement(name = "AccountTransaction")
    public List<AccountTransaction> getAccountTransactions() {
        return accountTransactions;
    }

    public void setAccountTransactions(List<AccountTransaction> accountTransactions) {
        this.accountTransactions = accountTransactions;
    }
}
