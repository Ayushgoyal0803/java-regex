package com.bridgelabz.javaRegex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidLicensePlate {
    public static void main(String[] args) {
        String regex = "^[A-Z]{2}[0-9]{4}$";
        Pattern pattern = Pattern.compile(regex);

        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a license plate number: ");
        String s1 = scn.next();

        if(pattern.matcher(s1).matches()){
            System.out.println("Valid License Plate Number.");
        }else{
            System.out.println("Not a valid License Plate Number.");
        }
    }
}
