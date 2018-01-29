package com.zmm.daggertest.model;

/**
 * Description:
 * Author:zhangmengmeng
 * Date:2018/1/29
 * Time:上午11:13
 */

public class User {

    private String username;

    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
