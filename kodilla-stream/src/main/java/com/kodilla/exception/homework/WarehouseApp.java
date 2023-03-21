package com.kodilla.exception.homework;

public class WarehouseApp {
    public static void main(String[] args) throws OrderDoesNotExistException {
        Warehouse warehouse = new Warehouse();

        warehouse.addOrder(new Order("001"));
        warehouse.addOrder(new Order("002"));
        warehouse.addOrder(new Order("003"));

        try {
            Order order = warehouse.getOrder("004");
            System.out.println("Order found: " + order.getNumber());
        } catch (OrderDoesNotExistException e) {
          System.out.println("The order with this number does not exist. Try again.");
        } finally {
            System.out.println("Thank you for using our service.");
    }
    }
}
