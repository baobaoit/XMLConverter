package com.hesmantech.ewmxmltool.utils;

import com.hesmantech.ewmxmltool.service.report.format.FileType;
import com.hesmantech.ewmxmltool.xml.data.accounts.Accounts;
import com.hesmantech.ewmxmltool.xml.data.accountsactivities.AccountsActivities;
import com.hesmantech.ewmxmltool.xml.data.accountssnapshots.AccountsSnapshots;
import com.hesmantech.ewmxmltool.xml.data.accountstransactions.AccountsTransactions;
import com.hesmantech.ewmxmltool.xml.data.authorizes.Authorizes;
import com.hesmantech.ewmxmltool.xml.data.cards.Cards;
import com.hesmantech.ewmxmltool.xml.data.cardsevents.CardsEvents;
import com.hesmantech.ewmxmltool.xml.data.cardssnapshots.CardsSnapshots;
import com.hesmantech.ewmxmltool.xml.data.cardstransactions.CardsTransactions;
import com.hesmantech.ewmxmltool.xml.data.currencyexchanges.Fx;
import com.hesmantech.ewmxmltool.xml.data.finauthorizes.FinancialAuthorizes;
import com.hesmantech.ewmxmltool.xml.data.lookups.Lookups;
import com.hesmantech.ewmxmltool.xml.data.settlementstransactions.SettlementsTransactions;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public final class FileUtils {
    private static final Logger logger = LoggerFactory.getLogger(FileUtils.class);
    private static final String RESOURCE_NOT_FOUND_MSG_FORMAT = "if the resource %s could not be found or the invoker doesn't have adequate privileges to get the resource %s";

    private FileUtils() {
        throw new UnsupportedOperationException("This class is not instantiable");
    }

    public static File readFileFromResource(String fileName, String fileSuffix) throws IOException {
        ClassLoader classLoader = FileUtils.class.getClassLoader();
        URL fileUrl = classLoader.getResource(fileName);
        if (fileUrl == null) {
            final String msg = String.format(RESOURCE_NOT_FOUND_MSG_FORMAT, fileName, fileName);
            logger.error(msg);
            return null;
        }

        return streamToFile(fileUrl.openStream(), fileSuffix);
    }

    public static File streamToFile(InputStream in, String fileSuffix) throws IOException {
        final File tempFile = File.createTempFile(String.format("tmp-%s", UUID.randomUUID()), fileSuffix);
        tempFile.deleteOnExit();
        try (FileOutputStream out = new FileOutputStream(tempFile)) {
            IOUtils.copy(in, out);
        }
        return tempFile;
    }

    /**
     * Returns a key in fileNameToClass
     * <br/>
     * <p>
     * Example:<br/>
     * cards-transactions-1-20-20220429 will be cards-transactions
     * </p>
     *
     * @param fileName a {@link String} file name
     * @return a key in fileNameToClass
     */
    public static String getFileNameToClassKey(String fileName) {
        final String SIMPLE_FILE_NAME_PATTERN = "-\\d+|.xml";
        Pattern pattern = Pattern.compile(SIMPLE_FILE_NAME_PATTERN);
        Matcher matcher = pattern.matcher(fileName.toLowerCase());
        return matcher.replaceAll("");
    }

    public static Map<String, Class<?>> initializeFileNameToClass() {
        final Map<String, Class<?>> internalFileNameToClass = new HashMap<>();
        internalFileNameToClass.put("cards-transactions", CardsTransactions.class);
        internalFileNameToClass.put("accounts", Accounts.class);
        internalFileNameToClass.put("accounts-snapshots", AccountsSnapshots.class);
        internalFileNameToClass.put("accounts-transactions", AccountsTransactions.class);
        internalFileNameToClass.put("authorizes", Authorizes.class);
        internalFileNameToClass.put("cards-events", CardsEvents.class);
        internalFileNameToClass.put("fin-authorizes", FinancialAuthorizes.class);
        internalFileNameToClass.put("currency-exchanges", Fx.class);
        internalFileNameToClass.put("accounts-activities", AccountsActivities.class);
        internalFileNameToClass.put("cards", Cards.class);
        internalFileNameToClass.put("cards-snapshots", CardsSnapshots.class);
        internalFileNameToClass.put("lookups", Lookups.class);
        internalFileNameToClass.put("settlements-transactions", SettlementsTransactions.class);

        return Collections.unmodifiableMap(internalFileNameToClass);
    }

    public static List<File> findXmlFiles(String dirPath, long daysAgoValue, long maxFileSize) throws IOException {
        logger.info("========= Find XML files =========");
        List<File> result = new ArrayList<>();
        File dir = new File(dirPath);
        Instant daysAgo = Instant.now().minus(daysAgoValue, ChronoUnit.DAYS);
        logger.info("=> Convert XML files have creation time after {}", daysAgo);

        try (Stream<Path> paths = Files.walk(dir.toPath())) {
            paths.filter(Files::isRegularFile)
                    .filter(path -> path.toString().endsWith(FileType.XML.getDotExtension()))
                    .forEach(path -> {
                        try {
                            BasicFileAttributes attr = Files.readAttributes(path, BasicFileAttributes.class);

                            Path pathFileName = path.getFileName();
                            FileTime attrCreationTime = attr.creationTime();
                            long attrSizeAsBytes = attr.size();

                            logger.info("\n\n==> Checking file: {}\n\n==> File {} has creation time: {}\n\n==> File {} has size: {} B",
                                    pathFileName, pathFileName, attrCreationTime, pathFileName, attrSizeAsBytes);

                            if (attrCreationTime.toInstant().isAfter(daysAgo) && attrSizeAsBytes <= maxFileSize) {
                                logger.info("==> File {} is valid", pathFileName);
                                result.add(path.toFile());
                            }
                        } catch (IOException e) {
                            logger.error("An error occurred when finding XML files: {}", e.getMessage(), e);
                        }
                    });
        }
        logger.info("========= Exit find XML files =========");

        return result;
    }
}
