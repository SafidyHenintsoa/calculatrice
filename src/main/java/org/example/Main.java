package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
    }
    public static double addition(double a, double b) {
        return a + b;
    }
    public static double subtraction(double a, double b) {
        return a - b;
    }
    public static double multiplication(double a, double b) {
        return a * b;
    }
    public static double division(double a, double b) {
        if (b == 0) {
            double positiveInfinity = Double.POSITIVE_INFINITY;
            return positiveInfinity;
        }else {
            return a / b;
        }
    }
}