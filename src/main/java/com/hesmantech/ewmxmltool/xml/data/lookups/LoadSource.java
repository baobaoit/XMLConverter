package com.hesmantech.ewmxmltool.xml.data.lookups;

import com.hesmantech.ewmxmltool.xml.data.lookups.base.AbstractLookupsElementFields;
import com.hesmantech.ewmxmltool.xml.data.lookups.base.LookupsCcAttribute;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "LoadSource")
public class LoadSource extends AbstractLookupsElementFields implements LookupsCcAttribute {
    @XmlAttribute(name = "cc")
    @Override
    public String getCc() {
        return cc;
    }

    @Override
    public void setCc(String cc) {
        this.cc = cc;
    }
}
