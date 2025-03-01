package com.hesmantech.ewmxmltool.service.report.exporter;

import net.sf.jasperreports.engine.JasperPrint;

public abstract class AbstractIReportExporter implements IReportExporter {
    protected JasperPrint jasperPrint;

    @Override
    public void setJasperPrint(JasperPrint jasperPrint) {
        this.jasperPrint = jasperPrint;
    }
}
