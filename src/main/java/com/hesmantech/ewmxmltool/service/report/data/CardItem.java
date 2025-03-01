package com.hesmantech.ewmxmltool.service.report.data;

public class CardItem {
    private String fileDate;
    private String workDate;
    private String issuerIdentificationNumber;
    private String programName;
    private String programId;
    private String productName;
    private String productId;
    private String subProductId;
    private String holderId;

    //region com.hesmantech.ewmxmltool.xml.data.cards.Account fields
    private String accountId;
    private String accountStatus;
    private String accountStatusDate;
    private String accountStatusChangeSource;
    private String accountStatusChangeReasonCode;
    private String accountStatusChangeNote;
    private String accountStatusChangeOriginatorId;
    private String accountLimitsGroupName;
    private String accountLimitsGroupId;
    private String accountFeeGroupName;
    private String accountFeeGroupId;

    //region com.hesmantech.ewmxmltool.xml.data.cards.BankAccount fields
    private String bankAccountNumber;
    private String bankAccountSortCode;
    private String bankAccountIban;
    private String bankAccountBic;
    private String bankAccountStatus;
    private String bankAccountDirectDebitsIn;
    private String bankAccountDirectDebitsOut;
    private String bankAccountInstantPaymentsIn;
    private String bankAccountInstantPaymentsOut;
    //endregion

    private String availableBalance;
    private String blockedAmount;
    private String currentBalance;
    private String reservedBalance;
    private String accountCurrency;
    //endregion

    private String cardNumber;
    private String cardNumberId;
    private String cardRequestId;
    private String isVirtual;
    private String cardExpirationDate;
    private String cardCreationDate;
    private String cardActivationDate;
    private String cardStatusDate;
    private String cardStatusCode;
    private String cardStatusCodeDescription;
    private String cardStatusChangeSource;
    private String cardStatusChangeReasonCode;
    private String cardStatusChangeNote;
    private String cardStatusChangeOriginatorId;
    private String limitsGroupName;
    private String limitsGroupId;
    private String feeGroupName;
    private String feeGroupId;
    private String usageGroupName;
    private String usageGroupId;
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String zipCode;
    private String countryCode;
    private String countryCodeAlpha;
    private String countryName;
    private String dob;
    private String emailAddress;
    private String phoneNumber;
    private String phoneNumberCountryCode;
    private String applicationIpAddress;
    private String kycVerification;
    private String cardEvent;
    private String defaultCardCurrency;
    private String network;
    private String deliveryTitle;
    private String deliveryFirstName;
    private String deliveryLastName;
    private String deliveryAddress;
    private String deliveryCity;
    private String deliveryState;
    private String deliveryZipCode;
    private String deliveryCountryCode;
    private String deliveryCountryName;

    public String getFileDate() {
        return fileDate;
    }

    public void setFileDate(String fileDate) {
        this.fileDate = fileDate;
    }

    public String getWorkDate() {
        return workDate;
    }

    public void setWorkDate(String workDate) {
        this.workDate = workDate;
    }

    public String getIssuerIdentificationNumber() {
        return issuerIdentificationNumber;
    }

    public void setIssuerIdentificationNumber(String issuerIdentificationNumber) {
        this.issuerIdentificationNumber = issuerIdentificationNumber;
    }

    public String getProgramName() {
        return programName;
    }

    public void setProgramName(String programName) {
        this.programName = programName;
    }

    public String getProgramId() {
        return programId;
    }

    public void setProgramId(String programId) {
        this.programId = programId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getSubProductId() {
        return subProductId;
    }

    public void setSubProductId(String subProductId) {
        this.subProductId = subProductId;
    }

    public String getHolderId() {
        return holderId;
    }

    public void setHolderId(String holderId) {
        this.holderId = holderId;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
    }

    public String getAccountStatusDate() {
        return accountStatusDate;
    }

    public void setAccountStatusDate(String accountStatusDate) {
        this.accountStatusDate = accountStatusDate;
    }

    public String getAccountStatusChangeSource() {
        return accountStatusChangeSource;
    }

    public void setAccountStatusChangeSource(String accountStatusChangeSource) {
        this.accountStatusChangeSource = accountStatusChangeSource;
    }

    public String getAccountStatusChangeReasonCode() {
        return accountStatusChangeReasonCode;
    }

    public void setAccountStatusChangeReasonCode(String accountStatusChangeReasonCode) {
        this.accountStatusChangeReasonCode = accountStatusChangeReasonCode;
    }

    public String getAccountStatusChangeNote() {
        return accountStatusChangeNote;
    }

    public void setAccountStatusChangeNote(String accountStatusChangeNote) {
        this.accountStatusChangeNote = accountStatusChangeNote;
    }

    public String getAccountStatusChangeOriginatorId() {
        return accountStatusChangeOriginatorId;
    }

    public void setAccountStatusChangeOriginatorId(String accountStatusChangeOriginatorId) {
        this.accountStatusChangeOriginatorId = accountStatusChangeOriginatorId;
    }

    public String getAccountLimitsGroupName() {
        return accountLimitsGroupName;
    }

    public void setAccountLimitsGroupName(String accountLimitsGroupName) {
        this.accountLimitsGroupName = accountLimitsGroupName;
    }

    public String getAccountLimitsGroupId() {
        return accountLimitsGroupId;
    }

    public void setAccountLimitsGroupId(String accountLimitsGroupId) {
        this.accountLimitsGroupId = accountLimitsGroupId;
    }

    public String getAccountFeeGroupName() {
        return accountFeeGroupName;
    }

    public void setAccountFeeGroupName(String accountFeeGroupName) {
        this.accountFeeGroupName = accountFeeGroupName;
    }

    public String getAccountFeeGroupId() {
        return accountFeeGroupId;
    }

    public void setAccountFeeGroupId(String accountFeeGroupId) {
        this.accountFeeGroupId = accountFeeGroupId;
    }

    public String getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(String bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    public String getBankAccountSortCode() {
        return bankAccountSortCode;
    }

    public void setBankAccountSortCode(String bankAccountSortCode) {
        this.bankAccountSortCode = bankAccountSortCode;
    }

    public String getBankAccountIban() {
        return bankAccountIban;
    }

    public void setBankAccountIban(String bankAccountIban) {
        this.bankAccountIban = bankAccountIban;
    }

    public String getBankAccountBic() {
        return bankAccountBic;
    }

    public void setBankAccountBic(String bankAccountBic) {
        this.bankAccountBic = bankAccountBic;
    }

    public String getBankAccountStatus() {
        return bankAccountStatus;
    }

    public void setBankAccountStatus(String bankAccountStatus) {
        this.bankAccountStatus = bankAccountStatus;
    }

    public String getBankAccountDirectDebitsIn() {
        return bankAccountDirectDebitsIn;
    }

    public void setBankAccountDirectDebitsIn(String bankAccountDirectDebitsIn) {
        this.bankAccountDirectDebitsIn = bankAccountDirectDebitsIn;
    }

    public String getBankAccountDirectDebitsOut() {
        return bankAccountDirectDebitsOut;
    }

    public void setBankAccountDirectDebitsOut(String bankAccountDirectDebitsOut) {
        this.bankAccountDirectDebitsOut = bankAccountDirectDebitsOut;
    }

    public String getBankAccountInstantPaymentsIn() {
        return bankAccountInstantPaymentsIn;
    }

    public void setBankAccountInstantPaymentsIn(String bankAccountInstantPaymentsIn) {
        this.bankAccountInstantPaymentsIn = bankAccountInstantPaymentsIn;
    }

    public String getBankAccountInstantPaymentsOut() {
        return bankAccountInstantPaymentsOut;
    }

    public void setBankAccountInstantPaymentsOut(String bankAccountInstantPaymentsOut) {
        this.bankAccountInstantPaymentsOut = bankAccountInstantPaymentsOut;
    }

    public String getAvailableBalance() {
        return availableBalance;
    }

    public void setAvailableBalance(String availableBalance) {
        this.availableBalance = availableBalance;
    }

    public String getBlockedAmount() {
        return blockedAmount;
    }

    public void setBlockedAmount(String blockedAmount) {
        this.blockedAmount = blockedAmount;
    }

    public String getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(String currentBalance) {
        this.currentBalance = currentBalance;
    }

    public String getReservedBalance() {
        return reservedBalance;
    }

    public void setReservedBalance(String reservedBalance) {
        this.reservedBalance = reservedBalance;
    }

    public String getAccountCurrency() {
        return accountCurrency;
    }

    public void setAccountCurrency(String accountCurrency) {
        this.accountCurrency = accountCurrency;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardNumberId() {
        return cardNumberId;
    }

    public void setCardNumberId(String cardNumberId) {
        this.cardNumberId = cardNumberId;
    }

    public String getCardRequestId() {
        return cardRequestId;
    }

    public void setCardRequestId(String cardRequestId) {
        this.cardRequestId = cardRequestId;
    }

    public String getIsVirtual() {
        return isVirtual;
    }

    public void setIsVirtual(String isVirtual) {
        this.isVirtual = isVirtual;
    }

    public String getCardExpirationDate() {
        return cardExpirationDate;
    }

    public void setCardExpirationDate(String cardExpirationDate) {
        this.cardExpirationDate = cardExpirationDate;
    }

    public String getCardCreationDate() {
        return cardCreationDate;
    }

    public void setCardCreationDate(String cardCreationDate) {
        this.cardCreationDate = cardCreationDate;
    }

    public String getCardActivationDate() {
        return cardActivationDate;
    }

    public void setCardActivationDate(String cardActivationDate) {
        this.cardActivationDate = cardActivationDate;
    }

    public String getCardStatusDate() {
        return cardStatusDate;
    }

    public void setCardStatusDate(String cardStatusDate) {
        this.cardStatusDate = cardStatusDate;
    }

    public String getCardStatusCode() {
        return cardStatusCode;
    }

    public void setCardStatusCode(String cardStatusCode) {
        this.cardStatusCode = cardStatusCode;
    }

    public String getCardStatusCodeDescription() {
        return cardStatusCodeDescription;
    }

    public void setCardStatusCodeDescription(String cardStatusCodeDescription) {
        this.cardStatusCodeDescription = cardStatusCodeDescription;
    }

    public String getCardStatusChangeSource() {
        return cardStatusChangeSource;
    }

    public void setCardStatusChangeSource(String cardStatusChangeSource) {
        this.cardStatusChangeSource = cardStatusChangeSource;
    }

    public String getCardStatusChangeReasonCode() {
        return cardStatusChangeReasonCode;
    }

    public void setCardStatusChangeReasonCode(String cardStatusChangeReasonCode) {
        this.cardStatusChangeReasonCode = cardStatusChangeReasonCode;
    }

    public String getCardStatusChangeNote() {
        return cardStatusChangeNote;
    }

    public void setCardStatusChangeNote(String cardStatusChangeNote) {
        this.cardStatusChangeNote = cardStatusChangeNote;
    }

    public String getCardStatusChangeOriginatorId() {
        return cardStatusChangeOriginatorId;
    }

    public void setCardStatusChangeOriginatorId(String cardStatusChangeOriginatorId) {
        this.cardStatusChangeOriginatorId = cardStatusChangeOriginatorId;
    }

    public String getLimitsGroupName() {
        return limitsGroupName;
    }

    public void setLimitsGroupName(String limitsGroupName) {
        this.limitsGroupName = limitsGroupName;
    }

    public String getLimitsGroupId() {
        return limitsGroupId;
    }

    public void setLimitsGroupId(String limitsGroupId) {
        this.limitsGroupId = limitsGroupId;
    }

    public String getFeeGroupName() {
        return feeGroupName;
    }

    public void setFeeGroupName(String feeGroupName) {
        this.feeGroupName = feeGroupName;
    }

    public String getFeeGroupId() {
        return feeGroupId;
    }

    public void setFeeGroupId(String feeGroupId) {
        this.feeGroupId = feeGroupId;
    }

    public String getUsageGroupName() {
        return usageGroupName;
    }

    public void setUsageGroupName(String usageGroupName) {
        this.usageGroupName = usageGroupName;
    }

    public String getUsageGroupId() {
        return usageGroupId;
    }

    public void setUsageGroupId(String usageGroupId) {
        this.usageGroupId = usageGroupId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCountryCodeAlpha() {
        return countryCodeAlpha;
    }

    public void setCountryCodeAlpha(String countryCodeAlpha) {
        this.countryCodeAlpha = countryCodeAlpha;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumberCountryCode() {
        return phoneNumberCountryCode;
    }

    public void setPhoneNumberCountryCode(String phoneNumberCountryCode) {
        this.phoneNumberCountryCode = phoneNumberCountryCode;
    }

    public String getApplicationIpAddress() {
        return applicationIpAddress;
    }

    public void setApplicationIpAddress(String applicationIpAddress) {
        this.applicationIpAddress = applicationIpAddress;
    }

    public String getKycVerification() {
        return kycVerification;
    }

    public void setKycVerification(String kycVerification) {
        this.kycVerification = kycVerification;
    }

    public String getCardEvent() {
        return cardEvent;
    }

    public void setCardEvent(String cardEvent) {
        this.cardEvent = cardEvent;
    }

    public String getDefaultCardCurrency() {
        return defaultCardCurrency;
    }

    public void setDefaultCardCurrency(String defaultCardCurrency) {
        this.defaultCardCurrency = defaultCardCurrency;
    }

    public String getNetwork() {
        return network;
    }

    public void setNetwork(String network) {
        this.network = network;
    }

    public String getDeliveryTitle() {
        return deliveryTitle;
    }

    public void setDeliveryTitle(String deliveryTitle) {
        this.deliveryTitle = deliveryTitle;
    }

    public String getDeliveryFirstName() {
        return deliveryFirstName;
    }

    public void setDeliveryFirstName(String deliveryFirstName) {
        this.deliveryFirstName = deliveryFirstName;
    }

    public String getDeliveryLastName() {
        return deliveryLastName;
    }

    public void setDeliveryLastName(String deliveryLastName) {
        this.deliveryLastName = deliveryLastName;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public String getDeliveryCity() {
        return deliveryCity;
    }

    public void setDeliveryCity(String deliveryCity) {
        this.deliveryCity = deliveryCity;
    }

    public String getDeliveryState() {
        return deliveryState;
    }

    public void setDeliveryState(String deliveryState) {
        this.deliveryState = deliveryState;
    }

    public String getDeliveryZipCode() {
        return deliveryZipCode;
    }

    public void setDeliveryZipCode(String deliveryZipCode) {
        this.deliveryZipCode = deliveryZipCode;
    }

    public String getDeliveryCountryCode() {
        return deliveryCountryCode;
    }

    public void setDeliveryCountryCode(String deliveryCountryCode) {
        this.deliveryCountryCode = deliveryCountryCode;
    }

    public String getDeliveryCountryName() {
        return deliveryCountryName;
    }

    public void setDeliveryCountryName(String deliveryCountryName) {
        this.deliveryCountryName = deliveryCountryName;
    }
}
