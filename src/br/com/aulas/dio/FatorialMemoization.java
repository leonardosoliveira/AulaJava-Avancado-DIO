package br.com.aulas.dio;

import java.util.HashMap;
import java.util.Map;

public class FatorialMemoization {

    //conceito memoization consite em uma tecnica de otimização em cache do resultado de função, ou seja,
    // ele quarda o resultado de uma execução e em uma execução futura consegue ter uma resposta mais rapida

    static Map<Integer,Integer> MAPA_FATORIAL = new HashMap<>();

    public static void main(String[] args) {
        long I = System.nanoTime();
        System.out.println(fatorialComMemoization(15));
        long F = System.nanoTime();
        System.out.println("Fatorial 1 " + (F-I));

        I = System.nanoTime();
        System.out.println(fatorialComMemoization(15));
        F = System.nanoTime();
        System.out.println("Fatorial 2 " + (F-I));
    }




    public static Integer fatorialComMemoization(Integer value){
        if(value == 1){
            return value;
        } else{
            if(MAPA_FATORIAL.containsKey(value)){
                return MAPA_FATORIAL.get(value);
            }else {
                Integer resultado = value * fatorialComMemoization(value-1);
                MAPA_FATORIAL.put(value,resultado);
                return resultado;
            }
        }
    }
}
