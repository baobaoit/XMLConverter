package com.hesmantech.ewmxmltool.service.report.filler;

import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class AbstractIReportFiller implements IReportFiller {
    protected String reportFileName;
    protected List<Object> beanList;
    protected Map<String, Object> parameters;
    protected JasperReport jasperReport;
    protected JasperPrint jasperPrint;

    protected AbstractIReportFiller() {
        beanList = new ArrayList<>();
        parameters = new HashMap<>();
    }

    @Override
    public void setReportFileName(String reportFileName) {
        this.reportFileName = reportFileName;
    }

    @Override
    public void setBeanList(List<Object> beanList) {
        this.beanList = beanList;
    }

    @Override
    public void setParameters(Map<String, Object> parameters) {
        this.parameters = parameters;
    }

    @Override
    public JasperPrint getJasperPrint() {
        return jasperPrint;
    }
}
