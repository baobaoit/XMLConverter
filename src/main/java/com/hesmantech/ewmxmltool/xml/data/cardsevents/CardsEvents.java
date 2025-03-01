package com.hesmantech.ewmxmltool.xml.data.cardsevents;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "CardsEvents")
public class CardsEvents {
    private List<CardEvent> cardEvents;

    @XmlElement(name = "CardEvent")
    public List<CardEvent> getCardEvents() {
        return cardEvents;
    }

    public void setCardEvents(List<CardEvent> cardEvents) {
        this.cardEvents = cardEvents;
    }
}
