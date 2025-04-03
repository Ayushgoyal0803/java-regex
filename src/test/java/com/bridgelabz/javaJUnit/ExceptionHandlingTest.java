package com.bridgelabz.javaJUnit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionHandlingTest {
    ExceptionHandling obj = new ExceptionHandling();

    @Test
    void shouldThrowExceptionIfDenominatorIsZero(){
        Assertions.assertThrows(ArithmeticException.class ,
                () -> {
                    obj.divideNumbers(5,0);
                });
    }

    @Test
    void shouldReturnDivisor(){
        Assertions.assertEquals(5,obj.divideNumbers(10,2));
    }
}
