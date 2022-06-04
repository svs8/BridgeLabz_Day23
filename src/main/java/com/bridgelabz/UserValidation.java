package com.bridgelabz;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidation {

    public static boolean userFirstName(String firstName) {

        String firstNamePattern = "[A-Z]{1}[a-z]{2,}";

        Pattern pattern = Pattern.compile(firstNamePattern);
        Matcher matcher = pattern.matcher(firstName);
        boolean result = matcher.matches();
        return result;
    }

    public static boolean userLastName(String lastName) {

        String lastNamePattern = "[A-Z]{1}[a-z]{2,}";

        Pattern pattern1 = Pattern.compile(lastNamePattern);
        Matcher matcher1 = pattern1.matcher(lastName);
        boolean result1 = matcher1.matches();
        return result1;
    }

    public static boolean userEmail(String email) {
        String emailPattern = "^[0-9a-zA-Z]+([._+-][0-9a-zA-Z]+)*" + "@([0-9a-zA-Z][_]?)+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?$";

        Pattern pattern2 = Pattern.compile(emailPattern);
        Matcher matcher2 = pattern2.matcher(email);
        boolean result2 = matcher2.matches();
        return result2;

    }

    public static boolean mobileNumberValidation(String phoneNumber) {
        Scanner scanner = new Scanner(System.in);
        String MobileNumberPattern = "(91-)?[0-9]{10}";

        Pattern pattern3 = Pattern.compile(MobileNumberPattern);
        Matcher matcher3 = pattern3.matcher(phoneNumber);
        Boolean result3 = matcher3.matches();
        return result3;
    }

//    public static void passwordValidation() {
//        Scanner scanner = new Scanner(System.in);
//        String PasswordPattern = "[a-zA-Z0-9~!@#$]{8,}";
//        System.out.println("Enter the Password");
//        String passWord = scanner.next();
//
//        Pattern pattern4 = Pattern.compile(PasswordPattern);
//        Matcher matcher4 = pattern4.matcher(passWord);
//        Boolean result4 = matcher4.matches();
//
//        if (result4 == true) {
//            passwordValidation2();
//        } else {
//            System.out.println("Password is invalid,please enter minimum 8 character");
//        }
//
//    }
//
//    public static void passwordValidation2() {
//        Scanner scanner = new Scanner(System.in);
//        String PasswordPattern2 = "[A-Z]+[a-zA-Z0-9~!@#$]{7,}";
//        System.out.println("Enter the Password to check Rule2");
//        String passWord2 = scanner.next();
//
//        Pattern pattern5 = Pattern.compile(PasswordPattern2);
//        Matcher matcher5 = pattern5.matcher(passWord2);
//        Boolean result5 = matcher5.matches();
//
//        if (result5 == true) {
//            passwordValidation3();
//        } else {
//            System.out.println("Password is invalid,please enter at least one upper case");
//        }
//
//    }
//
//    public static void passwordValidation3() {
//        Scanner scanner = new Scanner(System.in);
//        String PasswordPattern3 = "[A-Z][0-9][a-zA-Z0-9~!@#$]{6,}";
//        System.out.println("Enter the Password to check Rule3");
//        String passWord3 = scanner.next();
//
//        Pattern pattern6 = Pattern.compile(PasswordPattern3);
//        Matcher matcher6 = pattern6.matcher(passWord3);
//        Boolean result6 = matcher6.matches();
//
//        if (result6 == true) {
//            passwordValidation4();
//        } else {
//            System.out.println("Password is invalid,please enter at least one numeric");
//        }
//
//    }

    public static boolean passwordValidation4(String password4) {

        String PasswordPattern4 = "([0-9a-zA-Z]*[~!@#$]){1}[0-9a-zA-Z~!@#$]*";

        Pattern pattern7 = Pattern.compile(PasswordPattern4);
        Matcher matcher7 = pattern7.matcher(password4);
        boolean result7 = matcher7.matches();
        return result7;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to User Registration program");

    }
}