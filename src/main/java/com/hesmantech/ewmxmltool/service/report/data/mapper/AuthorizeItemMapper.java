package com.hesmantech.ewmxmltool.service.report.data.mapper;

import net.sf.jasperreports.engine.JRStyle;
import net.sf.jasperreports.engine.design.JRDesignExpression;
import net.sf.jasperreports.engine.design.JRDesignStaticText;
import net.sf.jasperreports.engine.design.JRDesignTextField;
import net.sf.jasperreports.engine.type.TextAdjustEnum;

import static com.hesmantech.ewmxmltool.service.report.data.mapper.constant.ItemMapperConstants.COLUMN_HEADER_CURRENCY;
import static com.hesmantech.ewmxmltool.service.report.data.mapper.constant.ItemMapperConstants.COLUMN_HEADER_RATE;
import static com.hesmantech.ewmxmltool.service.report.data.mapper.constant.ItemMapperConstants.JASPER_REPORT_GET_FIELD_VALUE_FORMAT;

public final class AuthorizeItemMapper {
    private AuthorizeItemMapper() {

    }

    public static Integer getColumnWidth(String fieldName) {
        AuthorizeItemField field = AuthorizeItemField.valueFrom(fieldName);

        return field == null ? 0 : field.getWidth();
    }

    public static JRDesignStaticText getColumnHeader(String fieldName, JRStyle style) {
        JRDesignStaticText columnHeader = new JRDesignStaticText();
        columnHeader.setX(0);
        columnHeader.setY(0);
        columnHeader.setStyle(style);
        columnHeader.setBold(true);
        columnHeader.setHeight(30);

        AuthorizeItemField field = AuthorizeItemField.valueFrom(fieldName);

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

        AuthorizeItemField field = AuthorizeItemField.valueFrom(fieldName);

        if (field == null) {
            return textField;
        }

        textField.setWidth(field.getWidth());
        textFieldExpression.setText(String.format(JASPER_REPORT_GET_FIELD_VALUE_FORMAT, field.getName()));

        switch (field) {
            case FIELD_LIMIT_ERROR:
            case FIELD_MERCHANT_ID:
            case FIELD_MERCHANT_NAME:
            case FIELD_NOTE:
            case FIELD_RESPONSE_CODE_DESCRIPTION:
            case FIELD_RETRIEVAL_REFERENCE_NUMBER:
            case FIELD_TRANS_LINK:
                textField.setTextAdjust(TextAdjustEnum.STRETCH_HEIGHT);
                break;
            default:
                break;
        }

        return textField;
    }

    private enum AuthorizeItemField {
        FIELD_TRANSACTION_TYPE("transactionType", 100, "Transaction Type"),
        FIELD_ENTRY_MODE_TYPE("entryModeType", 100, "Entry Mode Type"),
        FIELD_AUTHORIZE_ID("authorizeId", 100, "Authorize ID"),
        FIELD_TRANS_LINK("transLink", 210, "Trans Link"),
        FIELD_TRANSACTION_DATE_TIME("transactionDateTime", 120, "Transaction Date Time"),
        FIELD_SETTLEMENT_DATE("settlementDate", 100, "Settlement Date"),
        FIELD_CARD_PRODUCT_ID("cardProductId", 70, "Card Product ID"),
        FIELD_CARD_PROGRAM_ID("cardProgramId", 50, "Card Program ID"),
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
        FIELD_CASH_BACK_AMOUNT("cashBackAmount", 100, "Cash Back Amount"),
        FIELD_CASH_BACK_AMOUNT_CURRENCY("cashBackAmountCurrency", 60, COLUMN_HEADER_CURRENCY),
        FIELD_AUTH_CODE("authCode", 100, "Auth Code"),
        FIELD_RETRIEVAL_REFERENCE_NUMBER("retrievalReferenceNumber", 100, "Retrieval Reference Number"),
        FIELD_MERCHANT_ID("merchantId", 100, "Merchant ID"),
        FIELD_MERCHANT_NAME("merchantName", 250, "Merchant Name"),
        FIELD_MERCHANT_TERMINAL_ID("merchantTerminalId", 100, "Merchant Terminal ID"),
        FIELD_SCHEME_ID("schemeId", 100, "Scheme ID"),
        FIELD_TRANSACTION_FEE("transactionFee", 100, "Transaction Fee"),
        FIELD_TRANSACTION_FEE_CURRENCY("transactionFeeCurrency", 60, COLUMN_HEADER_CURRENCY),
        FIELD_SETTLEMENT_AMOUNT("settlementAmount", 100, "Settlement Amount"),
        FIELD_SETTLEMENT_AMOUNT_CURRENCY("settlementAmountCurrency", 60, COLUMN_HEADER_CURRENCY),
        FIELD_SETTLEMENT_AMOUNT_RATE("settlementAmountRate", 50, COLUMN_HEADER_RATE),
        FIELD_ISSUER_ID("issuerId", 100, "Issuer ID"),
        FIELD_ACQUIRER_ID("acquirerId", 100, "Acquirer ID"),
        FIELD_FORWARDER_ID("forwarderId", 100, "Forwarder ID"),
        FIELD_MCC("mcc", 60, "MCC"),
        FIELD_COUNTRY_ISON("countryIson", 100, "Country ISON"),
        FIELD_SUSPICIOUS("suspicious", 60, "Suspicious"),
        FIELD_REVERSAL("reversal", 100, "Reversal"),
        FIELD_AUTHORISED_VIA_TAI("authorisedViaTai", 100, "Authorised Via TAI"),
        FIELD_RISK_RULE_CODES("riskRuleCodes", 100, "Risk Rule Codes"),
        FIELD_MARK_TRANSACTION_AS_SUSPICIOUS("markTransactionAsSuspicious", 100, "Mark Transaction As Suspicious"),
        FIELD_NOTIFY_CARDHOLDER_BY_SENDING_TAIS_NOTIFICATION("notifyCardholderBySendingTAIsNotification", 100, "Notify Cardholder By Sending TAIs Notification"),
        FIELD_CHANGE_CARD_STATUS_TO_RISK("changeCardStatusToRisk", 100, "Change Card Status To Risk"),
        FIELD_CHANGE_ACCOUNT_STATUS_TO_SUSPENDED("changeAccountStatusToSuspended", 100, "Change Account Status To Suspended"),
        FIELD_REJECT_TRANSACTION("rejectTransaction", 100, "Reject Transaction"),
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
        FIELD_ADVICE_DETAIL_CODE("adviceDetailCode", 100, "Advice Detail Code"),
        FIELD_ADVICE_REASON_CODE("adviceReasonCode", 100, "Advice Reason Code"),
        FIELD_AUTHORISATION_TYPE("authorisationType", 100, "Authorisation Type"),
        FIELD_CARD_PRESENT("cardPresent", 100, "Card Present"),
        FIELD_CUMULATIVE_PADDING_AMOUNT("cumulativePaddingAmount", 100, "Cumulative Padding Amount"),
        FIELD_APPLIED_PADDING_AMOUNT("appliedPaddingAmount", 100, "Applied Padding Amount"),
        FIELD_AVS_RESULT("avsResult", 100, "AVS Result"),
        FIELD_CVC2_RESULT("cvc2Result", 100, "CVC2 Result"),
        FIELD_CVM_RESULT("cvmResult", 100, "CVM Result"),
        FIELD_ECI_INDICATOR("eciIndicator", 100, "ECI Indicator"),
        FIELD_LIMIT_ERROR("limitError", 100, "Limit Error"),
        FIELD_MTI("mti", 100, "MTI"),
        FIELD_NOTE("note", 100, "Note"),
        FIELD_POS_ENTRY_MODE("posEntryMode", 100, "POS Entry Mode"),
        FIELD_POS_DATA("posData", 100, "POS Data"),
        FIELD_PROCESSING_CODE("processingCode", 100, "Processing Code"),
        FIELD_RESPONSE_CODE("responseCode", 100, "Response Code"),
        FIELD_RESPONSE_CODE_DESCRIPTION("responseCodeDescription", 100, "Response Code Description"),
        FIELD_STAN("stan", 100, "STAN"),
        FIELD_TRACE_NUMBER("traceNumber", 100, "Trace Number"),
        FIELD_DATE_CREATED("dateCreated", 100, "Date Created");

        private final String name;
        private final int width;
        private final String columnHeaderText;

        AuthorizeItemField(String name, int width, String columnHeaderText) {
            this.name = name;
            this.width = width;
            this.columnHeaderText = columnHeaderText;
        }

        public static AuthorizeItemField valueFrom(String fieldName) {
            for (AuthorizeItemField value : AuthorizeItemField.values()) {
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
