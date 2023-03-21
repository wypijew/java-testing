package com.kodilla.exception;

public class FirstException {
    public static void main(String[] args) {
        String username = null;
        String[] nameParts = username.split(" ");
        System.out.println("Firstname: " + nameParts[0]);
        System.out.println("lastname: " + nameParts[1]);

//        String username = "Willy Wonka";
//        String[] nameParts = username.split(" ");
//        System.out.println("Firstname: " + nameParts[0]);
//        System.out.println("lastname: " + nameParts[1]);
    }
}
