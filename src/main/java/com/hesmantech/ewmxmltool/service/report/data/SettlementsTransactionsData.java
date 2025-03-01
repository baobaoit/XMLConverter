package com.hesmantech.ewmxmltool.service.report.data;

import com.google.auto.value.AutoValue;
import com.hesmantech.ewmxmltool.service.report.format.FileType;

import java.util.List;

@AutoValue
public abstract class SettlementsTransactionsData implements ReportData<SettlementTransactionItem> {
    public static Builder builder() {
        return new AutoValue_SettlementsTransactionsData.Builder();
    }

    @AutoValue.Builder
    public abstract static class Builder {
        public abstract Builder fileType(FileType value);

        public abstract Builder fileName(String value);

        public abstract Builder items(List<SettlementTransactionItem> value);

        public abstract Builder destinationDirectory(String value);

        public abstract SettlementsTransactionsData build();
    }
}
