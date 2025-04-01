package com.bridgelabz.javaRegex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractCapitalWords {
    public static void main(String[] args) {
        String s1 = "The Eiffel Tower is in Paris and the Statue of Liberty is in New York.";

        String regex = "\\b[A-Z][a-zA-Z]*\\b";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(s1);

        while (matcher.find()){
            System.out.print( matcher.group() + ", ");
        }

    }
}
