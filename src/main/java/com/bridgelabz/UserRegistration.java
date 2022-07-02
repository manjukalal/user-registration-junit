package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    Pattern pattern;
    Matcher matcher;

    public boolean validateFirstName(String name) {
        String regex = "^[A-Z]{1}[a-z]{2,}";
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(name);
        return matcher.matches();
    }

    public boolean validateLastName(String name) {
        String regex = "^[A-Z]{1}[a-z]{2,}";
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(name);
        return matcher.matches();
    }

    public boolean emailValidation(String name) {
        String regex = "^[a-z0-9]{3,}+([_+-.][a-z0-9]{3,}+)*@[a-z0-9]+.[a-z]{2,3}+(.[a-z][2,3]){0,1}$";
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(name);
        return matcher.matches();
    }


    public boolean numberValidation(String number) {
        String regex = "^[0-9]{2}\\s[0-9]{10}";
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(number);
        return matcher.matches();
    }



    public boolean loginValidationPassword(String name){
        String regex ="[A-Za-z]{2,}+\\d+[!@#$%^&*+-|'~`,<>.?_]+[A-za-z]{4,}";
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(name);
        return matcher.matches();
    }


}
