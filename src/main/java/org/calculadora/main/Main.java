package org.calculadora.main;

import org.calculadora.controller.*;
import org.calculadora.interfaz.Calculator;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new OperationType();

        calculator.operarAritmetica("10*5");

    }
}