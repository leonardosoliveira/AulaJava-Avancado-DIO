package br.com.aulas.dio.httpclientapi;

import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class TesteHttpClient {

    public static void main(String[] args) throws IOException, InterruptedException {

        leituraHtmlSiteUri();

    }

    private static void leituraHtmlSiteUri() throws IOException, InterruptedException {

    HttpRequest request = HttpRequest.newBuilder()
            .GET().uri(URI.create("https://portal.anhembi.br/"))
            .build();

    HttpClient httpClient = HttpClient.newHttpClient();

    HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println("Status code: " + response.statusCode());
        System.out.println("Headers response: " + response.headers());
        System.out.println(response.body());
    }
}
