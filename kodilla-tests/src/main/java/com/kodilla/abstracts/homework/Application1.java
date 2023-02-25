package com.kodilla.abstracts.homework;


public class Application1 {
    public static void main(String[] args) {
        Job architect = new Architect(5500, "creating projects, construction control, modernization");
        Job soldier = new Soldier(6500, "defense activities, obeying orders, domestic service");
        Job plumber = new Plumber(4500, "installing, maintenance, technical supervision");

        Person john = new Person(35, "John", architect);
        john.showResponsibilities();

        Person tom = new Person(28, "Tom", soldier);
        tom.showResponsibilities();

        Person mike = new Person(42, "Mike", plumber);
        mike.showResponsibilities();
    }
}
//
//    public static void main(String[] args) {
//        Job plumber = new Plumber(4500, );
//        Person person = new Person(45, "James", plumber.responsibilities());
//        person.showResponsibilities();
//
//    }
//}