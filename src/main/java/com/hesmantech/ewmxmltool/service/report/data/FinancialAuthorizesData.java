package com.hesmantech.ewmxmltool.service.report.data;

import com.google.auto.value.AutoValue;
import com.hesmantech.ewmxmltool.service.report.format.FileType;

import java.util.List;

@AutoValue
public abstract class FinancialAuthorizesData implements ReportData<CardFinAuthorizationItem> {
    public static Builder builder() {
        return new AutoValue_FinancialAuthorizesData.Builder();
    }

    @AutoValue.Builder
    public abstract static class Builder {
        public abstract Builder fileType(FileType value);

        public abstract Builder fileName(String value);

        public abstract Builder items(List<CardFinAuthorizationItem> value);

        public abstract Builder destinationDirectory(String value);

        public abstract FinancialAuthorizesData build();
    }
}
