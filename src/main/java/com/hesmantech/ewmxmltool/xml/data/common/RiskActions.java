package com.hesmantech.ewmxmltool.xml.data.common;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "RiskActions")
public class RiskActions {
    private String markTransactionAsSuspicious;
    private String notifyCardholderBySendingTAIsNotification;
    private String changeCardStatusToRisk;
    private String changeAccountStatusToSuspended;
    private String rejectTransaction;

    @XmlElement(name = "MarkTransactionAsSuspicious")
    public String getMarkTransactionAsSuspicious() {
        return markTransactionAsSuspicious;
    }

    public void setMarkTransactionAsSuspicious(String markTransactionAsSuspicious) {
        this.markTransactionAsSuspicious = markTransactionAsSuspicious;
    }

    @XmlElement(name = "NotifyCardholderBySendingTAIsNotification")
    public String getNotifyCardholderBySendingTAIsNotification() {
        return notifyCardholderBySendingTAIsNotification;
    }

    public void setNotifyCardholderBySendingTAIsNotification(String notifyCardholderBySendingTAIsNotification) {
        this.notifyCardholderBySendingTAIsNotification = notifyCardholderBySendingTAIsNotification;
    }

    @XmlElement(name = "ChangeCardStatusToRisk")
    public String getChangeCardStatusToRisk() {
        return changeCardStatusToRisk;
    }

    public void setChangeCardStatusToRisk(String changeCardStatusToRisk) {
        this.changeCardStatusToRisk = changeCardStatusToRisk;
    }

    @XmlElement(name = "ChangeAccountStatusToSuspended")
    public String getChangeAccountStatusToSuspended() {
        return changeAccountStatusToSuspended;
    }

    public void setChangeAccountStatusToSuspended(String changeAccountStatusToSuspended) {
        this.changeAccountStatusToSuspended = changeAccountStatusToSuspended;
    }

    @XmlElement(name = "RejectTransaction")
    public String getRejectTransaction() {
        return rejectTransaction;
    }

    public void setRejectTransaction(String rejectTransaction) {
        this.rejectTransaction = rejectTransaction;
    }
}
