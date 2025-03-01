package com.hesmantech.ewmxmltool.service.report.data;

import com.google.auto.value.AutoValue;
import com.hesmantech.ewmxmltool.service.report.format.FileType;

import java.util.List;

@AutoValue
public abstract class CardsTransactionsData {
    public static Builder builder() {
        return new AutoValue_CardsTransactionsData.Builder();
    }

    public abstract FileType getFileType();

    public abstract String getFileName();

    public abstract List<CardTransactionItem> getCardTransactionItems();

    public abstract String getDestinationDirectory();

    @AutoValue.Builder
    public abstract static class Builder {
        public abstract Builder fileType(FileType value);

        public abstract Builder fileName(String value);

        public abstract Builder cardTransactionItems(List<CardTransactionItem> value);

        public abstract Builder destinationDirectory(String value);

        public abstract CardsTransactionsData build();
    }
}
