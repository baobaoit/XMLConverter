package com.hesmantech.ewmxmltool.xml.data.lookups;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "ExternalPaymentTransactionTypes")
public class ExternalPaymentTransactionTypes {
    private List<ExternalPaymentTransactionType> externalPaymentTransactionTypes;

    @XmlElement(name = "ExternalPaymentTransactionType")
    public List<ExternalPaymentTransactionType> getExternalPaymentTransactionTypes() {
        return externalPaymentTransactionTypes;
    }

    public void setExternalPaymentTransactionTypes(List<ExternalPaymentTransactionType> externalPaymentTransactionTypes) {
        this.externalPaymentTransactionTypes = externalPaymentTransactionTypes;
    }
}
