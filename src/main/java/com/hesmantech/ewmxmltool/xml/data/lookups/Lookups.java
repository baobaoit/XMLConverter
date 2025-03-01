package com.hesmantech.ewmxmltool.xml.data.lookups;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Lookups")
public class Lookups {
    private String issuerIdentificationNumber;
    private AuthorizationCodes authorizationCodes;
    private CardEvents cardEvents;
    private RegionTypes regionTypes;
    private ActionTypes actionTypes;
    private TransactionCodes transactionCodes;
    private Networks networks;
    private EntryModeCodes entryModeCodes;
    private LoadTypes loadTypes;
    private LoadSources loadSources;
    private ExternalPaymentTransactionTypes externalPaymentTransactionTypes;
    private ExternalPaymentTransactionStatusCodes externalPaymentTransactionStatusCodes;
    private AccountStatusCodes accountStatusCodes;
    private CardStatusCodes cardStatusCodes;
    private RiskActions riskActions;
    private FunctionCodes functionCodes;
    private SecurityChecks securityChecks;

    @XmlElement(name = "IssuerIdentificationNumber")
    public String getIssuerIdentificationNumber() {
        return issuerIdentificationNumber;
    }

    public void setIssuerIdentificationNumber(String issuerIdentificationNumber) {
        this.issuerIdentificationNumber = issuerIdentificationNumber;
    }

    @XmlElement(name = "AuthorizationCodes")
    public AuthorizationCodes getAuthorizationCodes() {
        return authorizationCodes;
    }

    public void setAuthorizationCodes(AuthorizationCodes authorizationCodes) {
        this.authorizationCodes = authorizationCodes;
    }

    @XmlElement(name = "CardEvents")
    public CardEvents getCardEvents() {
        return cardEvents;
    }

    public void setCardEvents(CardEvents cardEvents) {
        this.cardEvents = cardEvents;
    }

    @XmlElement(name = "RegionTypes")
    public RegionTypes getRegionTypes() {
        return regionTypes;
    }

    public void setRegionTypes(RegionTypes regionTypes) {
        this.regionTypes = regionTypes;
    }

    @XmlElement(name = "ActionTypes")
    public ActionTypes getActionTypes() {
        return actionTypes;
    }

    public void setActionTypes(ActionTypes actionTypes) {
        this.actionTypes = actionTypes;
    }

    @XmlElement(name = "TransactionCodes")
    public TransactionCodes getTransactionCodes() {
        return transactionCodes;
    }

    public void setTransactionCodes(TransactionCodes transactionCodes) {
        this.transactionCodes = transactionCodes;
    }

    @XmlElement(name = "Networks")
    public Networks getNetworks() {
        return networks;
    }

    public void setNetworks(Networks networks) {
        this.networks = networks;
    }

    @XmlElement(name = "EntryModeCodes")
    public EntryModeCodes getEntryModeCodes() {
        return entryModeCodes;
    }

    public void setEntryModeCodes(EntryModeCodes entryModeCodes) {
        this.entryModeCodes = entryModeCodes;
    }

    @XmlElement(name = "LoadTypes")
    public LoadTypes getLoadTypes() {
        return loadTypes;
    }

    public void setLoadTypes(LoadTypes loadTypes) {
        this.loadTypes = loadTypes;
    }

    @XmlElement(name = "LoadSources")
    public LoadSources getLoadSources() {
        return loadSources;
    }

    public void setLoadSources(LoadSources loadSources) {
        this.loadSources = loadSources;
    }

    @XmlElement(name = "ExternalPaymentTransactionTypes")
    public ExternalPaymentTransactionTypes getExternalPaymentTransactionTypes() {
        return externalPaymentTransactionTypes;
    }

    public void setExternalPaymentTransactionTypes(ExternalPaymentTransactionTypes externalPaymentTransactionTypes) {
        this.externalPaymentTransactionTypes = externalPaymentTransactionTypes;
    }

    @XmlElement(name = "ExternalPaymentTransactionStatusCodes")
    public ExternalPaymentTransactionStatusCodes getExternalPaymentTransactionStatusCodes() {
        return externalPaymentTransactionStatusCodes;
    }

    public void setExternalPaymentTransactionStatusCodes(ExternalPaymentTransactionStatusCodes externalPaymentTransactionStatusCodes) {
        this.externalPaymentTransactionStatusCodes = externalPaymentTransactionStatusCodes;
    }

    @XmlElement(name = "AccountStatusCodes")
    public AccountStatusCodes getAccountStatusCodes() {
        return accountStatusCodes;
    }

    public void setAccountStatusCodes(AccountStatusCodes accountStatusCodes) {
        this.accountStatusCodes = accountStatusCodes;
    }

    @XmlElement(name = "CardStatusCodes")
    public CardStatusCodes getCardStatusCodes() {
        return cardStatusCodes;
    }

    public void setCardStatusCodes(CardStatusCodes cardStatusCodes) {
        this.cardStatusCodes = cardStatusCodes;
    }

    @XmlElement(name = "RiskActions")
    public RiskActions getRiskActions() {
        return riskActions;
    }

    public void setRiskActions(RiskActions riskActions) {
        this.riskActions = riskActions;
    }

    @XmlElement(name = "FunctionCodes")
    public FunctionCodes getFunctionCodes() {
        return functionCodes;
    }

    public void setFunctionCodes(FunctionCodes functionCodes) {
        this.functionCodes = functionCodes;
    }

    @XmlElement(name = "SecurityChecks")
    public SecurityChecks getSecurityChecks() {
        return securityChecks;
    }

    public void setSecurityChecks(SecurityChecks securityChecks) {
        this.securityChecks = securityChecks;
    }
}
