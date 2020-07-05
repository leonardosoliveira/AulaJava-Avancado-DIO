package br.com.aulas.dio;

import java.util.function.Predicate;

public class ConceitoPredicate {

    public static void main(String[] args) {
        //Predicate recebe uma parametro qualquer e retorna um boolean

        //Predicate<String> estaVazio = String::isEmpty; Outra forma de se fazer

        Predicate<String> estaVazio = texto -> texto.isEmpty();
        System.out.println(estaVazio.test(""));
        System.out.println(estaVazio.test("Leo"));
    }
}
