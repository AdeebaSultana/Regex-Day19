package com.rl.problems;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistrationProblem {
    Scanner sc = new Scanner(System.in);

    public void checkFirstName() {
        System.out.println("Enter first name start with Capital letter :");
        String firstName = sc.nextLine();
        if( Pattern.matches("^[A-Z][a-z]{2,}",firstName) ){
            System.out.println("first name is regestried sucessfully");
        }
        else {
            System.out.println("first name pattern is not matched");
        }
    }

    public void checkLastName() {
        System.out.println("Enter Last name start with Capital letter : ");
        String lastName = sc.nextLine();
        if(Pattern.matches("^[A-Z][a-z]{2,}",lastName)) {
            System.out.println("Last name is regestried sucessfully");
        }
        else {
            System.out.println("Last name pattern is not matched");
        }
    }
    public void checkEmail() {
        System.out.println("Enter Email : ");
        String email = sc.nextLine();
        if(Pattern.matches("^[A-Za-z0-9+_.-]+@(.+)$", email)){
            System.out.println("Email is regestried sucessfully");
        }
        else {
            System.out.println("Email pattern is not matched");
        }
    }

    public void checkPhoneNo() {
        System.out.println("Enter Phone No : ");
        String phoneNo = sc.nextLine();
        if( Pattern.matches("^(91)?\\s{0,2}[0-9]{10}$",phoneNo)){
            System.out.println("Phone Number is regestried sucessfully");
        }
        else {
            System.out.println("Phone Number pattern is not matched");
        }
    }

    public void checkPassword() {
        System.out.println("Enter Password : ");
        String password = sc.nextLine();
        if(Pattern.matches("((?=.*\\d)(?=.*[A-Z])(?=.*\\W).{8,})",password)){
            System.out.println("password is regestried sucessfully");
        }
        else {
            System.out.println("password pattern is not matched");
        }
    }

    public static void main(String[] args) {
        UserRegistrationProblem urp = new UserRegistrationProblem();
        urp.checkFirstName();
        urp.checkLastName();
        urp.checkEmail();
        urp.checkPhoneNo();
        urp.checkEmail();

    }

}