package org.calculadora.controller;

public class Resta {

    public Integer resta(String operation) {
        String[] parts = operation.split("-");

        int valueOne = Integer.parseInt(parts[0].trim());
        int valueTwo = Integer.parseInt(parts[1].trim());

        return valueOne - valueTwo;
    }
}
