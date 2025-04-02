package com.bridgelabz.javaJUnit;

import junit.framework.TestCase;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertThrows;
//import org.junit.jupiter.api.Test;

public class CalculatorTest extends TestCase {

    private Calculator cal;
    @BeforeEach
    void setup(){
        cal = new Calculator();
    }

    @Test
    void AddTwoNumbers(){
        assertEquals(12,cal.add(6,6));
    }

    @Test
    void subtractTwoNumbers(){
        assertEquals(5,cal.subtract(10,5));
    }

    @Test
    void multiplyTwoNumbers(){
        assertEquals(25,cal.multiply(5,5));
    }

    @Test
    void divideTwoNumbers(){
        assertEquals(2,cal.divide(12,6));
    }

    @Test
    void divideByZero(){
        assertThrows(ArithmeticException.class,
                () -> {
                    cal.divide(12,0);
                }
        );
    }
}