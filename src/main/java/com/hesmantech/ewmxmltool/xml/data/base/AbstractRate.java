package com.hesmantech.ewmxmltool.xml.data.base;

import com.hesmantech.ewmxmltool.jaxb.adapter.DoubleXmlAdapter;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

public abstract class AbstractRate extends AbstractAmount {
    protected Double rate;

    @XmlAttribute(name = "rate")
    @XmlJavaTypeAdapter(DoubleXmlAdapter.class)
    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }
}
