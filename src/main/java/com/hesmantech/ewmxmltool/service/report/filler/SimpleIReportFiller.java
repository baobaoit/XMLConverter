package com.hesmantech.ewmxmltool.service.report.filler;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.util.JRSaver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;

public class SimpleIReportFiller extends AbstractIReportFiller {
    private final Logger logger = LoggerFactory.getLogger(getClass());

    private SimpleIReportFiller() {
    }

    public static SimpleIReportFiller getInstance() {
        return SimpleReportFillerHolder.INSTANCE;
    }

    @Override
    public void compileReport(String compilePath) {
        try (InputStream reportStream = getClass().getResourceAsStream("/".concat(reportFileName))) {
            jasperReport = JasperCompileManager.compileReport(reportStream);
            JRSaver.saveObject(jasperReport, compilePath);
        } catch (IOException | JRException ex) {
            logger.error("An error occurred while compiling the report: {}", ex.getMessage(), ex);
        }
    }

    @Override
    public void fillReport() {
        try {
            jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, new JRBeanCollectionDataSource(beanList));
        } catch (JRException ex) {
            logger.error("An error occurred while filling the report: {}", ex.getMessage(), ex);
        }
    }

    @Override
    public void compileReport(JasperDesign jasperDesign) {
        try {
            jasperReport = JasperCompileManager.compileReport(jasperDesign);
        } catch (JRException ex) {
            logger.error("An error occurred while compiling the report: {}", ex.getMessage(), ex);
        }
    }

    private static class SimpleReportFillerHolder {
        private static final SimpleIReportFiller INSTANCE = new SimpleIReportFiller();
    }
}
