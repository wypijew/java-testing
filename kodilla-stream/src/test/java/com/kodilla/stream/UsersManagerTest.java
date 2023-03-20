package com.kodilla.stream;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static com.kodilla.stream.UsersManager.getOlderUsers;
import static org.junit.jupiter.api.Assertions.*;

public class UsersManagerTest {
    @Test
    public void testFilterChemistGroupUsernames() {
        // given
        List<User> users = UsersRepository.getUsersList();

        // when
        List<String> result = UsersManager.filterChemistGroupUsernames();

        // then
        assertEquals(2, result.size());
        assertEquals("Walter White", result.get(0));
        assertEquals("Gale Boetticher", result.get(1));
    }

    @Test
    public void testGetOlderUsers() {
        int age = 30;
        List<User> olderUsers = getOlderUsers(age);

        for (User user : olderUsers) {
            assertEquals(true, user.getAge() > age);
        }
    }

    @Test
    public void testGetCorrectListForValidAge() {
        // given
        int age = 45;
        List<User> expectedUsers = new ArrayList<>();
        expectedUsers.add(new User("Walter White", 50, 7, "Chemists"));
        expectedUsers.add(new User("Gus Firing", 49, 0, "Board"));
        expectedUsers.add(new User("Mike Ehrmantraut", 57, 0, "Security"));

        // when
        List<User> olderUsers = getOlderUsers(age);

        // then
        assertEquals(3, olderUsers.size());
        assertTrue(expectedUsers.containsAll(olderUsers));
    }

    @Test
    public void testGetEmptyListWhenAllUsersYoungerThanAge() {
        // given
        int age = 60;
        // when
        List<User> olderUsers = getOlderUsers(age);
        // then
        assertEquals(0, olderUsers.size());
    }

    @Test
    public void testGetCorrectNumberOfUsersWhenAgeAboveMaximum() {
        // given
        int age = 80; // maksymalny wiek użytkownika to 79 lat
        // when
        List<User> olderUsers = getOlderUsers(age);
        // then
        assertEquals(0, olderUsers.size());
    }

    @Test
    public void testGetOlderUsersWhenSomeUsersAreOlder() {
        int age = 30;
        List<User> olderUsers = getOlderUsers(age);

        for (User user : olderUsers) {
            assertEquals(true, user.getAge() > age);
        }
    }

//    testy do metody getUsersAboveAge(int age)

    @Test
    void shouldReturnUsersAboveAgeSortedByName() {
        // given
        UsersManager usersManager = new UsersManager();
        List<User> olderUsers = UsersRepository.getUsersList().stream()
                .filter(user -> user.getAge() > 40)
                .sorted(Comparator.comparing(User::getUsername))
                .collect(Collectors.toList());

        // when
        List<User> result = usersManager.getUsersAboveAge(40);

        // then
        assertEquals(olderUsers.size(), result.size());
        assertTrue(result.containsAll(olderUsers));

        // checking if the list is sorted alphabetically by name
        List<User> sortedResult = new ArrayList<>(result);
        sortedResult.sort(Comparator.comparing(User::getUsername));
        assertIterableEquals(sortedResult, result);
    }

    @Test
    void shouldReturnEmptyListIfNoUsersAboveAge() {
        // given
        UsersManager usersManager = new UsersManager();

        // when
        List<User> result = usersManager.getUsersAboveAge(100);

        // then
        assertTrue(result.isEmpty());
    }


    @Test
    void shouldReturnAllUsersIfAllAboveAge() {
        // given
        UsersManager usersManager = new UsersManager();
        List<User> allUsers = UsersRepository.getUsersList();

        // when
        List<User> result = usersManager.getUsersAboveAge(0);

        // then
        assertEquals(allUsers.size(), result.size());
        assertTrue(result.containsAll(allUsers));
    }
}