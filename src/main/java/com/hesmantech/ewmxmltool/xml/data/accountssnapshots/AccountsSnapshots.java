package com.hesmantech.ewmxmltool.xml.data.accountssnapshots;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "AccountsSnapshots")
public class AccountsSnapshots {
    private List<AccountSnapshot> accountSnapshots;

    @XmlElement(name = "AccountSnapshot")
    public List<AccountSnapshot> getAccountSnapshots() {
        return accountSnapshots;
    }

    public void setAccountSnapshots(List<AccountSnapshot> accountSnapshots) {
        this.accountSnapshots = accountSnapshots;
    }
}
