package com.kodilla.testing.user;

public class SimpleUser {
    String username;
    String realName;
    String sex;

    public SimpleUser(String username, String realName, String sex) {
        this.username = username;
        this.realName = realName;
        this.sex = sex;
    }

    public String getUsername() {

        return username;
    }

    public String getRealName() {

        return realName;
    }

    public String getSex() {
        return sex;
    }
}
