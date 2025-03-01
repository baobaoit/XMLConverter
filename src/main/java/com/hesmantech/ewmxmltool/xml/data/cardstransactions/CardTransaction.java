package com.hesmantech.ewmxmltool.xml.data.cardstransactions;

import com.hesmantech.ewmxmltool.xml.data.base.AbstractTransaction;
import com.hesmantech.ewmxmltool.xml.data.common.TransactionAmount;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "CardTransaction")
public class CardTransaction extends AbstractTransaction {
    @XmlElement(name = "TransactionAmount")
    public TransactionAmount getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(TransactionAmount transactionAmount) {
        this.transactionAmount = transactionAmount;
    }
}
