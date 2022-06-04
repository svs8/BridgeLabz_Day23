package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidationException {

    static Scanner scanner= new Scanner(System.in);

    public static void userFirstNameException() throws CustomException{

        String firstNamePattern = "[A-Z]{1}[a-z]{2,}";
        Pattern pattern = Pattern.compile(firstNamePattern);
        System.out.println("Enter the firstname");
        String firstName = scanner.next();
        Matcher matcher = pattern.matcher(firstName);
        boolean result = matcher.matches();
        if(result==false){
            throw new CustomException("Invalid first name");
        }else{
            System.out.println("First name is Vaild");
        }

    }

    public static void userLastNameException() throws CustomException {

        String lastNamePattern = "[A-Z]{1}[a-z]{2,}";
        Pattern pattern1 = Pattern.compile(lastNamePattern);
        System.out.println("Enter the lastname");
        String lastName = scanner.next();
        Matcher matcher1 = pattern1.matcher(lastName);
        boolean result1 = matcher1.matches();
        if(result1==false){
            throw new CustomException("Invalid last name");
        }else{
            System.out.println("last name is Vaild");
        }


    }

    public static void userEmailException() throws CustomException {
        String emailPattern = "^[0-9a-zA-Z]+([._+-][0-9a-zA-Z]+)*" + "@([0-9a-zA-Z][_]?)+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?$";
        Pattern pattern2 = Pattern.compile(emailPattern);
        System.out.println("Enter the Email");
        String email = scanner.next();
        Matcher matcher2 = pattern2.matcher(email);
        boolean result2 = matcher2.matches();
        if(result2==false){
            throw new CustomException("Invalid email");
        }else{
            System.out.println("Email is Vaild");
        }

    }

    public static void mobileNumberValidationException() throws CustomException {
        Scanner scanner = new Scanner(System.in);
        String MobileNumberPattern = "(91-)?[0-9]{10}";
        Pattern pattern3 = Pattern.compile(MobileNumberPattern);
        System.out.println("Enter the Phone Number");
        String phoneNumber = scanner.next();
        Matcher matcher3 = pattern3.matcher(phoneNumber);
        Boolean result3 = matcher3.matches();
        if(result3==false){
            throw new CustomException("Invalid Phone Number");
        }else{
            System.out.println("Phone Number is Vaild");
        }
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

    public static void passwordValidationException() throws CustomException {

        String PasswordPattern4 = "([0-9a-zA-Z]*[~!@#$]){1}[0-9a-zA-Z~!@#$]*";
        Pattern pattern7 = Pattern.compile(PasswordPattern4);
        System.out.println("Enter the Password");
        String password4 = scanner.next();
        Matcher matcher7 = pattern7.matcher(password4);
        boolean result7 = matcher7.matches();
        if(result7==false){
            throw new CustomException("Invalid Password follow the password rules");
        }else{
            System.out.println("Password is Vaild");
        }
    }

}