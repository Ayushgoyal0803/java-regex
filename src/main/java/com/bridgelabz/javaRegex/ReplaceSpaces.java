package com.bridgelabz.javaRegex;

//import java.util.regex.Matcher;
//import java.util.regex.Pattern;

public class ReplaceSpaces {
    public static void main(String[] args) {
        String regex = "\\s+";
        String s1 = "This   is an example     with   multiple  spaces.";

        System.out.println(s1);
        System.out.println(s1.replaceAll(regex," "));

    }
}
