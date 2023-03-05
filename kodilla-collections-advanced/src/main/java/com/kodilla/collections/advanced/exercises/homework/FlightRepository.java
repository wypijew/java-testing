package com.kodilla.collections.advanced.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {

    public static List<Flight> getFlightsTable() {
        List<Flight> flights = new ArrayList<>();

        flights.add(new Flight("Warsaw", "London"));
        flights.add(new Flight("Paris", "New York"));
        flights.add(new Flight("Berlin", "Moscow"));
        flights.add(new Flight("London", "Paris"));
        flights.add(new Flight("New York", "Warsaw"));
        flights.add(new Flight("Moscow", "Berlin"));

        return flights;
    }
}