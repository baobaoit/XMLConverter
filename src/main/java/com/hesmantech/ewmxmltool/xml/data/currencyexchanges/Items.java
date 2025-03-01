package com.hesmantech.ewmxmltool.xml.data.currencyexchanges;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "Items")
public class Items {
    private List<Item> items;

    @XmlElement(name = "Item")
    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
