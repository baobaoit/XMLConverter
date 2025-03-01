package com.hesmantech.ewmxmltool.xml.data.lookups;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "LoadTypes")
public class LoadTypes {
    private List<LoadType> loadTypes;

    @XmlElement(name = "LoadTypes")
    public List<LoadType> getLoadTypes() {
        return loadTypes;
    }

    public void setLoadTypes(List<LoadType> loadTypes) {
        this.loadTypes = loadTypes;
    }
}
