package com.bridgelabz.javaRegex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractDates {
    public static void main(String[] args) {
        String s1 = "The events are scheduled for 12/05/2023, 15/08/2024, and 29/02/2020.";
        String regex = "[0-9]{2}/[0-9]{2}/[0-9]{4}";
        String regex1 = "(0[0-9]|[12][0-9]|3[01])/(0[1-9]|1[012])/(19|20)[0-9]{2}";
        Pattern pattern = Pattern.compile(regex1);

        Matcher matcher = pattern.matcher(s1);

        while (matcher.find()){
            System.out.println("Dates found: " + matcher.group());
        }
    }
}
