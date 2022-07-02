package org.example;

import com.bridgelabz.UserRegistration;
import junit.framework.Assert;
import org.testng.annotations.Test;


public class UserRegistrationTest {
    UserRegistration userRegistration = new UserRegistration();

    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        boolean result = userRegistration.validateFirstName("Manju");
        Assert.assertTrue(result);
    }
    @Test
    public void giveLastName_WhenProper_ShouldReturnTrue() {
        boolean result = userRegistration.validateLastName("Kalal");
        Assert.assertTrue(result);
    }

    @Test
    public void giveEmailVaule_WhenProper_ShouldReturnTrue() {
        boolean result = userRegistration.emailValidation("abc@yahoo.com");
        Assert.assertTrue(result);
    }


    @Test
    public void giveNumberValue_WhenProper_ShouldReturnTrue() {
        boolean result = userRegistration.numberValidation("91 8748856526");
        Assert.assertTrue(result);
    }


    @Test
    public void givenLoginRule1Values_WhenNotProper_ShouldReturnFalse() {
        boolean result = userRegistration.loginValidationPassword("Mn2@kalal");
        Assert.assertTrue(result);


    }
}