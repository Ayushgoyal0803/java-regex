package com.bridgelabz.javaRegex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidateCreditCard {
    public static void main(String[] args) {
        String regex1 = "^4[0-9]{15}$";
        String regex2 = "^5[0-9]{15}$";

        Scanner scn = new Scanner(System.in);
        String st = scn.next();

        Pattern pattern1 = Pattern.compile(regex1);
        Pattern pattern2 = Pattern.compile(regex2);

        if(pattern1.matcher(st).matches()){
            System.out.println("Visa Credit Card.");
        }else if(pattern2.matcher(st).matches()){
            System.out.println("MasterCard Credit Card.");
        }else{
            System.out.println("Not a valid credit card");
        }

    }


}
