package com.hesmantech.ewmxmltool.xml.data.currencyexchanges;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Batch")
public class Batch {
    private String id;
    private String externalTransactionId;
    private String externalShortReference;
    private String currencyExchangeSourceId;
    private String currencyCodePair;
    private String fixedSide;
    private String buyCurrencyIson;
    private String sellCurrencyIson;
    private Double buyAmount;
    private Double sellAmount;
    private Double appliedConversionRate;
    private String dateCreated;
    private String dateSettled;
    private String dateConversion;
    private Items items;

    @XmlElement(name = "Id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @XmlElement(name = "ExternalTransactionId")
    public String getExternalTransactionId() {
        return externalTransactionId;
    }

    public void setExternalTransactionId(String externalTransactionId) {
        this.externalTransactionId = externalTransactionId;
    }

    @XmlElement(name = "ExternalShortReference")
    public String getExternalShortReference() {
        return externalShortReference;
    }

    public void setExternalShortReference(String externalShortReference) {
        this.externalShortReference = externalShortReference;
    }

    @XmlElement(name = "CurrencyExchangeSourceId")
    public String getCurrencyExchangeSourceId() {
        return currencyExchangeSourceId;
    }

    public void setCurrencyExchangeSourceId(String currencyExchangeSourceId) {
        this.currencyExchangeSourceId = currencyExchangeSourceId;
    }

    @XmlElement(name = "CurrencyCodePair")
    public String getCurrencyCodePair() {
        return currencyCodePair;
    }

    public void setCurrencyCodePair(String currencyCodePair) {
        this.currencyCodePair = currencyCodePair;
    }

    @XmlElement(name = "FixedSide")
    public String getFixedSide() {
        return fixedSide;
    }

    public void setFixedSide(String fixedSide) {
        this.fixedSide = fixedSide;
    }

    @XmlElement(name = "BuyCurrencyIson")
    public String getBuyCurrencyIson() {
        return buyCurrencyIson;
    }

    public void setBuyCurrencyIson(String buyCurrencyIson) {
        this.buyCurrencyIson = buyCurrencyIson;
    }

    @XmlElement(name = "SellCurrencyIson")
    public String getSellCurrencyIson() {
        return sellCurrencyIson;
    }

    public void setSellCurrencyIson(String sellCurrencyIson) {
        this.sellCurrencyIson = sellCurrencyIson;
    }

    @XmlElement(name = "BuyAmount")
    public Double getBuyAmount() {
        return buyAmount;
    }

    public void setBuyAmount(Double buyAmount) {
        this.buyAmount = buyAmount;
    }

    @XmlElement(name = "SellAmount")
    public Double getSellAmount() {
        return sellAmount;
    }

    public void setSellAmount(Double sellAmount) {
        this.sellAmount = sellAmount;
    }

    @XmlElement(name = "AppliedConversionRate")
    public Double getAppliedConversionRate() {
        return appliedConversionRate;
    }

    public void setAppliedConversionRate(Double appliedConversionRate) {
        this.appliedConversionRate = appliedConversionRate;
    }

    @XmlElement(name = "DateCreated")
    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    @XmlElement(name = "DateSettled")
    public String getDateSettled() {
        return dateSettled;
    }

    public void setDateSettled(String dateSettled) {
        this.dateSettled = dateSettled;
    }

    @XmlElement(name = "DateConversion")
    public String getDateConversion() {
        return dateConversion;
    }

    public void setDateConversion(String dateConversion) {
        this.dateConversion = dateConversion;
    }

    @XmlElement(name = "Items")
    public Items getItems() {
        return items;
    }

    public void setItems(Items items) {
        this.items = items;
    }
}
