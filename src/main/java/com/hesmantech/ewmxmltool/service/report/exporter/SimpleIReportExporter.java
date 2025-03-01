package com.hesmantech.ewmxmltool.service.report.exporter;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.export.JRCsvExporter;
import net.sf.jasperreports.engine.export.ooxml.JRXlsxExporter;
import net.sf.jasperreports.export.SimpleExporterInput;
import net.sf.jasperreports.export.SimpleOutputStreamExporterOutput;
import net.sf.jasperreports.export.SimpleWriterExporterOutput;
import net.sf.jasperreports.export.SimpleXlsxReportConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SimpleIReportExporter extends AbstractIReportExporter {
    private static final String EXPORT_TO_EXCEL_ERROR_MSG = "An error occurred while exporting the report to Excel: {}";
    private static final String EXPORT_TO_CSV_ERROR_MSG = "An error occurred while exporting the report to CSV: {}";
    private final Logger logger = LoggerFactory.getLogger(getClass());

    private SimpleIReportExporter() {
    }

    public static SimpleIReportExporter getInstance() {
        return SimpleIReportExporterHolder.INSTANCE;
    }

    @Override
    public void exportToXlsx(String fileName, String sheetName) {
        JRXlsxExporter exporter = new JRXlsxExporter();

        exporter.setExporterInput(new SimpleExporterInput(jasperPrint));
        exporter.setExporterOutput(new SimpleOutputStreamExporterOutput(fileName));

        SimpleXlsxReportConfiguration reportConfig = new SimpleXlsxReportConfiguration();
        reportConfig.setSheetNames(new String[]{sheetName});

        exporter.setConfiguration(reportConfig);

        try {
            exporter.exportReport();
        } catch (JRException ex) {
            logger.error(EXPORT_TO_EXCEL_ERROR_MSG, ex.getMessage(), ex);
        }
    }

    @Override
    public void exportToCsv(String fileName) {
        JRCsvExporter exporter = new JRCsvExporter();

        exporter.setExporterInput(new SimpleExporterInput(jasperPrint));
        exporter.setExporterOutput(new SimpleWriterExporterOutput(fileName));

        try {
            exporter.exportReport();
        } catch (JRException ex) {
            logger.error(EXPORT_TO_CSV_ERROR_MSG, ex.getMessage(), ex);
        }
    }

    private static class SimpleIReportExporterHolder {
        private static final SimpleIReportExporter INSTANCE = new SimpleIReportExporter();
    }
}
