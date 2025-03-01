package com.hesmantech.ewmxmltool.xml.data.common;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "SecurityChecks")
public class SecurityChecks {
    private String cardExpirationDatePresent;
    private String onlinePIN;
    private String offlinePIN;
    private String threeDomainSecure;
    private String cvv2;
    private String magneticStripe;
    private String chipData;
    private String AVS;
    private String phoneNumber;
    private String signature;

    @XmlElement(name = "CardExpirationDatePresent")
    public String getCardExpirationDatePresent() {
        return cardExpirationDatePresent;
    }

    public void setCardExpirationDatePresent(String cardExpirationDatePresent) {
        this.cardExpirationDatePresent = cardExpirationDatePresent;
    }

    @XmlElement(name = "OnlinePIN")
    public String getOnlinePIN() {
        return onlinePIN;
    }

    public void setOnlinePIN(String onlinePIN) {
        this.onlinePIN = onlinePIN;
    }

    @XmlElement(name = "OfflinePIN")
    public String getOfflinePIN() {
        return offlinePIN;
    }

    public void setOfflinePIN(String offlinePIN) {
        this.offlinePIN = offlinePIN;
    }

    @XmlElement(name = "ThreeDomainSecure")
    public String getThreeDomainSecure() {
        return threeDomainSecure;
    }

    public void setThreeDomainSecure(String threeDomainSecure) {
        this.threeDomainSecure = threeDomainSecure;
    }

    @XmlElement(name = "Cvv2")
    public String getCvv2() {
        return cvv2;
    }

    public void setCvv2(String cvv2) {
        this.cvv2 = cvv2;
    }

    @XmlElement(name = "MagneticStripe")
    public String getMagneticStripe() {
        return magneticStripe;
    }

    public void setMagneticStripe(String magneticStripe) {
        this.magneticStripe = magneticStripe;
    }

    @XmlElement(name = "ChipData")
    public String getChipData() {
        return chipData;
    }

    public void setChipData(String chipData) {
        this.chipData = chipData;
    }

    @XmlElement(name = "AVS")
    public String getAVS() {
        return AVS;
    }

    public void setAVS(String AVS) {
        this.AVS = AVS;
    }

    @XmlElement(name = "PhoneNumber")
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @XmlElement(name = "Signature")
    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }
}
