package com.bridgelabz.javaRegex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateSSN {
    public static void main(String[] args) {
        String st = "My SSN is 123-45-6789 not 123456789.";
        String regex = "[0-9]{3}-[0-9]{2}-[0-9]{4}";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(st);

        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
