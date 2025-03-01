package com.hesmantech.ewmxmltool.service.report.exporter;

import net.sf.jasperreports.engine.JasperPrint;

public interface IReportExporter {
    void setJasperPrint(JasperPrint jasperPrint);

    void exportToXlsx(String fileName, String sheetName);

    void exportToCsv(String fileName);
}
