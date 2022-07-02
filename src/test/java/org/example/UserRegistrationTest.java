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
    public void givenLoginRule1Values_WhenNotProper_ShouldReturnTrue() {
        boolean result = userRegistration.loginValidationPassword("Mn2@kalal");
        Assert.assertTrue(result);


    }


    @Test
    public void giveEmailVaule_WhenProper_ShouldReturnTrue1() {
        boolean result = userRegistration.emailValidation("abc-100@yahoo.com");
        Assert.assertTrue(result);
    }

    @Test
    public void giveEmailVaule_WhenProper_ShouldReturnTrue2() {
        boolean result = userRegistration.emailValidation("abc.100@yahoo.com");
        Assert.assertTrue(result);
    }

    @Test
    public void giveEmailVaule_WhenProper_ShouldReturnTrue3() {
        boolean result = userRegistration.emailValidation("abc111@yahoo.com");
        Assert.assertTrue(result);
    }

    @Test
    public void giveEmailVaule_WhenProper_ShouldReturnTrue4() {
        boolean result = userRegistration.emailValidation("abc-100@abc.com");
        Assert.assertTrue(result);
    }

    @Test
    public void giveEmailVaule_WhenProper_ShouldReturnTrue5() {
        boolean result = userRegistration.emailValidation("abc@1.com");
        Assert.assertTrue(result);
    }

    @Test
    public void giveEmailVaule_WhenProper_ShouldReturnTrue6() {
        boolean result = userRegistration.emailValidation("abc+100@gmail.com");
        Assert.assertTrue(result);
    }

    @Test
    public void giveEmailVaule_WhenProper_ShouldReturnTrue7() {
        boolean result = userRegistration.emailValidation("manjukalal888@gmail.com");
        Assert.assertTrue(result);
    }

    @Test
    public void giveEmailVaule_WhenProper_ShouldReturnTrue8() {
        boolean result = userRegistration.emailValidation("abc@1.com");
        Assert.assertTrue(result);
    }
}