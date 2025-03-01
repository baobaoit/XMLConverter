package com.hesmantech.ewmxmltool.xml.data.finauthorizes;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "FinancialAuthorizes")
public class FinancialAuthorizes {
    private List<CardFinancialAuthorization> cardFinancialAuthorizations;

    @XmlElement(name = "CardFinancialAuthorization")
    public List<CardFinancialAuthorization> getCardFinancialAuthorizations() {
        return cardFinancialAuthorizations;
    }

    public void setCardFinancialAuthorizations(List<CardFinancialAuthorization> cardFinancialAuthorizations) {
        this.cardFinancialAuthorizations = cardFinancialAuthorizations;
    }
}
