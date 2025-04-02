package com.bridgelabz.javaJUnit;

public class StringUtils {

    String reverse(String s){
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }

    Boolean isPalindrome(String s){
        return reverse(s).equals(s);
    }

    String toUpperCase(String s){
        return s.toUpperCase();
    }
}
