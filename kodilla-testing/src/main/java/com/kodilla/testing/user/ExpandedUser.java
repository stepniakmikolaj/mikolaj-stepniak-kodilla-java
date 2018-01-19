package com.kodilla.testing.user;

public class ExpandedUser extends SimpleUser {
    private String realName;
    private String sex;

    public ExpandedUser(String username, String realName, String sex) {
        super(username);
        this.realName = realName;
        this.sex = sex;
    }

    public String getRealName() {
        return this.realName;
    }

    public String getSex() {
        return this.sex;
    }
}