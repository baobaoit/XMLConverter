package com.hesmantech.ewmxmltool.xml.data.lookups;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "RiskActions")
public class RiskActions {
    private List<RiskAction> riskActions;

    @XmlElement(name = "RiskAction")
    public List<RiskAction> getRiskActions() {
        return riskActions;
    }

    public void setRiskActions(List<RiskAction> riskActions) {
        this.riskActions = riskActions;
    }
}
