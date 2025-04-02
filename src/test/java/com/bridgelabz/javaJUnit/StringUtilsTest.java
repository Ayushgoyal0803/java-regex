package com.bridgelabz.javaJUnit;

import junit.framework.TestCase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StringUtilsTest extends TestCase {
    private StringUtils util;

    @BeforeEach
    void setup(){
        util = new StringUtils();
    }
    @Test
    void reverseOfString(){
        assertEquals("Ayush",util.reverse("hsuyA"));
    }

    @Test
    void palidromeOfString(){
        assertTrue(util.isPalindrome("madam"));
    }

    @Test
    void convertToUpperCase(){
        assertEquals("AYUSH",util.toUpperCase("ayush"));
    }

}