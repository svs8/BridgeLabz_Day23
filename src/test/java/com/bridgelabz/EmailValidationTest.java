package com.bridgelabz;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class EmailValidationTest {

    private String emailTest;
    private Boolean expectedResult;

    private static UserValidation uservalidation;

    public EmailValidationTest(String emailTest, Boolean expectedResult) {
        this.emailTest = emailTest;
        this.expectedResult = expectedResult;
    }

    @Before
    public void initialize() {
        uservalidation = new UserValidation();
    }

    @Parameterized.Parameters
    public static Collection data() {
        return Arrays.asList(new Object[][]{{"abc@yahoo.com", true},
                {"abc-100@yahoo.com", true},
                {"abc.100@yahoo.com", true},
                {"abc111@abc.com", true},
                {"abc-100@abc.net", true},
                {"abc.100@abc.com.au", true},
                {"abc@1.com", true},
                {"abc@gmail.com.com", true},
                {"abc+100@gmail.com", true},
                {"ab@gmail.com", true},
                {"abc", false},
                {"abc@.com.my", false},
                {"abc123@gmail.a", false},
                {"abc123@.com", false},
                {"abc123@.com.com", false},
                {".abc@abc.com", false},
                {"abc()*@gmail.com", false},
                {"abc..2002@gmail.com", false},
                {"abc@gmail.com.1a", false},
                {"abc@gmail.com.aa.au", false}
        });
    }


    @Test
    public void givenUserEmail_WhenProper_ShouldReturnTrue() {
        boolean result = uservalidation.userEmail(this.emailTest);
        Assert.assertEquals("Email", this.expectedResult, result);

    }
}
