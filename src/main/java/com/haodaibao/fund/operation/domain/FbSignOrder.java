package com.haodaibao.fund.operation.domain;

import java.util.Date;

public class FbSignOrder {
    private Long id;

    private String signOrderNo;

    private String fdMhtNo;

    private String custName;

    private String mobileNo;

    private String certType;

    private String certNo;

    private String bankCode;

    private String bankCardNo;

    private String custSignNo;

    private String signStatus;

    private String errorMsg;

    private Date orderTime;

    private Date createdTime;

    private Date modifiedTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSignOrderNo() {
        return signOrderNo;
    }

    public void setSignOrderNo(String signOrderNo) {
        this.signOrderNo = signOrderNo == null ? null : signOrderNo.trim();
    }

    public String getFdMhtNo() {
        return fdMhtNo;
    }

    public void setFdMhtNo(String fdMhtNo) {
        this.fdMhtNo = fdMhtNo == null ? null : fdMhtNo.trim();
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName == null ? null : custName.trim();
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo == null ? null : mobileNo.trim();
    }

    public String getCertType() {
        return certType;
    }

    public void setCertType(String certType) {
        this.certType = certType == null ? null : certType.trim();
    }

    public String getCertNo() {
        return certNo;
    }

    public void setCertNo(String certNo) {
        this.certNo = certNo == null ? null : certNo.trim();
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode == null ? null : bankCode.trim();
    }

    public String getBankCardNo() {
        return bankCardNo;
    }

    public void setBankCardNo(String bankCardNo) {
        this.bankCardNo = bankCardNo == null ? null : bankCardNo.trim();
    }

    public String getCustSignNo() {
        return custSignNo;
    }

    public void setCustSignNo(String custSignNo) {
        this.custSignNo = custSignNo == null ? null : custSignNo.trim();
    }

    public String getSignStatus() {
        return signStatus;
    }

    public void setSignStatus(String signStatus) {
        this.signStatus = signStatus == null ? null : signStatus.trim();
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg == null ? null : errorMsg.trim();
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Date getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }
}