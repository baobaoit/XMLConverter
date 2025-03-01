package com.hesmantech.ewmxmltool.service.report;

import com.hesmantech.ewmxmltool.service.report.data.AccountActivityItem;
import com.hesmantech.ewmxmltool.service.report.data.AccountSnapshotItem;
import com.hesmantech.ewmxmltool.service.report.data.AccountTransactionItem;
import com.hesmantech.ewmxmltool.service.report.data.AccountsData;
import com.hesmantech.ewmxmltool.service.report.data.AuthorizeItem;
import com.hesmantech.ewmxmltool.service.report.data.BatchItem;
import com.hesmantech.ewmxmltool.service.report.data.CardEventItem;
import com.hesmantech.ewmxmltool.service.report.data.CardFinAuthorizationItem;
import com.hesmantech.ewmxmltool.service.report.data.CardItem;
import com.hesmantech.ewmxmltool.service.report.data.CardSnapshotItem;
import com.hesmantech.ewmxmltool.service.report.data.CardsTransactionsData;
import com.hesmantech.ewmxmltool.service.report.data.LookupItem;
import com.hesmantech.ewmxmltool.service.report.data.ReportData;
import com.hesmantech.ewmxmltool.service.report.data.SettlementTransactionItem;
import com.hesmantech.ewmxmltool.service.report.exporter.IReportExporter;
import com.hesmantech.ewmxmltool.service.report.filler.IReportFiller;

import java.io.IOException;

public interface ReportService {
    void setReportFiller(IReportFiller reportFiller);

    void setReportExporter(IReportExporter reportExporter);

    void generateCardsTransactions(CardsTransactionsData data) throws IOException;

    void generateAccounts(AccountsData accountsData);

    void generateAccountsSnapshots(ReportData<AccountSnapshotItem> accountsSnapshotsData);

    void generateAccountsTransactions(ReportData<AccountTransactionItem> accountsTransactionsData);

    void generateAuthorizes(ReportData<AuthorizeItem> authorizesData);

    void generateCardsEvents(ReportData<CardEventItem> cardsEventsData);

    void generateFinancialAuthorizes(ReportData<CardFinAuthorizationItem> financialAuthorizesData);

    void generateCurrencyExchanges(ReportData<BatchItem> fxData);

    void generateAccountsActivities(ReportData<AccountActivityItem> accountsActivitesData);

    void generateCards(ReportData<CardItem> cardsData);

    void generateCardsSnapshots(ReportData<CardSnapshotItem> cardsSnapshotsData);

    void generateLookups(ReportData<LookupItem> lookupsData);

    void generateSettlementsTransactions(ReportData<SettlementTransactionItem> settlementsTransactionsData);
}
