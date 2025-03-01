package com.hesmantech.ewmxmltool.xml.data.accounts;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "Cards")
public class Cards {
    private List<Card> cards;

    @XmlElement(name = "Card")
    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }
}
