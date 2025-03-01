package com.hesmantech.ewmxmltool.xml.data.cardstransactions;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "CardsTransactions")
public class CardsTransactions {
    private List<CardTransaction> cardTransactions;

    @XmlElement(name = "CardTransaction")
    public List<CardTransaction> getCardTransactions() {
        return cardTransactions;
    }

    public void setCardTransactions(List<CardTransaction> cardTransactions) {
        this.cardTransactions = cardTransactions;
    }
}
