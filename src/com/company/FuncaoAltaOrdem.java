package com.company;

public class FuncaoAltaOrdem {

    //Funcao de alta ordem é uma funcao que retorna uma funcao ou recebe uma funcao como parametro
    public static void main(String[] args) {

        //Utilizando o paradigma FUNCIONAL
        Calculador somador = (a, b) -> a+b;
        Calculador subtracao = (a, b) -> a-b;
        Calculador divisao = (a, b) -> a/b;
        Calculador multiplicacao = (a, b) -> a*b;

        System.out.println(executaOperacao(somador,1,3));
        System.out.println(executaOperacao(subtracao,10,2));
        System.out.println(executaOperacao(divisao,20,4));
        System.out.println(executaOperacao(multiplicacao,3,3));
    }

    public static int executaOperacao(Calculador calculo, int a, int b){return calculo.calcular(a,b);}
}

//Implementando uma interface funcional ontem possui apenas um metodo abstrato
@FunctionalInterface
interface Calculador {
    public int calcular(int a, int b);
}