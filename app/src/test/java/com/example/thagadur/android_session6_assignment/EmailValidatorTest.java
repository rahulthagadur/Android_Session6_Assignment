package com.example.thagadur.android_session6_assignment;


import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class EmailValidatorTest {
    @Test
    public void emailValidator_CorrectEmailSimple_ReturnsTrue() {
        assertTrue(EmailValidator.isValidEmail("rahul@email.com"));
    }

}
