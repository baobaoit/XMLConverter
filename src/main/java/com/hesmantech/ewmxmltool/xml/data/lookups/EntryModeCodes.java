package com.hesmantech.ewmxmltool.xml.data.lookups;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "EntryModeCodes")
public class EntryModeCodes {
    private List<EntryModeCode> entryModeCodes;

    @XmlElement(name = "EntryModeCode")
    public List<EntryModeCode> getEntryModeCodes() {
        return entryModeCodes;
    }

    public void setEntryModeCodes(List<EntryModeCode> entryModeCodes) {
        this.entryModeCodes = entryModeCodes;
    }
}
