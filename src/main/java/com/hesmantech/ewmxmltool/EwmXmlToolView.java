package com.hesmantech.ewmxmltool;

import com.hesmantech.ewmxmltool.constants.StorageUnit;
import com.hesmantech.ewmxmltool.mapper.AccountActivityMapper;
import com.hesmantech.ewmxmltool.mapper.AccountMapper;
import com.hesmantech.ewmxmltool.mapper.AccountSnapshotMapper;
import com.hesmantech.ewmxmltool.mapper.AccountTransactionMapper;
import com.hesmantech.ewmxmltool.mapper.AuthorizeMapper;
import com.hesmantech.ewmxmltool.mapper.BatchMapper;
import com.hesmantech.ewmxmltool.mapper.CardEventMapper;
import com.hesmantech.ewmxmltool.mapper.CardFinAuthorizationMapper;
import com.hesmantech.ewmxmltool.mapper.CardMapper;
import com.hesmantech.ewmxmltool.mapper.CardSnapshotMapper;
import com.hesmantech.ewmxmltool.mapper.CardTransactionMapper;
import com.hesmantech.ewmxmltool.mapper.LookupMapper;
import com.hesmantech.ewmxmltool.mapper.SettlementTransactionMapper;
import com.hesmantech.ewmxmltool.service.report.ReportService;
import com.hesmantech.ewmxmltool.service.report.ReportServiceImpl;
import com.hesmantech.ewmxmltool.service.report.data.AccountsActivitesData;
import com.hesmantech.ewmxmltool.service.report.data.AccountsData;
import com.hesmantech.ewmxmltool.service.report.data.AccountsSnapshotsData;
import com.hesmantech.ewmxmltool.service.report.data.AccountsTransactionsData;
import com.hesmantech.ewmxmltool.service.report.data.AuthorizesData;
import com.hesmantech.ewmxmltool.service.report.data.CardsData;
import com.hesmantech.ewmxmltool.service.report.data.CardsEventsData;
import com.hesmantech.ewmxmltool.service.report.data.CardsSnapshotsData;
import com.hesmantech.ewmxmltool.service.report.data.CardsTransactionsData;
import com.hesmantech.ewmxmltool.service.report.data.FinancialAuthorizesData;
import com.hesmantech.ewmxmltool.service.report.data.FxData;
import com.hesmantech.ewmxmltool.service.report.data.LookupsData;
import com.hesmantech.ewmxmltool.service.report.data.SettlementsTransactionsData;
import com.hesmantech.ewmxmltool.service.report.format.FileType;
import com.hesmantech.ewmxmltool.utils.FileUtils;
import com.hesmantech.ewmxmltool.utils.XmlUtils;
import com.hesmantech.ewmxmltool.xml.data.accounts.Account;
import com.hesmantech.ewmxmltool.xml.data.accounts.Accounts;
import com.hesmantech.ewmxmltool.xml.data.accountsactivities.AccountsActivities;
import com.hesmantech.ewmxmltool.xml.data.accountssnapshots.AccountsSnapshots;
import com.hesmantech.ewmxmltool.xml.data.accountstransactions.AccountsTransactions;
import com.hesmantech.ewmxmltool.xml.data.authorizes.Authorizes;
import com.hesmantech.ewmxmltool.xml.data.cards.Cards;
import com.hesmantech.ewmxmltool.xml.data.cardsevents.CardsEvents;
import com.hesmantech.ewmxmltool.xml.data.cardssnapshots.CardsSnapshots;
import com.hesmantech.ewmxmltool.xml.data.cardstransactions.CardTransaction;
import com.hesmantech.ewmxmltool.xml.data.cardstransactions.CardsTransactions;
import com.hesmantech.ewmxmltool.xml.data.currencyexchanges.Fx;
import com.hesmantech.ewmxmltool.xml.data.finauthorizes.FinancialAuthorizes;
import com.hesmantech.ewmxmltool.xml.data.lookups.Lookups;
import com.hesmantech.ewmxmltool.xml.data.settlementstransactions.SettlementsTransactions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.xml.bind.JAXBException;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

public class EwmXmlToolView extends WindowAdapter {
    private static final String CURRENT_DIR = ".";
    private static final String DASH_DASH_DESTINATION_DIR_PARAM = "--destinationDir=";
    private final Logger logger = LoggerFactory.getLogger(getClass());
    private final Map<String, Class<?>> fileNameToClass;
    private final String[] args;

    public EwmXmlToolView(String[] args) {
        this.args = args;
        fileNameToClass = FileUtils.initializeFileNameToClass();
    }

    @Override
    public void windowClosed(WindowEvent windowEvent) {
        System.exit(0);
    }

    @Override
    public void windowOpened(WindowEvent windowEvent) {
        String destinationDir = getDestinationDirOrCurrentDirFromArgs();
        convertXML(destinationDir);
    }

    private String getDestinationDirOrCurrentDirFromArgs() {
        return args != null ? getDestinationDirFromArgs() : CURRENT_DIR;
    }

    private String getDestinationDirFromArgs() {
        return Arrays.stream(args)
                .filter(arg -> arg.contains(DASH_DASH_DESTINATION_DIR_PARAM))
                .map(arg -> arg.substring(DASH_DASH_DESTINATION_DIR_PARAM.length()))
                .findFirst()
                .orElse(CURRENT_DIR);
    }

    private void convertXML(String destinationDir) {
        final int NUMBER_OF_THREADS = 5;
        ExecutorService executor = Executors.newFixedThreadPool(NUMBER_OF_THREADS);

        try {
            logger.info("========= Get list files valid =========");
            List<File> listFilesValid = getListFilesValid();
            int numberOfTask = listFilesValid.size();
            logger.info("Number of tasks: {}", numberOfTask);
            logger.info("========= Exit get list files valid =========");
            CountDownLatch countDownLatch = new CountDownLatch(numberOfTask);

            for (File xml : listFilesValid) {
                executor.submit(() -> {
                    try {
                        processFile(xml, destinationDir);
                    } catch (IOException e) {
                        logger.error("An error occurred when process file: {}", e.getMessage(), e);
                    } finally {
                        countDownLatch.countDown();
                    }
                });
            }
            executor.shutdown();
            countDownLatch.await();
            logger.info("Done!");
            System.exit(0);
        } catch (InterruptedException ex) {
            logger.error("The program encountered an InterruptedException and terminated abruptly: {}", ex.getMessage(), ex);
            executor.shutdown();
            Thread.currentThread().interrupt();
        } catch (Exception ex) {
            logger.error("An exception occurred: {}", ex.getMessage(), ex);
        }
    }

    private List<File> getListFilesValid() throws IOException {
        final long DAYS_AGO = 5;
        final long MAX_FILE_SIZE = StorageUnit.MB.getByteValue(); // 1MB
        List<File> findXmlFiles = FileUtils.findXmlFiles(CURRENT_DIR, DAYS_AGO, MAX_FILE_SIZE);

        return findXmlFiles.stream()
                .filter(this::isValidXml)
                .collect(Collectors.toList());
    }

    private boolean isValidXml(File f) {
        final String classKey = FileUtils.getFileNameToClassKey(f.getName());

        return fileNameToClass.containsKey(classKey);
    }

    private synchronized void processFile(File xml, String destinationDirectory) throws IOException {
        final String fileName = xml.getName();
        final String fileNameToClassKey = FileUtils.getFileNameToClassKey(fileName);
        if (!fileNameToClass.containsKey(fileNameToClassKey)) {
            return;
        }

        logger.info("========= Process file {} =========", fileName);

        Class<?> xmlDataClass = fileNameToClass.get(fileNameToClassKey);
        if (CURRENT_DIR.equals(destinationDirectory)) {
            destinationDirectory = xml.getParent();
        }

        try {
            ReportService reportService = ReportServiceImpl.getInstance();
            Object xmlToObject = XmlUtils.unmarshaller(xml, xmlDataClass);
            final String reportFileName = fileName.substring(0, fileName.lastIndexOf('.'));
            logger.info("\n\nReport destination directory: {}\n\nReport file name: {}", destinationDirectory, reportFileName);

            generateReport(xmlDataClass, xmlToObject, reportService, reportFileName, destinationDirectory);
        } catch (JAXBException ex) {
            logger.error("An error occured when unmarshaller data: {}", ex.getMessage(), ex);
        } catch (IOException ex) {
            logger.error("An error occured when generate report: {}", ex.getMessage(), ex);
        } catch (Exception ex) {
            logger.error("An error occured when process file: {}", ex.getMessage(), ex);
        }

        logger.info("========= Exit process file {} =========", fileName);
    }

    private void generateReport(Class<?> clazz, Object xmlToObject, ReportService reportService,
                                String reportFileName, String destinationDirectory) throws IOException {

        ClassName className = ClassName.valueFrom(clazz);

        if (className == null) {
            return;
        }

        switch (className) {
            case CARDS_TRANSACTIONS:
                reportService.generateCardsTransactions(buildCardsTransactionsData(xmlToObject, reportFileName, destinationDirectory));
                break;
            case ACCOUNTS:
                reportService.generateAccounts(buildAccountsData(xmlToObject, reportFileName, destinationDirectory));
                break;
            case ACCOUNTS_SNAPSHOTS:
                reportService.generateAccountsSnapshots(AccountsSnapshotsData.builder()
                        .fileType(FileType.XLSX)
                        .fileName(reportFileName)
                        .items(AccountSnapshotMapper.getInstance().toAccountSnapshotItems((AccountsSnapshots) xmlToObject))
                        .destinationDirectory(destinationDirectory)
                        .build());
                break;
            case ACCOUNTS_TRANSACTIONS:
                reportService.generateAccountsTransactions(AccountsTransactionsData.builder()
                        .fileType(FileType.XLSX)
                        .fileName(reportFileName)
                        .items(AccountTransactionMapper.INSTANCE.toAccountTransactionItemList((AccountsTransactions) xmlToObject))
                        .destinationDirectory(destinationDirectory)
                        .build());
                break;
            case AUTHORIZES:
                reportService.generateAuthorizes(AuthorizesData.builder()
                        .fileType(FileType.XLSX)
                        .fileName(reportFileName)
                        .items(AuthorizeMapper.INSTANCE.toAuthorizeItemList((Authorizes) xmlToObject))
                        .destinationDirectory(destinationDirectory)
                        .build());
                break;
            case CARDS_EVENTS:
                reportService.generateCardsEvents(CardsEventsData.builder()
                        .fileType(FileType.XLSX)
                        .fileName(reportFileName)
                        .items(CardEventMapper.INSTANCE.toCardEventItemList((CardsEvents) xmlToObject))
                        .destinationDirectory(destinationDirectory)
                        .build());
                break;
            case FIN_AUTHORIZES:
                reportService.generateFinancialAuthorizes(FinancialAuthorizesData.builder()
                        .fileType(FileType.XLSX)
                        .fileName(reportFileName)
                        .items(CardFinAuthorizationMapper.INSTANCE.toCardFinAuthorizationItemList((FinancialAuthorizes) xmlToObject))
                        .destinationDirectory(destinationDirectory)
                        .build());
                break;
            case FX:
                reportService.generateCurrencyExchanges(FxData.builder()
                        .fileType(FileType.XLSX)
                        .fileName(reportFileName)
                        .items(BatchMapper.INSTANCE.toBatchItemList((Fx) xmlToObject))
                        .destinationDirectory(destinationDirectory)
                        .build());
                break;
            case ACCOUNTS_ACTIVITIES:
                reportService.generateAccountsActivities(AccountsActivitesData.builder()
                        .fileType(FileType.XLSX)
                        .fileName(reportFileName)
                        .items(AccountActivityMapper.INSTANCE.toAccountActivityItemList((AccountsActivities) xmlToObject))
                        .destinationDirectory(destinationDirectory)
                        .build());
                break;
            case CARDS:
                reportService.generateCards(CardsData.builder()
                        .fileType(FileType.XLSX)
                        .fileName(reportFileName)
                        .items(CardMapper.INSTANCE.toCardItemList((Cards) xmlToObject))
                        .destinationDirectory(destinationDirectory)
                        .build());
                break;
            case CARDS_SNAPSHOTS:
                reportService.generateCardsSnapshots(CardsSnapshotsData.builder()
                        .fileType(FileType.XLSX)
                        .fileName(reportFileName)
                        .items(CardSnapshotMapper.INSTANCE.toCardSnapshotItemList((CardsSnapshots) xmlToObject))
                        .destinationDirectory(destinationDirectory)
                        .build());
                break;
            case LOOKUPS:
                reportService.generateLookups(LookupsData.builder()
                        .fileType(FileType.XLSX)
                        .fileName(reportFileName)
                        .items(LookupMapper.getInstance().toLookupItemList((Lookups) xmlToObject))
                        .destinationDirectory(destinationDirectory)
                        .build());
                break;
            case SETTLEMENTS_TRANSACTIONS:
                reportService.generateSettlementsTransactions(SettlementsTransactionsData.builder()
                        .fileType(FileType.XLSX)
                        .fileName(reportFileName)
                        .items(SettlementTransactionMapper.INSTANCE.toSettlementTransactionItemList((SettlementsTransactions) xmlToObject))
                        .destinationDirectory(destinationDirectory)
                        .build());
                break;
            default:
                break;
        }
    }

    private CardsTransactionsData buildCardsTransactionsData(Object xmlToObject, String reportFileName, String destinationDirectory) {
        CardsTransactions cardsTransactions = (CardsTransactions) xmlToObject;
        List<CardTransaction> cardTransactionList = cardsTransactions.getCardTransactions();

        return CardsTransactionsData.builder()
                .fileType(FileType.XLSX)
                .fileName(reportFileName)
                .cardTransactionItems(cardTransactionList.stream()
                        .map(CardTransactionMapper.INSTANCE::toCardTransactionItem)
                        .collect(Collectors.toList()))
                .destinationDirectory(destinationDirectory)
                .build();
    }

    private AccountsData buildAccountsData(Object xmlToObject, String reportFileName, String destinationDirectory) {
        Accounts accounts = (Accounts) xmlToObject;
        List<Account> accountList = accounts.getAccounts();

        return AccountsData.builder()
                .fileType(FileType.XLSX)
                .fileName(reportFileName)
                .accountItems(AccountMapper.getInstance().toAccountItems(accountList))
                .destinationDirectory(destinationDirectory)
                .build();
    }

    private enum ClassName {
        CARDS_TRANSACTIONS(CardsTransactions.class),
        ACCOUNTS(Accounts.class),
        ACCOUNTS_SNAPSHOTS(AccountsSnapshots.class),
        ACCOUNTS_TRANSACTIONS(AccountsTransactions.class),
        AUTHORIZES(Authorizes.class),
        CARDS_EVENTS(CardsEvents.class),
        FIN_AUTHORIZES(FinancialAuthorizes.class),
        FX(Fx.class),
        ACCOUNTS_ACTIVITIES(AccountsActivities.class),
        CARDS(Cards.class),
        CARDS_SNAPSHOTS(CardsSnapshots.class),
        LOOKUPS(Lookups.class),
        SETTLEMENTS_TRANSACTIONS(SettlementsTransactions.class);

        private final Class<?> clazz;

        ClassName(Class<?> clazz) {
            this.clazz = clazz;
        }

        static ClassName valueFrom(Class<?> clazz) {
            for (ClassName value : ClassName.values()) {
                if (value.clazz.equals(clazz)) {
                    return value;
                }
            }
            return null;
        }
    }
}
