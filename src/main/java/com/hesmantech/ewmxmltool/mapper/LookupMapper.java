package com.hesmantech.ewmxmltool.mapper;

import com.hesmantech.ewmxmltool.service.report.data.LookupItem;
import com.hesmantech.ewmxmltool.xml.data.lookups.AccountStatusCode;
import com.hesmantech.ewmxmltool.xml.data.lookups.AccountStatusCodes;
import com.hesmantech.ewmxmltool.xml.data.lookups.ActionType;
import com.hesmantech.ewmxmltool.xml.data.lookups.ActionTypes;
import com.hesmantech.ewmxmltool.xml.data.lookups.AuthorizationCode;
import com.hesmantech.ewmxmltool.xml.data.lookups.AuthorizationCodes;
import com.hesmantech.ewmxmltool.xml.data.lookups.CardEvent;
import com.hesmantech.ewmxmltool.xml.data.lookups.CardEvents;
import com.hesmantech.ewmxmltool.xml.data.lookups.CardStatusCode;
import com.hesmantech.ewmxmltool.xml.data.lookups.CardStatusCodes;
import com.hesmantech.ewmxmltool.xml.data.lookups.EntryModeCode;
import com.hesmantech.ewmxmltool.xml.data.lookups.EntryModeCodes;
import com.hesmantech.ewmxmltool.xml.data.lookups.ExternalPaymentTransactionStatusCode;
import com.hesmantech.ewmxmltool.xml.data.lookups.ExternalPaymentTransactionStatusCodes;
import com.hesmantech.ewmxmltool.xml.data.lookups.ExternalPaymentTransactionType;
import com.hesmantech.ewmxmltool.xml.data.lookups.ExternalPaymentTransactionTypes;
import com.hesmantech.ewmxmltool.xml.data.lookups.FunctionCode;
import com.hesmantech.ewmxmltool.xml.data.lookups.FunctionCodes;
import com.hesmantech.ewmxmltool.xml.data.lookups.LoadSource;
import com.hesmantech.ewmxmltool.xml.data.lookups.LoadSources;
import com.hesmantech.ewmxmltool.xml.data.lookups.LoadType;
import com.hesmantech.ewmxmltool.xml.data.lookups.LoadTypes;
import com.hesmantech.ewmxmltool.xml.data.lookups.Lookups;
import com.hesmantech.ewmxmltool.xml.data.lookups.Network;
import com.hesmantech.ewmxmltool.xml.data.lookups.Networks;
import com.hesmantech.ewmxmltool.xml.data.lookups.RegionType;
import com.hesmantech.ewmxmltool.xml.data.lookups.RegionTypes;
import com.hesmantech.ewmxmltool.xml.data.lookups.RiskAction;
import com.hesmantech.ewmxmltool.xml.data.lookups.RiskActions;
import com.hesmantech.ewmxmltool.xml.data.lookups.SecurityCheck;
import com.hesmantech.ewmxmltool.xml.data.lookups.SecurityChecks;
import com.hesmantech.ewmxmltool.xml.data.lookups.TransactionCode;
import com.hesmantech.ewmxmltool.xml.data.lookups.TransactionCodes;
import com.hesmantech.ewmxmltool.xml.data.lookups.base.AbstractLookupsElementFields;
import com.hesmantech.ewmxmltool.xml.data.lookups.base.LookupsCcAttribute;
import com.hesmantech.ewmxmltool.xml.data.lookups.base.LookupsNameAttribute;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LookupMapper {
    private LookupMapper() {

    }

    public static LookupMapper getInstance() {
        return LookupMapperHolder.INSTANCE;
    }

    /**
     * Converts a Lookups object to a list of LookupItem objects.
     *
     * @param lookups The Lookups object to be converted.
     * @return A list of LookupItem objects representing the lookup data.
     */
    public List<LookupItem> toLookupItemList(Lookups lookups) {
        if (lookups == null) {
            return Collections.emptyList();
        }

        final String issuerIdentificationNumber = lookups.getIssuerIdentificationNumber();

        return Stream.of(mapLookupsToLookupItems(lookups.getCardEvents(), issuerIdentificationNumber, CardEvents::getCardEvents, this::mapCcToLookupItem),
                        mapLookupsToLookupItems(lookups.getRegionTypes(), issuerIdentificationNumber, RegionTypes::getRegionTypes, this::mapCcToLookupItem),
                        mapLookupsToLookupItems(lookups.getActionTypes(), issuerIdentificationNumber, ActionTypes::getActionTypes, this::mapCcToLookupItem),
                        mapLookupsToLookupItems(lookups.getAuthorizationCodes(), issuerIdentificationNumber, AuthorizationCodes::getAuthorizationCodes, this::mapValueToLookupItem),
                        mapLookupsToLookupItems(lookups.getTransactionCodes(), issuerIdentificationNumber, TransactionCodes::getTransactionCodes, this::mapNameAttributeToLookupItem),
                        mapLookupsToLookupItems(lookups.getNetworks(), issuerIdentificationNumber, Networks::getNetworks, this::mapCcToLookupItem),
                        mapLookupsToLookupItems(lookups.getEntryModeCodes(), issuerIdentificationNumber, EntryModeCodes::getEntryModeCodes, this::mapNameAttributeToLookupItem),
                        mapLookupsToLookupItems(lookups.getLoadTypes(), issuerIdentificationNumber, LoadTypes::getLoadTypes, this::mapValueToLookupItem),
                        mapLookupsToLookupItems(lookups.getLoadSources(), issuerIdentificationNumber, LoadSources::getLoadSources, this::mapValueToLookupItem),
                        mapLookupsToLookupItems(lookups.getExternalPaymentTransactionTypes(), issuerIdentificationNumber, ExternalPaymentTransactionTypes::getExternalPaymentTransactionTypes, this::mapValueToLookupItem),
                        mapLookupsToLookupItems(lookups.getExternalPaymentTransactionStatusCodes(), issuerIdentificationNumber, ExternalPaymentTransactionStatusCodes::getExternalPaymentTransactionStatusCodes, this::mapValueToLookupItem),
                        mapLookupsToLookupItems(lookups.getAccountStatusCodes(), issuerIdentificationNumber, AccountStatusCodes::getAccountStatusCodes, this::mapValueToLookupItem),
                        mapLookupsToLookupItems(lookups.getCardStatusCodes(), issuerIdentificationNumber, CardStatusCodes::getCardStatusCodes, this::mapValueToLookupItem),
                        mapLookupsToLookupItems(lookups.getRiskActions(), issuerIdentificationNumber, RiskActions::getRiskActions, this::mapCcToLookupItem),
                        mapLookupsToLookupItems(lookups.getFunctionCodes(), issuerIdentificationNumber, FunctionCodes::getFunctionCodes, this::mapValueToLookupItem),
                        mapLookupsToLookupItems(lookups.getSecurityChecks(), issuerIdentificationNumber, SecurityChecks::getSecurityChecks, this::mapCcToLookupItem))
                .filter(Optional::isPresent).map(Optional::get)
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
    }

    /**
     * Maps various lookup types to a collection of LookupItem objects.
     *
     * @param lookups                    The lookup data to be processed.
     * @param issuerIdentificationNumber The issuer identification number.
     * @param expression                 A function to extract the lookup data.
     * @param mapper                     A function to map individual lookup items.
     * @param <T>                        The type of lookup data.
     * @param <U>                        The type of individual lookup item.
     * @return An Optional containing a collection of LookupItem objects.
     */
    private <T, U> Optional<Collection<? extends LookupItem>> mapLookupsToLookupItems(T lookups, String issuerIdentificationNumber,
                                                                                      Function<T, List<U>> expression,
                                                                                      BiFunction<U, String, LookupItem> mapper) {
        return Optional.ofNullable(lookups)
                .map(expression)
                .map(list -> list.stream()
                        .map(item -> mapper.apply(item, issuerIdentificationNumber))
                        .collect(Collectors.toList()));
    }

    /**
     * Maps LookupsCcAttribute objects to LookupItem objects.
     *
     * @param ccAttribute                The LookupsCcAttribute object to be mapped.
     * @param issuerIdentificationNumber The issuer identification number.
     * @param <T>                        The type of LookupsCcAttribute.
     * @return A LookupItem object representing the mapped data.
     */
    private <T extends LookupsCcAttribute> LookupItem mapCcToLookupItem(T ccAttribute, String issuerIdentificationNumber) {
        LookupItem lookupItem = new LookupItem();
        lookupItem.setIssuerIdentificationNumber(issuerIdentificationNumber);
        final String ccAttributeValue = ccAttribute.getCc();

        LookupField lookupField = LookupField.valueFrom(ccAttribute.getClass());

        switch (lookupField) {
            case CARD_EVENT:
                lookupItem.setCardEventCc(ccAttributeValue);
                break;
            case REGION_TYPE:
                lookupItem.setRegionTypeCc(ccAttributeValue);
                break;
            case ACTION_TYPE:
                lookupItem.setActionTypeCc(ccAttributeValue);
                break;
            case AUTHORIZATION_CODE:
                lookupItem.setAuthorizationCodeCc(ccAttributeValue);
                break;
            case TRANSACTION_CODE:
                lookupItem.setTransactionCodeCc(ccAttributeValue);
                break;
            case NETWORK:
                lookupItem.setNetworkCc(ccAttributeValue);
                break;
            case ENTRY_MODE_CODE:
                lookupItem.setEntryModeCodeCc(ccAttributeValue);
                break;
            case LOAD_TYPE:
                lookupItem.setLoadTypesCc(ccAttributeValue);
                break;
            case LOAD_SOURCE:
                lookupItem.setLoadSourceCc(ccAttributeValue);
                break;
            case EXTERNAL_PAYMENT_TRANSACTION_TYPE:
                lookupItem.setExternalPaymentTransactionTypeCc(ccAttributeValue);
                break;
            case EXTERNAL_PAYMENT_TRANSACTION_STATUS_CODE:
                lookupItem.setExternalPaymentTransactionStatusCodeCc(ccAttributeValue);
                break;
            case ACCOUNT_STATUS_CODE:
                lookupItem.setAccountStatusCodeCc(ccAttributeValue);
                break;
            case CARD_STATUS_CODE:
                lookupItem.setCardStatusCodeCc(ccAttributeValue);
                break;
            case RISK_ACTION:
                lookupItem.setRiskActionCc(ccAttributeValue);
                break;
            case FUNCTION_CODE:
                lookupItem.setFunctionCodeCc(ccAttributeValue);
                break;
            case SECURITY_CHECK:
                lookupItem.setSecurityCheckCc(ccAttributeValue);
                break;
            default:
                break;
        }

        return lookupItem;
    }

    /**
     * Maps LookupsCcAttribute objects with a value to LookupItem objects.
     *
     * @param value                      The LookupsCcAttribute object with a value to be mapped.
     * @param issuerIdentificationNumber The issuer identification number.
     * @param <T>                        The type of LookupsCcAttribute.
     * @return A LookupItem object representing the mapped data.
     */
    private <T extends LookupsCcAttribute> LookupItem mapValueToLookupItem(T value, String issuerIdentificationNumber) {
        LookupItem lookupItem = mapCcToLookupItem(value, issuerIdentificationNumber);
        final String VALUE = ((AbstractLookupsElementFields) value).getValue();

        LookupField lookupField = LookupField.valueFrom(value.getClass());

        switch (lookupField) {
            case AUTHORIZATION_CODE:
                lookupItem.setAuthorizationCodeValue(VALUE);
                break;
            case TRANSACTION_CODE:
                lookupItem.setTransactionCodeValue(VALUE);
                break;
            case ENTRY_MODE_CODE:
                lookupItem.setEntryModeCodeValue(VALUE);
                break;
            case LOAD_TYPE:
                lookupItem.setLoadTypesValue(VALUE);
                break;
            case LOAD_SOURCE:
                lookupItem.setLoadSourceValue(VALUE);
                break;
            case EXTERNAL_PAYMENT_TRANSACTION_TYPE:
                lookupItem.setExternalPaymentTransactionTypeValue(VALUE);
                break;
            case EXTERNAL_PAYMENT_TRANSACTION_STATUS_CODE:
                lookupItem.setExternalPaymentTransactionStatusCodeValue(VALUE);
                break;
            case ACCOUNT_STATUS_CODE:
                lookupItem.setAccountStatusCodeValue(VALUE);
                break;
            case CARD_STATUS_CODE:
                lookupItem.setCardStatusCodeValue(VALUE);
                break;
            case FUNCTION_CODE:
                lookupItem.setFunctionCodeValue(VALUE);
                break;
            default:
                break;
        }

        return lookupItem;
    }

    /**
     * Maps LookupsNameAttribute objects to LookupItem objects.
     *
     * @param nameAttribute              The LookupsNameAttribute object to be mapped.
     * @param issuerIdentificationNumber The issuer identification number.
     * @param <T>                        The type of LookupsNameAttribute.
     * @return A LookupItem object representing the mapped data.
     */
    private <T extends LookupsNameAttribute> LookupItem mapNameAttributeToLookupItem(T nameAttribute, String issuerIdentificationNumber) {
        LookupItem lookupItem = mapValueToLookupItem(((LookupsCcAttribute) nameAttribute), issuerIdentificationNumber);
        final String name = nameAttribute.getName();

        LookupField lookupField = LookupField.valueFrom(nameAttribute.getClass());

        switch (lookupField) {
            case TRANSACTION_CODE:
                lookupItem.setTransactionCodeName(name);
                break;
            case ENTRY_MODE_CODE:
                lookupItem.setEntryModeCodeName(name);
                break;
            default:
                break;
        }

        return lookupItem;
    }

    private enum LookupField {
        NONE(LookupField.class),
        CARD_EVENT(CardEvent.class),
        REGION_TYPE(RegionType.class),
        ACTION_TYPE(ActionType.class),
        AUTHORIZATION_CODE(AuthorizationCode.class),
        TRANSACTION_CODE(TransactionCode.class),
        NETWORK(Network.class),
        ENTRY_MODE_CODE(EntryModeCode.class),
        LOAD_TYPE(LoadType.class),
        LOAD_SOURCE(LoadSource.class),
        EXTERNAL_PAYMENT_TRANSACTION_TYPE(ExternalPaymentTransactionType.class),
        EXTERNAL_PAYMENT_TRANSACTION_STATUS_CODE(ExternalPaymentTransactionStatusCode.class),
        ACCOUNT_STATUS_CODE(AccountStatusCode.class),
        CARD_STATUS_CODE(CardStatusCode.class),
        RISK_ACTION(RiskAction.class),
        FUNCTION_CODE(FunctionCode.class),
        SECURITY_CHECK(SecurityCheck.class);

        private final Class<?> clazz;

        LookupField(Class<?> clazz) {
            this.clazz = clazz;
        }

        public static LookupField valueFrom(Class<?> clazz) {
            for (LookupField value : LookupField.values()) {
                if (value.clazz.equals(clazz)) {
                    return value;
                }
            }
            return NONE;
        }
    }

    private static class LookupMapperHolder {
        private static final LookupMapper INSTANCE = new LookupMapper();
    }
}
