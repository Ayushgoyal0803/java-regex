package com.bridgelabz.javaRegex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmail {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        String s1 =  "A email address is ayus@gmail.com and also looks like ayus122@yahoo.in";

        String regex = "[A-Za-z0-9+_.-]+@[A-Za-z0-9-]+\\.[a-z]{2,}";
        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(s1);

        while (matcher.find()){
            System.out.println("Email found: " + matcher.group());
        }
    }
}

/*
    Email found: ayus@gmail.in
    Email found: ayus122@yahoo.in
*/