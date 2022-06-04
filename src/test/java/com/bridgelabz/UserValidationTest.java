package com.bridgelabz;

import org.junit.jupiter.api.Test;
import org.junit.Assert;
import static org.junit.Assert.*;

class UserValidationTest {

    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        UserValidation uservalidation=new UserValidation();
        boolean result=uservalidation.userFirstName("Surak");
        Assert.assertEquals("Firstname",true,result);
    }
    @org.junit.jupiter.api.Test
    public void givenFirstName_WhenNotProper_ShouldReturnFalse() {
        UserValidation uservalidation1=new UserValidation();
        boolean result1=uservalidation1.userFirstName("surak");
        Assert.assertEquals("Firstname",true,result1);
    }

    @Test
    void givenLastName_WhenProper_ShouldReturnTrue() {
        UserValidation uservalidation2=new UserValidation();
        boolean result2=uservalidation2.userLastName("Vshetty");
        Assert.assertEquals("Lastname",true,result2);
    }

    @Test
    void givenLastName_WhenNotProper_ShouldReturnFalse() {
        UserValidation uservalidation3=new UserValidation();
        boolean result3=uservalidation3.userLastName("vshetty");
        Assert.assertEquals("Lastname",true,result3);
    }


    @Test
    void givenEmail_WhenProper_ShouldReturnTrue() {
        UserValidation uservalidation4=new UserValidation();
        boolean result4=uservalidation4.userEmail("abc@gmail.com");
        Assert.assertEquals("Email",true,result4);

    }

    @Test
    void givenEmail_WhenNotProper_ShouldReturnFalse() {
        UserValidation uservalidation5=new UserValidation();
        boolean result5=uservalidation5.userEmail("abc.gmail.com");
        Assert.assertEquals("Email",true,result5);
    }

    @Test
    void givenPhoneNumber_WhenProper_ShouldReturnTrue() {
        UserValidation uservalidation6=new UserValidation();
        boolean result6=uservalidation6.mobileNumberValidation("9745678902");
        Assert.assertEquals("Phone Number",true,result6);
    }

    @Test
    void givenPhoneNumber_WhenNotProper_ShouldReturnFalse() {
        UserValidation uservalidation7=new UserValidation();
        boolean result7=uservalidation7.mobileNumberValidation("345679");
        Assert.assertEquals("Phone Number",true,result7);
    }

    @Test
    void givenPassword_WhenProper_ShouldReturnTrue() {
        UserValidation uservalidation8=new UserValidation();
        boolean result8=uservalidation8.passwordValidation4("S687$vjhjh");
        Assert.assertEquals("Phone Number",true,result8);
    }

    @Test
    void givenPassword_WhenNotProper_ShouldReturnFalse() {
        UserValidation uservalidation9=new UserValidation();
        boolean result9=uservalidation9.mobileNumberValidation("yvvhj");
        Assert.assertEquals("Phone Number",true,result9);
    }




}