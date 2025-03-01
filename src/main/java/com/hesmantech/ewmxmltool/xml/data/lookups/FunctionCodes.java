package com.hesmantech.ewmxmltool.xml.data.lookups;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "FunctionCodes")
public class FunctionCodes {
    private List<FunctionCode> functionCodes;

    @XmlElement(name = "FunctionCode")
    public List<FunctionCode> getFunctionCodes() {
        return functionCodes;
    }

    public void setFunctionCodes(List<FunctionCode> functionCodes) {
        this.functionCodes = functionCodes;
    }
}
