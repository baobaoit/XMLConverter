package com.hesmantech.ewmxmltool.service.report;

import com.hesmantech.ewmxmltool.service.report.data.AccountActivityItem;
import com.hesmantech.ewmxmltool.service.report.data.AccountItem;
import com.hesmantech.ewmxmltool.service.report.data.AccountSnapshotItem;
import com.hesmantech.ewmxmltool.service.report.data.AccountTransactionItem;
import com.hesmantech.ewmxmltool.service.report.data.AccountsData;
import com.hesmantech.ewmxmltool.service.report.data.AuthorizeItem;
import com.hesmantech.ewmxmltool.service.report.data.BatchItem;
import com.hesmantech.ewmxmltool.service.report.data.CardEventItem;
import com.hesmantech.ewmxmltool.service.report.data.CardFinAuthorizationItem;
import com.hesmantech.ewmxmltool.service.report.data.CardItem;
import com.hesmantech.ewmxmltool.service.report.data.CardSnapshotItem;
import com.hesmantech.ewmxmltool.service.report.data.CardTransactionItem;
import com.hesmantech.ewmxmltool.service.report.data.CardsTransactionsData;
import com.hesmantech.ewmxmltool.service.report.data.LookupItem;
import com.hesmantech.ewmxmltool.service.report.data.ReportData;
import com.hesmantech.ewmxmltool.service.report.data.SettlementTransactionItem;
import com.hesmantech.ewmxmltool.service.report.exporter.IReportExporter;
import com.hesmantech.ewmxmltool.service.report.filler.IReportFiller;
import com.hesmantech.ewmxmltool.service.report.format.FileType;
import com.hesmantech.ewmxmltool.utils.ReportUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReportServiceImpl implements ReportService {
    private static final String DAILY_CARDS_TRANSACTIONS_XLSX = "daily_cards_transactions_xlsx";
    private static final String EXPORT_FILE_SUCCESSFULLY_MSG_FORMAT = "Export file successfully: %s";
    private static final String PARAMETERS_KEY_ITEMS = "items";

    private final Logger logger = LoggerFactory.getLogger(getClass());

    private final ReportUtils reportUtils;

    private ReportServiceImpl() {
        reportUtils = ReportUtils.getInstance();
    }

    public static ReportService getInstance() {
        return ReportServiceImplHolder.INSTANCE;
    }

    @Override
    public void setReportFiller(IReportFiller reportFiller) {
        reportUtils.setReportFiller(reportFiller);
    }

    @Override
    public void setReportExporter(IReportExporter reportExporter) {
        reportUtils.setReportExporter(reportExporter);
    }

    @Override
    public void generateCardsTransactions(CardsTransactionsData data) throws IOException {
        List<CardTransactionItem> cardTransactionItems = data.getCardTransactionItems();
        reportUtils.readAndCompileReportFile(DAILY_CARDS_TRANSACTIONS_XLSX);
        // Map to hold Jasper report Parameters
        Map<String, Object> parameters = new HashMap<>();
        parameters.put("dailyCardsTransactionsItem", cardTransactionItems);

        fillReport(parameters, Collections.singletonList(cardTransactionItems));

        exportToFile(data.getFileName(),
                data.getFileType(),
                data.getDestinationDirectory(),
                "Daily Cards Transactions");
    }

    @Override
    public void generateAccounts(AccountsData accountsData) {
        List<AccountItem> items = accountsData.getAccountItems();
        reportUtils.compileAccountsReport();

        // Map to hold Jasper report Parameters
        Map<String, Object> parameters = new HashMap<>();
        parameters.put(PARAMETERS_KEY_ITEMS, items);

        fillReport(parameters, Collections.singletonList(items));

        exportToFile(accountsData.getFileName(),
                accountsData.getFileType(),
                accountsData.getDestinationDirectory(),
                "Daily Accounts");
    }

    @Override
    public void generateAccountsSnapshots(ReportData<AccountSnapshotItem> accountsSnapshotsData) {
        List<AccountSnapshotItem> items = accountsSnapshotsData.getItems();
        reportUtils.compileAccountsSnapshotsReport();

        // Map to hold Jasper report Parameters
        Map<String, Object> parameters = new HashMap<>();
        parameters.put(PARAMETERS_KEY_ITEMS, items);

        fillReport(parameters, Collections.singletonList(items));

        exportToFile(accountsSnapshotsData.getFileName(),
                accountsSnapshotsData.getFileType(),
                accountsSnapshotsData.getDestinationDirectory(),
                "Daily Accounts Snapshots");
    }

    @Override
    public void generateAccountsTransactions(ReportData<AccountTransactionItem> accountsTransactionsData) {
        List<AccountTransactionItem> items = accountsTransactionsData.getItems();
        reportUtils.compileAccountsTransactionsReport();

        // Map to hold Jasper report Parameters
        Map<String, Object> parameters = new HashMap<>();
        parameters.put(PARAMETERS_KEY_ITEMS, items);

        fillReport(parameters, Collections.singletonList(items));

        exportToFile(accountsTransactionsData.getFileName(),
                accountsTransactionsData.getFileType(),
                accountsTransactionsData.getDestinationDirectory(),
                "Daily Accounts Transactions");
    }

    @Override
    public void generateAuthorizes(ReportData<AuthorizeItem> authorizesData) {
        List<AuthorizeItem> items = authorizesData.getItems();
        reportUtils.compileAuthorizesReport();

        // Map to hold Jasper report Parameters
        Map<String, Object> parameters = new HashMap<>();
        parameters.put(PARAMETERS_KEY_ITEMS, items);

        fillReport(parameters, Collections.singletonList(items));

        exportToFile(authorizesData.getFileName(),
                authorizesData.getFileType(),
                authorizesData.getDestinationDirectory(),
                "Daily Authorizes");
    }

    @Override
    public void generateCardsEvents(ReportData<CardEventItem> cardsEventsData) {
        List<CardEventItem> items = cardsEventsData.getItems();
        reportUtils.compileCardsEventsReport();

        // Map to hold Jasper report Parameters
        Map<String, Object> parameters = new HashMap<>();
        parameters.put(PARAMETERS_KEY_ITEMS, items);

        fillReport(parameters, Collections.singletonList(items));

        exportToFile(cardsEventsData.getFileName(),
                cardsEventsData.getFileType(),
                cardsEventsData.getDestinationDirectory(),
                "Daily Cards Events");
    }

    @Override
    public void generateFinancialAuthorizes(ReportData<CardFinAuthorizationItem> financialAuthorizesData) {
        List<CardFinAuthorizationItem> items = financialAuthorizesData.getItems();
        reportUtils.compileFinancialAuthorizesReport();

        // Map to hold Jasper report Parameters
        Map<String, Object> parameters = new HashMap<>();
        parameters.put(PARAMETERS_KEY_ITEMS, items);

        fillReport(parameters, Collections.singletonList(items));

        exportToFile(financialAuthorizesData.getFileName(),
                financialAuthorizesData.getFileType(),
                financialAuthorizesData.getDestinationDirectory(),
                "Daily Financial Authorizes");
    }

    @Override
    public void generateCurrencyExchanges(ReportData<BatchItem> fxData) {
        List<BatchItem> items = fxData.getItems();
        reportUtils.compileCurrencyExchangesReport();

        // Map to hold Jasper report Parameters
        Map<String, Object> parameters = new HashMap<>();
        parameters.put(PARAMETERS_KEY_ITEMS, items);

        fillReport(parameters, Collections.singletonList(items));

        exportToFile(fxData.getFileName(),
                fxData.getFileType(),
                fxData.getDestinationDirectory(),
                "Daily Currency Exchanges");
    }

    @Override
    public void generateAccountsActivities(ReportData<AccountActivityItem> accountsActivitesData) {
        List<AccountActivityItem> items = accountsActivitesData.getItems();
        reportUtils.compileAccountsActivitesReport();

        // Map to hold Jasper report Parameters
        Map<String, Object> parameters = new HashMap<>();
        parameters.put(PARAMETERS_KEY_ITEMS, items);

        fillReport(parameters, Collections.singletonList(items));

        exportToFile(accountsActivitesData.getFileName(),
                accountsActivitesData.getFileType(),
                accountsActivitesData.getDestinationDirectory(),
                "Daily Accounts Activites");
    }

    @Override
    public void generateCards(ReportData<CardItem> cardsData) {
        List<CardItem> items = cardsData.getItems();
        reportUtils.compileCardsReport();

        // Map to hold Jasper report Parameters
        Map<String, Object> parameters = new HashMap<>();
        parameters.put(PARAMETERS_KEY_ITEMS, items);

        fillReport(parameters, Collections.singletonList(items));

        exportToFile(cardsData.getFileName(),
                cardsData.getFileType(),
                cardsData.getDestinationDirectory(),
                "Daily Cards");
    }

    @Override
    public void generateCardsSnapshots(ReportData<CardSnapshotItem> cardsSnapshotsData) {
        List<CardSnapshotItem> items = cardsSnapshotsData.getItems();
        reportUtils.compileCardsSnapshotsReport();

        // Map to hold Jasper report Parameters
        Map<String, Object> parameters = new HashMap<>();
        parameters.put(PARAMETERS_KEY_ITEMS, items);

        fillReport(parameters, Collections.singletonList(items));

        exportToFile(cardsSnapshotsData.getFileName(),
                cardsSnapshotsData.getFileType(),
                cardsSnapshotsData.getDestinationDirectory(),
                "Daily Cards Snapshots");
    }

    @Override
    public void generateLookups(ReportData<LookupItem> lookupsData) {
        List<LookupItem> items = lookupsData.getItems();
        reportUtils.compileLookupsReport();

        // Map to hold Jasper report Parameters
        Map<String, Object> parameters = new HashMap<>();
        parameters.put(PARAMETERS_KEY_ITEMS, items);

        fillReport(parameters, Collections.singletonList(items));

        exportToFile(lookupsData.getFileName(),
                lookupsData.getFileType(),
                lookupsData.getDestinationDirectory(),
                "Daily Lookups");
    }

    @Override
    public void generateSettlementsTransactions(ReportData<SettlementTransactionItem> settlementsTransactionsData) {
        List<SettlementTransactionItem> items = settlementsTransactionsData.getItems();
        reportUtils.compileSettlementsTransactionsReport();

        // Map to hold Jasper report Parameters
        Map<String, Object> parameters = new HashMap<>();
        parameters.put(PARAMETERS_KEY_ITEMS, items);

        fillReport(parameters, Collections.singletonList(items));

        exportToFile(settlementsTransactionsData.getFileName(),
                settlementsTransactionsData.getFileType(),
                settlementsTransactionsData.getDestinationDirectory(),
                "Daily Settlements Transactions");
    }

    private void fillReport(Map<String, Object> parameters, List<Object> beanList) {
        IReportFiller reportFiller = reportUtils.getReportFiller();
        reportFiller.setParameters(parameters);
        reportFiller.setBeanList(Collections.unmodifiableList(beanList));
        reportFiller.fillReport();
    }

    private void exportToFile(String fileName, FileType fileType, String destDirectory, String sheetName) {
        final String fileNameExport = String.format("%s%s", fileName, fileType.getDotExtension());
        final String exportFile = String.format("%s/%s", destDirectory, fileNameExport);
        reportUtils.exportToFileExtension(fileType, exportFile, sheetName);
        final String msg = String.format(EXPORT_FILE_SUCCESSFULLY_MSG_FORMAT, exportFile);
        logger.info(msg);
    }

    private static class ReportServiceImplHolder {
        private static final ReportService INSTANCE = new ReportServiceImpl();
    }
}
