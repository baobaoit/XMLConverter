package com.hesmantech.ewmxmltool.service.report.data.mapper;

import net.sf.jasperreports.engine.JRStyle;
import net.sf.jasperreports.engine.design.JRDesignExpression;
import net.sf.jasperreports.engine.design.JRDesignStaticText;
import net.sf.jasperreports.engine.design.JRDesignTextField;
import net.sf.jasperreports.engine.type.TextAdjustEnum;

public final class CardMapper {
    private static final String ACCOUNT_ITEM_FIELD_CARD_NAME = "card";
    private static final String FIELD_CARD_ID = "cardId";
    private static final String FIELD_CARD_PRODUCT_ID = "cardProductId";
    private static final String FIELD_CARD_PROGRAM_ID = "cardProgramId";
    private static final String FIELD_CURRENCY_ISON = "currencyIson";
    private static final String FIELD_EXPIRY_DATE = "expiryDate";
    private static final String FIELD_HOLDER_ID = "holderId";
    private static final String FIELD_PRIMARY = "primary";
    private static final String FIELD_REFERENCE_ID = "referenceId";
    private static final String FIELD_STATUS = "status";
    private static final String FIELD_STATUS_CHANGE_NOTE = "statusChangeNote";
    private static final String FIELD_STATUS_CHANGE_ORIGINATOR_ID = "statusChangeOriginatorId";
    private static final String FIELD_STATUS_CHANGE_REASON_CODE = "statusChangeReasonCode";
    private static final String FIELD_STATUS_CHANGE_SOURCE = "statusChangeSource";
    private static final String FIELD_STATUS_DATE = "statusDate";
    private static final String FIELD_VIRTUAL = "virtual";
    private static final int FIELD_CARD_ID_WIDTH = 50;
    private static final int FIELD_CARD_PRODUCT_ID_WIDTH = 55;
    private static final int FIELD_CARD_PROGRAM_ID_WIDTH = 60;
    private static final int FIELD_CURRENCY_ISON_WIDTH = 75;
    private static final int FIELD_EXPIRY_DATE_WIDTH = 60;
    private static final int FIELD_HOLDER_ID_WIDTH = 60;
    private static final int FIELD_PRIMARY_WIDTH = 50;
    private static final int FIELD_REFERENCE_ID_WIDTH = 60;
    private static final int FIELD_STATUS_CHANGE_NOTE_WIDTH = 85;
    private static final int FIELD_STATUS_CHANGE_ORIGINATOR_ID_WIDTH = 100;
    private static final int FIELD_STATUS_CHANGE_REASON_CODE_WIDTH = 110;
    private static final int FIELD_STATUS_CHANGE_SOURCE_WIDTH = 85;
    private static final int FIELD_STATUS_DATE_WIDTH = 70;
    private static final int FIELD_STATUS_WIDTH = 50;
    private static final int FIELD_VIRTUAL_WIDTH = 40;

    private CardMapper() {

    }

    public static Integer getColumnWidth(String fieldName) {
        if (FIELD_CARD_ID.equals(fieldName)) {
            return FIELD_CARD_ID_WIDTH;
        }

        if (FIELD_VIRTUAL.equals(fieldName)) {
            return FIELD_VIRTUAL_WIDTH;
        }

        if (FIELD_PRIMARY.equals(fieldName)) {
            return FIELD_PRIMARY_WIDTH;
        }

        if (FIELD_CARD_PRODUCT_ID.equals(fieldName)) {
            return FIELD_CARD_PRODUCT_ID_WIDTH;
        }

        if (FIELD_CARD_PROGRAM_ID.equals(fieldName)) {
            return FIELD_CARD_PROGRAM_ID_WIDTH;
        }

        if (FIELD_REFERENCE_ID.equals(fieldName)) {
            return FIELD_REFERENCE_ID_WIDTH;
        }

        if (FIELD_HOLDER_ID.equals(fieldName)) {
            return FIELD_HOLDER_ID_WIDTH;
        }

        if (FIELD_CURRENCY_ISON.equals(fieldName)) {
            return FIELD_CURRENCY_ISON_WIDTH;
        }

        if (FIELD_STATUS.equals(fieldName)) {
            return FIELD_STATUS_WIDTH;
        }

        if (FIELD_STATUS_DATE.equals(fieldName)) {
            return FIELD_STATUS_DATE_WIDTH;
        }

        if (FIELD_STATUS_CHANGE_SOURCE.equals(fieldName)) {
            return FIELD_STATUS_CHANGE_SOURCE_WIDTH;
        }

        if (FIELD_STATUS_CHANGE_REASON_CODE.equals(fieldName)) {
            return FIELD_STATUS_CHANGE_REASON_CODE_WIDTH;
        }

        if (FIELD_STATUS_CHANGE_NOTE.equals(fieldName)) {
            return FIELD_STATUS_CHANGE_NOTE_WIDTH;
        }

        if (FIELD_STATUS_CHANGE_ORIGINATOR_ID.equals(fieldName)) {
            return FIELD_STATUS_CHANGE_ORIGINATOR_ID_WIDTH;
        }

        if (FIELD_EXPIRY_DATE.equals(fieldName)) {
            return FIELD_EXPIRY_DATE_WIDTH;
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
            case FIELD_CARD_ID:
                columnHeader.setWidth(FIELD_CARD_ID_WIDTH);
                columnHeader.setText("Card ID");
                break;
            case FIELD_VIRTUAL:
                columnHeader.setWidth(FIELD_VIRTUAL_WIDTH);
                columnHeader.setText("Virtual");
                break;
            case FIELD_PRIMARY:
                columnHeader.setWidth(FIELD_PRIMARY_WIDTH);
                columnHeader.setText("Primary");
                break;
            case FIELD_CARD_PRODUCT_ID:
                columnHeader.setWidth(FIELD_CARD_PRODUCT_ID_WIDTH);
                columnHeader.setText("Card product ID");
                break;
            case FIELD_CARD_PROGRAM_ID:
                columnHeader.setWidth(FIELD_CARD_PROGRAM_ID_WIDTH);
                columnHeader.setText("Card program ID");
                break;
            case FIELD_REFERENCE_ID:
                columnHeader.setWidth(FIELD_REFERENCE_ID_WIDTH);
                columnHeader.setText("Reference ID");
                break;
            case FIELD_HOLDER_ID:
                columnHeader.setWidth(FIELD_HOLDER_ID_WIDTH);
                columnHeader.setText("Card holder ID");
                break;
            case FIELD_CURRENCY_ISON:
                columnHeader.setWidth(FIELD_CURRENCY_ISON_WIDTH);
                columnHeader.setText("Card currency ison");
                break;
            case FIELD_STATUS:
                columnHeader.setWidth(FIELD_STATUS_WIDTH);
                columnHeader.setText("Card status");
                break;
            case FIELD_STATUS_DATE:
                columnHeader.setWidth(FIELD_STATUS_DATE_WIDTH);
                columnHeader.setText("Card status date");
                break;
            case FIELD_STATUS_CHANGE_SOURCE:
                columnHeader.setWidth(FIELD_STATUS_CHANGE_SOURCE_WIDTH);
                columnHeader.setText("Card status change source");
                break;
            case FIELD_STATUS_CHANGE_REASON_CODE:
                columnHeader.setWidth(FIELD_STATUS_CHANGE_REASON_CODE_WIDTH);
                columnHeader.setText("Card status change reason code");
                break;
            case FIELD_STATUS_CHANGE_NOTE:
                columnHeader.setWidth(FIELD_STATUS_CHANGE_NOTE_WIDTH);
                columnHeader.setText("Card status change note");
                break;
            case FIELD_STATUS_CHANGE_ORIGINATOR_ID:
                columnHeader.setWidth(FIELD_STATUS_CHANGE_ORIGINATOR_ID_WIDTH);
                columnHeader.setText("Card status change originator ID");
                break;
            case FIELD_EXPIRY_DATE:
                columnHeader.setWidth(FIELD_EXPIRY_DATE_WIDTH);
                columnHeader.setText("Card expiry date");
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

        StringBuilder expressionBuilder = new StringBuilder(String.format("$F{%s}.get(\"", ACCOUNT_ITEM_FIELD_CARD_NAME));
        switch (fieldName) {
            case FIELD_CARD_ID:
                textField.setWidth(FIELD_CARD_ID_WIDTH);
                textField.setTextAdjust(TextAdjustEnum.STRETCH_HEIGHT);
                expressionBuilder.append(FIELD_CARD_ID);
                break;
            case FIELD_VIRTUAL:
                textField.setWidth(FIELD_VIRTUAL_WIDTH);
                expressionBuilder.append(FIELD_VIRTUAL);
                break;
            case FIELD_PRIMARY:
                textField.setWidth(FIELD_PRIMARY_WIDTH);
                expressionBuilder.append(FIELD_PRIMARY);
                break;
            case FIELD_CARD_PRODUCT_ID:
                textField.setWidth(FIELD_CARD_PRODUCT_ID_WIDTH);
                expressionBuilder.append(FIELD_CARD_PRODUCT_ID);
                break;
            case FIELD_CARD_PROGRAM_ID:
                textField.setWidth(FIELD_CARD_PROGRAM_ID_WIDTH);
                expressionBuilder.append(FIELD_CARD_PROGRAM_ID);
                break;
            case FIELD_REFERENCE_ID:
                textField.setWidth(FIELD_REFERENCE_ID_WIDTH);
                textField.setTextAdjust(TextAdjustEnum.STRETCH_HEIGHT);
                expressionBuilder.append(FIELD_REFERENCE_ID);
                break;
            case FIELD_HOLDER_ID:
                textField.setWidth(FIELD_HOLDER_ID_WIDTH);
                expressionBuilder.append(FIELD_HOLDER_ID);
                break;
            case FIELD_CURRENCY_ISON:
                textField.setWidth(FIELD_CURRENCY_ISON_WIDTH);
                expressionBuilder.append(FIELD_CURRENCY_ISON);
                break;
            case FIELD_STATUS:
                textField.setWidth(FIELD_STATUS_WIDTH);
                expressionBuilder.append(FIELD_STATUS);
                break;
            case FIELD_STATUS_DATE:
                textField.setWidth(FIELD_STATUS_DATE_WIDTH);
                expressionBuilder.append(FIELD_STATUS_DATE);
                break;
            case FIELD_STATUS_CHANGE_SOURCE:
                textField.setWidth(FIELD_STATUS_CHANGE_SOURCE_WIDTH);
                expressionBuilder.append(FIELD_STATUS_CHANGE_SOURCE);
                break;
            case FIELD_STATUS_CHANGE_REASON_CODE:
                textField.setWidth(FIELD_STATUS_CHANGE_REASON_CODE_WIDTH);
                expressionBuilder.append(FIELD_STATUS_CHANGE_REASON_CODE);
                break;
            case FIELD_STATUS_CHANGE_NOTE:
                textField.setWidth(FIELD_STATUS_CHANGE_NOTE_WIDTH);
                textField.setTextAdjust(TextAdjustEnum.STRETCH_HEIGHT);
                expressionBuilder.append(FIELD_STATUS_CHANGE_NOTE);
                break;
            case FIELD_STATUS_CHANGE_ORIGINATOR_ID:
                textField.setWidth(FIELD_STATUS_CHANGE_ORIGINATOR_ID_WIDTH);
                expressionBuilder.append(FIELD_STATUS_CHANGE_ORIGINATOR_ID);
                break;
            case FIELD_EXPIRY_DATE:
                textField.setWidth(FIELD_EXPIRY_DATE_WIDTH);
                expressionBuilder.append(FIELD_EXPIRY_DATE);
                break;
            default:
                break;
        }

        expressionBuilder.append("\")");
        textFieldExpression.setText(expressionBuilder.toString());

        return textField;
    }
}
