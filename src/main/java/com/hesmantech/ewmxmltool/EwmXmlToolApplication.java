package com.hesmantech.ewmxmltool;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.awt.EventQueue;

public class EwmXmlToolApplication {
    private static final Logger logger = LoggerFactory.getLogger(EwmXmlToolApplication.class);

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                EwmXmlController controller = new EwmXmlController(args);
                controller.start();
            } catch (Exception e) {
                logger.error("An error occurred when running XML converter: {}", e.getMessage(), e);
            }
        });
    }
}
