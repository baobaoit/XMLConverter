package com.hesmantech.ewmxmltool.service.report.data.mapper.constant;

public final class ItemMapperConstants {
    public static final String COLUMN_HEADER_CURRENCY = "Currency";
    public static final String COLUMN_HEADER_RATE = "Rate";
    public static final String JASPER_REPORT_GET_FIELD_VALUE_FORMAT = "$F{%s}";
    public static final String JASPER_REPORT_GET_FIELD_VALUE_IF_NULL_THEN_BLANK_FORMAT = "$F{%s} != null ? $F{%s} : \"\"";

    private ItemMapperConstants() {

    }
}
