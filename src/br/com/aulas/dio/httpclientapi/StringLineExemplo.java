package br.com.aulas.dio.httpclientapi;
import java.util.stream.Collectors;
public class StringLineExemplo {

    public static void main(String[] args) {
        String html = "<html>\n<head>\n</head>\n <body> \n <body> \n<html>";
        System.out.println(html.lines().map(s -> "[TAG] :: "+s).collect(Collectors.toList()));
    }

}
