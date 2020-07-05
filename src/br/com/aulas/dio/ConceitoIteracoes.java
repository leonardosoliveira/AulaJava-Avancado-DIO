package br.com.aulas.dio;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ConceitoIteracoes {

    public static void main(String[] args) {

        String[] nomes = {"Leonardo", "Silva", "de", "Oliveira"};
        imprimiTodosNomes(nomes);


        Integer[] numeros = {1, 2, 3, 4, 5};
        imprimeNumerosDobrados(numeros);

        List<String> profissoes = new ArrayList<>();
        profissoes.add("Dev");
        profissoes.add("Pintor");
        profissoes.add("Gerente de negocios");
        profissoes.add("Gerente de TI");

        profissoes.stream()
                .filter(profissao -> profissao.startsWith("Gerente"))
                .forEach(System.out::println);




    }


    public static void imprimiTodosNomes(String... nomes){
        for (String nome: nomes
             ) {
            System.out.println(nome);
        }

        Stream.of(nomes)
                .forEach(System.out::println);
    }

    public static void imprimeNumerosDobrados(Integer... numeros){
        for (Integer numero: numeros
             ) {
            System.out.println(numero*2);
        }

        Stream.of(numeros)
                .map(numero -> numero*2)
                .forEach(System.out::println);
    }
}
