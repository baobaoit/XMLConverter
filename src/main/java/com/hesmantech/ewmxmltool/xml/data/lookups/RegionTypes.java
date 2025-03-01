package com.hesmantech.ewmxmltool.xml.data.lookups;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "RegionTypes")
public class RegionTypes {
    private List<RegionType> regionTypes;

    @XmlElement(name = "RegionType")
    public List<RegionType> getRegionTypes() {
        return regionTypes;
    }

    public void setRegionTypes(List<RegionType> regionTypes) {
        this.regionTypes = regionTypes;
    }
}
