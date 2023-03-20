package com.kodilla.stream;

import com.kodilla.stream.homework.ForumStats;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class ForumStatsTest {
    @Test
    void testAveragePostsForUsersAboveAge() {
        // given
        List<User> users = new ArrayList<>();
                users.add(new User("John", 40, 10,null));
                users.add(new User("Alice", 50, 5, null));
                users.add(new User("Bob", 45, 15, null));
                users.add(new User("Mary", 35, 20, null));

        // when
        double averagePostsAbove40 = ForumStats.averagePostsForUsersAboveAge(users, 40);

        // then
        Assertions.assertEquals(10.0, averagePostsAbove40);
    }

    @Test
    void testAveragePostsForUsersBelowAge() {
        // given
        List<User> users = new ArrayList<>();
                users.add(new User("John", 40, 10, null));
                users.add(new User("Alice", 50, 5, null));
                users.add(new User("Bob", 45, 15, null));
                users.add(new User("Mary", 35, 20, null));

        // when
        double averagePostsBelow40 = ForumStats.averagePostsForUsersBelowAge(users, 40);

        // then
        Assertions.assertEquals(20.0, averagePostsBelow40);
    }

}
