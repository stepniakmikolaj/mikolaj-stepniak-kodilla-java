package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMainForum {
    public static void main(String[] args) {
        Forum theForum = new Forum();
        List<ForumUser> theResultMaleListForum = theForum.getList().stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                .collect(Collectors.toList());
        System.out.println("# of Male users: " + theResultMaleListForum.size() + "\n");
        theResultMaleListForum.stream()
                .forEach(System.out::println);

        List<ForumUser> theResultFemaleListForum = theForum.getList().stream()
                .filter(forumUser -> forumUser.getSex() == 'F')
                .collect(Collectors.toList());
        System.out.println("\n# of Female users: " + theResultFemaleListForum.size() + "\n");
        theResultFemaleListForum.stream()
                .forEach(System.out::println);

        List<ForumUser> theResult20YearListForum = theForum.getList().stream()
                .filter(forumUser -> forumUser.getBirthDate(20))
                .collect(Collectors.toList());
        System.out.println("\n# of 20 Year up users: " + theResult20YearListForum.size() + "\n");
        theResult20YearListForum.stream()
                .forEach(System.out::println);

        List<ForumUser> theResult1PostListForum = theForum.getList().stream()
                .filter(forumUser -> forumUser.getPosts() > 0)
                .collect(Collectors.toList());
        System.out.println("\n# of 1 up posts users: " + theResult1PostListForum.size() + "\n");
        theResult1PostListForum.stream()
                .forEach(System.out::println);

        Map<Integer, ForumUser> TheResultMap = theForum.getList().stream()
                .collect(Collectors.toMap(ForumUser::getUniCode, forumUser -> forumUser));
        System.out.println("\n# ForumUsers: " + TheResultMap.size() + "\n");
        TheResultMap.entrySet().stream()
                .map(entry -> "Map entry: key=" + entry.getKey() + ", value=" + entry.getValue())
                .forEach(System.out::println);
    }
}
