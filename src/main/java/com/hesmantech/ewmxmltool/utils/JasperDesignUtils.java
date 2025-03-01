package com.hesmantech.ewmxmltool.utils;

import net.sf.jasperreports.components.table.DesignCell;
import net.sf.jasperreports.components.table.StandardColumn;
import net.sf.jasperreports.components.table.TableComponent;
import net.sf.jasperreports.engine.JRBand;
import net.sf.jasperreports.engine.JRElement;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRSection;
import net.sf.jasperreports.engine.JRStyle;
import net.sf.jasperreports.engine.base.JRBoxPen;
import net.sf.jasperreports.engine.component.ComponentKey;
import net.sf.jasperreports.engine.design.JRDesignBand;
import net.sf.jasperreports.engine.design.JRDesignComponentElement;
import net.sf.jasperreports.engine.design.JRDesignElement;
import net.sf.jasperreports.engine.design.JRDesignElementGroup;
import net.sf.jasperreports.engine.design.JRDesignField;
import net.sf.jasperreports.engine.design.JRDesignSection;
import net.sf.jasperreports.engine.design.JRDesignStyle;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.type.ModeEnum;
import net.sf.jasperreports.engine.type.OrientationEnum;
import net.sf.jasperreports.engine.type.PrintOrderEnum;
import net.sf.jasperreports.engine.type.RunDirectionEnum;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.awt.*;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class JasperDesignUtils {
    public static final String STYLE_TABLE_10 = "table 10";
    public static final String STYLE_TABLE_10_CH = "table 10_CH";
    public static final String STYLE_TABLE_10_TD = "table 10_TD";
    public static final String JASPER_DESIGN_SUB_DATASET_NAME = "ItemDataset";
    private static final Color COLOR_FRENCH_PASS = Color.decode("#BFE1FF");
    private static final String COMPONENT_KEY_NAMESPACE = "http://jasperreports.sourceforge.net/jasperreports/components";
    private static final String COMPONENT_KEY_NAMESPACE_PREFIX_JR = "jr";
    private static final String COMPONENT_KEY_NAME_TABLE = "table";
    private static final String JASPER_DESIGN_LANGUAGE = "groovy";
    private static final String JASPER_DESIGN_PROPERTY_DEFAULT_DATA_ADAPTER = "com.jaspersoft.studio.data.defaultdataadapter";
    private static final String JASPER_DESIGN_PROPERTY_EXPORT_XLS_DETECT_CELL_TYPE = "net.sf.jasperreports.export.xls.detect.cell.type";
    private static final String JASPER_DESIGN_PROPERTY_IREPORT_X = "ireport.x";
    private static final String JASPER_DESIGN_PROPERTY_IREPORT_Y = "ireport.y";
    private static final String JASPER_DESIGN_PROPERTY_IREPORT_ZOOM = "ireport.zoom";
    private final Logger logger = LoggerFactory.getLogger(getClass());
    private final Map<String, JRStyle> styleMap;

    private JasperDesignUtils() {
        styleMap = initializeStyleMap();
    }

    public static JasperDesignUtils getInstance() {
        return JasperDesignUtilsHolder.INSTANCE;
    }

    private static JasperDesign generateJasperDesign(String reportName) {
        JasperDesign jasperDesign = new JasperDesign();
        jasperDesign.setBottomMargin(0);
        jasperDesign.setColumnCount(1);
        jasperDesign.setColumnDirection(RunDirectionEnum.LTR);
        jasperDesign.setColumnSpacing(0);
        jasperDesign.setColumnWidth(595);
        jasperDesign.setIgnorePagination(true);
        jasperDesign.setLanguage(JASPER_DESIGN_LANGUAGE);
        jasperDesign.setLeftMargin(0);
        jasperDesign.setName(reportName);
        jasperDesign.setOrientation(OrientationEnum.PORTRAIT);
        jasperDesign.setPageHeight(842);
        jasperDesign.setPageWidth(595);
        jasperDesign.setPrintOrder(PrintOrderEnum.VERTICAL);
        jasperDesign.setRightMargin(0);
        jasperDesign.setTopMargin(0);

        jasperDesign.setProperty(JASPER_DESIGN_PROPERTY_DEFAULT_DATA_ADAPTER, "One Empty Record");
        jasperDesign.setProperty(JASPER_DESIGN_PROPERTY_EXPORT_XLS_DETECT_CELL_TYPE, "true");
        jasperDesign.setProperty(JASPER_DESIGN_PROPERTY_IREPORT_X, "0");
        jasperDesign.setProperty(JASPER_DESIGN_PROPERTY_IREPORT_Y, "0");
        jasperDesign.setProperty(JASPER_DESIGN_PROPERTY_IREPORT_ZOOM, "1.5");

        return jasperDesign;
    }

    private Map<String, JRStyle> initializeStyleMap() {
        Map<String, JRStyle> internalStyleMap = new HashMap<>();

        JRDesignStyle table10 = new JRDesignStyle();
        table10.setName(STYLE_TABLE_10);
        JRBoxPen table10BoxPen = table10.getLineBox().getPen();
        table10BoxPen.setLineWidth(1f);
        table10BoxPen.setLineColor(Color.BLACK);
        internalStyleMap.put(STYLE_TABLE_10, table10);

        JRDesignStyle table10CH = new JRDesignStyle();
        table10CH.setName(STYLE_TABLE_10_CH);
        table10CH.setMode(ModeEnum.OPAQUE);
        table10CH.setBackcolor(COLOR_FRENCH_PASS);
        JRBoxPen table10CHBoxPen = table10CH.getLineBox().getPen();
        table10CHBoxPen.setLineWidth(0.5f);
        table10CHBoxPen.setLineColor(Color.BLACK);
        internalStyleMap.put(STYLE_TABLE_10_CH, table10CH);

        JRDesignStyle table10TD = new JRDesignStyle();
        table10TD.setName(STYLE_TABLE_10_TD);
        table10TD.setMode(ModeEnum.OPAQUE);
        table10TD.setBackcolor(Color.WHITE);
        JRBoxPen table10TDBoxPen = table10TD.getLineBox().getPen();
        table10TDBoxPen.setLineWidth(0.5f);
        table10TDBoxPen.setLineColor(Color.BLACK);
        internalStyleMap.put(STYLE_TABLE_10_TD, table10TD);

        return Collections.unmodifiableMap(internalStyleMap);
    }

    public JasperDesign createJasperDesign(String reportName) {
        JasperDesign jasperDesign = generateJasperDesign(reportName);

        try {
            jasperDesign.addStyle(styleMap.get(STYLE_TABLE_10));
            jasperDesign.addStyle(styleMap.get(STYLE_TABLE_10_CH));
            jasperDesign.addStyle(styleMap.get(STYLE_TABLE_10_TD));
        } catch (JRException ex) {
            logger.error("An error occurred when add style for Jasper Design: {}", ex.getMessage(), ex);
        }

        JRDesignElementGroup band = addBandToDetailSection(jasperDesign);

        JRDesignComponentElement componentElement = new JRDesignComponentElement();
        componentElement.setComponentKey(new ComponentKey(COMPONENT_KEY_NAMESPACE, COMPONENT_KEY_NAMESPACE_PREFIX_JR, COMPONENT_KEY_NAME_TABLE));
        componentElement.setKey(STYLE_TABLE_10);
        componentElement.setStyle(styleMap.get(STYLE_TABLE_10));
        componentElement.setX(0);
        componentElement.setY(0);
        band.addElement(componentElement);

        return jasperDesign;
    }

    public void addTableComponentToJasperDesign(JasperDesign jasperDesign, TableComponent tableComponent) {
        JRSection detailSection = jasperDesign.getDetailSection();
        JRBand[] bands = detailSection.getBands();
        if (bands != null && bands.length > 0) {
            JRBand band = bands[0];
            JRElement[] elements = band.getElements();
            if (elements != null && elements.length > 0) {
                JRDesignComponentElement componentElement = (JRDesignComponentElement) elements[0];
                componentElement.setComponent(tableComponent);
            }
        }
    }

    public String getDatasetRunExpressionText(String parameterCollectionName) {
        return String.format("new net.sf.jasperreports.engine.data.JRBeanCollectionDataSource($P{%s})", parameterCollectionName);
    }

    public JRStyle getStyle(String styleName) {
        if (!styleMap.containsKey(styleName)) {
            throw new IllegalArgumentException("Doesn't exist this style name");
        }

        return styleMap.get(styleName);
    }

    public void addDetailCellToColumn(StandardColumn column, JRDesignElement columnHeader, JRDesignElement columnDetail) {
        DesignCell columnHeaderCell = new DesignCell();
        columnHeaderCell.addElement(columnHeader);
        columnHeaderCell.setHeight(columnHeader.getHeight());
        columnHeaderCell.setRowSpan(1);
        DesignCell detailCell = new DesignCell();
        detailCell.addElement(columnDetail);
        detailCell.setHeight(columnDetail.getHeight());
        detailCell.setRowSpan(1);
        column.setDetailCell(detailCell);
        column.setColumnHeader(columnHeaderCell);
    }

    public JRDesignField convertObjectFieldToJRDesignField(String fieldName, Class<?> fieldType) {
        JRDesignField designField = new JRDesignField();
        designField.setName(fieldName);
        designField.setValueClass(fieldType);
        return designField;
    }

    private JRDesignElementGroup addBandToDetailSection(JasperDesign jasperDesign) {
        JRDesignBand band = new JRDesignBand();
        band.setHeight(76);

        JRDesignSection detailSection = (JRDesignSection) jasperDesign.getDetailSection();
        detailSection.addBand(band);

        return band;
    }

    private static class JasperDesignUtilsHolder {
        private static final JasperDesignUtils INSTANCE = new JasperDesignUtils();
    }
}
