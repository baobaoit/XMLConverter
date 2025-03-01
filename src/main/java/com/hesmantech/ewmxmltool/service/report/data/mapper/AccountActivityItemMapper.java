package com.hesmantech.ewmxmltool.service.report.data.mapper;

import net.sf.jasperreports.engine.JRStyle;
import net.sf.jasperreports.engine.design.JRDesignExpression;
import net.sf.jasperreports.engine.design.JRDesignStaticText;
import net.sf.jasperreports.engine.design.JRDesignTextField;
import net.sf.jasperreports.engine.type.TextAdjustEnum;

import static com.hesmantech.ewmxmltool.service.report.data.mapper.constant.ItemMapperConstants.JASPER_REPORT_GET_FIELD_VALUE_FORMAT;

public final class AccountActivityItemMapper {
    private AccountActivityItemMapper() {

    }

    public static Integer getColumnWidth(String fieldName) {
        AccountActivityItemField field = AccountActivityItemField.valueFrom(fieldName);

        return field == null ? 0 : field.getWidth();
    }

    public static JRDesignStaticText getColumnHeader(String fieldName, JRStyle style) {
        JRDesignStaticText columnHeader = new JRDesignStaticText();
        columnHeader.setX(0);
        columnHeader.setY(0);
        columnHeader.setStyle(style);
        columnHeader.setBold(true);
        columnHeader.setHeight(30);

        AccountActivityItemField field = AccountActivityItemField.valueFrom(fieldName);

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

        AccountActivityItemField field = AccountActivityItemField.valueFrom(fieldName);

        if (field == null) {
            return textField;
        }

        textField.setWidth(field.getWidth());
        textFieldExpression.setText(String.format(JASPER_REPORT_GET_FIELD_VALUE_FORMAT, field.getName()));

        switch (field) {
            case FIELD_ACTION:
            case FIELD_ENTRY_MODE_CODE_DESCRIPTION:
            case FIELD_EPM_TRANSACTION_REASON_DESCRIPTION:
            case FIELD_F0_FEE_NAME:
            case FIELD_FEE_GROUP_NAME:
            case FIELD_FX_FEE_NAME:
            case FIELD_NETWORK:
            case FIELD_PRODUCT_NAME:
            case FIELD_REFERENCE:
            case FIELD_TRANSACTION_DESCRIPTION:
            case FIELD_TRANS_LINK:
                textField.setTextAdjust(TextAdjustEnum.STRETCH_HEIGHT);
                break;
            default:
                break;
        }

        return textField;
    }

    private enum AccountActivityItemField {
        FIELD_FILE_DATE("fileDate", 65, "File Date"),
        FIELD_WORK_DATE("workDate", 110, "Work Date"),
        FIELD_ISSUER_IDENTIFICATION_NUMBER("issuerIdentificationNumber", 150, "Issuer Identification Number"),
        FIELD_PROGRAM_NAME("programName", 200, "Program Name"),
        FIELD_PROGRAM_ID("programId", 65, "Program Id"),
        FIELD_PRODUCT_NAME("productName", 200, "Product Name"),
        FIELD_PRODUCT_ID("productId", 60, "Product Id"),
        FIELD_SUB_PRODUCT_ID("subProductId", 80, "Sub Product Id"),
        FIELD_HOLDER_ID("holderId", 90, "Holder Id"),
        FIELD_ACCOUNT_ID("accountId", 90, "Account Id"),
        FIELD_BANK_ACCOUNT_ID("bankAccountId", 90, "Bank Account Id"),
        FIELD_EXTERNAL_BANK_ACCOUNT_ID("externalBankAccountId", 180, "External Bank Account Id"),
        FIELD_BANK_ACCOUNT_NUMBER("bankAccountNumber", 120, "Bank Account Number"),
        FIELD_BANK_ACCOUNT_SORT_CODE("bankAccountSortCode", 130, "Bank Account Sort Code"),
        FIELD_BANK_ACCOUNT_IBAN("bankAccountIban", 230, "Bank Account IBAN"),
        FIELD_BANK_ACCOUNT_BIC("bankAccountBic", 200, "Bank Account BIC"),
        FIELD_CARD_NUMBER("cardNumber", 220, "Card Number"),
        FIELD_CARD_NUMBER_ID("cardNumberId", 200, "Card Number Id"),
        FIELD_CARD_REQUEST_ID("cardRequestId", 200, "Card Request Id"),
        FIELD_BIN("bin", 220, "BIN"),
        FIELD_TRANSACTION_CODE("transactionCode", 100, "Transaction Code"),
        FIELD_TRANSACTION_CODE_DESCRIPTION("transactionCodeDescription", 240, "Transaction Code Description"),
        FIELD_TRANSACTION_DATE_TIME("transactionDateTime", 120, "Transaction Date Time"),
        FIELD_TRANSACTION_AMOUNT("transactionAmount", 110, "Transaction Amount"),
        FIELD_TRANSACTION_CURRENCY_CODE("transactionCurrencyCode", 150, "Transaction Currency Code"),
        FIELD_TRANSACTION_CURRENCY_ALPHA("transactionCurrencyAlpha", 150, "Transaction Currency Alpha"),
        FIELD_TRANS_LINK("transLink", 200, "Trans Link"),
        FIELD_TRACE_ID("traceId", 150, "Trace Id"),
        FIELD_TRANSACTION_CODE_IDENTIFIER("transactionCodeIdentifier", 150, "Transaction Code Identifier"),
        FIELD_HOLDER_AMOUNT("holderAmount", 80, "Holder Amount"),
        FIELD_HOLDER_CURRENCY_CODE("holderCurrencyCode", 120, "Holder Currency Code"),
        FIELD_HOLDER_CURRENCY_ALPHA("holderCurrencyAlpha", 120, "Holder Currency Alpha"),
        FIELD_FX_RATE("fxRate", 90, "FX Rate"),
        FIELD_FEE_GROUP_ID("feeGroupId", 130, "Fee Group Id"),
        FIELD_FEE_GROUP_NAME("feeGroupName", 200, "Fee Group Name"),
        FIELD_FX_FEE_NAME("fxFeeName", 200, "FX Fee Name"),
        FIELD_FX_FEE_AMOUNT("fxFeeAmount", 90, "FX Fee Amount"),
        FIELD_FX_FEE_CURRENCY("fxFeeCurrency", 180, "FX Fee Currency"),
        FIELD_FX_FEE_REASON("fxFeeReason", 90, "FX Fee Reason"),
        FIELD_F0_FEE_NAME("f0FeeName", 200, "F0 Fee Name"),
        FIELD_F0_FEE_AMOUNT("f0FeeAmount", 90, "F0 Fee Amount"),
        FIELD_F0_FEE_CURRENCY("f0FeeCurrency", 90, "F0 Fee Currency"),
        FIELD_F0_FEE_REASON("f0FeeReason", 190, "F0 Fee Reason"),
        FIELD_BILL_RATE_AMOUNT("billRateAmount", 90, "Bill Rate Amount"),
        FIELD_BILLING_DATE("billingDate", 120, "Billing Date"),
        FIELD_BILLING_AMOUNT("billingAmount", 90, "Billing Amount"),
        FIELD_BILLING_CURRENCY_CODE("billingCurrencyCode", 120, "Billing Currency Code"),
        FIELD_BILLING_CURRENCY_ALPHA("billingCurrencyAlpha", 120, "Billing Currency Alpha"),
        FIELD_SETTLEMENT_AMOUNT("settlementAmount", 100, "Settlement Amount"),
        FIELD_SETTLEMENT_CURRENCY_CODE("settlementCurrencyCode", 140, "Settlement Currency Code"),
        FIELD_SETTLEMENT_CURRENCY_ALPHA("settlementCurrencyAlpha", 140, "Settlement Currency Alpha"),
        FIELD_SETTLEMENT_CONVERSION_RATE("settlementConversionRate", 145, "Settlement Conversion Rate"),
        FIELD_CARD_PRESENT("cardPresent", 150, "Card Present"),
        FIELD_TRANSACTION_ID("transactionId", 160, "Transaction Id"),
        FIELD_TRANSACTION_CLASS("transactionClass", 170, "Transaction Class"),
        FIELD_ACTION("action", 100, "Action"),
        FIELD_NETWORK("network", 120, "Network"),
        FIELD_TRANSACTION_DESCRIPTION("transactionDescription", 250, "Transaction Description"),
        FIELD_ENTRY_MODE_CODE("entryModeCode", 90, "Entry Mode Code"),
        FIELD_ENTRY_MODE_CODE_DESCRIPTION("entryModeCodeDescription", 300, "Entry Mode Code Description"),
        FIELD_REFERENCE_NUMBER("referenceNumber", 200, "Reference Number"),
        FIELD_BALANCE_ADJUSTMENT_TYPE("balanceAdjustmentType", 220, "Balance Adjustment Type"),
        FIELD_COUNTRY_ISON("countryIson", 80, "Country ISON"),
        FIELD_LOAD_TYPE("loadType", 160, "Load Type"),
        FIELD_LOAD_SOURCE("loadSource", 180, "Load Source"),
        FIELD_EPM_METHOD_ID("epmMethodId", 190, "EPM Method Id"),
        FIELD_EPM_TRANSACTION_ID("epmTransactionId", 200, "EPM Transaction Id"),
        FIELD_EXTERNAL_EPM_TRANSACTION_ID("externalEpmTransactionId", 260, "External EPM Transaction Id"),
        FIELD_EPM_TRANSACTION_TYPE("epmTransactionType", 120, "EPM Transaction Type"),
        FIELD_EPM_TRANSACTION_STATUS_CODE("epmTransactionStatusCode", 160, "EPM Transaction Status Code"),
        FIELD_EPM_TRANSACTION_STATUS("epmTransactionStatus", 125, "EPM Transaction Status"),
        FIELD_EPM_TRANSACTION_REASON_DESCRIPTION("epmTransactionReasonDescription", 320, "EPM Transaction Reason Description"),
        FIELD_EPM_TRANSACTION_BANK_PROVIDER_REASON_CODE("epmTransactionBankProviderReasonCode", 240, "EPM Transaction Bank Provider Reason Code"),
        FIELD_EPM_MANDATE_ID("epmMandateId", 250, "EPM Mandate Id"),
        FIELD_REFERENCE("reference", 170, "Reference"),
        FIELD_TRANSACTION_IDENTIFIER("transactionIdentifier", 220, "Transaction Identifier"),
        FIELD_END_TO_END_IDENTIFIER("endToEndIdentifier", 220, "End to End Identifier"),
        FIELD_SUSPICIOUS("suspicious", 70, "Suspicious"),
        FIELD_RISK_RULE_CODES("riskRuleCodes", 140, "Risk Rule Codes"),
        FIELD_MARK_TRANSACTION_AS_SUSPICIOUS("markTransactionAsSuspicious", 300, "Mark Transaction as Suspicious"),
        FIELD_NOTIFY_CARDHOLDER_BY_SENDING_TA_IS_NOTIFICATION("notifyCardholderBySendingTAIsNotification", 450, "Notify Cardholder by Sending TA is Notification"),
        FIELD_CHANGE_CARD_STATUS_TO_RISK("changeCardStatusToRisk", 280, "Change Card Status to Risk"),
        FIELD_CHANGE_ACCOUNT_STATUS_TO_SUSPENDED("changeAccountStatusToSuspended", 320, "Change Account Status to Suspended"),
        FIELD_REJECT_TRANSACTION("rejectTransaction", 200, "Reject Transaction"),
        FIELD_CARD_EXPIRATION_DATE_PRESENT("cardExpirationDatePresent", 300, "Card Expiration Date Present"),
        FIELD_ONLINE_PIN("onlinePIN", 120, "Online PIN"),
        FIELD_OFFLINE_PIN("offlinePIN", 130, "Offline PIN"),
        FIELD_THREE_DOMAIN_SECURE("threeDomainSecure", 180, "Three Domain Secure"),
        FIELD_CVV2("cvv2", 90, "CVV2"),
        FIELD_MAGNETIC_STRIPE("magneticStripe", 150, "Magnetic Stripe"),
        FIELD_CHIP_DATA("chipData", 120, "Chip Data"),
        FIELD_AVS("avs", 70, "AVS"),
        FIELD_PHONE_NUMBER("phoneNumber", 110, "Phone Number"),
        FIELD_SIGNATURE("signature", 100, "Signature");

        private final String name;
        private final int width;
        private final String columnHeaderText;

        AccountActivityItemField(String name, int width, String columnHeaderText) {
            this.name = name;
            this.width = width;
            this.columnHeaderText = columnHeaderText;
        }

        public static AccountActivityItemField valueFrom(String fieldName) {
            for (AccountActivityItemField value : AccountActivityItemField.values()) {
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
