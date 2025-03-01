package com.hesmantech.ewmxmltool.xml.data.cardssnapshots;

import com.hesmantech.ewmxmltool.xml.data.base.AbstractCard;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "CardSnapshotItem")
public class CardSnapshot extends AbstractCard {
    private String cardEvent;
    private String activeWallet;

    @XmlElement(name = "CardEvent")
    public String getCardEvent() {
        return cardEvent;
    }

    public void setCardEvent(String cardEvent) {
        this.cardEvent = cardEvent;
    }

    @XmlElement(name = "ActiveWallet")
    public String getActiveWallet() {
        return activeWallet;
    }

    public void setActiveWallet(String activeWallet) {
        this.activeWallet = activeWallet;
    }
}
