package br.com.aulas.dio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.stream.Collectors;

public class ExemploInferenciaReleaseJava {

    public static void main(String[] args) throws IOException {

        juntaNomes("Leonardo", "Oliveira");

    }

    public static void pegaUrlSite() throws IOException{
        var url = new URL("https://portal.anhembi.br/");
        var urlConnection = url.openConnection();
        var bufferedReader = new BufferedReader(new InputStreamReader((urlConnection.getInputStream())));
        System.out.println(bufferedReader.lines().collect(Collectors.joining()).replaceAll(">",">\n"));
    }

    public static void juntaNomes(String nome, String sobrenome){
        var nomeCompleto = String.format("%s %s",nome,sobrenome);
        System.out.println(nomeCompleto);
    }






}
