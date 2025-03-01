package com.hesmantech.ewmxmltool.xml.data.currencyexchanges;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Item")
public class Item {
    private String authorizeId;
    private String actualAuthorizeId;
    private String transactionId;
    private String clearingFileId;
    private String programId;
    private Double conversionRate;
    private String fixedSide;
    private Double amount;
    private String transLink;

    @XmlElement(name = "AuthorizeId")
    public String getAuthorizeId() {
        return authorizeId;
    }

    public void setAuthorizeId(String authorizeId) {
        this.authorizeId = authorizeId;
    }

    @XmlElement(name = "ActualAuthorizeId")
    public String getActualAuthorizeId() {
        return actualAuthorizeId;
    }

    public void setActualAuthorizeId(String actualAuthorizeId) {
        this.actualAuthorizeId = actualAuthorizeId;
    }

    @XmlElement(name = "TransactionId")
    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    @XmlElement(name = "ClearingFileId")
    public String getClearingFileId() {
        return clearingFileId;
    }

    public void setClearingFileId(String clearingFileId) {
        this.clearingFileId = clearingFileId;
    }

    @XmlElement(name = "ProgramId")
    public String getProgramId() {
        return programId;
    }

    public void setProgramId(String programId) {
        this.programId = programId;
    }

    @XmlElement(name = "ConversionRate")
    public Double getConversionRate() {
        return conversionRate;
    }

    public void setConversionRate(Double conversionRate) {
        this.conversionRate = conversionRate;
    }

    @XmlElement(name = "FixedSide")
    public String getFixedSide() {
        return fixedSide;
    }

    public void setFixedSide(String fixedSide) {
        this.fixedSide = fixedSide;
    }

    @XmlElement(name = "Amount")
    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @XmlElement(name = "TransLink")
    public String getTransLink() {
        return transLink;
    }

    public void setTransLink(String transLink) {
        this.transLink = transLink;
    }
}
