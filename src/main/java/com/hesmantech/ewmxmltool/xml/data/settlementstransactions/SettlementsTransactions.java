package com.hesmantech.ewmxmltool.xml.data.settlementstransactions;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "SettlementsTransactions")
public class SettlementsTransactions {
    private List<SettlementTransaction> settlementTransactions;

    @XmlElement(name = "SettlementTransaction")
    public List<SettlementTransaction> getSettlementTransactions() {
        return settlementTransactions;
    }

    public void setSettlementTransactions(List<SettlementTransaction> settlementTransactions) {
        this.settlementTransactions = settlementTransactions;
    }
}
