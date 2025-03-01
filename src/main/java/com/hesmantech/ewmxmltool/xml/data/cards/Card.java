package com.hesmantech.ewmxmltool.xml.data.cards;

import com.hesmantech.ewmxmltool.xml.data.base.AbstractCard;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Card")
public class Card extends AbstractCard {
    private CardEvents cardEvents;

    @XmlElement(name = "CardEvents")
    public CardEvents getCardEvents() {
        return cardEvents;
    }

    public void setCardEvents(CardEvents cardEvents) {
        this.cardEvents = cardEvents;
    }
}
