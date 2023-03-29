package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserValidatorTestSuite {

    @ParameterizedTest
    @ValueSource(strings = {"john_doe123", "JaneDoe456", "johndoe789", "j.doe", "j-doe", "j_doe"})
    public void testValidateUsername_ValidUsernames(String username) {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validateUsername(username);
        assertEquals(true, result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"j", "jo", "j_", "j$123", "joe!", "john*doe"})
    public void testValidateUsername_InvalidUsernames(String username) {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validateUsername(username);
        assertEquals(false, result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"john.doe@example.com", "jane.doe@example.co.uk", "jdoe_123@example.pl"})
    public void testValidateEmail_ValidEmails(String email) {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validateEmail(email);
        assertEquals(true, result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"johndoe@example", "johndoe@", "@example.com", "johndoe@example..com", "johndoe@example.coom "})
    public void testValidateEmail_InvalidEmails(String email) {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validateEmail(email);
        assertEquals(false, result);
    }
}
