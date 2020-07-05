package br.com.aulas.dio;

import java.util.function.Supplier;

public class ConceitoSuppliers {

    public static void main(String[] args) {
        //geralmente utilizado que trabalha com uma classe que lida com lista, arrays conjuntos

        //outra maneira de se fazer
        //Supplier<Pessoa> supridor = Pessoa::new;
        Supplier<Pessoa> suppliers = () -> new Pessoa();
        System.out.println(suppliers.get());

    }

    static class Pessoa{
        private String nome;
        private Integer idade;

        public Pessoa() {
            nome = "Leonardo";
            idade = 24;
        }

        @Override
        public String toString() {
            return String.format("nome : %s, idade: %d", nome,idade);
        }
    }
}
