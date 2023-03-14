package com.kodilla.optional;

import com.kodilla.stream.User;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        User user = new User("user1", 30, 100,"Test");
//        User user = null;

        Optional<User> optionalUser = Optional.ofNullable(user);

//        String username =
//                optionalUser.orElse(new User("", 0, 0, "")).getUsername();     // [1]
//
//        System.out.println(username);
        optionalUser.ifPresent(u -> System.out.println(u.getUsername()));
    }
}
