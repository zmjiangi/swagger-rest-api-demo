package com.gzyijian.swagger.rest.api.demo.model;

import io.swagger.models.auth.In;

import java.io.Serializable;

/**
 * @author zmjiangi
 * @date 2019-5-9
 */
public class User implements Serializable {
    private static final long serialVersionUID = 1L;

    private String cid;
    private String userName;
    private String password;
    private String fullName;
    private String email;
    private Integer userType;
    private String dateFormat;
    private String timeFormat;
    private String timeZone;
    private String language;

    public User() {
    }

    public User(
            String userName,
            String password,
            String fullName,
            String email,
            Integer userType,
            String dateFormat,
            String timeFormat,
            String timeZone,
            String language
    ) {
        this.userName = userName;
        this.password = password;
        this.fullName = fullName;
        this.email = email;
        this.userType = userType;
        this.dateFormat = dateFormat;
        this.timeFormat = timeFormat;
        this.timeZone = timeZone;
        this.language = language;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public String getDateFormat() {
        return dateFormat;
    }

    public void setDateFormat(String dateFormat) {
        this.dateFormat = dateFormat;
    }

    public String getTimeFormat() {
        return timeFormat;
    }

    public void setTimeFormat(String timeFormat) {
        this.timeFormat = timeFormat;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return "User{" +
                "cid='" + cid + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", userType=" + userType +
                ", dateFormat='" + dateFormat + '\'' +
                ", timeFormat='" + timeFormat + '\'' +
                ", timeZone='" + timeZone + '\'' +
                ", language='" + language + '\'' +
                '}';
    }
}
