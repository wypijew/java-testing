package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class GamblingMachineTestSuite {

    private GamblingMachine gamblingMachine = new GamblingMachine();

    @ParameterizedTest
    @CsvFileSource(resources = "/gamblingMachineInvalidSizeNumbers.csv")
    public void testHowManyWins_InvalidSizeNumbers(String numbersString) {
        // Convert comma-separated string of numbers to Set<Integer>
        String[] numbersArray = numbersString.split(",");
        Set<Integer> numbers = new HashSet<>();
        for (String number : numbersArray) {
            numbers.add(Integer.parseInt(number));
        }

        GamblingMachine gamblingMachine = new GamblingMachine();
        assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(numbers));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/gamblingMachineInvalidScopeNumbers.csv")
    public void testHowManyWins_InvalidScopeNumbers(String numbersString) {
        // Convert comma-separated string of numbers to Set<Integer>
        String[] numbersArray = numbersString.split(",");
        Set<Integer> numbers = new HashSet<>();
        for (String number : numbersArray) {
            numbers.add(Integer.parseInt(number));
        }

        GamblingMachine gamblingMachine = new GamblingMachine();
        assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(numbers));
    }

    @ParameterizedTest
    @CsvSource({"51,1,2,3,4,5", "50,51,52,53,54,55"})
    public void testHowManyWins_InvalidNumbers_ThrowsException(String numbersString) {
        // Convert comma-separated string of numbers to Set<Integer>
        String[] numbersArray = numbersString.split(",");
        Set<Integer> numbers = new HashSet<>();
        for (String number : numbersArray) {
            numbers.add(Integer.parseInt(number));
        }

        GamblingMachine gamblingMachine = new GamblingMachine();
        assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(numbers));
    }

    @ParameterizedTest
    @CsvSource({"1,2,3,4,5,5", "1,2,3,4,5,5,5"})
    public void testHowManyWins_DuplicateNumbers_ThrowsException(String numbersString) {
        // Convert comma-separated string of numbers to Set<Integer>
        String[] numbersArray = numbersString.split(",");
        Set<Integer> numbers = new HashSet<>();
        for (String number : numbersArray) {
            numbers.add(Integer.parseInt(number));
        }

        GamblingMachine gamblingMachine = new GamblingMachine();
        assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(numbers));
    }
}