package com.haodaibao.fund.operation.domain;

import java.util.Date;

public class FbRevokeOrder {
    private Long id;

    private String orderNo;

    private String outTradeNo;

    private Date outTradeTime;

    private String oriOutTradeNo;

    private Date orderTime;

    private String orderStatus;

    private String errorMsg;

    private Date createdTime;

    private Date modifiedTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    public String getOutTradeNo() {
        return outTradeNo;
    }

    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo == null ? null : outTradeNo.trim();
    }

    public Date getOutTradeTime() {
        return outTradeTime;
    }

    public void setOutTradeTime(Date outTradeTime) {
        this.outTradeTime = outTradeTime;
    }

    public String getOriOutTradeNo() {
        return oriOutTradeNo;
    }

    public void setOriOutTradeNo(String oriOutTradeNo) {
        this.oriOutTradeNo = oriOutTradeNo == null ? null : oriOutTradeNo.trim();
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus == null ? null : orderStatus.trim();
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