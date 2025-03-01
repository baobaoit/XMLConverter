package com.hesmantech.ewmxmltool.xml.data.accounts;

import com.hesmantech.ewmxmltool.xml.data.base.AbstractAccount;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Account")
public class Account extends AbstractAccount {
    private Double reservedBalance;
    private String accountStatusDate;
    private Cards cards;

    @XmlElement(name = "ReservedBalance")
    public Double getReservedBalance() {
        return reservedBalance;
    }

    public void setReservedBalance(Double reservedBalance) {
        this.reservedBalance = reservedBalance;
    }

    @XmlElement(name = "AccountStatusDate")
    public String getAccountStatusDate() {
        return accountStatusDate;
    }

    public void setAccountStatusDate(String accountStatusDate) {
        this.accountStatusDate = accountStatusDate;
    }

    @XmlElement(name = "Cards")
    public Cards getCards() {
        return cards;
    }

    public void setCards(Cards cards) {
        this.cards = cards;
    }
}
