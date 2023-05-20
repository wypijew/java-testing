package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class PersonSource {
    public static Stream<Arguments> provideDataForTesting() {
        return Stream.of(
                Arguments.of(new Person(1.80, 50), "Severely underweight"),
                Arguments.of(new Person(1.70, 55), "Normal (healthy weight)"),
                Arguments.of(new Person(1.65, 60), "Normal (healthy weight)"),
                Arguments.of(new Person(1.75, 70), "Normal (healthy weight)"),
                Arguments.of(new Person(1.80, 85), "Overweight"),
                Arguments.of(new Person(1.65, 90), "Obese Class I (Moderately obese)"),
                Arguments.of(new Person(1.70, 100), "Obese Class I (Moderately obese)"),
                Arguments.of(new Person(1.75, 115), "Obese Class II (Severely obese)"),
                Arguments.of(new Person(1.80, 130), "Obese Class III (Very severely obese)"),
                Arguments.of(new Person(1.65, 150), "Obese Class V (Super Obese)"),
                Arguments.of(new Person(1.70, 180), "Obese Class VI (Hyper Obese)")
        );
    }

    public static class PersonData {
        private Person person;
        private String expectedBMI;

        public PersonData(Person person, String expectedBMI) {
            this.person = person;
            this.expectedBMI = expectedBMI;
        }

        public Person getPerson() {
            return person;
        }

        public String getExpectedBMI() {
            return expectedBMI;
        }
    }
}