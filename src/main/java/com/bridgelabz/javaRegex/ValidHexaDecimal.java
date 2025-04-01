package com.bridgelabz.javaRegex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidHexaDecimal {
    public static void main(String[] args) {
        String regex = "^[#][A-Fa-f0-9]{6}$";

        Scanner scn = new Scanner(System.in);

        System.out.print("Enter a hexadecimal code: ");
        String s1 = scn.next();

        Pattern pattern = Pattern.compile(regex);

        if(pattern.matcher(s1).matches()){
            System.out.println("Valid hexadecimal number");
        }
        else{
            System.out.println("Not a valid hexadecimal number");
        }
    }
}
