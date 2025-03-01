package com.hesmantech.ewmxmltool.xml.data.lookups;

import com.hesmantech.ewmxmltool.xml.data.lookups.base.AbstractLookupsElementFields;
import com.hesmantech.ewmxmltool.xml.data.lookups.base.LookupsCcAttribute;
import com.hesmantech.ewmxmltool.xml.data.lookups.base.LookupsNameAttribute;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "EntryModeCode")
public class EntryModeCode extends AbstractLookupsElementFields implements LookupsCcAttribute, LookupsNameAttribute {
    @XmlAttribute(name = "cc")
    @Override
    public String getCc() {
        return cc;
    }

    @Override
    public void setCc(String cc) {
        this.cc = cc;
    }

    @XmlAttribute(name = "name")
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
