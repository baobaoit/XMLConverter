package com.hesmantech.ewmxmltool.service.report.data.mapper;

import net.sf.jasperreports.engine.JRStyle;
import net.sf.jasperreports.engine.design.JRDesignExpression;
import net.sf.jasperreports.engine.design.JRDesignStaticText;
import net.sf.jasperreports.engine.design.JRDesignTextField;
import net.sf.jasperreports.engine.type.TextAdjustEnum;

import static com.hesmantech.ewmxmltool.service.report.data.mapper.constant.ItemMapperConstants.JASPER_REPORT_GET_FIELD_VALUE_IF_NULL_THEN_BLANK_FORMAT;

public final class LookupItemMapper {
    private LookupItemMapper() {

    }

    public static Integer getColumnWidth(String fieldName) {
        LookupItemField field = LookupItemField.valueFrom(fieldName);

        return field == null ? 0 : field.getWidth();
    }

    public static JRDesignStaticText getColumnHeader(String fieldName, JRStyle style) {
        JRDesignStaticText columnHeader = new JRDesignStaticText();
        columnHeader.setX(0);
        columnHeader.setY(0);
        columnHeader.setStyle(style);
        columnHeader.setBold(true);
        columnHeader.setHeight(30);

        LookupItemField field = LookupItemField.valueFrom(fieldName);

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

        LookupItemField field = LookupItemField.valueFrom(fieldName);

        if (field == null) {
            return textField;
        }

        textField.setWidth(field.getWidth());
        textFieldExpression.setText(String.format(JASPER_REPORT_GET_FIELD_VALUE_IF_NULL_THEN_BLANK_FORMAT,
                field.getName(), field.getName()));

        switch (field) {
            case FIELD_CARD_EVENT_CC:
            case FIELD_AUTHORIZATION_CODE_VALUE:
            case FIELD_TRANSACTION_CODE_VALUE:
            case FIELD_ENTRY_MODE_CODE_VALUE:
            case FIELD_LOAD_SOURCE_VALUE:
            case FIELD_EXTERNAL_PAYMENT_TRANSACTION_TYPE_VALUE:
            case FIELD_EXTERNAL_PAYMENT_TRANSACTION_STATUS_CODE_VALUE:
            case FIELD_FUNCTION_CODE_VALUE:
                textField.setTextAdjust(TextAdjustEnum.STRETCH_HEIGHT);
                break;
            default:
                break;
        }

        return textField;
    }

    private enum LookupItemField {
        FIELD_ISSUER_IDENTIFICATION_NUMBER("issuerIdentificationNumber", 150, "Issuer Identification Number"),
        FIELD_CARD_EVENT_CC("cardEventCc", 200, "Card Event"),
        FIELD_REGION_TYPE_CC("regionTypeCc", 170, "Region Type"),
        FIELD_ACTION_TYPE_CC("actionTypeCc", 110, "Action Type"),
        FIELD_AUTHORIZATION_CODE_CC("authorizationCodeCc", 130, "Authorization Code"),
        FIELD_AUTHORIZATION_CODE_VALUE("authorizationCodeValue", 135, "Authorization Code Value"),
        FIELD_TRANSACTION_CODE_CC("transactionCodeCc", 140, "Transaction Code"),
        FIELD_TRANSACTION_CODE_NAME("transactionCodeName", 330, "Transaction Code Name"),
        FIELD_TRANSACTION_CODE_VALUE("transactionCodeValue", 330, "Transaction Code Value"),
        FIELD_NETWORK_CC("networkCc", 140, "Network"),
        FIELD_ENTRY_MODE_CODE_CC("entryModeCodeCc", 160, "Entry Mode Code"),
        FIELD_ENTRY_MODE_CODE_NAME("entryModeCodeName", 165, "Entry Mode Code Name"),
        FIELD_ENTRY_MODE_CODE_VALUE("entryModeCodeValue", 300, "Entry Mode Code Value"),
        FIELD_LOAD_TYPES_CC("loadTypesCc", 170, "Load Types"),
        FIELD_LOAD_TYPES_VALUE("loadTypesValue", 175, "Load Types Value"),
        FIELD_LOAD_SOURCE_CC("loadSourceCc", 180, "Load Source"),
        FIELD_LOAD_SOURCE_VALUE("loadSourceValue", 430, "Load Source Value"),
        FIELD_EXTERNAL_PAYMENT_TRANSACTION_TYPE_CC("externalPaymentTransactionTypeCc", 190, "External Payment Transaction Type"),
        FIELD_EXTERNAL_PAYMENT_TRANSACTION_TYPE_VALUE("externalPaymentTransactionTypeValue", 195, "External Payment Transaction Type Value"),
        FIELD_EXTERNAL_PAYMENT_TRANSACTION_STATUS_CODE_CC("externalPaymentTransactionStatusCodeCc", 200, "External Payment Transaction Status Code"),
        FIELD_EXTERNAL_PAYMENT_TRANSACTION_STATUS_CODE_VALUE("externalPaymentTransactionStatusCodeValue", 290, "External Payment Transaction Status Code Value"),
        FIELD_ACCOUNT_STATUS_CODE_CC("accountStatusCodeCc", 210, "Account Status Code"),
        FIELD_ACCOUNT_STATUS_CODE_VALUE("accountStatusCodeValue", 215, "Account Status Code Value"),
        FIELD_CARD_STATUS_CODE_CC("cardStatusCodeCc", 220, "Card Status Code"),
        FIELD_CARD_STATUS_CODE_VALUE("cardStatusCodeValue", 225, "Card Status Code Value"),
        FIELD_RISK_ACTION_CC("riskActionCc", 230, "Risk Action"),
        FIELD_FUNCTION_CODE_CC("functionCodeCc", 240, "Function Code"),
        FIELD_FUNCTION_CODE_VALUE("functionCodeValue", 245, "Function Code Value"),
        FIELD_SECURITY_CHECK_CC("securityCheckCc", 250, "Security Check");

        private final String name;
        private final int width;
        private final String columnHeaderText;

        LookupItemField(String name, int width, String columnHeaderText) {
            this.name = name;
            this.width = width;
            this.columnHeaderText = columnHeaderText;
        }

        public static LookupItemField valueFrom(String fieldName) {
            for (LookupItemField value : LookupItemField.values()) {
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
