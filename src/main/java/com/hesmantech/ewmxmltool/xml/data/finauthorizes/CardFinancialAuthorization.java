package com.hesmantech.ewmxmltool.xml.data.finauthorizes;

import com.hesmantech.ewmxmltool.xml.data.authorizes.Authorize;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "CardFinancialAuthorization")
public class CardFinancialAuthorization extends Authorize {
    private String cardProgram;

    @XmlElement(name = "CardProgram")
    public String getCardProgram() {
        return cardProgram;
    }

    public void setCardProgram(String cardProgram) {
        this.cardProgram = cardProgram;
    }
}
