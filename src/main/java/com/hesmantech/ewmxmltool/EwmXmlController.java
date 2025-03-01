package com.hesmantech.ewmxmltool;

import javax.swing.*;

public class EwmXmlController {
    private JFrame frame;

    public EwmXmlController(String[] args) {
        initialize(args);
    }

    public void start() {
        frame.setVisible(true);
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize(String[] args) {
        frame = new JFrame();

        frame.addWindowListener(new EwmXmlToolView(args));

        frame.setBounds(100, 100, 769, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        frame.setTitle("XML Converter");

        JLabel labelConverting = new JLabel("Application is converting... please wait for a while");
        labelConverting.setBounds(225, 184, 320, 16);
        frame.getContentPane().add(labelConverting);
    }
}
