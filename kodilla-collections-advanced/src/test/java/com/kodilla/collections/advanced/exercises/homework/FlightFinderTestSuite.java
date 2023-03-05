package com.kodilla.collections.advanced.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FlightFinderTestSuite {
    @Test
    public void testFindFlightsFrom() {
        FlightFinder flightFinder = new FlightFinder();
        List<Flight> flightsFromWarsaw = flightFinder.findFlightsFrom("Warsaw");
        assertEquals(1, flightsFromWarsaw.size());
        assertEquals("London", flightsFromWarsaw.get(0).getArrival());

        List<Flight> flightsFromBerlin = flightFinder.findFlightsFrom("Berlin");
        assertEquals(1, flightsFromBerlin.size());
        assertEquals("Moscow", flightsFromBerlin.get(0).getArrival());

        List<Flight> flightsFromParis = flightFinder.findFlightsFrom("Paris");
        assertEquals(1, flightsFromParis.size());
        assertEquals("New York", flightsFromParis.get(0).getArrival());

        List<Flight> flightsFromLondon = flightFinder.findFlightsFrom("London");
        assertEquals(1, flightsFromLondon.size());
        assertEquals("Paris", flightsFromLondon.get(0).getArrival());
    }

    @Test
    public void testFindFlightsTo() {
        FlightFinder flightFinder = new FlightFinder();
        List<Flight> flightsToLondon = flightFinder.findFlightsTo("London");
        assertEquals(1, flightsToLondon.size());
        assertEquals("Warsaw", flightsToLondon.get(0).getDeparture());

        List<Flight> flightsToMoscow = flightFinder.findFlightsTo("Moscow");
        assertEquals(1, flightsToMoscow.size());
        assertEquals("Berlin", flightsToMoscow.get(0).getDeparture());

        List<Flight> flightsToNewYork = flightFinder.findFlightsTo("New York");
        assertEquals(1, flightsToNewYork.size());
        assertEquals("Paris", flightsToNewYork.get(0).getDeparture());

        List<Flight> flightsToParis = flightFinder.findFlightsTo("Paris");
        assertEquals(1, flightsToParis.size());
        assertEquals("London", flightsToParis.get(0).getDeparture());
    }
}