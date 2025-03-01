package com.hesmantech.ewmxmltool.xml.data.lookups;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "AccountStatusCodes")
public class AccountStatusCodes {
    private List<AccountStatusCode> accountStatusCodes;

    @XmlElement(name = "AccountStatusCode")
    public List<AccountStatusCode> getAccountStatusCodes() {
        return accountStatusCodes;
    }

    public void setAccountStatusCodes(List<AccountStatusCode> accountStatusCodes) {
        this.accountStatusCodes = accountStatusCodes;
    }
}
