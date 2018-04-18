package com.kodilla.patterns2.observer.forum;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ForumUserTestSuite {
    @Test
    public void testUpdate() {
        //G
        ForumTopic javaHelpForum = new JavaHelpForumTopic();
        ForumTopic javaToolsForum = new JavaToolsForumTopic();
        ForumUser saulGoodman = new ForumUser("Saul Goodman");
        ForumUser walterWhite = new ForumUser("Walter White");
        ForumUser jessiePinkman = new ForumUser("Jessie Pinkman");
        javaHelpForum.registerObserver(saulGoodman);
        javaToolsForum.registerObserver(walterWhite);
        javaHelpForum.registerObserver(jessiePinkman);
        javaToolsForum.registerObserver(jessiePinkman);
        //W
        javaHelpForum.addPost("Hi everyone! Could you help me whit for loop?");
        javaHelpForum.addPost("Better try to use while loop in this case.");
        javaToolsForum.addPost("Help pls, my MySQL db doesn't want to work :(");
        javaHelpForum.addPost("Why while? Is it better?");
        javaToolsForum.addPost("When I try to log in I got 'bad credentials' message");
        //T
        assertEquals(3, saulGoodman.getUpdateCount());
        assertEquals(2, walterWhite.getUpdateCount());
        assertEquals(5, jessiePinkman.getUpdateCount());
    }

}