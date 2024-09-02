package org.calculadora.controller;

import org.calculadora.interfaz.Calculator;

public class OperationType implements Calculator{

    Division division = new Division();
    Multiplication multiplication= new Multiplication();
    Resta resta = new Resta();
    Sum sum = new Sum();

    Integer result;

    @Override
    public void operarAritmetica(String operacion){
        //Return Operation Type

        try{
            char operador = operacion.replaceAll("[^+\\-*/]", "").charAt(0);

            System.out.println(operacion);

            result = (operador == '/') ? division.division(operacion) :
                        (operador == '*') ? multiplication.multiplication(operacion) :
                                (operador == '-') ? resta.resta(operacion) :
                                        (operador == '+') ? sum.suma(operacion) :0; //<--Si se le manda otro caracter que no sea un operador da error en las pruebas unitarias

            System.out.println("El resultado de: "+operacion+ "=" + result);

        }catch (Exception e){
            e.printStackTrace();
        }
    }

}