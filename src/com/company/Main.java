package com.company;

import java.util.function.UnaryOperator;

public class Main {

    public static void main(String[] args) {

        //Conceito de programação funcional, por meio de declarações,
        UnaryOperator<Integer> calculador = valor -> valor*3;

        System.out.println(calculador.apply(20));
    }
}
