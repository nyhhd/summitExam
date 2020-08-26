package com.summitexam.bean;

import java.io.Serializable;

public class StaticData implements Serializable {
    private String codeType;

    private String codeValue;

    private String codeName;

    private String codeDesc;

    private String state;

    private String externCodeType;

    private static final long serialVersionUID = 1L;

    public String getCodeType() {
        return codeType;
    }

    public void setCodeType(String codeType) {
        this.codeType = codeType == null ? null : codeType.trim();
    }

    public String getCodeValue() {
        return codeValue;
    }

    public void setCodeValue(String codeValue) {
        this.codeValue = codeValue == null ? null : codeValue.trim();
    }

    public String getCodeName() {
        return codeName;
    }

    public void setCodeName(String codeName) {
        this.codeName = codeName == null ? null : codeName.trim();
    }

    public String getCodeDesc() {
        return codeDesc;
    }

    public void setCodeDesc(String codeDesc) {
        this.codeDesc = codeDesc == null ? null : codeDesc.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getExternCodeType() {
        return externCodeType;
    }

    public void setExternCodeType(String externCodeType) {
        this.externCodeType = externCodeType == null ? null : externCodeType.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", codeType=").append(codeType);
        sb.append(", codeValue=").append(codeValue);
        sb.append(", codeName=").append(codeName);
        sb.append(", codeDesc=").append(codeDesc);
        sb.append(", state=").append(state);
        sb.append(", externCodeType=").append(externCodeType);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}