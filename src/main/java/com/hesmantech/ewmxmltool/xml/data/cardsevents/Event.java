package com.hesmantech.ewmxmltool.xml.data.cardsevents;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Event")
public class Event {
    private String type;
    private String date;
    private String oldCardStatus;
    private String cardStatus;
    private String activationDate;
    private String source;
    private String reasonCode;
    private String note;
    private String originatorId;

    @XmlAttribute(name = "Type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @XmlAttribute(name = "Date")
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @XmlAttribute(name = "OldCardStatus")
    public String getOldCardStatus() {
        return oldCardStatus;
    }

    public void setOldCardStatus(String oldCardStatus) {
        this.oldCardStatus = oldCardStatus;
    }

    @XmlAttribute(name = "CardStatus")
    public String getCardStatus() {
        return cardStatus;
    }

    public void setCardStatus(String cardStatus) {
        this.cardStatus = cardStatus;
    }

    @XmlAttribute(name = "ActivationDate")
    public String getActivationDate() {
        return activationDate;
    }

    public void setActivationDate(String activationDate) {
        this.activationDate = activationDate;
    }

    @XmlAttribute(name = "Source")
    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    @XmlAttribute(name = "ReasonCode")
    public String getReasonCode() {
        return reasonCode;
    }

    public void setReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
    }

    @XmlAttribute(name = "Note")
    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @XmlAttribute(name = "OriginatorId")
    public String getOriginatorId() {
        return originatorId;
    }

    public void setOriginatorId(String originatorId) {
        this.originatorId = originatorId;
    }
}
