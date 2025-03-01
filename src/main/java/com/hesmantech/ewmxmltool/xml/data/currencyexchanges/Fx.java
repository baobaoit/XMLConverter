package com.hesmantech.ewmxmltool.xml.data.currencyexchanges;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "Fx")
public class Fx {
    private List<Batch> batchList;

    @XmlElement(name = "Batch")
    public List<Batch> getBatchList() {
        return batchList;
    }

    public void setBatchList(List<Batch> batchList) {
        this.batchList = batchList;
    }
}
