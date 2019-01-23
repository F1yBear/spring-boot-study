package com.swagger.bean;

import com.google.common.base.MoreObjects;

/**
 *  用户
 * @author  wangfeixiong
 */
public class User {

    /**
     *  用户名字
     */
    private String userName;

    /**
     *  用户密码
     */
    private String password;

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

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("userName", userName)
                .add("password", password)
                .toString();
    }
}
