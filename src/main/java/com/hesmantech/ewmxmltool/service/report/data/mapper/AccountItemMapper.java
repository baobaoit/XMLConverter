package com.hesmantech.ewmxmltool.service.report.data.mapper;

import net.sf.jasperreports.engine.JRStyle;
import net.sf.jasperreports.engine.design.JRDesignExpression;
import net.sf.jasperreports.engine.design.JRDesignStaticText;
import net.sf.jasperreports.engine.design.JRDesignTextField;
import net.sf.jasperreports.engine.type.TextAdjustEnum;

public final class AccountItemMapper {
    private static final String FIELD_ACCOUNT_ID = "accountId";
    private static final String FIELD_ACCOUNT_STATUS = "accountStatus";
    private static final String FIELD_ACCOUNT_STATUS_CHANGE_NOTE = "accountStatusChangeNote";
    private static final String FIELD_ACCOUNT_STATUS_CHANGE_ORIGINATOR_ID = "accountStatusChangeOriginatorId";
    private static final String FIELD_ACCOUNT_STATUS_CHANGE_REASON_CODE = "accountStatusChangeReasonCode";
    private static final String FIELD_ACCOUNT_STATUS_CHANGE_SOURCE = "accountStatusChangeSource";
    private static final String FIELD_ACCOUNT_STATUS_DATE = "accountStatusDate";
    private static final String FIELD_AVAILABLE_BALANCE = "availableBalance";
    private static final String FIELD_CURRENCY_ISON = "currencyIson";
    private static final String FIELD_DATE_UPDATED = "dateUpdated";
    private static final String FIELD_HOLDER_ID = "holderId";
    private static final String FIELD_PROGRAM_ID = "programId";
    private static final String FIELD_RESERVED_BALANCE = "reservedBalance";
    private static final String FIELD_SETTLED_BALANCE = "settledBalance";
    private static final String JASPER_REPORT_GET_FIELD_VALUE_FORMAT = "$F{%s}";
    private static final int FIELD_ACCOUNT_ID_WIDTH = 70;
    private static final int FIELD_ACCOUNT_STATUS_CHANGE_NOTE_WIDTH = 85;
    private static final int FIELD_ACCOUNT_STATUS_CHANGE_ORIGINATOR_ID_WIDTH = 100;
    private static final int FIELD_ACCOUNT_STATUS_CHANGE_REASON_CODE_WIDTH = 110;
    private static final int FIELD_ACCOUNT_STATUS_CHANGE_SOURCE_WIDTH = 85;
    private static final int FIELD_ACCOUNT_STATUS_DATE_WIDTH = 70;
    private static final int FIELD_ACCOUNT_STATUS_WIDTH = 50;
    private static final int FIELD_AVAILABLE_BALANCE_WIDTH = 100;
    private static final int FIELD_CURRENCY_ISON_WIDTH = 75;
    private static final int FIELD_DATE_UPDATED_WIDTH = 110;
    private static final int FIELD_HOLDER_ID_WIDTH = 60;
    private static final int FIELD_PROGRAM_ID_WIDTH = 65;
    private static final int FIELD_RESERVED_BALANCE_WIDTH = 100;
    private static final int FIELD_SETTLED_BALANCE_WIDTH = 100;

    private AccountItemMapper() {

    }

    public static JRDesignTextField getColumnDetail(String fieldName, JRStyle style) {
        JRDesignTextField textField = new JRDesignTextField();
        textField.setX(0);
        textField.setY(0);
        textField.setHeight(30);
        textField.setStyle(style);
        JRDesignExpression textFieldExpression = new JRDesignExpression();
        textField.setExpression(textFieldExpression);

        switch (fieldName) {
            case FIELD_ACCOUNT_ID:
                textField.setWidth(FIELD_ACCOUNT_ID_WIDTH);
                textFieldExpression.setText(String.format(JASPER_REPORT_GET_FIELD_VALUE_FORMAT, FIELD_ACCOUNT_ID));
                break;
            case FIELD_HOLDER_ID:
                textField.setWidth(FIELD_HOLDER_ID_WIDTH);
                textFieldExpression.setText(String.format(JASPER_REPORT_GET_FIELD_VALUE_FORMAT, FIELD_HOLDER_ID));
                break;
            case FIELD_PROGRAM_ID:
                textField.setWidth(FIELD_PROGRAM_ID_WIDTH);
                textFieldExpression.setText(String.format(JASPER_REPORT_GET_FIELD_VALUE_FORMAT, FIELD_PROGRAM_ID));
                break;
            case FIELD_CURRENCY_ISON:
                textField.setWidth(FIELD_CURRENCY_ISON_WIDTH);
                textFieldExpression.setText(String.format(JASPER_REPORT_GET_FIELD_VALUE_FORMAT, FIELD_CURRENCY_ISON));
                break;
            case FIELD_AVAILABLE_BALANCE:
                textField.setWidth(FIELD_AVAILABLE_BALANCE_WIDTH);
                textFieldExpression.setText(String.format(JASPER_REPORT_GET_FIELD_VALUE_FORMAT, FIELD_AVAILABLE_BALANCE));
                break;
            case FIELD_SETTLED_BALANCE:
                textField.setWidth(FIELD_SETTLED_BALANCE_WIDTH);
                textFieldExpression.setText(String.format(JASPER_REPORT_GET_FIELD_VALUE_FORMAT, FIELD_SETTLED_BALANCE));
                break;
            case FIELD_RESERVED_BALANCE:
                textField.setWidth(FIELD_RESERVED_BALANCE_WIDTH);
                textFieldExpression.setText(String.format(JASPER_REPORT_GET_FIELD_VALUE_FORMAT, FIELD_RESERVED_BALANCE));
                break;
            case FIELD_ACCOUNT_STATUS:
                textField.setWidth(FIELD_ACCOUNT_STATUS_WIDTH);
                textFieldExpression.setText(String.format(JASPER_REPORT_GET_FIELD_VALUE_FORMAT, FIELD_ACCOUNT_STATUS));
                break;
            case FIELD_ACCOUNT_STATUS_DATE:
                textField.setWidth(FIELD_ACCOUNT_STATUS_DATE_WIDTH);
                textFieldExpression.setText(String.format(JASPER_REPORT_GET_FIELD_VALUE_FORMAT, FIELD_ACCOUNT_STATUS_DATE));
                break;
            case FIELD_ACCOUNT_STATUS_CHANGE_SOURCE:
                textField.setWidth(FIELD_ACCOUNT_STATUS_CHANGE_SOURCE_WIDTH);
                textFieldExpression.setText(String.format(JASPER_REPORT_GET_FIELD_VALUE_FORMAT, FIELD_ACCOUNT_STATUS_CHANGE_SOURCE));
                break;
            case FIELD_ACCOUNT_STATUS_CHANGE_REASON_CODE:
                textField.setWidth(FIELD_ACCOUNT_STATUS_CHANGE_REASON_CODE_WIDTH);
                textFieldExpression.setText(String.format(JASPER_REPORT_GET_FIELD_VALUE_FORMAT, FIELD_ACCOUNT_STATUS_CHANGE_REASON_CODE));
                break;
            case FIELD_ACCOUNT_STATUS_CHANGE_NOTE:
                textField.setWidth(FIELD_ACCOUNT_STATUS_CHANGE_NOTE_WIDTH);
                textField.setTextAdjust(TextAdjustEnum.STRETCH_HEIGHT);
                textFieldExpression.setText(String.format(JASPER_REPORT_GET_FIELD_VALUE_FORMAT, FIELD_ACCOUNT_STATUS_CHANGE_NOTE));
                break;
            case FIELD_ACCOUNT_STATUS_CHANGE_ORIGINATOR_ID:
                textField.setWidth(FIELD_ACCOUNT_STATUS_CHANGE_ORIGINATOR_ID_WIDTH);
                textFieldExpression.setText(String.format(JASPER_REPORT_GET_FIELD_VALUE_FORMAT, FIELD_ACCOUNT_STATUS_CHANGE_ORIGINATOR_ID));
                break;
            case FIELD_DATE_UPDATED:
                textField.setWidth(FIELD_DATE_UPDATED_WIDTH);
                textFieldExpression.setText(String.format(JASPER_REPORT_GET_FIELD_VALUE_FORMAT, FIELD_DATE_UPDATED));
                break;
            default:
                break;
        }

        return textField;
    }

    public static JRDesignStaticText getColumnHeader(String fieldName, JRStyle style) {
        JRDesignStaticText columnHeader = new JRDesignStaticText();
        columnHeader.setX(0);
        columnHeader.setY(0);
        columnHeader.setStyle(style);
        columnHeader.setBold(true);
        columnHeader.setHeight(30);

        switch (fieldName) {
            case FIELD_ACCOUNT_ID:
                columnHeader.setWidth(FIELD_ACCOUNT_ID_WIDTH);
                columnHeader.setText("Account ID");
                break;
            case FIELD_HOLDER_ID:
                columnHeader.setWidth(FIELD_HOLDER_ID_WIDTH);
                columnHeader.setText("Holder ID");
                break;
            case FIELD_PROGRAM_ID:
                columnHeader.setWidth(FIELD_PROGRAM_ID_WIDTH);
                columnHeader.setText("Program ID");
                break;
            case FIELD_CURRENCY_ISON:
                columnHeader.setWidth(FIELD_CURRENCY_ISON_WIDTH);
                columnHeader.setText("Currency ison");
                break;
            case FIELD_AVAILABLE_BALANCE:
                columnHeader.setWidth(FIELD_AVAILABLE_BALANCE_WIDTH);
                columnHeader.setText("Available balance");
                break;
            case FIELD_SETTLED_BALANCE:
                columnHeader.setWidth(FIELD_SETTLED_BALANCE_WIDTH);
                columnHeader.setText("Settled balance");
                break;
            case FIELD_RESERVED_BALANCE:
                columnHeader.setWidth(FIELD_RESERVED_BALANCE_WIDTH);
                columnHeader.setText("Reserved balance");
                break;
            case FIELD_ACCOUNT_STATUS:
                columnHeader.setWidth(FIELD_ACCOUNT_STATUS_WIDTH);
                columnHeader.setText("Account status");
                break;
            case FIELD_ACCOUNT_STATUS_DATE:
                columnHeader.setWidth(FIELD_ACCOUNT_STATUS_DATE_WIDTH);
                columnHeader.setText("Account status date");
                break;
            case FIELD_ACCOUNT_STATUS_CHANGE_SOURCE:
                columnHeader.setWidth(FIELD_ACCOUNT_STATUS_CHANGE_SOURCE_WIDTH);
                columnHeader.setText("Account status change source");
                break;
            case FIELD_ACCOUNT_STATUS_CHANGE_REASON_CODE:
                columnHeader.setWidth(FIELD_ACCOUNT_STATUS_CHANGE_REASON_CODE_WIDTH);
                columnHeader.setText("Account status change reason code");
                break;
            case FIELD_ACCOUNT_STATUS_CHANGE_NOTE:
                columnHeader.setWidth(FIELD_ACCOUNT_STATUS_CHANGE_NOTE_WIDTH);
                columnHeader.setText("Account status change note");
                break;
            case FIELD_ACCOUNT_STATUS_CHANGE_ORIGINATOR_ID:
                columnHeader.setWidth(FIELD_ACCOUNT_STATUS_CHANGE_ORIGINATOR_ID_WIDTH);
                columnHeader.setText("Account status change originator ID");
                break;
            case FIELD_DATE_UPDATED:
                columnHeader.setWidth(FIELD_DATE_UPDATED_WIDTH);
                columnHeader.setText("Date updated");
                break;
            default:
                break;
        }

        return columnHeader;
    }

    public static Integer getColumnWidth(String fieldName) {
        if (FIELD_ACCOUNT_ID.equals(fieldName)) {
            return FIELD_ACCOUNT_ID_WIDTH;
        }

        if (FIELD_HOLDER_ID.equals(fieldName)) {
            return FIELD_HOLDER_ID_WIDTH;
        }

        if (FIELD_PROGRAM_ID.equals(fieldName)) {
            return FIELD_PROGRAM_ID_WIDTH;
        }

        if (FIELD_CURRENCY_ISON.equals(fieldName)) {
            return FIELD_CURRENCY_ISON_WIDTH;
        }

        if (FIELD_AVAILABLE_BALANCE.equals(fieldName)) {
            return FIELD_AVAILABLE_BALANCE_WIDTH;
        }

        if (FIELD_SETTLED_BALANCE.equals(fieldName)) {
            return FIELD_SETTLED_BALANCE_WIDTH;
        }

        if (FIELD_RESERVED_BALANCE.equals(fieldName)) {
            return FIELD_RESERVED_BALANCE_WIDTH;
        }

        if (FIELD_ACCOUNT_STATUS.equals(fieldName)) {
            return FIELD_ACCOUNT_STATUS_WIDTH;
        }

        if (FIELD_ACCOUNT_STATUS_DATE.equals(fieldName)) {
            return FIELD_ACCOUNT_STATUS_DATE_WIDTH;
        }

        if (FIELD_ACCOUNT_STATUS_CHANGE_SOURCE.equals(fieldName)) {
            return FIELD_ACCOUNT_STATUS_CHANGE_SOURCE_WIDTH;
        }

        if (FIELD_ACCOUNT_STATUS_CHANGE_REASON_CODE.equals(fieldName)) {
            return FIELD_ACCOUNT_STATUS_CHANGE_REASON_CODE_WIDTH;
        }

        if (FIELD_ACCOUNT_STATUS_CHANGE_NOTE.equals(fieldName)) {
            return FIELD_ACCOUNT_STATUS_CHANGE_NOTE_WIDTH;
        }

        if (FIELD_ACCOUNT_STATUS_CHANGE_ORIGINATOR_ID.equals(fieldName)) {
            return FIELD_ACCOUNT_STATUS_CHANGE_ORIGINATOR_ID_WIDTH;
        }

        if (FIELD_DATE_UPDATED.equals(fieldName)) {
            return FIELD_DATE_UPDATED_WIDTH;
        }

        return 0;
    }
}
