package com.test.entity;

import java.util.Date;
import java.util.Objects;

/**
 * 用户实体类:当前类的一个对象可以封装User——message表中一行用户信息
 *
 * @author 李占文
 */
public class UserMessage {
    private int userId;
    private String userName;
    private String userPassword;
    private String userGender;
    private String userEmail;
    private Date userRegDate;

    //无参构造方法
    public UserMessage() {
        super();
    }

    //全参构造方法
    public UserMessage(String userName, String userPassword, String userGender, String userEmail, Date userRegDate) {
        super();
        this.userName = userName;
        this.userPassword = userPassword;
        this.userGender = userGender;
        this.userEmail = userEmail;
        this.userRegDate = userRegDate;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Date getUserRegDate(java.sql.Date userRegdate) {
        return userRegDate;
    }

    public void setUserRegDate(Date userRegDate) {
        this.userRegDate = userRegDate;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserGender() {
        return userGender;
    }

    public void setUserGender(String userGender) {
        this.userGender = userGender;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    //如果需要判断当前类的两个对象是否相等,则推荐重写hashCode()与equals()方法

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        UserMessage that = (UserMessage) o;
        return userId == that.userId && Objects.equals(userName, that.userName) && Objects.equals(userPassword, that.userPassword) && Objects.equals(userGender, that.userGender) && Objects.equals(userEmail, that.userEmail) && Objects.equals(userRegDate, that.userRegDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, userName, userPassword, userGender, userEmail, userRegDate);
    }

    //重写toString()方法

    @Override
    public String toString() {
        return "UserMessage{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", userGender='" + userGender + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", userRegDate=" + userRegDate +
                '}';
    }
}
