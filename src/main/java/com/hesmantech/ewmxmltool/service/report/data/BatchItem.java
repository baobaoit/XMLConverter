package com.hesmantech.ewmxmltool.service.report.data;

public class BatchItem {
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

    //region com.hesmantech.ewmxmltool.xml.data.currencyexchanges.Item fields
    private String itemAuthorizeId;
    private String itemActualAuthorizeId;
    private String itemTransactionId;
    private String itemClearingFileId;
    private String itemProgramId;
    private Double itemConversionRate;
    private String itemFixedSide;
    private Double itemAmount;
    private String itemTransLink;
    //endregion

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getExternalTransactionId() {
        return externalTransactionId;
    }

    public void setExternalTransactionId(String externalTransactionId) {
        this.externalTransactionId = externalTransactionId;
    }

    public String getExternalShortReference() {
        return externalShortReference;
    }

    public void setExternalShortReference(String externalShortReference) {
        this.externalShortReference = externalShortReference;
    }

    public String getCurrencyExchangeSourceId() {
        return currencyExchangeSourceId;
    }

    public void setCurrencyExchangeSourceId(String currencyExchangeSourceId) {
        this.currencyExchangeSourceId = currencyExchangeSourceId;
    }

    public String getCurrencyCodePair() {
        return currencyCodePair;
    }

    public void setCurrencyCodePair(String currencyCodePair) {
        this.currencyCodePair = currencyCodePair;
    }

    public String getFixedSide() {
        return fixedSide;
    }

    public void setFixedSide(String fixedSide) {
        this.fixedSide = fixedSide;
    }

    public String getBuyCurrencyIson() {
        return buyCurrencyIson;
    }

    public void setBuyCurrencyIson(String buyCurrencyIson) {
        this.buyCurrencyIson = buyCurrencyIson;
    }

    public String getSellCurrencyIson() {
        return sellCurrencyIson;
    }

    public void setSellCurrencyIson(String sellCurrencyIson) {
        this.sellCurrencyIson = sellCurrencyIson;
    }

    public Double getBuyAmount() {
        return buyAmount;
    }

    public void setBuyAmount(Double buyAmount) {
        this.buyAmount = buyAmount;
    }

    public Double getSellAmount() {
        return sellAmount;
    }

    public void setSellAmount(Double sellAmount) {
        this.sellAmount = sellAmount;
    }

    public Double getAppliedConversionRate() {
        return appliedConversionRate;
    }

    public void setAppliedConversionRate(Double appliedConversionRate) {
        this.appliedConversionRate = appliedConversionRate;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getDateSettled() {
        return dateSettled;
    }

    public void setDateSettled(String dateSettled) {
        this.dateSettled = dateSettled;
    }

    public String getDateConversion() {
        return dateConversion;
    }

    public void setDateConversion(String dateConversion) {
        this.dateConversion = dateConversion;
    }

    public String getItemAuthorizeId() {
        return itemAuthorizeId;
    }

    public void setItemAuthorizeId(String itemAuthorizeId) {
        this.itemAuthorizeId = itemAuthorizeId;
    }

    public String getItemActualAuthorizeId() {
        return itemActualAuthorizeId;
    }

    public void setItemActualAuthorizeId(String itemActualAuthorizeId) {
        this.itemActualAuthorizeId = itemActualAuthorizeId;
    }

    public String getItemTransactionId() {
        return itemTransactionId;
    }

    public void setItemTransactionId(String itemTransactionId) {
        this.itemTransactionId = itemTransactionId;
    }

    public String getItemClearingFileId() {
        return itemClearingFileId;
    }

    public void setItemClearingFileId(String itemClearingFileId) {
        this.itemClearingFileId = itemClearingFileId;
    }

    public String getItemProgramId() {
        return itemProgramId;
    }

    public void setItemProgramId(String itemProgramId) {
        this.itemProgramId = itemProgramId;
    }

    public Double getItemConversionRate() {
        return itemConversionRate;
    }

    public void setItemConversionRate(Double itemConversionRate) {
        this.itemConversionRate = itemConversionRate;
    }

    public String getItemFixedSide() {
        return itemFixedSide;
    }

    public void setItemFixedSide(String itemFixedSide) {
        this.itemFixedSide = itemFixedSide;
    }

    public Double getItemAmount() {
        return itemAmount;
    }

    public void setItemAmount(Double itemAmount) {
        this.itemAmount = itemAmount;
    }

    public String getItemTransLink() {
        return itemTransLink;
    }

    public void setItemTransLink(String itemTransLink) {
        this.itemTransLink = itemTransLink;
    }
}
