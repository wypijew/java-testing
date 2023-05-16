package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;

class PersonTestSuite {
//    @ParameterizedTest
//    @MethodSource(value = "provideListForTesting")
//    void getBMI_ShouldReturnCorrectValue(double height, double weight, String expectedBMI) {
//
//        Person person = new Person(height, weight);
//        String actualBMI = person.getBMI();
//
//        Assertions.assertEquals(expectedBMI, actualBMI);
//    }
//
//    private static List<PersonSource.PersonData> provideListForTesting () {
//        return PersonSource.provideListForTesting();
//
//    }

        @ParameterizedTest
        @MethodSource(value = "com.kodilla.parametrized_tests.homework.PersonSource#provideListForTesting")
        void getBMI_ShouldReturnCorrectValue(PersonSource.PersonData personData) {
            Person person = personData.getPerson();
            String expectedBMI = personData.getExpectedBMI();

            String actualBMI = person.getBMI();

            Assertions.assertEquals(expectedBMI, actualBMI);
        }

        private static List<PersonSource.PersonData> provideListForTesting() {
            return PersonSource.provideListForTesting();
        }
    }
