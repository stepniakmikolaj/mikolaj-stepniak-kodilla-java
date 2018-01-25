package com.kodilla.testing.forum.staitstics;

import java.util.List;

public interface Statistics {

    List<String> userNames(); // list of user names
    int postCount();          // total quantity of forum posts
    int commentsCount();      // total quantity of forum comments
}
