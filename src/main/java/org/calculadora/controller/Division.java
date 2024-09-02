package org.calculadora.controller;

public class Division {

    public Integer division(String operation) {

        String[] parts = operation.split("/");

        int numerator = Integer.parseInt(parts[0].trim());
        int denominator = Integer.parseInt(parts[1].trim());

        if (denominator == 0) {
            throw new ArithmeticException("Syntaxis Error");
        }
        return numerator / denominator;
    }
}
