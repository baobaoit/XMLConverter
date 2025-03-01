package com.hesmantech.ewmxmltool.service.report.data;

import com.google.auto.value.AutoValue;
import com.hesmantech.ewmxmltool.service.report.format.FileType;

import java.util.List;

@AutoValue
public abstract class AccountsActivitesData implements ReportData<AccountActivityItem> {
    public static Builder builder() {
        return new AutoValue_AccountsActivitesData.Builder();
    }

    @AutoValue.Builder
    public abstract static class Builder {
        public abstract Builder fileType(FileType value);

        public abstract Builder fileName(String value);

        public abstract Builder items(List<AccountActivityItem> value);

        public abstract Builder destinationDirectory(String value);

        public abstract AccountsActivitesData build();
    }
}
