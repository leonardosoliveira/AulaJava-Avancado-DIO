package com.company;

import java.util.function.UnaryOperator;

public class Main {

    public static void main(String[] args) {

        UnaryOperator<Integer> calculador = valor -> valor*3;//Conceito de programação funcional, por meio de declarações,

        System.out.println(calculador.apply(20));
    }
}
