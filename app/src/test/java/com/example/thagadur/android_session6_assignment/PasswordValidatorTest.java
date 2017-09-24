package com.example.thagadur.android_session6_assignment;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Thagadur on 9/14/2017.
 */

public class PasswordValidatorTest {

    @Test
    public void correct_passworsd_validator_ReturnsTrue(){
        Assert.assertTrue(PasswordValidator.isValidPassword(".qweAsd$123"));
    }


}
