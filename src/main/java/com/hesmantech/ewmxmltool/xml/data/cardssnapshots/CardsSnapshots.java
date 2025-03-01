package com.hesmantech.ewmxmltool.xml.data.cardssnapshots;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "CardsSnapshots")
public class CardsSnapshots {
    private List<CardSnapshot> cardSnapshots;

    @XmlElement(name = "CardSnapshot")
    public List<CardSnapshot> getCardSnapshots() {
        return cardSnapshots;
    }

    public void setCardSnapshots(List<CardSnapshot> cardSnapshots) {
        this.cardSnapshots = cardSnapshots;
    }
}
