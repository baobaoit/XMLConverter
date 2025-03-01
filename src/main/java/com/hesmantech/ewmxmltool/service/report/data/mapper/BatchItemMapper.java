package com.hesmantech.ewmxmltool.service.report.data.mapper;

import net.sf.jasperreports.engine.JRStyle;
import net.sf.jasperreports.engine.design.JRDesignExpression;
import net.sf.jasperreports.engine.design.JRDesignStaticText;
import net.sf.jasperreports.engine.design.JRDesignTextField;
import net.sf.jasperreports.engine.type.TextAdjustEnum;

import static com.hesmantech.ewmxmltool.service.report.data.mapper.constant.ItemMapperConstants.JASPER_REPORT_GET_FIELD_VALUE_FORMAT;

public final class BatchItemMapper {
    private BatchItemMapper() {

    }

    public static Integer getColumnWidth(String fieldName) {
        BatchItemField field = BatchItemField.valueFrom(fieldName);

        return field == null ? 0 : field.getWidth();
    }

    public static JRDesignStaticText getColumnHeader(String fieldName, JRStyle style) {
        JRDesignStaticText columnHeader = new JRDesignStaticText();
        columnHeader.setX(0);
        columnHeader.setY(0);
        columnHeader.setStyle(style);
        columnHeader.setBold(true);
        columnHeader.setHeight(30);

        BatchItemField field = BatchItemField.valueFrom(fieldName);

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

        BatchItemField field = BatchItemField.valueFrom(fieldName);

        if (field == null) {
            return textField;
        }

        textField.setWidth(field.getWidth());
        textFieldExpression.setText(String.format(JASPER_REPORT_GET_FIELD_VALUE_FORMAT, field.getName()));

        switch (field) {
            case FIELD_ITEM_TRANS_LINK:
                textField.setTextAdjust(TextAdjustEnum.STRETCH_HEIGHT);
                break;
            default:
                break;
        }

        return textField;
    }

    private enum BatchItemField {
        FIELD_ID("id", 100, "ID"),
        FIELD_EXTERNAL_TRANSACTION_ID("externalTransactionId", 210, "External Transaction ID"),
        FIELD_EXTERNAL_SHORT_REFERENCE("externalShortReference", 140, "External Short Reference"),
        FIELD_CURRENCY_EXCHANGE_SOURCE_ID("currencyExchangeSourceId", 157, "Currency Exchange Source ID"),
        FIELD_CURRENCY_CODE_PAIR("currencyCodePair", 105, "Currency Code Pair"),
        FIELD_FIXED_SIDE("fixedSide", 60, "Fixed Side"),
        FIELD_BUY_CURRENCY_ISON("buyCurrencyIson", 105, "Buy Currency ISON"),
        FIELD_SELL_CURRENCY_ISON("sellCurrencyIson", 105, "Sell Currency ISON"),
        FIELD_BUY_AMOUNT("buyAmount", 70, "Buy Amount"),
        FIELD_SELL_AMOUNT("sellAmount", 70, "Sell Amount"),
        FIELD_APPLIED_CONVERSION_RATE("appliedConversionRate", 130, "Applied Conversion Rate"),
        FIELD_DATE_CREATED("dateCreated", 107, "Date Created"),
        FIELD_DATE_SETTLED("dateSettled", 107, "Date Settled"),
        FIELD_DATE_CONVERSION("dateConversion", 107, "Date Conversion"),
        FIELD_ITEM_AUTHORIZE_ID("itemAuthorizeId", 100, "Item Authorize ID"),
        FIELD_ITEM_ACTUAL_AUTHORIZE_ID("itemActualAuthorizeId", 125, "Item Actual Authorize ID"),
        FIELD_ITEM_TRANSACTION_ID("itemTransactionId", 180, "Item Transaction ID"),
        FIELD_ITEM_CLEARING_FILE_ID("itemClearingFileId", 180, "Item Clearing File ID"),
        FIELD_ITEM_PROGRAM_ID("itemProgramId", 90, "Item Program ID"),
        FIELD_ITEM_CONVERSION_RATE("itemConversionRate", 115, "Item Conversion Rate"),
        FIELD_ITEM_FIXED_SIDE("itemFixedSide", 85, "Item Fixed Side"),
        FIELD_ITEM_AMOUNT("itemAmount", 70, "Item Amount"),
        FIELD_ITEM_TRANS_LINK("itemTransLink", 215, "Item Trans Link");

        private final String name;
        private final int width;
        private final String columnHeaderText;

        BatchItemField(String name, int width, String columnHeaderText) {
            this.name = name;
            this.width = width;
            this.columnHeaderText = columnHeaderText;
        }

        public static BatchItemField valueFrom(String fieldName) {
            for (BatchItemField value : BatchItemField.values()) {
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
