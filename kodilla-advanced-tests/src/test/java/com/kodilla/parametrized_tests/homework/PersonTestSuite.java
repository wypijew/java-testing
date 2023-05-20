package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class PersonTestSuite {

    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.homework.PersonSource#provideDataForTesting")
    void getBMI_ShouldReturnCorrectValue(Person person, String expectedBMI) {
        String actualBMI = person.getBMI();
        Assertions.assertEquals(expectedBMI, actualBMI);
    }
}