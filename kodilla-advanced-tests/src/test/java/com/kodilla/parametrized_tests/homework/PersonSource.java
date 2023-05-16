package com.kodilla.parametrized_tests.homework;

import java.util.Arrays;
import java.util.List;

public class PersonSource {
    public static List<PersonData> provideListForTesting() {
        return Arrays.asList(
                new PersonData(new Person(1.80, 50), "Very severely underweight"),
                new PersonData(new Person(1.70, 55), "Severely underweight"),
                new PersonData(new Person(1.65, 60), "Underweight"),
                new PersonData(new Person(1.75, 70), "Normal (healthy weight)"),
                new PersonData(new Person(1.80, 85), "Normal (healthy weight)"),
                new PersonData(new Person(1.65, 90), "Overweight"),
                new PersonData(new Person(1.70, 100), "Overweight"),
                new PersonData(new Person(1.75, 115), "Obese Class I (Moderately obese)"),
                new PersonData(new Person(1.80, 130), "Obese Class I (Moderately obese)"),
                new PersonData(new Person(1.65, 150), "Obese Class II (Severely obese)"),
                new PersonData(new Person(1.70, 180), "Obese Class III (Very severely obese)")
        );
    }

    public static class PersonData {
        private final Person person;
        private final String expectedBMI;

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