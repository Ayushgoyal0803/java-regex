package com.bridgelabz.javaRegex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidUsername {
    public static void main(String[] args) {
        String regex = "^[A-Z][A-Za-z0-9_]{4,14}$";
        Pattern pattern = Pattern.compile(regex);

        Scanner scn = new Scanner(System.in);
        String s1 = scn.next();

        if(pattern.matcher(s1).matches()){
            System.out.println("User name is valid.");
        }else {
            System.out.println("Enter a valid user name.");
        }

        scn.close();
    }
}
