package org.example.calculator;

import java.math.BigDecimal;

public class Calculator {

    // 정수형

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        return a / b;
    }

    // 실수형

    public double add(double a, double b){
        final BigDecimal bdA = new BigDecimal(String.valueOf(a));
        final BigDecimal bdB = new BigDecimal(String.valueOf(b));

        return bdA.add(bdB).doubleValue();
    }

    public double subtract(double a, double b){
        final BigDecimal bdA = new BigDecimal(String.valueOf(a));
        final BigDecimal bdB = new BigDecimal(String.valueOf(b));

        return bdA.subtract(bdB).doubleValue();
    }

    public double multiply(double a, double b){
        final BigDecimal bdA = new BigDecimal(String.valueOf(a));
        final BigDecimal bdB = new BigDecimal(String.valueOf(b));

        return bdA.multiply(bdB).doubleValue();
    }

    public double divide(double a, double b){
        final BigDecimal bdA = new BigDecimal(String.valueOf(a));
        final BigDecimal bdB = new BigDecimal(String.valueOf(b));

        return bdA.divide(bdB).doubleValue();
    }

}
