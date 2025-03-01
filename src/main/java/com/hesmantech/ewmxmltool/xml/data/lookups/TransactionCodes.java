package com.hesmantech.ewmxmltool.xml.data.lookups;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "TransactionCodes")
public class TransactionCodes {
    private List<TransactionCode> transactionCodes;

    @XmlElement(name = "TransactionCode")
    public List<TransactionCode> getTransactionCodes() {
        return transactionCodes;
    }

    public void setTransactionCodes(List<TransactionCode> transactionCodes) {
        this.transactionCodes = transactionCodes;
    }
}
