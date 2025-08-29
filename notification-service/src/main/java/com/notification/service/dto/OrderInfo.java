package com.notification.service.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;


public class OrderInfo {

    private String userId;

    private String orderId;

    private Date createdDate;

    private String price;

    private String emailId;

    private String userPhone;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public OrderInfo(String userId, String orderId, Date createdDate, String price, String emailId, String userPhone) {
        this.userId = userId;
        this.orderId = orderId;
        this.createdDate = createdDate;
        this.price = price;
        this.emailId = emailId;
        this.userPhone = userPhone;
    }

    public OrderInfo() {
    }

    @Override
    public String toString() {
        return "OrderInfo{" +
                "userId='" + userId + '\'' +
                ", orderId='" + orderId + '\'' +
                ", createdDate=" + createdDate +
                ", price='" + price + '\'' +
                ", emailId='" + emailId + '\'' +
                ", userPhone='" + userPhone + '\'' +
                '}';
    }
}
