package com.company;

import java.util.function.Function;

public class ConceitoFunction {

    public static void main(String[] args) {
        Function<String, Integer> stringParaInteiro = texto -> Integer.valueOf(texto) * 2;
        System.out.println(stringParaInteiro.apply("20"));

        Function<String, String> nomeInvertido = texto -> new StringBuilder(texto).reverse().toString();
        System.out.println(nomeInvertido.apply("Leonardo"));


    }

}
