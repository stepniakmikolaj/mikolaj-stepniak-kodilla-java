package com.kodilla.testing.forum;
import com.kodilla.testing.user.SimpleUser;
import org.junit.*;

public class ForumTestSuite {
    @Before
    public void before(){
        System.out.println("Test Case Before: Begin");
    }
    @After
    public void after(){
        System.out.println("Test Case After: End");
    }
    @BeforeClass
    public static void beforeClass(){
        System.out.println("Test Suite: Rozpoczynam");
    }
    @AfterClass
    public static void afterClass(){
        System.out.println("Test Suite: Kończę");
    }
    @Test
    public void testCaseUsername(){
        //Given
        SimpleUser simpleUser = new SimpleUser("theForumUser", "Jonny Cage","Male");
        //When
        String result = simpleUser.getUsername();
        System.out.println("Testing: " + result);
        //Then
        Assert.assertEquals("theForumUser", result);
    }
    @Test
    public void testCaseRealName(){
        //Given
        SimpleUser simpleUser = new SimpleUser("theForumUser", "Jonny Cage", "Male");
        //When
        String result = simpleUser.getRealName();
        System.out.println("Testing: " + result);
        //Then
        Assert.assertEquals("Jonny Cage", result);
    }
    @Test
    public void testCaseSex(){
        //Given
        SimpleUser simpleUser = new SimpleUser("theForumUser", "Jonny Cage", "Male");
        //When
        String result = simpleUser.getSex();
        System.out.println("Testing: " + result);
        //Then
        Assert.assertEquals("Male", result);
    }
}
