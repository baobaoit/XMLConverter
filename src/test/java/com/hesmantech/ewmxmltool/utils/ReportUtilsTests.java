package com.hesmantech.ewmxmltool.utils;

import com.hesmantech.ewmxmltool.service.report.exporter.IReportExporter;
import com.hesmantech.ewmxmltool.service.report.filler.IReportFiller;
import com.hesmantech.ewmxmltool.service.report.filler.SimpleIReportFiller;
import com.hesmantech.ewmxmltool.service.report.format.FileType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

class ReportUtilsTests {
    final Logger logger = Logger.getLogger(getClass().getName());

    ReportUtils reportUtils;

    @Test
    void initOk() {
        reportUtils = ReportUtils.getInstance();
        Assertions.assertNotNull(reportUtils);
    }

    @Test
    void readAndCompileFileOk() {
        final String ANY_TEMPLATE_FILE_NAME = "ANY_TEMPLATE_FILE_NAME";
        try {
            reportUtils = Mockito.mock(ReportUtils.class);
            Mockito.doNothing().when(reportUtils).readAndCompileReportFile(Mockito.anyString());
            reportUtils.readAndCompileReportFile(ANY_TEMPLATE_FILE_NAME);
            Mockito.verify(reportUtils, Mockito.times(1))
                    .readAndCompileReportFile(ANY_TEMPLATE_FILE_NAME);
        } catch (IOException ex) {
            logger.log(Level.SEVERE,
                    "An error occurred during read and compile report file", ex);
        }
    }

    @Test
    void exportToFileExtensionOk() {
        final FileType ANY_FILE_TYPE = FileType.XLSX;
        final String ANY_EXPORT_FILE = "ANY_EXPORT_FILE";
        final String ANY_SHEET_NAME = "ANY_SHEET_NAME";
        reportUtils = Mockito.mock(ReportUtils.class);
        Mockito.doNothing().when(reportUtils)
                .exportToFileExtension(Mockito.any(FileType.class), Mockito.anyString(), Mockito.anyString());
        reportUtils.exportToFileExtension(ANY_FILE_TYPE, ANY_EXPORT_FILE, ANY_SHEET_NAME);
        Mockito.verify(reportUtils, Mockito.times(1))
                .exportToFileExtension(ANY_FILE_TYPE, ANY_EXPORT_FILE, ANY_SHEET_NAME);
    }

    @Test
    void getReportFiller_IsInstanceOfSimpleIReportFiller() {
        reportUtils = ReportUtils.getInstance();
        IReportFiller reportFiller = reportUtils.getReportFiller();
        Assertions.assertInstanceOf(SimpleIReportFiller.class, reportFiller);
    }

    @Test
    void setReportFillerOk() {
        reportUtils = Mockito.mock(ReportUtils.class);
        IReportFiller reportFiller = Mockito.mock(IReportFiller.class);
        Mockito.doNothing().when(reportUtils).setReportFiller(Mockito.any(IReportFiller.class));
        reportUtils.setReportFiller(reportFiller);
        Mockito.verify(reportUtils, Mockito.times(1)).setReportFiller(reportFiller);
    }

    @Test
    void setReportExporterOk() {
        reportUtils = Mockito.mock(ReportUtils.class);
        IReportExporter reportExporter = Mockito.mock(IReportExporter.class);
        Mockito.doNothing().when(reportUtils).setReportExporter(Mockito.any(IReportExporter.class));
        reportUtils.setReportExporter(reportExporter);
        Mockito.verify(reportUtils, Mockito.times(1)).setReportExporter(reportExporter);
    }
}
