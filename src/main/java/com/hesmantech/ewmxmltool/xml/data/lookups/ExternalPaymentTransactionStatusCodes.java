package com.hesmantech.ewmxmltool.xml.data.lookups;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "ExternalPaymentTransactionStatusCodes")
public class ExternalPaymentTransactionStatusCodes {
    private List<ExternalPaymentTransactionStatusCode> externalPaymentTransactionStatusCodes;

    @XmlElement(name = "ExternalPaymentTransactionStatusCode")
    public List<ExternalPaymentTransactionStatusCode> getExternalPaymentTransactionStatusCodes() {
        return externalPaymentTransactionStatusCodes;
    }

    public void setExternalPaymentTransactionStatusCodes(List<ExternalPaymentTransactionStatusCode> externalPaymentTransactionStatusCodes) {
        this.externalPaymentTransactionStatusCodes = externalPaymentTransactionStatusCodes;
    }
}
