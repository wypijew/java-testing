package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;
import java.util.List;

class ShopTestSuite {

    private Shop shop;
    private Order order1;
    private Order order2;
    private Order order3;
    private Order order4;

    @BeforeEach
    public void setUp() {
        shop = new Shop();
        order1 = new Order(10.0, new Date(), "user1");
        order2 = new Order(20.0, new Date(), "user2");
        order3 = new Order(15.0, new Date(), "user3");
        order4 = new Order(30.0, new Date(), "user4");

        shop.addOrder(order1.getValue(), order1.getDate(), order1.getLogin());
        shop.addOrder(order2.getValue(), order2.getDate(), order2.getLogin());
        shop.addOrder(order3.getValue(), order3.getDate(), order3.getLogin());
        shop.addOrder(order4.getValue(), order4.getDate(), order4.getLogin());
    }

    @Test
    public void testAddOrder() {
        Order newOrder = new Order(25.0, new Date(), "user5");
        shop.addOrder(newOrder.getValue(), newOrder.getDate(), newOrder.getLogin());

        int expectedSize = 5;
        int actualSize = shop.getSize();

        Assertions.assertEquals(expectedSize, actualSize, "Liczba zamówień po dodaniu się nie zgadza");
        Assertions.assertTrue(shop.getOrders().contains(newOrder), "Nowe zamówienie nie znajduje się na liście zamówień");
    }

    @Test
    public void testAddedOrderExistsInShop() {
        Order newOrder = new Order(25.0, new Date(), "user5");
        shop.addOrder(newOrder.getValue(), newOrder.getDate(), newOrder.getLogin());

        boolean orderExists = false;
        for (Order order : shop.getOrders()) {
            if (order.equals(newOrder)) {
                orderExists = true;
                break;
            }
        }

        Assertions.assertTrue(orderExists, "Dodane zamówienie nie znajduje się na liście zamówień");
    }

    @Test
    public void testGetOrdersBetweenDates() {

        Date startDate = new Date(122, 0, 1); // 1 stycznia 2022
        Date endDate = new Date(122, 11, 31); // 31 grudnia 2022

        List<Order> ordersBetweenDates = shop.getOrdersBetweenDates(startDate, endDate);

        for (Order order : ordersBetweenDates) {
            Date orderDate = order.getDate();
            Assertions.assertTrue(orderDate.after(startDate) || orderDate.equals(startDate), "Zamówienie spoza zakresu dat zostało zwrócone");
            Assertions.assertTrue(orderDate.before(endDate) || orderDate.equals(endDate), "Zamówienie spoza zakresu dat zostało zwrócone");
        }

        for (Order order : shop.getOrders()) {
            Date orderDate = order.getDate();
            Assertions.assertTrue(orderDate.before(startDate) || orderDate.after(endDate), "Zamówienie spoza zakresu dat znajduje się na liście");
        }
    }

    @Test
    public void testGetOrdersWithinValueRange() {
        double minValue = 10.0;
        double maxValue = 30.0;

        List<Order> ordersWithinValueRange = shop.getOrdersWithinValueRange(minValue, maxValue);

        for (Order order : ordersWithinValueRange) {
            double orderValue = order.getValue();
            Assertions.assertTrue(orderValue >= minValue && orderValue <= maxValue, "Zamówienie spoza zakresu wartości zostało zwrócone");
        }

        for (Order order : shop.getOrders()) {
            double orderValue = order.getValue();
            Assertions.assertFalse(orderValue < minValue || orderValue > maxValue, "Zamówienie spoza zakresu wartości znajduje się na liście");
        }
    }

    @Test
    public void testNoOrdersOutsideValueRange() {
        double minValue = 10.0;
        double maxValue = 30.0;

        List<Order> ordersWithinValueRange = shop.getOrdersWithinValueRange(minValue, maxValue);

        for (Order order : ordersWithinValueRange) {
            double orderValue = order.getValue();
            Assertions.assertTrue(orderValue >= minValue && orderValue <= maxValue, "Zamówienie spoza zakresu wartości zostało zwrócone");
        }

        for (Order order : shop.getOrders()) {
            double orderValue = order.getValue();
            Assertions.assertFalse(orderValue < minValue || orderValue > maxValue, "Zamówienie spoza zakresu wartości znajduje się na liście");
        }
    }

    @Test
    public void testOrderCountAfterAddingOrders() {
        // Sprawdzenie liczby zamówień
        int expectedSize = 4;
        int actualSize = shop.getSize();

        Assertions.assertEquals(expectedSize, actualSize, "Liczba zamówień po dodaniu się nie zgadza");

        // Dodanie kolejnego zamówienia
        shop.addOrder(25.0, new Date(), "user5");

        // Aktualizacja oczekiwanej liczby zamówień
        expectedSize = 5;
        actualSize = shop.getSize();

        Assertions.assertEquals(expectedSize, actualSize, "Liczba zamówień po dodaniu kolejnego zamówienia się nie zgadza");
    }

    @Test
    public void testTotalOrderValue() {
        // Sprawdzenie sumy wartości wszystkich zamówień
        double expectedTotalValue = 75.0;
        double actualTotalValue = shop.getTotalOrderValue();

        Assertions.assertEquals(expectedTotalValue, actualTotalValue, 0.01, "Suma wartości wszystkich zamówień się nie zgadza");

        // Dodanie kolejnego zamówienia
        shop.addOrder(25.0, new Date(), "user5");

        // Aktualizacja oczekiwanej sumy wartości zamówień
        expectedTotalValue = 100.0;
        actualTotalValue = shop.getTotalOrderValue();

        Assertions.assertEquals(expectedTotalValue, actualTotalValue, 0.01, "Suma wartości wszystkich zamówień po dodaniu kolejnego zamówienia się nie zgadza");
    }


    @Test
    public void testInvalidArguments() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            shop.addOrder(10.0, null, "user1");
        });

        // Null jako data początkowa
        Assertions.assertThrows(NullPointerException.class, () -> {
            shop.getOrdersBetweenDates(null, new Date());
        });

        // Null jako data końcowa
        Assertions.assertThrows(NullPointerException.class, () -> {
            shop.getOrdersBetweenDates(new Date(), null);
        });

        // Null jako wartość zamówienia
        Assertions.assertThrows(NullPointerException.class, () -> {
            shop.addOrder(null, new Date(), "user1");
        });

        // Sprawdzenie dla null jako loginu
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            shop.addOrder(10.0, new Date(), null);
        });
    }

    @Test
    public void testEmptyShop() {
        Shop shop = new Shop();

        //Lista zamówień jest pusta?
        List<Order> orders = shop.getOrders();
        Assertions.assertTrue(orders.isEmpty(), "Lista zamówień powinna być pusta");

        //Czy liczba zamówień wynosi 0
        int orderCount = shop.getSize();
        Assertions.assertEquals(0, orderCount, "Liczba zamówień powinna wynosić 0");

        //Czy suma wartości zamówień wynosi 0
        double totalValue = shop.getTotalOrderValue();
        Assertions.assertEquals(0.0, totalValue, 0.01, "Suma wartości zamówień powinna wynosić 0.0");
    }
}

