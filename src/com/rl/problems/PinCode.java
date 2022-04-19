package com.rl.problems;
import java.util.regex.*;
public class PinCode {
    //static Pattern p = Pattern.compile("\d");//. represents single character

    public static void main(String []args) {

        System.out.println("The result is :" + Pattern.matches("[0-9]{6}","400086"));

        System.out.println("The result is :" + Pattern.matches("^[0-9]{6}","A400088"));

        System.out.println("The result is :" + Pattern.matches("^[0-9]{6}$","A400088"));

        System.out.println("The result is :" + Pattern.matches("[0-9]{3}?(\\s)[0-9]{3}$","400 088"));

    }
}