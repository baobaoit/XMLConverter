package com.hesmantech.ewmxmltool.service.report.filler;

import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.design.JasperDesign;

import java.util.List;
import java.util.Map;

public interface IReportFiller {
    void setReportFileName(String reportFileName);

    void setBeanList(List<Object> beanList);

    void setParameters(Map<String, Object> parameters);

    JasperPrint getJasperPrint();

    void compileReport(String compilePath);

    void fillReport();

    void compileReport(JasperDesign jasperDesign);
}
