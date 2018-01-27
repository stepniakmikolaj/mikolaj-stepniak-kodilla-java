package com.kodilla.testing.forum.staitstics;

public class ForumStatistics {

    int quantityOfUsers;
    int quantityOfPosts;
    int quantityOfComments;
    double averageQuantityPostsOnUser;
    double averageQuantityCommentsOnUser;
    double averageQuantityCommentsOnPost;

    public void calculateAdvStatistics(Statistics statistics) {
        quantityOfUsers = statistics.userNames().size();
        quantityOfPosts = statistics.postCount();
        quantityOfComments = statistics.commentsCount();

        if(quantityOfUsers != 0){
            averageQuantityPostsOnUser = quantityOfPosts / quantityOfUsers;
            averageQuantityCommentsOnUser = quantityOfComments / quantityOfUsers;
        } else {
            averageQuantityPostsOnUser = 0;
            averageQuantityCommentsOnUser = 0;
        }

        if(quantityOfPosts !=0){
            averageQuantityCommentsOnPost = quantityOfComments / quantityOfPosts;
        } else {
            averageQuantityCommentsOnPost = 0;
        }
    }

    public int getQuantityOfUsers() {
        return quantityOfUsers;
    }

    public int getQuantityOfPosts() {
        return quantityOfPosts;
    }

    public int getQuantityOfComments() {
        return quantityOfComments;
    }

    public double getAverageQuantityPostsOnUser() {
        return averageQuantityPostsOnUser;
    }

    public double getAverageQuantityCommentsOnUser() {
        return averageQuantityCommentsOnUser;
    }

    public double getAverageQuantityCommentsOnPost() {
        return averageQuantityCommentsOnPost;
    }
}
