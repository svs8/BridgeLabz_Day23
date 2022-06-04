package com.bridgelabz;
import javax.swing.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidation {


    public static void multipleEmailValidation() {
        String emailPattern = "[a-zA-Z0-9]+[.+-]{0,1}[0-9a-zA-Z]*@[a-z0-9]+[.][a-z]{2,4}[.a-z]{0,4}";
        System.out.println("Enter your Email:");
        String[] str = {"abc@yahoo.com", "abc-100@yahoo.com", "abc.100@yahoo.com", "abc111@abc.com",
                "abc-100@abc.net", "abc.100@abc.com.au", "abc@1.com", "abc@gmail.com.com", "abc+100@gmail.com"};
        int i = 0;
        while (i < str.length) {
            Pattern pattern = Pattern.compile(emailPattern);
            Matcher matcher = pattern.matcher(str[i]);
            Boolean result = matcher.matches();

            if (result == true) {
                System.out.println(i + ": Valid");
            } else {
                System.out.println(i + ": Email is not valid");
            }
            i++;
        }
    }

    public static void main(String[] args) {
        multipleEmailValidation();

    }
}