package com.hesmantech.ewmxmltool.exception;

import org.slf4j.LoggerFactory;

public class FileResourceNotFound extends RuntimeException {

    public FileResourceNotFound(String fileName) {
        super(String.format("File resource %s not found", fileName));
        LoggerFactory.getLogger(getClass())
                .error(getMessage());
    }
}
