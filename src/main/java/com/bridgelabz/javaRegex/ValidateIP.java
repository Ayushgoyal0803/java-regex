package com.bridgelabz.javaRegex;

import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateIP {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        String s1 = scn.next();

        String regex = "^((25[0-5]|(2[0-4]|1[0-9]|[1-9]|)[0-9])(\\.(?!$)|$)){4}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(s1);

        if(matcher.matches()){
            System.out.println("Valid IP");
        }else{
            System.out.println("Not a valid IP");
        }
    }
}
