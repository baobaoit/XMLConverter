package com.hesmantech.ewmxmltool.xml.data.accounts;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Card")
public class Card {
    private String cardId;
    private String virtual;
    private String primary;
    private String cardProductId;
    private String cardProgramId;
    private String referenceId;
    private String holderId;
    private String currencyIson;
    private String status;
    private String statusDate;
    private String statusChangeSource;
    private String statusChangeReasonCode;
    private String statusChangeNote;
    private String statusChangeOriginatorId;
    private String expiryDate;

    @XmlElement(name = "CardId")
    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    @XmlElement(name = "Virtual")
    public String getVirtual() {
        return virtual;
    }

    public void setVirtual(String virtual) {
        this.virtual = virtual;
    }

    @XmlElement(name = "Primary")
    public String getPrimary() {
        return primary;
    }

    public void setPrimary(String primary) {
        this.primary = primary;
    }

    @XmlElement(name = "CardProductId")
    public String getCardProductId() {
        return cardProductId;
    }

    public void setCardProductId(String cardProductId) {
        this.cardProductId = cardProductId;
    }

    @XmlElement(name = "CardProgramId")
    public String getCardProgramId() {
        return cardProgramId;
    }

    public void setCardProgramId(String cardProgramId) {
        this.cardProgramId = cardProgramId;
    }

    @XmlElement(name = "ReferenceId")
    public String getReferenceId() {
        return referenceId;
    }

    public void setReferenceId(String referenceId) {
        this.referenceId = referenceId;
    }

    @XmlElement(name = "HolderId")
    public String getHolderId() {
        return holderId;
    }

    public void setHolderId(String holderId) {
        this.holderId = holderId;
    }

    @XmlElement(name = "CurrencyIson")
    public String getCurrencyIson() {
        return currencyIson;
    }

    public void setCurrencyIson(String currencyIson) {
        this.currencyIson = currencyIson;
    }

    @XmlElement(name = "Status")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @XmlElement(name = "StatusDate")
    public String getStatusDate() {
        return statusDate;
    }

    public void setStatusDate(String statusDate) {
        this.statusDate = statusDate;
    }

    @XmlElement(name = "StatusChangeSource")
    public String getStatusChangeSource() {
        return statusChangeSource;
    }

    public void setStatusChangeSource(String statusChangeSource) {
        this.statusChangeSource = statusChangeSource;
    }

    @XmlElement(name = "StatusChangeReasonCode")
    public String getStatusChangeReasonCode() {
        return statusChangeReasonCode;
    }

    public void setStatusChangeReasonCode(String statusChangeReasonCode) {
        this.statusChangeReasonCode = statusChangeReasonCode;
    }

    @XmlElement(name = "StatusChangeNote")
    public String getStatusChangeNote() {
        return statusChangeNote;
    }

    public void setStatusChangeNote(String statusChangeNote) {
        this.statusChangeNote = statusChangeNote;
    }

    @XmlElement(name = "StatusChangeOriginatorId")
    public String getStatusChangeOriginatorId() {
        return statusChangeOriginatorId;
    }

    public void setStatusChangeOriginatorId(String statusChangeOriginatorId) {
        this.statusChangeOriginatorId = statusChangeOriginatorId;
    }

    @XmlElement(name = "ExpiryDate")
    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }
}
