package com.hesmantech.ewmxmltool.xml.data.accountsactivities;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "AccountsActivities")
public class AccountsActivities {
    private List<AccountActivity> accountActivities;

    @XmlElement(name = "AccountActivity")
    public List<AccountActivity> getAccountActivities() {
        return accountActivities;
    }

    public void setAccountActivities(List<AccountActivity> accountActivities) {
        this.accountActivities = accountActivities;
    }
}
