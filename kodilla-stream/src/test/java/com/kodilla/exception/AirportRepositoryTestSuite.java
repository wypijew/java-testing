package com.kodilla.exception;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AirportRepositoryTestSuite {

    @Test
    public void TestIsAirportInUse() throws AirportNotFoundException {

        AirportRepository airportRepository = new AirportRepository();

        boolean isWarsawInUse = airportRepository.isAirportInUse("Warsaw");

        assertTrue(isWarsawInUse);
    }

    @Test
    public void TestIsAirportInUse_withException() {
        AirportRepository airportRepository = new AirportRepository();

        assertThrows(AirportNotFoundException.class, () -> airportRepository.isAirportInUse("Vienna"));
    }


}