package com.hesmantech.ewmxmltool.service.report.data;

import com.hesmantech.ewmxmltool.service.report.format.FileType;

import java.util.List;

public interface ReportData<T> {
    List<T> getItems();

    String getFileName();

    FileType getFileType();

    String getDestinationDirectory();
}
