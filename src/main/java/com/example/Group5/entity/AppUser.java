package com.example.Group5.entity;

import javax.persistence.*;

@Entity
@Table(name = "app_user", uniqueConstraints = {@UniqueConstraint(name = "APP_USER_UK", columnNames = "User_Name")})
public class AppUser {

    @Id
    @GeneratedValue
    @Column(name = "User_Id", nullable = false)
    private int userId;

    @Column(name = "User_Name", nullable = false)
    private String userName;

    @Column(name = "Encryted_Password", nullable = false)
    private String encrytedPassword;

    @Column(name = "User_full_name")
    private String fullName;

    @Column(name = "USER_EMAIL")
    private String email;

    @Column(name = "User_phone")
    private String phone;

    @Column(name = "User_address")
    private String address;

    @Column(name = "User_age")
    private Integer age;

    @Column(name = "Enabled", length = 1, nullable = false)
    private boolean enabled;

    public int getUserId() { return userId; }

    public void setUserId(int userId) { this.userId = userId; }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEncrytedPassword() {
        return encrytedPassword;
    }

    public void setEncrytedPassword(String encrytedPassword) {
        this.encrytedPassword = encrytedPassword;
    }

    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
}
