package com.hesmantech.ewmxmltool.service.report.format;

public enum FileType {
    XLSX(".xlsx"),
    CSV(".csv"),
    JRXML(".jrxml"),
    JASPER(".jasper"),
    XML(".xml");

    private final String dotExtension;

    FileType(final String dotExtension) {
        this.dotExtension = dotExtension;
    }

    public String getDotExtension() {
        return dotExtension;
    }
}
