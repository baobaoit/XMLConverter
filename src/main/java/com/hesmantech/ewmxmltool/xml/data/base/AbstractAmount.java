package com.hesmantech.ewmxmltool.xml.data.base;

import com.hesmantech.ewmxmltool.jaxb.adapter.DoubleXmlAdapter;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

public abstract class AbstractAmount {
    protected String currency;
    protected Double value;

    @XmlAttribute(name = "currency")
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @XmlAttribute(name = "value")
    @XmlJavaTypeAdapter(DoubleXmlAdapter.class)
    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }
}
