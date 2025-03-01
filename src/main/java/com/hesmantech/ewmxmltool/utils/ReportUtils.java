package com.hesmantech.ewmxmltool.utils;

import com.hesmantech.ewmxmltool.exception.FileResourceNotFound;
import com.hesmantech.ewmxmltool.service.report.data.SettlementTransactionItem;
import com.hesmantech.ewmxmltool.service.report.data.mapper.CardSnapshotItemMapper;
import com.hesmantech.ewmxmltool.service.report.data.AccountActivityItem;
import com.hesmantech.ewmxmltool.service.report.data.AccountItem;
import com.hesmantech.ewmxmltool.service.report.data.AccountSnapshotItem;
import com.hesmantech.ewmxmltool.service.report.data.AccountTransactionItem;
import com.hesmantech.ewmxmltool.service.report.data.AuthorizeItem;
import com.hesmantech.ewmxmltool.service.report.data.BatchItem;
import com.hesmantech.ewmxmltool.service.report.data.CardEventItem;
import com.hesmantech.ewmxmltool.service.report.data.CardFinAuthorizationItem;
import com.hesmantech.ewmxmltool.service.report.data.CardItem;
import com.hesmantech.ewmxmltool.service.report.data.CardSnapshotItem;
import com.hesmantech.ewmxmltool.service.report.data.LookupItem;
import com.hesmantech.ewmxmltool.service.report.data.mapper.AccountActivityItemMapper;
import com.hesmantech.ewmxmltool.service.report.data.mapper.AccountItemMapper;
import com.hesmantech.ewmxmltool.service.report.data.mapper.AccountSnapshotItemMapper;
import com.hesmantech.ewmxmltool.service.report.data.mapper.AccountTransactionItemMapper;
import com.hesmantech.ewmxmltool.service.report.data.mapper.AuthorizeItemMapper;
import com.hesmantech.ewmxmltool.service.report.data.mapper.BankAccountMapper;
import com.hesmantech.ewmxmltool.service.report.data.mapper.BatchItemMapper;
import com.hesmantech.ewmxmltool.service.report.data.mapper.CardEventItemMapper;
import com.hesmantech.ewmxmltool.service.report.data.mapper.CardFinAuthorizationItemMapper;
import com.hesmantech.ewmxmltool.service.report.data.mapper.CardItemMapper;
import com.hesmantech.ewmxmltool.service.report.data.mapper.CardMapper;
import com.hesmantech.ewmxmltool.service.report.data.mapper.LookupItemMapper;
import com.hesmantech.ewmxmltool.service.report.data.mapper.SettlementTransactionItemMapper;
import com.hesmantech.ewmxmltool.service.report.exporter.IReportExporter;
import com.hesmantech.ewmxmltool.service.report.exporter.SimpleIReportExporter;
import com.hesmantech.ewmxmltool.service.report.filler.IReportFiller;
import com.hesmantech.ewmxmltool.service.report.filler.SimpleIReportFiller;
import com.hesmantech.ewmxmltool.service.report.format.FileType;
import com.hesmantech.ewmxmltool.xml.data.accounts.Card;
import com.hesmantech.ewmxmltool.xml.data.accountssnapshots.BankAccount;
import net.sf.jasperreports.components.table.StandardColumn;
import net.sf.jasperreports.components.table.StandardTable;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRStyle;
import net.sf.jasperreports.engine.design.JRDesignDataset;
import net.sf.jasperreports.engine.design.JRDesignDatasetRun;
import net.sf.jasperreports.engine.design.JRDesignExpression;
import net.sf.jasperreports.engine.design.JRDesignParameter;
import net.sf.jasperreports.engine.design.JRDesignStaticText;
import net.sf.jasperreports.engine.design.JRDesignTextField;
import net.sf.jasperreports.engine.design.JasperDesign;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.function.BiConsumer;

public class ReportUtils {
    private static final String REPORT_TEMPLATES_DIRECTORY = "report-templates/";
    private final JasperDesignUtils jasperDesignUtils;
    private final Logger logger = LoggerFactory.getLogger(getClass());
    private IReportExporter reportExporter;
    private IReportFiller reportFiller;

    private ReportUtils() {
        reportFiller = SimpleIReportFiller.getInstance();
        reportExporter = SimpleIReportExporter.getInstance();
        jasperDesignUtils = JasperDesignUtils.getInstance();
    }

    public static ReportUtils getInstance() {
        return ReportUtilsHolder.INSTANCE;
    }

    public void readAndCompileReportFile(String templateFileName) throws IOException {
        // Start processing the report.
        final String templatePath = String.format("%s%s", REPORT_TEMPLATES_DIRECTORY, templateFileName);
        final String fileName = String.format("%s%s", templatePath, FileType.JRXML.getDotExtension());
        File file = FileUtils.readFileFromResource(fileName, FileType.JRXML.getDotExtension());
        if (file == null || !file.exists()) {
            throw new FileResourceNotFound(fileName);
        }

        final String compilePath = file.getPath().replace(FileType.JRXML.getDotExtension(), FileType.JASPER.getDotExtension());
        reportFiller.setReportFileName(fileName);
        reportFiller.compileReport(compilePath);
    }

    public void exportToFileExtension(FileType fileType, String exportFile, String sheetName) {
        reportExporter.setJasperPrint(reportFiller.getJasperPrint());

        if (FileType.XLSX.equals(fileType)) {
            reportExporter.exportToXlsx(exportFile, sheetName);
        } else if (FileType.CSV.equals(fileType)) {
            reportExporter.exportToCsv(exportFile);
        }
    }

    public void compileAccountsReport() {
        try {
            JasperDesign jasperDesign = generateJasperDesign("AccountsReport",
                    this::generateAccountsTable);

            reportFiller.compileReport(jasperDesign);
        } catch (JRException | SecurityException ex) {
            logger.error("An error occurred when compile Accounts report {}", ex.getMessage(), ex);
        }
    }

    public void compileAccountsSnapshotsReport() {
        try {
            JasperDesign jasperDesign = generateJasperDesign("AccountsSnapshotsReport",
                    this::generateAccountsSnapshotsTable);

            reportFiller.compileReport(jasperDesign);
        } catch (JRException | SecurityException ex) {
            logger.error("An error occurred when compile Accounts Snapshots report {}", ex.getMessage(), ex);
        }
    }

    public void compileAccountsTransactionsReport() {
        try {
            JasperDesign jasperDesign = generateJasperDesign("AccountsTransactionsReport",
                    this::generateAccountsTransactionsTable);

            reportFiller.compileReport(jasperDesign);
        } catch (JRException | SecurityException ex) {
            logger.error("An error occurred when compile Accounts Transactions report {}", ex.getMessage(), ex);
        }
    }

    public void compileAuthorizesReport() {
        try {
            JasperDesign jasperDesign = generateJasperDesign("AuthorizesReport",
                    this::generateAuthorizesTable);

            reportFiller.compileReport(jasperDesign);
        } catch (JRException | SecurityException ex) {
            logger.error("An error occurred when compile Authorizes report {}", ex.getMessage(), ex);
        }
    }

    public void compileCardsEventsReport() {
        try {
            JasperDesign jasperDesign = generateJasperDesign("CardsEventsReport",
                    this::generateCardsEventsTable);

            reportFiller.compileReport(jasperDesign);
        } catch (JRException | SecurityException ex) {
            logger.error("An error occurred when compile Cards Events report {}", ex.getMessage(), ex);
        }
    }

    public void compileFinancialAuthorizesReport() {
        try {
            JasperDesign jasperDesign = generateJasperDesign("FinancialAuthorizesReport",
                    this::generateFinancialAuthorizesTable);

            reportFiller.compileReport(jasperDesign);
        } catch (JRException | SecurityException ex) {
            logger.error("An error occurred when compile Fin Authorizes report {}", ex.getMessage(), ex);
        }
    }

    public void compileCurrencyExchangesReport() {
        try {
            JasperDesign jasperDesign = generateJasperDesign("CurrencyExchangesReport",
                    this::generateCurrencyExchangesTable);

            reportFiller.compileReport(jasperDesign);
        } catch (JRException | SecurityException ex) {
            logger.error("An error occurred when compile Currency Exchanges report {}", ex.getMessage(), ex);
        }
    }

    public void compileAccountsActivitesReport() {
        try {
            JasperDesign jasperDesign = generateJasperDesign("AccountsActivitesReport",
                    this::generateAccountsActivitesTable);

            reportFiller.compileReport(jasperDesign);
        } catch (JRException | SecurityException ex) {
            logger.error("An error occurred when compile Accounts Activities report {}", ex.getMessage(), ex);
        }
    }

    public void compileCardsReport() {
        try {
            JasperDesign jasperDesign = generateJasperDesign("CardsReport",
                    this::generateCardsTable);

            reportFiller.compileReport(jasperDesign);
        } catch (JRException | SecurityException ex) {
            logger.error("An error occurred when compile Cards report {}", ex.getMessage(), ex);
        }
    }

    public void compileCardsSnapshotsReport() {
        try {
            JasperDesign jasperDesign = generateJasperDesign("CardsSnapshotsReport",
                    this::generateCardsSnapshotsTable);

            reportFiller.compileReport(jasperDesign);
        } catch (JRException | SecurityException ex) {
            logger.error("An error occurred when compile Cards Snapshots report {}", ex.getMessage(), ex);
        }
    }

    public void compileLookupsReport() {
        try {
            JasperDesign jasperDesign = generateJasperDesign("LookupsReport",
                    this::generateLookupsTable);

            reportFiller.compileReport(jasperDesign);
        } catch (JRException | SecurityException ex) {
            logger.error("An error occurred when compile Lookups report {}", ex.getMessage(), ex);
        }
    }

    public void compileSettlementsTransactionsReport() {
        try {
            JasperDesign jasperDesign = generateJasperDesign("SettlementsTransactionsReport",
                    this::generateSettlementsTransactionsTable);

            reportFiller.compileReport(jasperDesign);
        } catch (JRException | SecurityException ex) {
            logger.error("An error occurred when compile Settlements Transactions report {}", ex.getMessage(), ex);
        }
    }

    private JasperDesign generateJasperDesign(String reportName, BiConsumer<JRDesignDataset, StandardTable> generateTable) throws JRException {
        JasperDesign jasperDesign = jasperDesignUtils.createJasperDesign(reportName);

        JRDesignParameter parameter = new JRDesignParameter();
        final String PARAMETER_COLLECTION_NAME = "items";
        parameter.setName(PARAMETER_COLLECTION_NAME);
        parameter.setValueClass(Collection.class);
        jasperDesign.addParameter(parameter);

        JRDesignDataset subDataset = new JRDesignDataset(false);
        subDataset.setName(JasperDesignUtils.JASPER_DESIGN_SUB_DATASET_NAME);
        jasperDesign.addDataset(subDataset);

        StandardTable table = new StandardTable();
        JRDesignDatasetRun datasetRun = new JRDesignDatasetRun();
        datasetRun.setDatasetName(JasperDesignUtils.JASPER_DESIGN_SUB_DATASET_NAME);
        JRDesignExpression expression = new JRDesignExpression();
        expression.setText(jasperDesignUtils.getDatasetRunExpressionText(PARAMETER_COLLECTION_NAME));
        datasetRun.setDataSourceExpression(expression);
        table.setDatasetRun(datasetRun);
        jasperDesignUtils.addTableComponentToJasperDesign(jasperDesign, table);

        generateTable.accept(subDataset, table);

        return jasperDesign;
    }

    private void generateAccountsTable(JRDesignDataset subDataset, StandardTable table) {
        try {
            JRStyle styleTable10TD = jasperDesignUtils.getStyle(JasperDesignUtils.STYLE_TABLE_10_TD);
            JRStyle styleTable10CH = jasperDesignUtils.getStyle(JasperDesignUtils.STYLE_TABLE_10_CH);

            Field[] fields = AccountItem.class.getDeclaredFields();
            for (Field field : fields) {
                final String fieldName = field.getName();
                subDataset.addField(jasperDesignUtils.convertObjectFieldToJRDesignField(fieldName, field.getType()));

                if ("card".equals(fieldName)) {
                    continue;
                }

                StandardColumn column = new StandardColumn();
                column.setWidth(AccountItemMapper.getColumnWidth(fieldName));

                JRDesignStaticText columnHeader = AccountItemMapper.getColumnHeader(fieldName, styleTable10CH);
                JRDesignTextField columnDetail = AccountItemMapper.getColumnDetail(fieldName, styleTable10TD);

                jasperDesignUtils.addDetailCellToColumn(column, columnHeader, columnDetail);

                table.addColumn(column);
            }

            Field[] cardFields = Card.class.getDeclaredFields();
            for (Field field : cardFields) {
                final String fieldName = field.getName();
                StandardColumn column = new StandardColumn();
                column.setWidth(CardMapper.getColumnWidth(fieldName));

                JRDesignStaticText columnHeader = CardMapper.getColumnHeader(fieldName, styleTable10CH);
                JRDesignTextField columnDetail = CardMapper.getColumnDetail(fieldName, styleTable10TD);

                jasperDesignUtils.addDetailCellToColumn(column, columnHeader, columnDetail);

                table.addColumn(column);
            }
        } catch (Exception ex) {
            logger.error("An error occurred when generate Accounts table {}", ex.getMessage(), ex);
        }
    }

    private void generateAccountsSnapshotsTable(JRDesignDataset subDataset, StandardTable table) {
        try {
            JRStyle styleTable10TD = jasperDesignUtils.getStyle(JasperDesignUtils.STYLE_TABLE_10_TD);
            JRStyle styleTable10CH = jasperDesignUtils.getStyle(JasperDesignUtils.STYLE_TABLE_10_CH);

            Field[] fields = AccountSnapshotItem.class.getDeclaredFields();
            for (Field field : fields) {
                final String fieldName = field.getName();
                subDataset.addField(jasperDesignUtils.convertObjectFieldToJRDesignField(fieldName, field.getType()));

                if ("bankAccount".equals(fieldName)) {
                    continue;
                }

                StandardColumn column = new StandardColumn();
                column.setWidth(AccountSnapshotItemMapper.getColumnWidth(fieldName));

                JRDesignStaticText columnHeader = AccountSnapshotItemMapper.getColumnHeader(fieldName, styleTable10CH);
                JRDesignTextField columnDetail = AccountSnapshotItemMapper.getColumnDetail(fieldName, styleTable10TD);

                jasperDesignUtils.addDetailCellToColumn(column, columnHeader, columnDetail);

                table.addColumn(column);
            }

            Field[] bankAccountFields = BankAccount.class.getDeclaredFields();
            for (Field field : bankAccountFields) {
                final String fieldName = field.getName();
                StandardColumn column = new StandardColumn();
                column.setWidth(BankAccountMapper.getColumnWidth(fieldName));

                JRDesignStaticText columnHeader = BankAccountMapper.getColumnHeader(fieldName, styleTable10CH);
                JRDesignTextField columnDetail = BankAccountMapper.getColumnDetail(fieldName, styleTable10TD);

                jasperDesignUtils.addDetailCellToColumn(column, columnHeader, columnDetail);

                table.addColumn(column);
            }
        } catch (Exception ex) {
            logger.error("An error occurred when generate Accounts Snapshots table {}", ex.getMessage(), ex);
        }
    }

    private void generateAccountsTransactionsTable(JRDesignDataset subDataset, StandardTable table) {
        try {
            JRStyle styleTable10TD = jasperDesignUtils.getStyle(JasperDesignUtils.STYLE_TABLE_10_TD);
            JRStyle styleTable10CH = jasperDesignUtils.getStyle(JasperDesignUtils.STYLE_TABLE_10_CH);

            Field[] fields = AccountTransactionItem.class.getDeclaredFields();
            for (Field field : fields) {
                final String fieldName = field.getName();
                subDataset.addField(jasperDesignUtils.convertObjectFieldToJRDesignField(fieldName, field.getType()));

                StandardColumn column = new StandardColumn();
                column.setWidth(AccountTransactionItemMapper.getColumnWidth(fieldName));

                JRDesignStaticText columnHeader = AccountTransactionItemMapper.getColumnHeader(fieldName, styleTable10CH);
                JRDesignTextField columnDetail = AccountTransactionItemMapper.getColumnDetail(fieldName, styleTable10TD);

                jasperDesignUtils.addDetailCellToColumn(column, columnHeader, columnDetail);

                table.addColumn(column);
            }
        } catch (Exception ex) {
            logger.error("An error occurred when generate Accounts Transactions table {}", ex.getMessage(), ex);
        }
    }

    private void generateAuthorizesTable(JRDesignDataset subDataset, StandardTable table) {
        try {
            JRStyle styleTable10TD = jasperDesignUtils.getStyle(JasperDesignUtils.STYLE_TABLE_10_TD);
            JRStyle styleTable10CH = jasperDesignUtils.getStyle(JasperDesignUtils.STYLE_TABLE_10_CH);

            Field[] fields = AuthorizeItem.class.getDeclaredFields();
            for (Field field : fields) {
                final String fieldName = field.getName();
                subDataset.addField(jasperDesignUtils.convertObjectFieldToJRDesignField(fieldName, field.getType()));

                StandardColumn column = new StandardColumn();
                column.setWidth(AuthorizeItemMapper.getColumnWidth(fieldName));

                JRDesignStaticText columnHeader = AuthorizeItemMapper.getColumnHeader(fieldName, styleTable10CH);
                JRDesignTextField columnDetail = AuthorizeItemMapper.getColumnDetail(fieldName, styleTable10TD);

                jasperDesignUtils.addDetailCellToColumn(column, columnHeader, columnDetail);

                table.addColumn(column);
            }
        } catch (Exception ex) {
            logger.error("An error occurred when generate Authorizes table {}", ex.getMessage(), ex);
        }
    }

    private void generateCardsEventsTable(JRDesignDataset subDataset, StandardTable table) {
        try {
            JRStyle styleTable10TD = jasperDesignUtils.getStyle(JasperDesignUtils.STYLE_TABLE_10_TD);
            JRStyle styleTable10CH = jasperDesignUtils.getStyle(JasperDesignUtils.STYLE_TABLE_10_CH);

            Field[] fields = CardEventItem.class.getDeclaredFields();
            for (Field field : fields) {
                final String fieldName = field.getName();
                subDataset.addField(jasperDesignUtils.convertObjectFieldToJRDesignField(fieldName, field.getType()));

                StandardColumn column = new StandardColumn();
                column.setWidth(CardEventItemMapper.getColumnWidth(fieldName));

                JRDesignStaticText columnHeader = CardEventItemMapper.getColumnHeader(fieldName, styleTable10CH);
                JRDesignTextField columnDetail = CardEventItemMapper.getColumnDetail(fieldName, styleTable10TD);

                jasperDesignUtils.addDetailCellToColumn(column, columnHeader, columnDetail);

                table.addColumn(column);
            }
        } catch (Exception ex) {
            logger.error("An error occurred when generate Cards Events table {}", ex.getMessage(), ex);
        }
    }

    private void generateFinancialAuthorizesTable(JRDesignDataset subDataset, StandardTable table) {
        try {
            JRStyle styleTable10TD = jasperDesignUtils.getStyle(JasperDesignUtils.STYLE_TABLE_10_TD);
            JRStyle styleTable10CH = jasperDesignUtils.getStyle(JasperDesignUtils.STYLE_TABLE_10_CH);

            Field[] fields = CardFinAuthorizationItem.class.getDeclaredFields();
            for (Field field : fields) {
                final String fieldName = field.getName();
                subDataset.addField(jasperDesignUtils.convertObjectFieldToJRDesignField(fieldName, field.getType()));

                StandardColumn column = new StandardColumn();
                column.setWidth(CardFinAuthorizationItemMapper.getColumnWidth(fieldName));

                JRDesignStaticText columnHeader = CardFinAuthorizationItemMapper.getColumnHeader(fieldName, styleTable10CH);
                JRDesignTextField columnDetail = CardFinAuthorizationItemMapper.getColumnDetail(fieldName, styleTable10TD);

                jasperDesignUtils.addDetailCellToColumn(column, columnHeader, columnDetail);

                table.addColumn(column);
            }
        } catch (Exception ex) {
            logger.error("An error occurred when generate Financial Authorizes table {}", ex.getMessage(), ex);
        }
    }

    private void generateCurrencyExchangesTable(JRDesignDataset subDataset, StandardTable table) {
        try {
            JRStyle styleTable10TD = jasperDesignUtils.getStyle(JasperDesignUtils.STYLE_TABLE_10_TD);
            JRStyle styleTable10CH = jasperDesignUtils.getStyle(JasperDesignUtils.STYLE_TABLE_10_CH);

            Field[] fields = BatchItem.class.getDeclaredFields();
            for (Field field : fields) {
                final String fieldName = field.getName();
                subDataset.addField(jasperDesignUtils.convertObjectFieldToJRDesignField(fieldName, field.getType()));

                StandardColumn column = new StandardColumn();
                column.setWidth(BatchItemMapper.getColumnWidth(fieldName));

                JRDesignStaticText columnHeader = BatchItemMapper.getColumnHeader(fieldName, styleTable10CH);
                JRDesignTextField columnDetail = BatchItemMapper.getColumnDetail(fieldName, styleTable10TD);

                jasperDesignUtils.addDetailCellToColumn(column, columnHeader, columnDetail);

                table.addColumn(column);
            }
        } catch (Exception ex) {
            logger.error("An error occurred when generate Currency Exchanges table {}", ex.getMessage(), ex);
        }
    }

    private void generateAccountsActivitesTable(JRDesignDataset subDataset, StandardTable table) {
        try {
            JRStyle styleTable10TD = jasperDesignUtils.getStyle(JasperDesignUtils.STYLE_TABLE_10_TD);
            JRStyle styleTable10CH = jasperDesignUtils.getStyle(JasperDesignUtils.STYLE_TABLE_10_CH);

            Field[] fields = AccountActivityItem.class.getDeclaredFields();
            for (Field field : fields) {
                final String fieldName = field.getName();
                subDataset.addField(jasperDesignUtils.convertObjectFieldToJRDesignField(fieldName, field.getType()));

                StandardColumn column = new StandardColumn();
                column.setWidth(AccountActivityItemMapper.getColumnWidth(fieldName));

                JRDesignStaticText columnHeader = AccountActivityItemMapper.getColumnHeader(fieldName, styleTable10CH);
                JRDesignTextField columnDetail = AccountActivityItemMapper.getColumnDetail(fieldName, styleTable10TD);

                jasperDesignUtils.addDetailCellToColumn(column, columnHeader, columnDetail);

                table.addColumn(column);
            }
        } catch (Exception ex) {
            logger.error("An error occurred when generate Accounts Activites table {}", ex.getMessage(), ex);
        }
    }

    private void generateCardsTable(JRDesignDataset subDataset, StandardTable table) {
        try {
            JRStyle styleTable10TD = jasperDesignUtils.getStyle(JasperDesignUtils.STYLE_TABLE_10_TD);
            JRStyle styleTable10CH = jasperDesignUtils.getStyle(JasperDesignUtils.STYLE_TABLE_10_CH);

            Field[] fields = CardItem.class.getDeclaredFields();
            for (Field field : fields) {
                final String fieldName = field.getName();
                subDataset.addField(jasperDesignUtils.convertObjectFieldToJRDesignField(fieldName, field.getType()));

                StandardColumn column = new StandardColumn();
                column.setWidth(CardItemMapper.getColumnWidth(fieldName));

                JRDesignStaticText columnHeader = CardItemMapper.getColumnHeader(fieldName, styleTable10CH);
                JRDesignTextField columnDetail = CardItemMapper.getColumnDetail(fieldName, styleTable10TD);

                jasperDesignUtils.addDetailCellToColumn(column, columnHeader, columnDetail);

                table.addColumn(column);
            }
        } catch (Exception ex) {
            logger.error("An error occurred when generate Cards table {}", ex.getMessage(), ex);
        }
    }

    private void generateCardsSnapshotsTable(JRDesignDataset subDataset, StandardTable table) {
        try {
            JRStyle styleTable10TD = jasperDesignUtils.getStyle(JasperDesignUtils.STYLE_TABLE_10_TD);
            JRStyle styleTable10CH = jasperDesignUtils.getStyle(JasperDesignUtils.STYLE_TABLE_10_CH);

            Field[] fields = CardSnapshotItem.class.getDeclaredFields();
            for (Field field : fields) {
                final String fieldName = field.getName();
                subDataset.addField(jasperDesignUtils.convertObjectFieldToJRDesignField(fieldName, field.getType()));

                StandardColumn column = new StandardColumn();
                column.setWidth(CardSnapshotItemMapper.getColumnWidth(fieldName));

                JRDesignStaticText columnHeader = CardSnapshotItemMapper.getColumnHeader(fieldName, styleTable10CH);
                JRDesignTextField columnDetail = CardSnapshotItemMapper.getColumnDetail(fieldName, styleTable10TD);

                jasperDesignUtils.addDetailCellToColumn(column, columnHeader, columnDetail);

                table.addColumn(column);
            }
        } catch (Exception ex) {
            logger.error("An error occurred when generate Cards Snapshots table {}", ex.getMessage(), ex);
        }
    }

    private void generateLookupsTable(JRDesignDataset subDataset, StandardTable table) {
        try {
            JRStyle styleTable10TD = jasperDesignUtils.getStyle(JasperDesignUtils.STYLE_TABLE_10_TD);
            JRStyle styleTable10CH = jasperDesignUtils.getStyle(JasperDesignUtils.STYLE_TABLE_10_CH);

            Field[] fields = LookupItem.class.getDeclaredFields();
            for (Field field : fields) {
                final String fieldName = field.getName();
                subDataset.addField(jasperDesignUtils.convertObjectFieldToJRDesignField(fieldName, field.getType()));

                StandardColumn column = new StandardColumn();
                column.setWidth(LookupItemMapper.getColumnWidth(fieldName));

                JRDesignStaticText columnHeader = LookupItemMapper.getColumnHeader(fieldName, styleTable10CH);
                JRDesignTextField columnDetail = LookupItemMapper.getColumnDetail(fieldName, styleTable10TD);

                jasperDesignUtils.addDetailCellToColumn(column, columnHeader, columnDetail);

                table.addColumn(column);
            }
        } catch (Exception ex) {
            logger.error("An error occurred when generate Lookups table {}", ex.getMessage(), ex);
        }
    }

    private void generateSettlementsTransactionsTable(JRDesignDataset subDataset, StandardTable table) {
        try {
            JRStyle styleTable10TD = jasperDesignUtils.getStyle(JasperDesignUtils.STYLE_TABLE_10_TD);
            JRStyle styleTable10CH = jasperDesignUtils.getStyle(JasperDesignUtils.STYLE_TABLE_10_CH);

            Field[] fields = SettlementTransactionItem.class.getDeclaredFields();
            for (Field field : fields) {
                final String fieldName = field.getName();
                subDataset.addField(jasperDesignUtils.convertObjectFieldToJRDesignField(fieldName, field.getType()));

                StandardColumn column = new StandardColumn();
                column.setWidth(SettlementTransactionItemMapper.getColumnWidth(fieldName));

                JRDesignStaticText columnHeader = SettlementTransactionItemMapper.getColumnHeader(fieldName, styleTable10CH);
                JRDesignTextField columnDetail = SettlementTransactionItemMapper.getColumnDetail(fieldName, styleTable10TD);

                jasperDesignUtils.addDetailCellToColumn(column, columnHeader, columnDetail);

                table.addColumn(column);
            }
        } catch (Exception ex) {
            logger.error("An error occurred when generate Lookups table {}", ex.getMessage(), ex);
        }
    }

    public IReportFiller getReportFiller() {
        return reportFiller;
    }

    public void setReportFiller(IReportFiller reportFiller) {
        this.reportFiller = reportFiller;
    }

    public void setReportExporter(IReportExporter reportExporter) {
        this.reportExporter = reportExporter;
    }

    private static class ReportUtilsHolder {
        private static final ReportUtils INSTANCE = new ReportUtils();
    }
}
