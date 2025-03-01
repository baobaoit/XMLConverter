package com.hesmantech.ewmxmltool.utils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.logging.Level;
import java.util.logging.Logger;

class FileUtilsTests {
    final Logger logger = Logger.getLogger(getClass().getName());
    final String JRXML_SUFFIX = ".jrxml";

    @Test
    void shouldThrowsUnsupportedOperationException() {
        Constructor<FileUtils> fileUtilsConstructor = ReflectionHelper
                .getPrivateUtilsConstructorNoParams(FileUtils.class);

        if (fileUtilsConstructor != null) {
            try {
                fileUtilsConstructor.newInstance();
            } catch (Exception ex) {
                Throwable cause = ex.getCause();
                Assertions.assertInstanceOf(UnsupportedOperationException.class, cause,
                        "Cause must from UnsupportedOperationException");
            }
        }
    }

    @Test
    void readFileFromResourceOk() {
        final String FILE_NAME = "report-templates/daily_cards_transactions_xlsx.jrxml";
        try {
            File file = FileUtils.readFileFromResource(FILE_NAME, JRXML_SUFFIX);

            Assertions.assertNotNull(file, "File must not be null");

            final String fileName = file.getName();
            Assertions.assertTrue(fileName.startsWith("tmp-"),
                    "File name must starts with \"tmp-\"");
            Assertions.assertTrue(fileName.endsWith(JRXML_SUFFIX),
                    String.format("File name must ends with \"%s\"", JRXML_SUFFIX));

            file.deleteOnExit();
        } catch (IOException ex) {
            logger.log(Level.SEVERE, "An error occurred during reading file", ex);
        }
    }

    @Test
    void readFileFromSource_whenNotFound_thenReturnNull() {
        final String FILE_NAME = "report-templates/not_found.jrxml";
        try {
            File file = FileUtils.readFileFromResource(FILE_NAME, JRXML_SUFFIX);
            Assertions.assertNull(file, "File must be null");
        } catch (IOException ex) {
            logger.log(Level.SEVERE, "An error occurred during reading file", ex);
        }
    }
}
