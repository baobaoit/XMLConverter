package com.hesmantech.ewmxmltool.xml.data.lookups.base;

import javax.xml.bind.annotation.XmlValue;

public abstract class AbstractLookupsElementFields {
    protected String cc;
    protected String name;
    protected String value;

    @XmlValue
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
