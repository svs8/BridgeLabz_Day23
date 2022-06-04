package com.bridgelabz;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidation {

    public static void userFirstName() {

        String firstNamePattern = "[A-Z]{1}[a-z]{2,}";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Name:");
        String firstName = scanner.next();

        Pattern pattern = Pattern.compile(firstNamePattern);
        Matcher matcher = pattern.matcher(firstName);
        boolean result = matcher.matches();

        if(result == true)
            System.out.println("First Name is Valid");
        else
            System.out.println("First Name is Invalid");
    }

    public static void userLastName() {

        String lastNamePattern = "[A-Z]{1}[a-z]{2,}";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Last Name:");
        String lastName = scanner.next();

        Pattern pattern = Pattern.compile(lastNamePattern);
        Matcher matcher = pattern.matcher(lastName);
        boolean result = matcher.matches();

        if(result == true)
            userEmail();
        else
            System.out.println("Last Name is Invalid");
    }

    public static void userEmail() {
        String emailPattern = "^[0-9a-zA-Z]+([._+-][0-9a-zA-Z]+)*" + "@([0-9a-zA-Z][_]?)+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?$";
        System.out.println("Enter your Email:");
        Scanner scanner = new Scanner(System.in);
        String email = scanner.next();

        Pattern pattern2 = Pattern.compile(emailPattern);
        Matcher matcher2 = pattern2.matcher(email);
        boolean result2 = matcher2.matches();

        if (result2 == true) {
            mobileNumberValidation();
        } else {
            System.out.println("Email is not valid");
        }

    }

    public static void mobileNumberValidation() {
        Scanner scanner = new Scanner(System.in);
        String MobileNumberPattern = "(91-)?[0-9]{10}";
        System.out.println("Enter the phone number");
        String phoneNumber = scanner.next();

        Pattern pattern3 = Pattern.compile(MobileNumberPattern);
        Matcher matcher3 = pattern3.matcher(phoneNumber);
        Boolean result3 = matcher3.matches();

        if (result3 == true) {
            System.out.println("Mobile number is valid");
        } else {
            System.out.println("Mobile number is invalid");
        }

    }
    public static void main(String[] args) {
        System.out.println("Welcome to User Registration program");
        userFirstName();
        userLastName();

    }
}