package com.hesmantech.ewmxmltool.service.report.data;

import com.google.auto.value.AutoValue;
import com.hesmantech.ewmxmltool.service.report.format.FileType;

import java.util.List;

@AutoValue
public abstract class CardsEventsData implements ReportData<CardEventItem> {
    public static Builder builder() {
        return new AutoValue_CardsEventsData.Builder();
    }

    @AutoValue.Builder
    public abstract static class Builder {
        public abstract Builder fileType(FileType value);

        public abstract Builder fileName(String value);

        public abstract Builder items(List<CardEventItem> value);

        public abstract Builder destinationDirectory(String value);

        public abstract CardsEventsData build();
    }
}
