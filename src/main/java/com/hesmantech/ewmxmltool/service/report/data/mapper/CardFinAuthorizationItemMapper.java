package com.hesmantech.ewmxmltool.service.report.data.mapper;

import net.sf.jasperreports.engine.JRStyle;
import net.sf.jasperreports.engine.design.JRDesignExpression;
import net.sf.jasperreports.engine.design.JRDesignStaticText;
import net.sf.jasperreports.engine.design.JRDesignTextField;
import net.sf.jasperreports.engine.type.TextAdjustEnum;

import static com.hesmantech.ewmxmltool.service.report.data.mapper.constant.ItemMapperConstants.COLUMN_HEADER_CURRENCY;
import static com.hesmantech.ewmxmltool.service.report.data.mapper.constant.ItemMapperConstants.COLUMN_HEADER_RATE;
import static com.hesmantech.ewmxmltool.service.report.data.mapper.constant.ItemMapperConstants.JASPER_REPORT_GET_FIELD_VALUE_FORMAT;

public final class CardFinAuthorizationItemMapper {
    private CardFinAuthorizationItemMapper() {

    }

    public static Integer getColumnWidth(String fieldName) {
        CardFinAuthorizationItemField field = CardFinAuthorizationItemField.valueFrom(fieldName);

        return field == null ? 0 : field.getWidth();
    }

    public static JRDesignStaticText getColumnHeader(String fieldName, JRStyle style) {
        JRDesignStaticText columnHeader = new JRDesignStaticText();
        columnHeader.setX(0);
        columnHeader.setY(0);
        columnHeader.setStyle(style);
        columnHeader.setBold(true);
        columnHeader.setHeight(30);

        CardFinAuthorizationItemField field = CardFinAuthorizationItemField.valueFrom(fieldName);

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

        CardFinAuthorizationItemField field = CardFinAuthorizationItemField.valueFrom(fieldName);

        if (field == null) {
            return textField;
        }

        textField.setWidth(field.getWidth());
        textFieldExpression.setText(String.format(JASPER_REPORT_GET_FIELD_VALUE_FORMAT, field.getName()));

        switch (field) {
            case FIELD_TRANS_LINK:
            case FIELD_MERCHANT_ID:
            case FIELD_MERCHANT_NAME:
                textField.setTextAdjust(TextAdjustEnum.STRETCH_HEIGHT);
                break;
            default:
                break;
        }

        return textField;
    }

    private enum CardFinAuthorizationItemField {
        FIELD_TRANSACTION_TYPE("transactionType", 90, "Transaction Type"),
        FIELD_ENTRY_MODE_TYPE("entryModeType", 90, "Entry Mode Type"),
        FIELD_AUTHORIZE_ID("authorizeId", 100, "Authorize ID"),
        FIELD_TRANS_LINK("transLink", 210, "Trans Link"),
        FIELD_TRANSACTION_DATE_TIME("transactionDateTime", 120, "Transaction Date Time"),
        FIELD_SETTLEMENT_DATE("settlementDate", 85, "Settlement Date"),
        FIELD_CARD_PRODUCT("cardProduct", 70, "Card Product"),
        FIELD_CARD_PROGRAM("cardProgram", 75, "Card Program"),
        FIELD_CARD_ID("cardId", 50, "Card ID"),
        FIELD_TRANSACTION_AMOUNT("transactionAmount", 110, "Transaction Amount"),
        FIELD_TRANSACTION_AMOUNT_CURRENCY("transactionAmountCurrency", 55, COLUMN_HEADER_CURRENCY),
        FIELD_BILLING_AMOUNT("billingAmount", 80, "Billing Amount"),
        FIELD_BILLING_AMOUNT_CURRENCY("billingAmountCurrency", 55, COLUMN_HEADER_CURRENCY),
        FIELD_BILLING_AMOUNT_RATE("billingAmountRate", 70, COLUMN_HEADER_RATE),
        FIELD_CARDHOLDER_AMOUNT("cardholderAmount", 110, "Cardholder Amount"),
        FIELD_CARDHOLDER_AMOUNT_CURRENCY("cardholderAmountCurrency", 55, COLUMN_HEADER_CURRENCY),
        FIELD_CARDHOLDER_AMOUNT_RATE("cardholderAmountRate", 70, COLUMN_HEADER_RATE),
        FIELD_CASH_BACK_AMOUNT("cashBackAmount", 110, "Cash Back Amount"),
        FIELD_CASH_BACK_AMOUNT_CURRENCY("cashBackAmountCurrency", 55, COLUMN_HEADER_CURRENCY),
        FIELD_AUTH_CODE("authCode", 60, "Auth Code"),
        FIELD_RETRIEVAL_REFERENCE_NUMBER("retrievalReferenceNumber", 150, "Retrieval Reference Number"),
        FIELD_MERCHANT_ID("merchantId", 120, "Merchant ID"),
        FIELD_MERCHANT_NAME("merchantName", 260, "Merchant Name"),
        FIELD_MERCHANT_TERMINAL_ID("merchantTerminalId", 120, "Merchant Terminal ID"),
        FIELD_SCHEME_ID("schemeId", 60, "Scheme ID"),
        FIELD_TRANSACTION_FEE("transactionFee", 110, "Transaction Fee"),
        FIELD_TRANSACTION_FEE_CURRENCY("transactionFeeCurrency", 55, COLUMN_HEADER_CURRENCY),
        FIELD_SETTLEMENT_AMOUNT("settlementAmount", 180, "Settlement Amount"),
        FIELD_SETTLEMENT_AMOUNT_CURRENCY("settlementAmountCurrency", 55, COLUMN_HEADER_CURRENCY),
        FIELD_SETTLEMENT_AMOUNT_RATE("settlementAmountRate", 70, COLUMN_HEADER_RATE),
        FIELD_ACQUIRER_ID("acquirerId", 70, "Acquirer ID"),
        FIELD_FORWARDER_ID("forwarderId", 70, "Forwarder ID"),
        FIELD_MCC("mcc", 80, "MCC"),
        FIELD_COUNTRY_ISON("countryIson", 80, "Country ISON"),
        FIELD_SUSPICIOUS("suspicious", 65, "Suspicious"),
        FIELD_CARD_EXPIRATION_DATE_PRESENT("cardExpirationDatePresent", 150, "Card Expiration Date Present"),
        FIELD_ONLINE_PIN("onlinePIN", 60, "Online PIN"),
        FIELD_OFFLINE_PIN("offlinePIN", 60, "Offline PIN"),
        FIELD_THREE_DOMAIN_SECURE("threeDomainSecure", 200, "Three Domain Secure"),
        FIELD_CVV2("cvv2", 80, "CVV2"),
        FIELD_MAGNETIC_STRIPE("magneticStripe", 150, "Magnetic Stripe"),
        FIELD_CHIP_DATA("chipData", 100, "Chip Data"),
        FIELD_AVS("AVS", 80, "AVS"),
        FIELD_PHONE_NUMBER("phoneNumber", 120, "Phone Number"),
        FIELD_SIGNATURE("signature", 100, "Signature"),
        FIELD_TRANSACTION_CLASS("transactionClass", 100, "Transaction Class");

        private final String name;
        private final int width;
        private final String columnHeaderText;

        CardFinAuthorizationItemField(String name, int width, String columnHeaderText) {
            this.name = name;
            this.width = width;
            this.columnHeaderText = columnHeaderText;
        }

        public static CardFinAuthorizationItemField valueFrom(String fieldName) {
            for (CardFinAuthorizationItemField value : CardFinAuthorizationItemField.values()) {
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
