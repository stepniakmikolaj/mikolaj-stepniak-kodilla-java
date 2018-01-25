package com.kodilla.testing.forum.statistics;

import com.kodilla.testing.forum.staitstics.ForumStatistics;
import com.kodilla.testing.forum.staitstics.Statistics;
import org.junit.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatisticsTestSuite {

    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {

        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {

        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testForumStatisticsZeroPosts() {
        //g
        List<String> theList = Arrays.asList("aaaa", "bbbb", "cccc", "dddd", "eeee");
        int quantityOfPost = 0;
        int quantityOfComments = 0;
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.userNames()).thenReturn(theList);
        when(statisticsMock.postCount()).thenReturn(quantityOfPost);
        when(statisticsMock.commentsCount()).thenReturn(quantityOfComments);
        //w
        ForumStatistics forumStatistics = new ForumStatistics();
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //t
        assertEquals(5, theList.size());
        assertEquals(0, quantityOfPost);
        assertEquals(0, quantityOfComments);
    }

    @Test
    public void testForumStatisticsThousandPosts() {
        //g
        List<String> theList = Arrays.asList("aaaa", "bbbb", "cccc", "dddd", "eeee");
        int quantityOfPost = 1000;
        int quantityOfComments = 1;
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.userNames()).thenReturn(theList);
        when(statisticsMock.postCount()).thenReturn(quantityOfPost);
        when(statisticsMock.commentsCount()).thenReturn(quantityOfComments);
        //w
        ForumStatistics forumStatistics = new ForumStatistics();
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //t
        assertEquals(5, theList.size());
        assertEquals(1000, quantityOfPost);
        assertEquals(1, quantityOfComments);
    }

    @Test
    public void testForumStatisticsZeroComments() {
        //g
        List<String> theList = Arrays.asList("aaaa", "bbbb", "cccc", "dddd", "eeee");
        int quantityOfPost = 100;
        int quantityOfComments = 0;
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.userNames()).thenReturn(theList);
        when(statisticsMock.postCount()).thenReturn(quantityOfPost);
        when(statisticsMock.commentsCount()).thenReturn(quantityOfComments);
        //w
        ForumStatistics forumStatistics = new ForumStatistics();
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //t
        assertEquals(5, theList.size());
        assertEquals(100, quantityOfPost);
        assertEquals(0, quantityOfComments);
    }

    @Test
    public void testForumStatisticsCommentsIsMoreThanPosts() {
        //g
        List<String> theList = Arrays.asList("aaaa", "bbbb", "cccc", "dddd", "eeee");
        int quantityOfPost = 10;
        int quantityOfComments = 1000;
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.userNames()).thenReturn(theList);
        when(statisticsMock.postCount()).thenReturn(quantityOfPost);
        when(statisticsMock.commentsCount()).thenReturn(quantityOfComments);
        //w
        ForumStatistics forumStatistics = new ForumStatistics();
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //t
        assertEquals(5, theList.size());
        assertEquals(10, quantityOfPost);
        assertEquals(1000, quantityOfComments);
    }

    @Test
    public void testForumStatisticsPostsIsMoreThanComments() {
        //g
        List<String> theList = Arrays.asList("aaaa", "bbbb", "cccc", "dddd", "eeee");
        int quantityOfPost = 1000;
        int quantityOfComments = 10;
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.userNames()).thenReturn(theList);
        when(statisticsMock.postCount()).thenReturn(quantityOfPost);
        when(statisticsMock.commentsCount()).thenReturn(quantityOfComments);
        //w
        ForumStatistics forumStatistics = new ForumStatistics();
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //t
        assertEquals(5, theList.size());
        assertEquals(1000, quantityOfPost);
        assertEquals(10, quantityOfComments);
    }

    @Test
    public void testForumStatisticsZeroUsers() {
        //g
        List<String> theList = Arrays.asList();
        int quantityOfPost = 0;
        int quantityOfComments = 0;
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.userNames()).thenReturn(theList);
        when(statisticsMock.postCount()).thenReturn(quantityOfPost);
        when(statisticsMock.commentsCount()).thenReturn(quantityOfComments);
        //w
        ForumStatistics forumStatistics = new ForumStatistics();
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //t
        assertEquals(0, theList.size());
        assertEquals(0, quantityOfPost);
        assertEquals(0, quantityOfComments);
    }

    @Test
    public void testForumStatisticsOneHundredUsers() {
        //g
        List<String> theList = new ArrayList<>();
        for (int i = 1; i < 101; i++) {
            theList.add("User " + i);
        }
        int quantityOfPost = 100;
        int quantityOfComments = 100;
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.userNames()).thenReturn(theList);
        when(statisticsMock.postCount()).thenReturn(quantityOfPost);
        when(statisticsMock.commentsCount()).thenReturn(quantityOfComments);
        //w
        ForumStatistics forumStatistics = new ForumStatistics();
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //t
        assertEquals(100, theList.size());
        assertEquals(100, quantityOfPost);
        assertEquals(100, quantityOfComments);
    }
}