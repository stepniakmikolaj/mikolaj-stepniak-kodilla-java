package com.kodilla.testing.forum;

import com.kodilla.testing.user.ExpandedUser;

import org.junit.*;

public class ForumTestSuite {
    @Before
    public void before() {
        System.out.println("Test Case Before: Begin");
    }

    @After
    public void after() {
        System.out.println("Test Case After: End");
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: Start");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: End");
    }

    @Test
    public void testCaseUsername() {
        //Given
        ExpandedUser expandedUser = new ExpandedUser("theForumUser", "Jonny Cage", "Male");
        //When
        String result = expandedUser.getUsername();
        System.out.println("Testing: " + result);
        //Then
        Assert.assertEquals("theForumUser", result);
    }

    @Test
    public void testCaseRealName() {
        //Given
        ExpandedUser expandedUser = new ExpandedUser("theForumUser", "Jonny Cage", "Male");
        //When
        String result = expandedUser.getRealName();
        System.out.println("Testing: " + result);
        //Then
        Assert.assertEquals("Jonny Cage", result);
    }

    @Test
    public void testCaseSex() {
        //Given
        ExpandedUser expandedUser = new ExpandedUser("theForumUser", "Jonny Cage", "Male");
        //When
        String result = expandedUser.getSex();
        System.out.println("Testing: " + result);
        //Then
        Assert.assertEquals("Male", result);
    }
}
