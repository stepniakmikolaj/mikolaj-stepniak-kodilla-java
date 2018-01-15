package com.kodilla.mod1;

import com.kodilla.mod1.User;
import com.kodilla.mod1.UserValidator;

public class App1 {
    public static void main(String args[]) {
        User user1 = new User("Adam ", 38, 178);
        User user2 = new User("Ewa ", 29, 159);

        UserValidator userValidator = new UserValidator(30, 160);

        userValidator.validate(user1);
        userValidator.validate(user2);
    }
}
