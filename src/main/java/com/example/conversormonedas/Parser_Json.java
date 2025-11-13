package com.example.conversormonedas;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Parser_Json {
    private static final String API_KEY = "b46c215d46505973f777d208";
    private static final HttpClient CLIENTE = HttpClient.newHttpClient();

    public String solicitarConversion(String base, String destino, double monto)
            throws IOException, InterruptedException {

        String url = "https://v6.exchangerate-api.com/v6/" + API_KEY +
                "/pair/" + base + "/" + destino + "/" + monto;

        HttpRequest solicitud = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .GET()
                .build();

        HttpResponse<String> respuesta = CLIENTE.send(
                solicitud,
                HttpResponse.BodyHandlers.ofString()
        );

        return respuesta.body();
    }
}
