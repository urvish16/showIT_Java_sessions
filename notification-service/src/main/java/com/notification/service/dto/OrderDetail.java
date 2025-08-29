package com.notification.service.dto;

public class OrderDetail {
    private String orderId;
    private String emailId;
    private String userId;
    private String userPhone;
    private boolean orderPaymentStatus=false;

    public OrderDetail() {
    }

    public OrderDetail(String orderId, String emailId, String userId, String userPhone, boolean orderPaymentStatus) {
        this.orderId = orderId;
        this.emailId = emailId;
        this.userId = userId;
        this.userPhone = userPhone;
        this.orderPaymentStatus = orderPaymentStatus;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public boolean isOrderPaymentStatus() {
        return orderPaymentStatus;
    }

    public void setOrderPaymentStatus(boolean orderPaymentStatus) {
        this.orderPaymentStatus = orderPaymentStatus;
    }
}
