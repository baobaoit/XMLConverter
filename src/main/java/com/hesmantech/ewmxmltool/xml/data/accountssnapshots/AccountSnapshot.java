package com.hesmantech.ewmxmltool.xml.data.accountssnapshots;

import com.hesmantech.ewmxmltool.xml.data.base.AbstractAccount;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "AccountSnapshot")
public class AccountSnapshot extends AbstractAccount {
    private String fileDate;
    private String workDate;
    private String accountStatusDescription;
    private String accountStatusChangeDate;
    private BankAccounts bankAccounts;
    private String dateCreated;

    @XmlElement(name = "FileDate")
    public String getFileDate() {
        return fileDate;
    }

    public void setFileDate(String fileDate) {
        this.fileDate = fileDate;
    }

    @XmlElement(name = "WorkDate")
    public String getWorkDate() {
        return workDate;
    }

    public void setWorkDate(String workDate) {
        this.workDate = workDate;
    }

    @XmlElement(name = "AccountStatusDescription")
    public String getAccountStatusDescription() {
        return accountStatusDescription;
    }

    public void setAccountStatusDescription(String accountStatusDescription) {
        this.accountStatusDescription = accountStatusDescription;
    }

    @XmlElement(name = "AccountStatusChangeDate")
    public String getAccountStatusChangeDate() {
        return accountStatusChangeDate;
    }

    public void setAccountStatusChangeDate(String accountStatusChangeDate) {
        this.accountStatusChangeDate = accountStatusChangeDate;
    }

    @XmlElement(name = "BankAccounts")
    public BankAccounts getBankAccounts() {
        return bankAccounts;
    }

    public void setBankAccounts(BankAccounts bankAccounts) {
        this.bankAccounts = bankAccounts;
    }

    @XmlElement(name = "DateCreated")
    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }
}
