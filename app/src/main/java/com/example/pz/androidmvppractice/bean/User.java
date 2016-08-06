package com.example.pz.androidmvppractice.bean;

/**
 * Created by pz on 2016/8/6.
 */
public class User {
    private String userName;
    private String password;

    public String getPassword() {
        return password;
    }

    public User setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getUserName() {
        return userName;
    }

    public User setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public String toString() {
        return "userName: " + userName + "password: " + password;
    }
}
