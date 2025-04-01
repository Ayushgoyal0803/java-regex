package com.bridgelabz.javaRegex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractLinks {
    public static void main(String[] args) {
        String s1 = "Visit https://www.google.com and http://example.org for more info.";
        String regex = "(https?://)?(?:www\\.)?[A-Za-z0-9-_]+\\.[a-z]{2,}";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(s1);

        while (matcher.find()){
            System.out.println("link found: " + matcher.group());
        }

    }
}
