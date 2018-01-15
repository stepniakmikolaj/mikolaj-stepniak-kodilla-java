package com.kodilla.mod1;

import com.kodilla.mod1.User;

public class UserValidator {
    private double age;
    private double height;

    public UserValidator(double age, double height) {
        this.age = age;
        this.height = height;
    }

    public void validate(User user) {
        if (user.getName() != null) {
            if (user.getAge() > age && user.getHeight() > height) {
                System.out.println(user.getName() + "User is older than 30 and higher then 160cm");
            } else {
                System.out.println(user.getName() + "User is younger than 30 or lower than 160cm");
            }
        }
    }
}
