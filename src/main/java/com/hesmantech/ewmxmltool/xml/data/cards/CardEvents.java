package com.hesmantech.ewmxmltool.xml.data.cards;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "CardEvents")
public class CardEvents {
    private List<String> events;

    @XmlElement(name = "Event")
    public List<String> getEvents() {
        return events;
    }

    public void setEvents(List<String> events) {
        this.events = events;
    }
}
