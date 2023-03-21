package com.kodilla.exception.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WarehouseTest {

    @Test
    public void TestGetOrderWhenOrderExists() throws OrderDoesNotExistException {
        Warehouse warehouse = new Warehouse();
        Order order1 = new Order("004");
        Order order2 = new Order("005");
        warehouse.addOrder(order1);
        warehouse.addOrder(order2);

        Order addedOrder = warehouse.getOrder("005");

        assertNotNull(addedOrder);
        assertEquals(order2.getNumber(), addedOrder.getNumber());
    }

    @Test
    public void TestGetOrderWhenOrderDoesNotExist() throws OrderDoesNotExistException {
        Warehouse warehouse = new Warehouse();
        Order order1 = new Order("007");
        Order order2 = new Order("008");
        warehouse.addOrder(order1);
        warehouse.addOrder(order2);

        assertThrows(OrderDoesNotExistException.class, () -> {
            warehouse.getOrder("009");
        });
    }
}