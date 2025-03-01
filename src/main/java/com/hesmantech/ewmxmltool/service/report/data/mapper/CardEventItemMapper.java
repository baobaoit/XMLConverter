package com.hesmantech.ewmxmltool.service.report.data.mapper;

import net.sf.jasperreports.engine.JRStyle;
import net.sf.jasperreports.engine.design.JRDesignExpression;
import net.sf.jasperreports.engine.design.JRDesignStaticText;
import net.sf.jasperreports.engine.design.JRDesignTextField;
import net.sf.jasperreports.engine.type.TextAdjustEnum;

import static com.hesmantech.ewmxmltool.service.report.data.mapper.constant.ItemMapperConstants.JASPER_REPORT_GET_FIELD_VALUE_FORMAT;

public final class CardEventItemMapper {
    private CardEventItemMapper() {

    }

    public static Integer getColumnWidth(String fieldName) {
        CardEventItemField field = CardEventItemField.valueFrom(fieldName);

        return field == null ? 0 : field.getWidth();
    }

    public static JRDesignStaticText getColumnHeader(String fieldName, JRStyle style) {
        JRDesignStaticText columnHeader = new JRDesignStaticText();
        columnHeader.setX(0);
        columnHeader.setY(0);
        columnHeader.setStyle(style);
        columnHeader.setBold(true);
        columnHeader.setHeight(30);

        CardEventItemField field = CardEventItemField.valueFrom(fieldName);

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

        CardEventItemField field = CardEventItemField.valueFrom(fieldName);

        if (field == null) {
            return textField;
        }

        textField.setWidth(field.getWidth());
        textFieldExpression.setText(String.format(JASPER_REPORT_GET_FIELD_VALUE_FORMAT, field.getName()));

        switch (field) {
            case FIELD_EVENT_NOTE:
                textField.setTextAdjust(TextAdjustEnum.STRETCH_HEIGHT);
                break;
            default:
                break;
        }

        return textField;
    }

    private enum CardEventItemField {
        FIELD_CARD_ID("cardId", 50, "Card ID"),
        FIELD_CARD_PRODUCT("cardProduct", 70, "Card Product"),
        FIELD_EVENT_TYPE("eventType", 150, "Event Type"),
        FIELD_EVENT_DATE("eventDate", 120, "Date"),
        FIELD_EVENT_OLD_CARD_STATUS("eventOldCardStatus", 85, "Old Card Status"),
        FIELD_EVENT_CARD_STATUS("eventCardStatus", 65, "Card Status"),
        FIELD_EVENT_ACTIVATION_DATE("eventActivationDate", 110, "Activation Date"),
        FIELD_EVENT_SOURCE("eventSource", 45, "Source"),
        FIELD_EVENT_REASON_CODE("eventReasonCode", 75, "Reason Code"),
        FIELD_EVENT_NOTE("eventNote", 250, "Note"),
        FIELD_EVENT_ORIGINATOR_ID("eventOriginatorId", 70, "Originator ID");

        private final String name;
        private final int width;
        private final String columnHeaderText;

        CardEventItemField(String name, int width, String columnHeaderText) {
            this.name = name;
            this.width = width;
            this.columnHeaderText = columnHeaderText;
        }

        public static CardEventItemField valueFrom(String fieldName) {
            for (CardEventItemField value : CardEventItemField.values()) {
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
