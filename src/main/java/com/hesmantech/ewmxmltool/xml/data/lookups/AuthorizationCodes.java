package com.hesmantech.ewmxmltool.xml.data.lookups;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "AuthorizationCodes")
public class AuthorizationCodes {
    private List<AuthorizationCode> authorizationCodes;

    @XmlElement(name = "AuthorizationCode")
    public List<AuthorizationCode> getAuthorizationCodes() {
        return authorizationCodes;
    }

    public void setAuthorizationCodes(List<AuthorizationCode> authorizationCodes) {
        this.authorizationCodes = authorizationCodes;
    }
}
