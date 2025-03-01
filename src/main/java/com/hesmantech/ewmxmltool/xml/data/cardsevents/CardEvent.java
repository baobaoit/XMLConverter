package com.hesmantech.ewmxmltool.xml.data.cardsevents;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "CardEvent")
public class CardEvent {
    private String cardId;
    private String cardProduct;
    private Event event;

    @XmlElement(name = "CardId")
    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    @XmlElement(name = "CardProduct")
    public String getCardProduct() {
        return cardProduct;
    }

    public void setCardProduct(String cardProduct) {
        this.cardProduct = cardProduct;
    }

    @XmlElement(name = "Event")
    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }
}
