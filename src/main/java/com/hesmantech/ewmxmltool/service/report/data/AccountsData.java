package com.hesmantech.ewmxmltool.service.report.data;

import com.google.auto.value.AutoValue;
import com.hesmantech.ewmxmltool.service.report.format.FileType;

import java.util.List;

@AutoValue
public abstract class AccountsData {
    public static Builder builder() {
        return new AutoValue_AccountsData.Builder();
    }

    public abstract FileType getFileType();

    public abstract String getFileName();

    public abstract List<AccountItem> getAccountItems();

    public abstract String getDestinationDirectory();

    @AutoValue.Builder
    public abstract static class Builder {
        public abstract Builder fileType(FileType value);

        public abstract Builder fileName(String value);

        public abstract Builder accountItems(List<AccountItem> value);

        public abstract Builder destinationDirectory(String value);

        public abstract AccountsData build();
    }
}
