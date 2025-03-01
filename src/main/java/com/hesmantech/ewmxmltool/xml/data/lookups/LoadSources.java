package com.hesmantech.ewmxmltool.xml.data.lookups;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "LoadSources")
public class LoadSources {
    private List<LoadSource> loadSources;

    @XmlElement(name = "LoadSource")
    public List<LoadSource> getLoadSources() {
        return loadSources;
    }

    public void setLoadSources(List<LoadSource> loadSources) {
        this.loadSources = loadSources;
    }
}
