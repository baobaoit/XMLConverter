package com.hesmantech.ewmxmltool.service.report.data.mapper;

import net.sf.jasperreports.engine.JRStyle;
import net.sf.jasperreports.engine.design.JRDesignExpression;
import net.sf.jasperreports.engine.design.JRDesignStaticText;
import net.sf.jasperreports.engine.design.JRDesignTextField;
import net.sf.jasperreports.engine.type.TextAdjustEnum;

import static com.hesmantech.ewmxmltool.service.report.data.mapper.constant.ItemMapperConstants.JASPER_REPORT_GET_FIELD_VALUE_FORMAT;

public final class SettlementTransactionItemMapper {
    private SettlementTransactionItemMapper() {

    }

    public static Integer getColumnWidth(String fieldName) {
        SettlementTransactionItemField field = SettlementTransactionItemField.valueFrom(fieldName);

        return field == null ? 0 : field.getWidth();
    }

    public static JRDesignStaticText getColumnHeader(String fieldName, JRStyle style) {
        JRDesignStaticText columnHeader = new JRDesignStaticText();
        columnHeader.setX(0);
        columnHeader.setY(0);
        columnHeader.setStyle(style);
        columnHeader.setBold(true);
        columnHeader.setHeight(30);

        SettlementTransactionItemField field = SettlementTransactionItemField.valueFrom(fieldName);

        if (field == null) {
            return columnHeader;
        }

        columnHeader.setWidth(field.getWidth());
        columnHeader.setText(field.getColumnHeaderText());

        return columnHeader;
    }

    public static JRDesignTextField getColumnDetail(String fieldName, JRStyle style) {
        JRDesignTextField textField = new JRDesignTextField();
        textField.setX(0);
        textField.setY(0);
        textField.setHeight(30);
        textField.setStyle(style);
        JRDesignExpression textFieldExpression = new JRDesignExpression();
        textField.setExpression(textFieldExpression);

        SettlementTransactionItemField field = SettlementTransactionItemField.valueFrom(fieldName);

        if (field == null) {
            return textField;
        }

        textField.setWidth(field.getWidth());
        textFieldExpression.setText(String.format(JASPER_REPORT_GET_FIELD_VALUE_FORMAT, field.getName()));

        switch (field) {
            case FIELD_PROGRAM_NAME:
            case FIELD_PRODUCT_NAME:
            case FIELD_TRANSACTION_CODE_DESCRIPTION:
            case FIELD_TRANS_LINK:
            case FIELD_FEE_GROUP_NAME:
            case FIELD_FX_FEE_NAME:
            case FIELD_F0_FEE_NAME:
            case FIELD_MERCHANT_NUMBER:
            case FIELD_MERCHANT:
            case FIELD_MERCHANT_NAME:
            case FIELD_MERCHANT_ADDRESS:
            case FIELD_MERCHANT_CITY:
            case FIELD_ACQUIRER_REFERENCE_NUMBER:
            case FIELD_TRANSACTION_DESCRIPTION:
            case FIELD_REFERENCE_NUMBER:
                textField.setTextAdjust(TextAdjustEnum.STRETCH_HEIGHT);
                break;
            default:
                break;
        }

        return textField;
    }

    private enum SettlementTransactionItemField {
        FIELD_FILE_DATE("fileDate", 65, "File Date"),
        FIELD_WORK_DATE("workDate", 110, "Work Date"),
        FIELD_ISSUER_IDENTIFICATION_NUMBER("issuerIdentificationNumber", 150, "Issuer Identification Number"),
        FIELD_PROGRAM_NAME("programName", 180, "Program Name"),
        FIELD_PROGRAM_ID("programId", 120, "Program Id"),
        FIELD_PRODUCT_NAME("productName", 220, "Product Name"),
        FIELD_PRODUCT_ID("productId", 120, "Product Id"),
        FIELD_SUB_PRODUCT_ID("subProductId", 120, "Sub Product Id"),
        FIELD_HOLDER_ID("holderId", 120, "Holder Id"),
        FIELD_ACCOUNT_ID("accountId", 102, "Account Id"),
        FIELD_BANK_ACCOUNT_ID("bankAccountId", 203, "Bank Account Id"),
        FIELD_CARD_NUMBER("cardNumber", 120, "Card Number"),
        FIELD_CARD_NUMBER_ID("cardNumberId", 100, "Card Number Id"),
        FIELD_CARD_REQUEST_ID("cardRequestId", 100, "Card Request Id"),
        FIELD_MTI_CODE("mtiCode", 100, "MTI Code"),
        FIELD_MESSAGE_REASON_CODE("messageReasonCode", 120, "Message Reason Code"),
        FIELD_BIN("bin", 120, "BIN"),
        FIELD_TRANSACTION_CODE("transactionCode", 100, "Transaction Code"),
        FIELD_TRANSACTION_CODE_DESCRIPTION("transactionCodeDescription", 250, "Transaction Code Description"),
        FIELD_AUTHORIZATION_CODE("authorizationCode", 100, "Authorization Code"),
        FIELD_TRANSACTION_DATE_TIME("transactionDateTime", 120, "Transaction Date Time"),
        FIELD_TRANSACTION_AMOUNT("transactionAmount", 110, "Transaction Amount"),
        FIELD_TRANSACTION_CURRENCY_CODE("transactionCurrencyCode", 150, "Transaction Currency Code"),
        FIELD_TRANSACTION_CURRENCY_ALPHA("transactionCurrencyAlpha", 150, "Transaction Currency Alpha"),
        FIELD_TRANS_LINK("transLink", 400, "Trans Link"),
        FIELD_TRACE_ID("traceId", 120, "Trace Id"),
        FIELD_TRANSACTION_CODE_IDENTIFIER("transactionCodeIdentifier", 150, "Transaction Code Identifier"),
        FIELD_HOLDER_AMOUNT("holderAmount", 120, "Holder Amount"),
        FIELD_HOLDER_CURRENCY_CODE("holderCurrencyCode", 120, "Holder Currency Code"),
        FIELD_HOLDER_CURRENCY_ALPHA("holderCurrencyAlpha", 120, "Holder Currency Alpha"),
        FIELD_FX_RATE("fxRate", 100, "FX Rate"),
        FIELD_FEE_GROUP_ID("feeGroupId", 100, "Fee Group Id"),
        FIELD_FEE_GROUP_NAME("feeGroupName", 120, "Fee Group Name"),
        FIELD_FX_FEE_NAME("fxFeeName", 120, "FX Fee Name"),
        FIELD_FX_FEE_CODE("fxFeeCode", 120, "FX Fee Code"),
        FIELD_FX_FEE_AMOUNT("fxFeeAmount", 120, "FX Fee Amount"),
        FIELD_FX_FEE_CURRENCY("fxFeeCurrency", 100, "FX Fee Currency"),
        FIELD_FX_FEE_REASON("fxFeeReason", 100, "FX Fee Reason"),
        FIELD_F0_FEE_NAME("f0FeeName", 120, "F0 Fee Name"),
        FIELD_F0_FEE_CODE("f0FeeCode", 100, "F0 Fee Code"),
        FIELD_F0_FEE_AMOUNT("f0FeeAmount", 120, "F0 Fee Amount"),
        FIELD_F0_FEE_CURRENCY("f0FeeCurrency", 100, "F0 Fee Currency"),
        FIELD_F0_FEE_REASON("f0FeeReason", 120, "F0 Fee Reason"),
        FIELD_BILL_RATE_AMOUNT("billRateAmount", 120, "Bill Rate Amount"),
        FIELD_BILLING_DATE("billingDate", 120, "Billing Date"),
        FIELD_BILLING_AMOUNT("billingAmount", 120, "Billing Amount"),
        FIELD_BILLING_CURRENCY_CODE("billingCurrencyCode", 120, "Billing Currency Code"),
        FIELD_BILLING_CURRENCY_ALPHA("billingCurrencyAlpha", 120, "Billing Currency Alpha"),
        FIELD_RECONCILIATION_DATE("reconciliationDate", 120, "Reconciliation Date"),
        FIELD_SETTLEMENT_DATE("settlementDate", 100, "Settlement Date"),
        FIELD_SETTLEMENT_AMOUNT("settlementAmount", 120, "Settlement Amount"),
        FIELD_SETTLEMENT_CURRENCY_CODE("settlementCurrencyCode", 140, "Settlement Currency Code"),
        FIELD_SETTLEMENT_CURRENCY_ALPHA("settlementCurrencyAlpha", 140, "Settlement Currency Alpha"),
        FIELD_SETTLEMENT_CONVERSION_RATE("settlementConversionRate", 145, "Settlement Conversion Rate"),
        FIELD_SETTLEMENT_FLAG("settlementFlag", 100, "Settlement Flag"),
        FIELD_MERCHANT_NUMBER("merchantNumber", 250, "Merchant Number"),
        FIELD_MERCHANT("merchant", 350, "Merchant"),
        FIELD_MERCHANT_NAME("merchantName", 200, "Merchant Name"),
        FIELD_MERCHANT_ADDRESS("merchantAddress", 300, "Merchant Address"),
        FIELD_MERCHANT_CITY("merchantCity", 100, "Merchant City"),
        FIELD_MERCHANT_POSTCODE("merchantPostcode", 110, "Merchant Postcode"),
        FIELD_MERCHANT_COUNTRY_CODE_ALPHA("merchantCountryCodeAlpha", 160, "Merchant Country Code Alpha"),
        FIELD_MERCHANT_COUNTRY_NAME("merchantCountryName", 220, "Merchant Country Name"),
        FIELD_MCC("mcc", 160, "MCC"),
        FIELD_CARD_PRESENT("cardPresent", 100, "Card Present"),
        FIELD_CARD_INPUT_MODE("cardInputMode", 358, "Card Input Mode"),
        FIELD_CARDHOLDER_AUTHENTICATION_METHOD("cardholderAuthenticationMethod", 459, "Cardholder Authentication Method"),
        FIELD_POS_DATA_DE22("posDataDe22", 100, "POS Data De22"),
        FIELD_POS_DATA_DE61("posDataDe61", 100, "POS Data De61"),
        FIELD_ACQUIRER_ID("acquirerId", 100, "Acquirer Id"),
        FIELD_ACQUIRER_REFERENCE_NUMBER("acquirerReferenceNumber", 200, "Acquirer Reference Number"),
        FIELD_TRANSACTION_ID("transactionId", 200, "Transaction Id"),
        FIELD_INTERCHANGE_FEE_AMOUNT("interchangeFeeAmount", 170, "Interchange Fee Amount"),
        FIELD_INTERCHANGE_FEE_CURRENCY("interchangeFeeCurrency", 140, "Interchange Fee Currency"),
        FIELD_INTERCHANGE_FEE_DIRECTION("interchangeFeeDirection", 140, "Interchange Fee Direction"),
        FIELD_INTERCHANGE_RATE_DESIGNATOR("interchangeRateDesignator", 468, "Interchange Rate Designator"),
        FIELD_CYCLE_NUMBER("cycleNumber", 569, "Cycle Number"),
        FIELD_CYCLE_FILE_ID("cycleFileId", 150, "Cycle File Id"),
        FIELD_TRANSACTION_CLASS("transactionClass", 150, "Transaction Class"),
        FIELD_ACTION("action", 100, "Action"),
        FIELD_NETWORK("network", 100, "Network"),
        FIELD_TRANSACTION_DESCRIPTION("transactionDescription", 300, "Transaction Description"),
        FIELD_ENTRY_MODE_CODE("entryModeCode", 90, "Entry Mode Code"),
        FIELD_ENTRY_MODE_CODE_DESCRIPTION("entryModeCodeDescription", 160, "Entry Mode Code Description"),
        FIELD_ECI_INDICATOR("eciIndicator", 100, "ECI Indicator"),
        FIELD_SUSPICIOUS("suspicious", 70, "Suspicious"),
        FIELD_RISK_RULE_CODES("riskRuleCodes", 120, "Risk Rule Codes"),
        FIELD_MARK_TRANSACTION_AS_SUSPICIOUS("markTransactionAsSuspicious", 170, "Mark Transaction As Suspicious"),
        FIELD_NOTIFY_CARDHOLDER_BY_SENDING_TAIS_NOTIFICATION("notifyCardholderBySendingTAIsNotification", 250, "Notify Cardholder By Sending TAIs Notification"),
        FIELD_CHANGE_CARD_STATUS_TO_RISK("changeCardStatusToRisk", 150, "Change Card Status To Risk"),
        FIELD_CHANGE_ACCOUNT_STATUS_TO_SUSPENDED("changeAccountStatusToSuspended", 150, "Change Account Status To Suspended"),
        FIELD_REJECT_TRANSACTION("rejectTransaction", 150, "Reject Transaction"),
        FIELD_FUNCTION_CODE("functionCode", 100, "Function Code"),
        FIELD_CARD_EXPIRATION_DATE_PRESENT("cardExpirationDatePresent", 160, "Card Expiration Date Present"),
        FIELD_ONLINE_PIN("onlinePIN", 100, "Online PIN"),
        FIELD_OFFLINE_PIN("offlinePIN", 100, "Offline PIN"),
        FIELD_THREE_DOMAIN_SECURE("threeDomainSecure", 100, "Three Domain Secure"),
        FIELD_CVV2("cvv2", 100, "CVV2"),
        FIELD_MAGNETIC_STRIPE("magneticStripe", 100, "Magnetic Stripe"),
        FIELD_CHIP_DATA("chipData", 100, "Chip Data"),
        FIELD_AVS("avs", 100, "AVS"),
        FIELD_PHONE_NUMBER("phoneNumber", 150, "Phone Number"),
        FIELD_SIGNATURE("signature", 220, "Signature"),
        FIELD_LOAD_TYPE("loadType", 220, "Load Type"),
        FIELD_LOAD_SOURCE("loadSource", 220, "Load Source"),
        FIELD_TRANSACTION_CODE_QUALIFIER("transactionCodeQualifier", 220, "Transaction Code Qualifier"),
        FIELD_BUSINESS_FORMAT_CODE("businessFormatCode", 220, "Business Format Code"),
        FIELD_CARD_TYPE("cardType", 100, "Card Type"),
        FIELD_PARENT_TRANSACTION_ID("parentTransactionId", 201, "Parent Transaction Id"),
        FIELD_DISPUTE_ID("disputeId", 220, "Dispute Id"),
        FIELD_EXTERNAL_DISPUTE_ID("externalDisputeId", 220, "External Dispute Id"),
        FIELD_ACTUAL_AUTHORIZATION_ID("actualAuthorizationId", 220, "Actual Authorization Id"),
        FIELD_FIRST_AUTHORIZATION_DATE("firstAuthorizationDate", 130, "First Authorization Date"),
        FIELD_REFERENCE_NUMBER("referenceNumber", 220, "Reference Number");

        private final String name;
        private final int width;
        private final String columnHeaderText;

        SettlementTransactionItemField(String name, int width, String columnHeaderText) {
            this.name = name;
            this.width = width;
            this.columnHeaderText = columnHeaderText;
        }

        public static SettlementTransactionItemField valueFrom(String fieldName) {
            for (SettlementTransactionItemField value : SettlementTransactionItemField.values()) {
                if (value.name.equals(fieldName)) {
                    return value;
                }
            }
            return null;
        }

        public String getName() {
            return name;
        }

        public int getWidth() {
            return width;
        }

        public String getColumnHeaderText() {
            return columnHeaderText;
        }
    }
}
