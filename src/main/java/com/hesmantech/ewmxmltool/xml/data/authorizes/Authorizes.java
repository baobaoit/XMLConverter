package com.hesmantech.ewmxmltool.xml.data.authorizes;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "Authorizes")
public class Authorizes {
    private List<Authorize> authorizes;

    @XmlElement(name = "Authorize")
    public List<Authorize> getAuthorizes() {
        return authorizes;
    }

    public void setAuthorizes(List<Authorize> authorizes) {
        this.authorizes = authorizes;
    }
}
