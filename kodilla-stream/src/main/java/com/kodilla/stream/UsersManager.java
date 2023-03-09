package com.kodilla.stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class UsersManager {
    public static void main(String[] args) {
        List<String> chemistGroupUsernames = filterChemistGroupUsernames();
        System.out.println(chemistGroupUsernames);
        List<User> securityGroupUsersOver30 = getUsersAboveAge(40);
        for (User user : securityGroupUsersOver30) {
            System.out.println("Name: " + user.getUsername() + ", age: " + user.getAge());
        }
    }

    public static List<String> filterChemistGroupUsernames() {
        List<String> usernames = UsersRepository.getUsersList()   // [1]
                .stream()
                .filter(user -> user.getGroup().equals("Chemists"))
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());                      // [2]

        return usernames;
    }

    public static String getUserName(User user) {
        return user.getUsername();
    }

    public static List<User> getOlderUsers(int age) {
        List<User> olderUsers = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getAge() > age)
                .collect(Collectors.toList());

        return olderUsers;
    }

    public static List <User> getUsersAboveAge(int age) {
    List<User> users = UsersRepository.getUsersList();
    List<User> sortedNames = users.stream()
            .filter(user -> user.getAge() > age)
            .sorted(Comparator.comparing(User::getUsername))
            .collect(Collectors.toList());

        return sortedNames;
    }
}


//    private static void processUsersStream() {
//        List<String> usernames = UsersRepository.getUsersList()
//        UsersRepository.getUsersList()
//                .stream()
//                .filter(user -> user.getGroup().equals("Chemists"))
//                .map(UsersManager::getUserName)
//                .forEach(username -> System.out.println(username));
//    }



