package com.hesmantech.ewmxmltool.xml.data.lookups;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "CardStatusCodes")
public class CardStatusCodes {
    private List<CardStatusCode> cardStatusCodes;

    @XmlElement(name = "CardStatusCode")
    public List<CardStatusCode> getCardStatusCodes() {
        return cardStatusCodes;
    }

    public void setCardStatusCodes(List<CardStatusCode> cardStatusCodes) {
        this.cardStatusCodes = cardStatusCodes;
    }
}
