package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int uniCode;
    private final String nameUser;
    private final char sex;
    private final LocalDate birthDate;
    private final int posts;

    public ForumUser(final int uniCode, final String nameUser, final char sex, final LocalDate birthDate, final int posts) {
        this.uniCode = uniCode;
        this.nameUser = nameUser;
        this.sex = sex;
        this.birthDate = birthDate;
        this.posts = posts;
    }

    public int getUniCode() {
        return uniCode;
    }

    public String getNameUser() {
        return nameUser;
    }

    public char getSex() {
        return sex;
    }

    public boolean getBirthDate(int years) {
        return LocalDate.now().getYear() - birthDate.getYear() >= years;
    }

    public int getPosts() {
        return posts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "uniCode=" + uniCode +
                ", nameUser='" + nameUser + '\'' +
                ", sex=" + sex +
                ", birthDate=" + birthDate +
                ", posts=" + posts +
                '}';
    }
}
