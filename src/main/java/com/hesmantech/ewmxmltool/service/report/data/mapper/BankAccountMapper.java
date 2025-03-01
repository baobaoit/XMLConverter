package com.hesmantech.ewmxmltool.service.report.data.mapper;

import net.sf.jasperreports.engine.JRStyle;
import net.sf.jasperreports.engine.design.JRDesignExpression;
import net.sf.jasperreports.engine.design.JRDesignStaticText;
import net.sf.jasperreports.engine.design.JRDesignTextField;
import net.sf.jasperreports.engine.type.TextAdjustEnum;

public final class BankAccountMapper {
    private static final String ACCOUNT_SNAPSHOT_ITEM_FIELD_BANK_ACCOUNT_NAME = "bankAccount";
    private static final String FIELD_BANK_ACCOUNT_ACCOUNT_NAME = "bankAccountAccountName";
    private static final String FIELD_BANK_ACCOUNT_ACCOUNT_NUMBER = "bankAccountAccountNumber";
    private static final String FIELD_BANK_ACCOUNT_BANK_PROVIDER_ID = "bankAccountBankProviderId";
    private static final String FIELD_BANK_ACCOUNT_BIC = "bankAccountBic";
    private static final String FIELD_BANK_ACCOUNT_EXTERNAL_ID = "bankAccountExternalId";
    private static final String FIELD_BANK_ACCOUNT_IBAN = "bankAccountIban";
    private static final String FIELD_BANK_ACCOUNT_ID = "bankAccountId";
    private static final String FIELD_BANK_ACCOUNT_SORT_CODE = "bankAccountSortCode";
    private static final String FIELD_BANK_ACCOUNT_STATUS_CHANGE_NOTE = "bankAccountStatusChangeNote";
    private static final String FIELD_BANK_ACCOUNT_STATUS_CHANGE_REASON_CODE = "bankAccountStatusChangeReasonCode";
    private static final String FIELD_BANK_ACCOUNT_STATUS_CHANGE_SOURCE = "bankAccountStatusChangeSource";
    private static final String FIELD_BANK_STATUS = "bankAccountStatus";
    private static final int FIELD_BANK_ACCOUNT_ACCOUNT_NAME_WIDTH = 100;
    private static final int FIELD_BANK_ACCOUNT_ACCOUNT_NUMBER_WIDTH = 100;
    private static final int FIELD_BANK_ACCOUNT_BANK_PROVIDER_ID_WIDTH = 90;
    private static final int FIELD_BANK_ACCOUNT_BIC_WIDTH = 100;
    private static final int FIELD_BANK_ACCOUNT_EXTERNAL_ID_WIDTH = 130;
    private static final int FIELD_BANK_ACCOUNT_IBAN_WIDTH = 150;
    private static final int FIELD_BANK_ACCOUNT_ID_WIDTH = 70;
    private static final int FIELD_BANK_ACCOUNT_SORT_CODE_WIDTH = 100;
    private static final int FIELD_BANK_ACCOUNT_STATUS_CHANGE_NOTE_WIDTH = 110;
    private static final int FIELD_BANK_ACCOUNT_STATUS_CHANGE_REASON_CODE_WIDTH = 150;
    private static final int FIELD_BANK_ACCOUNT_STATUS_CHANGE_SOURCE_WIDTH = 120;
    private static final int FIELD_BANK_STATUS_WIDTH = 70;

    private BankAccountMapper() {

    }

    public static Integer getColumnWidth(String fieldName) {
        if (FIELD_BANK_ACCOUNT_ID.equals(fieldName)) {
            return FIELD_BANK_ACCOUNT_ID_WIDTH;
        }

        if (FIELD_BANK_ACCOUNT_EXTERNAL_ID.equals(fieldName)) {
            return FIELD_BANK_ACCOUNT_EXTERNAL_ID_WIDTH;
        }

        if (FIELD_BANK_STATUS.equals(fieldName)) {
            return FIELD_BANK_STATUS_WIDTH;
        }

        if (FIELD_BANK_ACCOUNT_BANK_PROVIDER_ID.equals(fieldName)) {
            return FIELD_BANK_ACCOUNT_BANK_PROVIDER_ID_WIDTH;
        }

        if (FIELD_BANK_ACCOUNT_ACCOUNT_NAME.equals(fieldName)) {
            return FIELD_BANK_ACCOUNT_ACCOUNT_NAME_WIDTH;
        }

        if (FIELD_BANK_ACCOUNT_ACCOUNT_NUMBER.equals(fieldName)) {
            return FIELD_BANK_ACCOUNT_ACCOUNT_NUMBER_WIDTH;
        }

        if (FIELD_BANK_ACCOUNT_SORT_CODE.equals(fieldName)) {
            return FIELD_BANK_ACCOUNT_SORT_CODE_WIDTH;
        }

        if (FIELD_BANK_ACCOUNT_IBAN.equals(fieldName)) {
            return FIELD_BANK_ACCOUNT_IBAN_WIDTH;
        }

        if (FIELD_BANK_ACCOUNT_BIC.equals(fieldName)) {
            return FIELD_BANK_ACCOUNT_BIC_WIDTH;
        }

        if (FIELD_BANK_ACCOUNT_STATUS_CHANGE_REASON_CODE.equals(fieldName)) {
            return FIELD_BANK_ACCOUNT_STATUS_CHANGE_REASON_CODE_WIDTH;
        }

        if (FIELD_BANK_ACCOUNT_STATUS_CHANGE_NOTE.equals(fieldName)) {
            return FIELD_BANK_ACCOUNT_STATUS_CHANGE_NOTE_WIDTH;
        }

        if (FIELD_BANK_ACCOUNT_STATUS_CHANGE_SOURCE.equals(fieldName)) {
            return FIELD_BANK_ACCOUNT_STATUS_CHANGE_SOURCE_WIDTH;
        }

        return 0;
    }

    public static JRDesignStaticText getColumnHeader(String fieldName, JRStyle style) {
        JRDesignStaticText columnHeader = new JRDesignStaticText();
        columnHeader.setX(0);
        columnHeader.setY(0);
        columnHeader.setStyle(style);
        columnHeader.setBold(true);
        columnHeader.setHeight(30);

        switch (fieldName) {
            case FIELD_BANK_ACCOUNT_ID:
                columnHeader.setWidth(FIELD_BANK_ACCOUNT_ID_WIDTH);
                columnHeader.setText("Bank account ID");
                break;
            case FIELD_BANK_ACCOUNT_EXTERNAL_ID:
                columnHeader.setWidth(FIELD_BANK_ACCOUNT_EXTERNAL_ID_WIDTH);
                columnHeader.setText("Bank account external ID");
                break;
            case FIELD_BANK_STATUS:
                columnHeader.setWidth(FIELD_BANK_STATUS_WIDTH);
                columnHeader.setText("Bank status");
                break;
            case FIELD_BANK_ACCOUNT_BANK_PROVIDER_ID:
                columnHeader.setWidth(FIELD_BANK_ACCOUNT_BANK_PROVIDER_ID_WIDTH);
                columnHeader.setText("Bank provider ID");
                break;
            case FIELD_BANK_ACCOUNT_ACCOUNT_NAME:
                columnHeader.setWidth(FIELD_BANK_ACCOUNT_ACCOUNT_NAME_WIDTH);
                columnHeader.setText("Account name");
                break;
            case FIELD_BANK_ACCOUNT_ACCOUNT_NUMBER:
                columnHeader.setWidth(FIELD_BANK_ACCOUNT_ACCOUNT_NUMBER_WIDTH);
                columnHeader.setText("Account number");
                break;
            case FIELD_BANK_ACCOUNT_SORT_CODE:
                columnHeader.setWidth(FIELD_BANK_ACCOUNT_SORT_CODE_WIDTH);
                columnHeader.setText("Sort code");
                break;
            case FIELD_BANK_ACCOUNT_IBAN:
                columnHeader.setWidth(FIELD_BANK_ACCOUNT_IBAN_WIDTH);
                columnHeader.setText("Iban");
                break;
            case FIELD_BANK_ACCOUNT_BIC:
                columnHeader.setWidth(FIELD_BANK_ACCOUNT_BIC_WIDTH);
                columnHeader.setText("Bic");
                break;
            case FIELD_BANK_ACCOUNT_STATUS_CHANGE_REASON_CODE:
                columnHeader.setWidth(FIELD_BANK_ACCOUNT_STATUS_CHANGE_REASON_CODE_WIDTH);
                columnHeader.setText("Bank account status change reason code");
                break;
            case FIELD_BANK_ACCOUNT_STATUS_CHANGE_NOTE:
                columnHeader.setWidth(FIELD_BANK_ACCOUNT_STATUS_CHANGE_NOTE_WIDTH);
                columnHeader.setText("Bank account status change note");
                break;
            case FIELD_BANK_ACCOUNT_STATUS_CHANGE_SOURCE:
                columnHeader.setWidth(FIELD_BANK_ACCOUNT_STATUS_CHANGE_SOURCE_WIDTH);
                columnHeader.setText("Bank account status change source");
                break;
            default:
                break;
        }

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

        StringBuilder expressionBuilder = new StringBuilder(String.format("$F{%s}.get(\"", ACCOUNT_SNAPSHOT_ITEM_FIELD_BANK_ACCOUNT_NAME));
        switch (fieldName) {
            case FIELD_BANK_ACCOUNT_ID:
                textField.setWidth(FIELD_BANK_ACCOUNT_ID_WIDTH);
                expressionBuilder.append(FIELD_BANK_ACCOUNT_ID);
                break;
            case FIELD_BANK_ACCOUNT_EXTERNAL_ID:
                textField.setWidth(FIELD_BANK_ACCOUNT_EXTERNAL_ID_WIDTH);
                expressionBuilder.append(FIELD_BANK_ACCOUNT_EXTERNAL_ID);
                break;
            case FIELD_BANK_STATUS:
                textField.setWidth(FIELD_BANK_STATUS_WIDTH);
                expressionBuilder.append(FIELD_BANK_STATUS);
                break;
            case FIELD_BANK_ACCOUNT_BANK_PROVIDER_ID:
                textField.setWidth(FIELD_BANK_ACCOUNT_BANK_PROVIDER_ID_WIDTH);
                expressionBuilder.append(FIELD_BANK_ACCOUNT_BANK_PROVIDER_ID);
                break;
            case FIELD_BANK_ACCOUNT_ACCOUNT_NAME:
                textField.setWidth(FIELD_BANK_ACCOUNT_ACCOUNT_NAME_WIDTH);
                textField.setTextAdjust(TextAdjustEnum.STRETCH_HEIGHT);
                expressionBuilder.append(FIELD_BANK_ACCOUNT_ACCOUNT_NAME);
                break;
            case FIELD_BANK_ACCOUNT_ACCOUNT_NUMBER:
                textField.setWidth(FIELD_BANK_ACCOUNT_ACCOUNT_NUMBER_WIDTH);
                expressionBuilder.append(FIELD_BANK_ACCOUNT_ACCOUNT_NUMBER);
                break;
            case FIELD_BANK_ACCOUNT_SORT_CODE:
                textField.setWidth(FIELD_BANK_ACCOUNT_SORT_CODE_WIDTH);
                expressionBuilder.append(FIELD_BANK_ACCOUNT_SORT_CODE);
                break;
            case FIELD_BANK_ACCOUNT_IBAN:
                textField.setWidth(FIELD_BANK_ACCOUNT_IBAN_WIDTH);
                textField.setTextAdjust(TextAdjustEnum.STRETCH_HEIGHT);
                expressionBuilder.append(FIELD_BANK_ACCOUNT_IBAN);
                break;
            case FIELD_BANK_ACCOUNT_BIC:
                textField.setWidth(FIELD_BANK_ACCOUNT_BIC_WIDTH);
                expressionBuilder.append(FIELD_BANK_ACCOUNT_BIC);
                break;
            case FIELD_BANK_ACCOUNT_STATUS_CHANGE_REASON_CODE:
                textField.setWidth(FIELD_BANK_ACCOUNT_STATUS_CHANGE_REASON_CODE_WIDTH);
                expressionBuilder.append(FIELD_BANK_ACCOUNT_STATUS_CHANGE_REASON_CODE);
                break;
            case FIELD_BANK_ACCOUNT_STATUS_CHANGE_NOTE:
                textField.setWidth(FIELD_BANK_ACCOUNT_STATUS_CHANGE_NOTE_WIDTH);
                textField.setTextAdjust(TextAdjustEnum.STRETCH_HEIGHT);
                expressionBuilder.append(FIELD_BANK_ACCOUNT_STATUS_CHANGE_NOTE);
                break;
            case FIELD_BANK_ACCOUNT_STATUS_CHANGE_SOURCE:
                textField.setWidth(FIELD_BANK_ACCOUNT_STATUS_CHANGE_SOURCE_WIDTH);
                expressionBuilder.append(FIELD_BANK_ACCOUNT_STATUS_CHANGE_SOURCE);
                break;
            default:
                break;
        }

        expressionBuilder.append("\")");
        textFieldExpression.setText(expressionBuilder.toString());

        return textField;
    }
}
