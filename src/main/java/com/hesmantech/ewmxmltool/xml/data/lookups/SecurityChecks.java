package com.hesmantech.ewmxmltool.xml.data.lookups;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "SecurityChecks")
public class SecurityChecks {
    private List<SecurityCheck> securityChecks;

    @XmlElement(name = "SecurityCheck")
    public List<SecurityCheck> getSecurityChecks() {
        return securityChecks;
    }

    public void setSecurityChecks(List<SecurityCheck> securityChecks) {
        this.securityChecks = securityChecks;
    }
}
