package com.bridgelabz.javaJUnit;

public class ExceptionHandling {
    int divideNumbers(int a, int b) throws ArithmeticException {
        if(b==0){
            throw new ArithmeticException();
        }
        return a / b;
    }
}
