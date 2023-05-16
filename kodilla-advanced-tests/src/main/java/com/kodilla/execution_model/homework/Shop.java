package com.kodilla.execution_model.homework;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Shop {

    private List<Order> orders = new ArrayList<>();

    public void addOrder(Order order) {
        this.orders.add(order);
    }

    public List<Order> getOrdersBetweenDates(Date startDate, Date endDate) {
        List<Order> filteredOrders = new ArrayList<>();
        for (Order order : orders) {
            if (order.getDate().after(startDate) && order.getDate().before(endDate)) {
                filteredOrders.add(order);
            }
        }
        return filteredOrders;
    }

    public List<Order> getOrdersWithinValueRange(double minValue, double maxValue) {
        List<Order> filteredOrders = new ArrayList<>();
        for (Order order : orders) {
            if (order.getValue() >= minValue && order.getValue() <= maxValue) {
                filteredOrders.add(order);
            }
        }
        return filteredOrders;
    }

    public int getSize() {
        return this.orders.size();
    }

    public double getTotalOrderValue() {
        double totalSum = 0;
        for (Order order : orders) {
            totalSum += order.getValue();
        }
        return totalSum;
    }
}
