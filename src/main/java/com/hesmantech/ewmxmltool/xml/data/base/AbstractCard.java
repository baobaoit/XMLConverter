package com.hesmantech.ewmxmltool.xml.data.base;

import com.hesmantech.ewmxmltool.xml.data.cards.Accounts;

import javax.xml.bind.annotation.XmlElement;

public abstract class AbstractCard {
    protected String fileDate;
    protected String workDate;
    protected String issuerIdentificationNumber;
    protected String programName;
    protected String programId;
    protected String productName;
    protected String productId;
    protected String subProductId;
    protected String holderId;
    protected Accounts accounts;
    protected String cardNumber;
    protected String cardNumberId;
    protected String cardRequestId;
    protected String isVirtual;
    protected String cardExpirationDate;
    protected String cardCreationDate;
    protected String cardActivationDate;
    protected String cardStatusDate;
    protected String cardStatusCode;
    protected String cardStatusCodeDescription;
    protected String cardStatusChangeSource;
    protected String cardStatusChangeReasonCode;
    protected String cardStatusChangeNote;
    protected String cardStatusChangeOriginatorId;
    protected String limitsGroupName;
    protected String limitsGroupId;
    protected String feeGroupName;
    protected String feeGroupId;
    protected String usageGroupName;
    protected String usageGroupId;
    protected String firstName;
    protected String lastName;
    protected String address;
    protected String city;
    protected String state;
    protected String zipCode;
    protected String countryCode;
    protected String countryCodeAlpha;
    protected String countryName;
    protected String dob;
    protected String emailAddress;
    protected String phoneNumber;
    protected String phoneNumberCountryCode;
    protected String applicationIpAddress;
    protected String kycVerification;
    protected String defaultCardCurrency;
    protected String network;
    protected String deliveryTitle;
    protected String deliveryFirstName;
    protected String deliveryLastName;
    protected String deliveryAddress;
    protected String deliveryCity;
    protected String deliveryState;
    protected String deliveryZipCode;
    protected String deliveryCountryCode;
    protected String deliveryCountryName;

    @XmlElement(name = "FileDate")
    public String getFileDate() {
        return fileDate;
    }

    public void setFileDate(String fileDate) {
        this.fileDate = fileDate;
    }

    @XmlElement(name = "WorkDate")
    public String getWorkDate() {
        return workDate;
    }

    public void setWorkDate(String workDate) {
        this.workDate = workDate;
    }

    @XmlElement(name = "IssuerIdentificationNumber")
    public String getIssuerIdentificationNumber() {
        return issuerIdentificationNumber;
    }

    public void setIssuerIdentificationNumber(String issuerIdentificationNumber) {
        this.issuerIdentificationNumber = issuerIdentificationNumber;
    }

    @XmlElement(name = "ProgramName")
    public String getProgramName() {
        return programName;
    }

    public void setProgramName(String programName) {
        this.programName = programName;
    }

    @XmlElement(name = "ProgramId")
    public String getProgramId() {
        return programId;
    }

    public void setProgramId(String programId) {
        this.programId = programId;
    }

    @XmlElement(name = "ProductName")
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @XmlElement(name = "ProductId")
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    @XmlElement(name = "SubProductId")
    public String getSubProductId() {
        return subProductId;
    }

    public void setSubProductId(String subProductId) {
        this.subProductId = subProductId;
    }

    @XmlElement(name = "HolderId")
    public String getHolderId() {
        return holderId;
    }

    public void setHolderId(String holderId) {
        this.holderId = holderId;
    }

    @XmlElement(name = "Accounts")
    public Accounts getAccounts() {
        return accounts;
    }

    public void setAccounts(Accounts accounts) {
        this.accounts = accounts;
    }

    @XmlElement(name = "CardNumber")
    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @XmlElement(name = "CardNumberId")
    public String getCardNumberId() {
        return cardNumberId;
    }

    public void setCardNumberId(String cardNumberId) {
        this.cardNumberId = cardNumberId;
    }

    @XmlElement(name = "CardRequestId")
    public String getCardRequestId() {
        return cardRequestId;
    }

    public void setCardRequestId(String cardRequestId) {
        this.cardRequestId = cardRequestId;
    }

    @XmlElement(name = "IsVirtual")
    public String getIsVirtual() {
        return isVirtual;
    }

    public void setIsVirtual(String isVirtual) {
        this.isVirtual = isVirtual;
    }

    @XmlElement(name = "CardExpirationDate")
    public String getCardExpirationDate() {
        return cardExpirationDate;
    }

    public void setCardExpirationDate(String cardExpirationDate) {
        this.cardExpirationDate = cardExpirationDate;
    }

    @XmlElement(name = "CardCreationDate")
    public String getCardCreationDate() {
        return cardCreationDate;
    }

    public void setCardCreationDate(String cardCreationDate) {
        this.cardCreationDate = cardCreationDate;
    }

    @XmlElement(name = "CardActivationDate")
    public String getCardActivationDate() {
        return cardActivationDate;
    }

    public void setCardActivationDate(String cardActivationDate) {
        this.cardActivationDate = cardActivationDate;
    }

    @XmlElement(name = "CardStatusDate")
    public String getCardStatusDate() {
        return cardStatusDate;
    }

    public void setCardStatusDate(String cardStatusDate) {
        this.cardStatusDate = cardStatusDate;
    }

    @XmlElement(name = "CardStatusCode")
    public String getCardStatusCode() {
        return cardStatusCode;
    }

    public void setCardStatusCode(String cardStatusCode) {
        this.cardStatusCode = cardStatusCode;
    }

    @XmlElement(name = "CardStatusCodeDescription")
    public String getCardStatusCodeDescription() {
        return cardStatusCodeDescription;
    }

    public void setCardStatusCodeDescription(String cardStatusCodeDescription) {
        this.cardStatusCodeDescription = cardStatusCodeDescription;
    }

    @XmlElement(name = "CardStatusChangeSource")
    public String getCardStatusChangeSource() {
        return cardStatusChangeSource;
    }

    public void setCardStatusChangeSource(String cardStatusChangeSource) {
        this.cardStatusChangeSource = cardStatusChangeSource;
    }

    @XmlElement(name = "CardStatusChangeReasonCode")
    public String getCardStatusChangeReasonCode() {
        return cardStatusChangeReasonCode;
    }

    public void setCardStatusChangeReasonCode(String cardStatusChangeReasonCode) {
        this.cardStatusChangeReasonCode = cardStatusChangeReasonCode;
    }

    @XmlElement(name = "CardStatusChangeNote")
    public String getCardStatusChangeNote() {
        return cardStatusChangeNote;
    }

    public void setCardStatusChangeNote(String cardStatusChangeNote) {
        this.cardStatusChangeNote = cardStatusChangeNote;
    }

    @XmlElement(name = "CardStatusChangeOriginatorId")
    public String getCardStatusChangeOriginatorId() {
        return cardStatusChangeOriginatorId;
    }

    public void setCardStatusChangeOriginatorId(String cardStatusChangeOriginatorId) {
        this.cardStatusChangeOriginatorId = cardStatusChangeOriginatorId;
    }

    @XmlElement(name = "LimitsGroupName")
    public String getLimitsGroupName() {
        return limitsGroupName;
    }

    public void setLimitsGroupName(String limitsGroupName) {
        this.limitsGroupName = limitsGroupName;
    }

    @XmlElement(name = "LimitsGroupId")
    public String getLimitsGroupId() {
        return limitsGroupId;
    }

    public void setLimitsGroupId(String limitsGroupId) {
        this.limitsGroupId = limitsGroupId;
    }

    @XmlElement(name = "FeeGroupName")
    public String getFeeGroupName() {
        return feeGroupName;
    }

    public void setFeeGroupName(String feeGroupName) {
        this.feeGroupName = feeGroupName;
    }

    @XmlElement(name = "FeeGroupId")
    public String getFeeGroupId() {
        return feeGroupId;
    }

    public void setFeeGroupId(String feeGroupId) {
        this.feeGroupId = feeGroupId;
    }

    @XmlElement(name = "UsageGroupName")
    public String getUsageGroupName() {
        return usageGroupName;
    }

    public void setUsageGroupName(String usageGroupName) {
        this.usageGroupName = usageGroupName;
    }

    @XmlElement(name = "UsageGroupId")
    public String getUsageGroupId() {
        return usageGroupId;
    }

    public void setUsageGroupId(String usageGroupId) {
        this.usageGroupId = usageGroupId;
    }

    @XmlElement(name = "FirstName")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @XmlElement(name = "LastName")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @XmlElement(name = "Address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @XmlElement(name = "City")
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @XmlElement(name = "State")
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @XmlElement(name = "ZipCode")
    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    @XmlElement(name = "CountryCode")
    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    @XmlElement(name = "CountryCodeAlpha")
    public String getCountryCodeAlpha() {
        return countryCodeAlpha;
    }

    public void setCountryCodeAlpha(String countryCodeAlpha) {
        this.countryCodeAlpha = countryCodeAlpha;
    }

    @XmlElement(name = "CountryName")
    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    @XmlElement(name = "Dob")
    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    @XmlElement(name = "EmailAddress")
    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @XmlElement(name = "PhoneNumber")
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @XmlElement(name = "PhoneNumberCountryCode")
    public String getPhoneNumberCountryCode() {
        return phoneNumberCountryCode;
    }

    public void setPhoneNumberCountryCode(String phoneNumberCountryCode) {
        this.phoneNumberCountryCode = phoneNumberCountryCode;
    }

    @XmlElement(name = "ApplicationIpAddress")
    public String getApplicationIpAddress() {
        return applicationIpAddress;
    }

    public void setApplicationIpAddress(String applicationIpAddress) {
        this.applicationIpAddress = applicationIpAddress;
    }

    @XmlElement(name = "KycVerification")
    public String getKycVerification() {
        return kycVerification;
    }

    public void setKycVerification(String kycVerification) {
        this.kycVerification = kycVerification;
    }

    @XmlElement(name = "DefaultCardCurrency")
    public String getDefaultCardCurrency() {
        return defaultCardCurrency;
    }

    public void setDefaultCardCurrency(String defaultCardCurrency) {
        this.defaultCardCurrency = defaultCardCurrency;
    }

    @XmlElement(name = "Network")
    public String getNetwork() {
        return network;
    }

    public void setNetwork(String network) {
        this.network = network;
    }

    @XmlElement(name = "DeliveryTitle")
    public String getDeliveryTitle() {
        return deliveryTitle;
    }

    public void setDeliveryTitle(String deliveryTitle) {
        this.deliveryTitle = deliveryTitle;
    }

    @XmlElement(name = "DeliveryFirstName")
    public String getDeliveryFirstName() {
        return deliveryFirstName;
    }

    public void setDeliveryFirstName(String deliveryFirstName) {
        this.deliveryFirstName = deliveryFirstName;
    }

    @XmlElement(name = "DeliveryLastName")
    public String getDeliveryLastName() {
        return deliveryLastName;
    }

    public void setDeliveryLastName(String deliveryLastName) {
        this.deliveryLastName = deliveryLastName;
    }

    @XmlElement(name = "DeliveryAddress")
    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    @XmlElement(name = "DeliveryCity")
    public String getDeliveryCity() {
        return deliveryCity;
    }

    public void setDeliveryCity(String deliveryCity) {
        this.deliveryCity = deliveryCity;
    }

    @XmlElement(name = "DeliveryState")
    public String getDeliveryState() {
        return deliveryState;
    }

    public void setDeliveryState(String deliveryState) {
        this.deliveryState = deliveryState;
    }

    @XmlElement(name = "DeliveryZipCode")
    public String getDeliveryZipCode() {
        return deliveryZipCode;
    }

    public void setDeliveryZipCode(String deliveryZipCode) {
        this.deliveryZipCode = deliveryZipCode;
    }

    @XmlElement(name = "DeliveryCountryCode")
    public String getDeliveryCountryCode() {
        return deliveryCountryCode;
    }

    public void setDeliveryCountryCode(String deliveryCountryCode) {
        this.deliveryCountryCode = deliveryCountryCode;
    }

    @XmlElement(name = "DeliveryCountryName")
    public String getDeliveryCountryName() {
        return deliveryCountryName;
    }

    public void setDeliveryCountryName(String deliveryCountryName) {
        this.deliveryCountryName = deliveryCountryName;
    }
}
