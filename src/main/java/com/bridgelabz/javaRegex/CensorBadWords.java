package com.bridgelabz.javaRegex;

import java.util.LinkedList;
import java.util.List;

public class CensorBadWords {
    public static void main(String[] args) {
        String s1 = "This is a Damn bad example with some stupid words.";

        List<String> badWords = new LinkedList<>();
        badWords.add("damn");
        badWords.add("stupid");

        System.out.println(s1);

        for(String bad:badWords ){
            s1 = s1.replaceAll("(?i)"+ bad ,"****");
        }

        System.out.println(s1);

    }
}
