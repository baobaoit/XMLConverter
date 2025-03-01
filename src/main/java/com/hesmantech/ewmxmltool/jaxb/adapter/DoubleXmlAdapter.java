package com.hesmantech.ewmxmltool.jaxb.adapter;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class DoubleXmlAdapter extends XmlAdapter<String, Double> {
    @Override
    public Double unmarshal(String s) throws Exception {
        if (s == null || s.isEmpty()) {
            return 0.0;
        }

        return Double.valueOf(s);
    }

    @Override
    public String marshal(Double aDouble) throws Exception {
        return aDouble.toString();
    }
}
