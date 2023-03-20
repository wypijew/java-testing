package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UsersRepository;

import java.util.ArrayList;
import java.util.List;

public class ForumStats {

    public static double averagePostsForUsersAboveAge(List<User> users, int age) {
        return users.stream()
                .filter(u -> u.getAge() >= age)
                .mapToInt(u -> u.getNumberOfPost())
                .average()
                .orElse(0.0);
    }

    public static double averagePostsForUsersBelowAge(List<User> users, int age) {
        return users.stream()
                .filter(u -> u.getAge() < age)
                .mapToInt(u -> u.getNumberOfPost())
                .average()
                .orElse(0.0);
    }

    public static void main(String[] args) {
        List<User> users = UsersRepository.getUsersList();
        double averagePostsAbove40 = averagePostsForUsersAboveAge(users,40 );
        double averagePostsBelow40 = averagePostsForUsersBelowAge(users,40 );

        System.out.println("Average posts for users under age 40: " + averagePostsAbove40);
        System.out.println("Average posts for users over age 40: " + averagePostsBelow40);
    }


}
