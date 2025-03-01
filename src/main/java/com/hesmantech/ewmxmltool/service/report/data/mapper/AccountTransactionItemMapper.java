package com.hesmantech.ewmxmltool.service.report.data.mapper;

import net.sf.jasperreports.engine.JRStyle;
import net.sf.jasperreports.engine.design.JRDesignExpression;
import net.sf.jasperreports.engine.design.JRDesignStaticText;
import net.sf.jasperreports.engine.design.JRDesignTextField;
import net.sf.jasperreports.engine.type.TextAdjustEnum;

import static com.hesmantech.ewmxmltool.service.report.data.mapper.constant.ItemMapperConstants.COLUMN_HEADER_CURRENCY;
import static com.hesmantech.ewmxmltool.service.report.data.mapper.constant.ItemMapperConstants.COLUMN_HEADER_RATE;
import static com.hesmantech.ewmxmltool.service.report.data.mapper.constant.ItemMapperConstants.JASPER_REPORT_GET_FIELD_VALUE_FORMAT;

public final class AccountTransactionItemMapper {
    private AccountTransactionItemMapper() {

    }

    public static Integer getColumnWidth(String fieldName) {
        AccountTransactionItemField field = AccountTransactionItemField.valueFrom(fieldName);

        return field == null ? 0 : field.getWidth();
    }

    public static JRDesignStaticText getColumnHeader(String fieldName, JRStyle style) {
        JRDesignStaticText columnHeader = new JRDesignStaticText();
        columnHeader.setX(0);
        columnHeader.setY(0);
        columnHeader.setStyle(style);
        columnHeader.setBold(true);
        columnHeader.setHeight(30);

        AccountTransactionItemField field = AccountTransactionItemField.valueFrom(fieldName);

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

        AccountTransactionItemField field = AccountTransactionItemField.valueFrom(fieldName);

        if (field == null) {
            return textField;
        }

        textField.setWidth(field.getWidth());
        textFieldExpression.setText(String.format(JASPER_REPORT_GET_FIELD_VALUE_FORMAT, field.getName()));

        switch (field) {
            case FIELD_TRANS_LINK:
            case FIELD_CARD_ID:
            case FIELD_ACCOUNT_ID:
            case FIELD_RETRIEVAL_REFERENCE_NUMBER:
            case FIELD_MERCHANT_ID:
            case FIELD_MERCHANT_NAME:
                textField.setTextAdjust(TextAdjustEnum.STRETCH_HEIGHT);
                break;
            default:
                break;
        }

        return textField;
    }

    private enum AccountTransactionItemField {
        FIELD_TRANSACTION_TYPE("transactionType", 100, "Transaction Type"),
        FIELD_ENTRY_MODE_TYPE("entryModeType", 100, "Entry Mode Type"),
        FIELD_TRANSACTION_ID("transactionId", 100, "Transaction ID"),
        FIELD_TRANS_LINK("transLink", 310, "Trans Link"),
        FIELD_TRANSACTION_LOCAL_TIME("transactionLocalTime", 120, "Transaction Local Time"),
        FIELD_RECONCILIATION_DATE("reconciliationDate", 100, "Reconciliation Date"),
        FIELD_SETTLEMENT_DATE("settlementDate", 100, "Settlement Date"),
        FIELD_DATE_TIME_PROCESSED("dateTimeProcessed", 110, "Date Time Processed"),
        FIELD_CARD_PRODUCT("cardProduct", 70, "Card Product"),
        FIELD_PROGRAM("program", 50, "Program"),
        FIELD_CARD_ID("cardId", 60, "Card ID"),
        FIELD_ACCOUNT_ID("accountId", 60, "Account ID"),
        FIELD_TRANSACTION_AMOUNT("transactionAmount", 100, "Transaction Amount"),
        FIELD_TRANSACTION_AMOUNT_CURRENCY("transactionAmountCurrency", 60, COLUMN_HEADER_CURRENCY),
        FIELD_BILLING_AMOUNT("billingAmount", 100, "Billing Amount"),
        FIELD_BILLING_AMOUNT_CURRENCY("billingAmountCurrency", 60, COLUMN_HEADER_CURRENCY),
        FIELD_BILLING_AMOUNT_RATE("billingAmountRate", 50, COLUMN_HEADER_RATE),
        FIELD_CARDHOLDER_AMOUNT("cardholderAmount", 100, "Cardholder Amount"),
        FIELD_CARDHOLDER_AMOUNT_CURRENCY("cardholderAmountCurrency", 60, COLUMN_HEADER_CURRENCY),
        FIELD_CARDHOLDER_AMOUNT_RATE("cardholderAmountRate", 50, COLUMN_HEADER_RATE),
        FIELD_BASE_CONVERSION_RATE("baseConversionRate", 100, "Base Conversion Rate"),
        FIELD_IS_CONVERSION_FEE_BLENDED("isConversionFeeBlended", 100, "Is Conversion Fee Blended"),
        FIELD_AUTH_CODE("authCode", 100, "Auth Code"),
        FIELD_RETRIEVAL_REFERENCE_NUMBER("retrievalReferenceNumber", 100, "Retrieval Reference Number"),
        FIELD_MERCHANT_ID("merchantId", 100, "Merchant ID"),
        FIELD_MERCHANT_NAME("merchantName", 250, "Merchant Name"),
        FIELD_MERCHANT_STATE("merchantState", 100, "Merchant State"),
        FIELD_MERCHANT_COUNTRY("merchantCountry", 100, "Merchant Country"),
        FIELD_MERCHANT_TERMINAL_ID("merchantTerminalId", 100, "Merchant Terminal ID"),
        FIELD_SCHEME_ID("schemeId", 100, "Scheme ID"),
        FIELD_TRANSACTION_FEE("transactionFee", 100, "Transaction Fee"),
        FIELD_TRANSACTION_FEE_CURRENCY("transactionFeeCurrency", 60, COLUMN_HEADER_CURRENCY),
        FIELD_SETTLEMENT_AMOUNT("settlementAmount", 100, "Settlement Amount"),
        FIELD_SETTLEMENT_AMOUNT_CURRENCY("settlementAmountCurrency", 60, COLUMN_HEADER_CURRENCY),
        FIELD_SETTLEMENT_AMOUNT_RATE("settlementAmountRate", 50, COLUMN_HEADER_RATE),
        FIELD_ACQUIRER_ID("acquirerId", 100, "Acquirer ID"),
        FIELD_FORWARDER_ID("forwarderId", 100, "Forwarder ID"),
        FIELD_MCC("mcc", 60, "MCC"),
        FIELD_REASON_CODE("reasonCode", 80, "Reason Code"),
        FIELD_EPM_METHOD_ID("epmMethodId", 85, "EPM Method ID"),
        FIELD_EPM_TRANSACTION_ID("epmTransactionId", 100, "EPM Transaction ID"),
        FIELD_SUSPICIOUS("suspicious", 60, "Suspicious"),
        FIELD_RISK_RULE_CODES("riskRuleCodes", 100, "Risk Rule Codes"),
        FIELD_MARK_TRANSACTION_AS_SUSPICIOUS("markTransactionAsSuspicious", 100, "Mark Transaction As Suspicious"),
        FIELD_NOTIFY_CARDHOLDER_BY_SENDING_TAIS_NOTIFICATION("notifyCardholderBySendingTAIsNotification", 100, "Notify Cardholder By Sending TAIs Notification"),
        FIELD_CHANGE_CARD_STATUS_TO_RISK("changeCardStatusToRisk", 100, "Change Card Status To Risk"),
        FIELD_CHANGE_ACCOUNT_STATUS_TO_SUSPENDED("changeAccountStatusToSuspended", 100, "Change Account Status To Suspended"),
        FIELD_REJECT_TRANSACTION("rejectTransaction", 100, "Reject Transaction"),
        FIELD_FUNCTION_CODE("functionCode", 100, "Function Code"),
        FIELD_CARD_EXPIRATION_DATE_PRESENT("cardExpirationDatePresent", 150, "Card Expiration Date Present"),
        FIELD_ONLINE_PIN("onlinePIN", 100, "Online PIN"),
        FIELD_OFFLINE_PIN("offlinePIN", 100, "Offline PIN"),
        FIELD_THREE_DOMAIN_SECURE("threeDomainSecure", 100, "Three Domain Secure"),
        FIELD_CVV2("cvv2", 100, "CVV2"),
        FIELD_MAGNETIC_STRIPE("magneticStripe", 100, "Magnetic Stripe"),
        FIELD_CHIP_DATA("chipData", 100, "Chip Data"),
        FIELD_AVS("AVS", 100, "AVS"),
        FIELD_PHONE_NUMBER("phoneNumber", 100, "Phone Number"),
        FIELD_SIGNATURE("signature", 100, "Signature"),
        FIELD_TRANSACTION_CLASS("transactionClass", 100, "Transaction Class"),
        FIELD_REFERENCE_NUMBER("referenceNumber", 100, "Reference Number"),
        FIELD_TRANSACTION_DESCRIPTION("transactionDescription", 100, "Transaction Description"),
        FIELD_LOAD_TYPE("loadType", 60, "Load Type"),
        FIELD_LOAD_SOURCE("loadSource", 70, "Load Source"),
        FIELD_TRANSACTION_EXCHANGE_FEE_AMOUNT("transactionExchangeFeeAmount", 100, "Transaction Exchange Fee Amount"),
        FIELD_TRANSACTION_EXCHANGE_FEE_AMOUNT_CURRENCY("transactionExchangeFeeAmountCurrency", 60, COLUMN_HEADER_CURRENCY);

        private final String name;
        private final int width;
        private final String columnHeaderText;

        AccountTransactionItemField(String name, int width, String columnHeaderText) {
            this.name = name;
            this.width = width;
            this.columnHeaderText = columnHeaderText;
        }

        public static AccountTransactionItemField valueFrom(String fieldName) {
            AccountTransactionItemField[] values = AccountTransactionItemField.values();

            for (AccountTransactionItemField value : values) {
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
