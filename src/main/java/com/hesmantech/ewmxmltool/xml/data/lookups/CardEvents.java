package com.hesmantech.ewmxmltool.xml.data.lookups;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "CardEvents")
public class CardEvents {
    private List<CardEvent> cardEvents;

    @XmlElement(name = "CardEvent")
    public List<CardEvent> getCardEvents() {
        return cardEvents;
    }

    public void setCardEvents(List<CardEvent> cardEvents) {
        this.cardEvents = cardEvents;
    }
}
