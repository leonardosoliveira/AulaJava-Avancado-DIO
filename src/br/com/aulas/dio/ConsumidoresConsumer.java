package br.com.aulas.dio;

import java.util.function.Consumer;

public class ConsumidoresConsumer {

    public static void main(String[] args) {
        //Consumer é uma interface funcional que recebe um parametro e não retorna nada

        Consumer<String> imprimirFrase = System.out::println;

        // Consumer<String> imprimeFrase = frase -> System.out.println(frase);
        imprimirFrase.accept("Hello World");

    }
}
