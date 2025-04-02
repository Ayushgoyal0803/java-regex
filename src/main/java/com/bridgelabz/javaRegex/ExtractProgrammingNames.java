package com.bridgelabz.javaRegex;

import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractProgrammingNames {
    public static void main(String[] args) {
        String st ="I love Java, Python, and JavaScript, java,but I haven't tried Go yet.";
        String regex = "\\b(Java|Python|JavaScript|Go|C|C++|Rust|MySQL|Kotlin|Swift)\\b";

        Pattern pattern = Pattern.compile(regex,Pattern.CASE_INSENSITIVE);

        Matcher matcher = pattern.matcher(st);

        while (matcher.find()){
            System.out.print(matcher.group() + ", ");
        }



    }
}
