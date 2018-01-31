package com.kodilla.exception.nullpointer;

public class MessageSender {
    public void sendMessegeTo(User user, String messege) throws MessageNotSentException {
        if(user != null) {
            System.out.println("Sending message: " + messege + " to: " + user.getName());
        }
        throw new MessageNotSentException("Object User was null");
    }
}
