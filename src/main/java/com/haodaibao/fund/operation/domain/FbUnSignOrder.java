package com.haodaibao.fund.operation.domain;

import java.util.Date;

public class FbUnSignOrder {
    private Long id;

    private String unsignOrderNo;

    private String custAccNo;

    private String custSignNo;

    private String unsignStatus;

    private Date orderTime;

    private String errorMsg;

    private Date createdTime;

    private Date modifiedTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUnsignOrderNo() {
        return unsignOrderNo;
    }

    public void setUnsignOrderNo(String unsignOrderNo) {
        this.unsignOrderNo = unsignOrderNo == null ? null : unsignOrderNo.trim();
    }

    public String getCustAccNo() {
        return custAccNo;
    }

    public void setCustAccNo(String custAccNo) {
        this.custAccNo = custAccNo == null ? null : custAccNo.trim();
    }

    public String getCustSignNo() {
        return custSignNo;
    }

    public void setCustSignNo(String custSignNo) {
        this.custSignNo = custSignNo == null ? null : custSignNo.trim();
    }

    public String getUnsignStatus() {
        return unsignStatus;
    }

    public void setUnsignStatus(String unsignStatus) {
        this.unsignStatus = unsignStatus == null ? null : unsignStatus.trim();
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg == null ? null : errorMsg.trim();
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