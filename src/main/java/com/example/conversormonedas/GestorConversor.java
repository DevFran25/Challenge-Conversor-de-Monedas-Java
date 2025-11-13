package com.example.conversormonedas;

import java.io.IOException;
import java.util.Scanner;


public class GestorConversor {

    public static void iniciar() throws IOException, InterruptedException {
        Scanner entrada = new Scanner(System.in);
        Service servicio = new Service();
        Parser_Json lector = new Parser_Json();

        boolean continuar = true;

        while (continuar) {
            System.out.println("\n=== Sistema de Conversión de Monedas ===");
            System.out.println("1) Dólares (USD) → Soles (PEN)");
            System.out.println("2) Soles (PEN) → Dólares (USD)");
            System.out.println("3) Dólares (USD) → Pesos Argentinos (ARS)");
            System.out.println("4) Pesos Argentinos (ARS) → Dólares (USD)");
            System.out.println("5) Dólares (USD) → Pesos Chilenos (CLP)");
            System.out.println("6) Salir");
            System.out.print("Elige una opción: ");

            String opcionTexto = entrada.nextLine();

            if (!opcionTexto.matches("\\d+")) {
                System.out.println("Por favor, introduce solo números.");
                continue;
            }

            int opcion = Integer.parseInt(opcionTexto);
            if (opcion == 6) {
                System.out.println("Hasta pronto ");
                continuar = false;
                continue;
            }

            System.out.print("Monto a convertir: ");
            String montoTexto = entrada.nextLine();

            if (!montoTexto.matches("\\d+(\\.\\d+)?")) {
                System.out.println("Monto inválido. Intenta otra vez.");
                continue;
            }

            double monto = Double.parseDouble(montoTexto);
            String monedaOrigen = "";
            String monedaDestino = "";

            switch (opcion) {
                case 1 -> { monedaOrigen = "USD"; monedaDestino = "PEN"; }
                case 2 -> { monedaOrigen = "PEN"; monedaDestino = "USD"; }
                case 3 -> { monedaOrigen = "USD"; monedaDestino = "ARS"; }
                case 4 -> { monedaOrigen = "ARS"; monedaDestino = "USD"; }
                case 5 -> { monedaOrigen = "USD"; monedaDestino = "CLP"; }
                default -> {
                    System.out.println(" Opción no reconocida.");
                    continue;
                }
            }

            String respuestaApi = servicio.obtenerConversion(monedaOrigen, monedaDestino, monto);
            double totalConvertido = lector.extraerMonto(respuestaApi);

            System.out.printf("\n %.2f %s equivale a %.2f %s\n",
                    monto, monedaOrigen, totalConvertido, monedaDestino);
        }
    }
}
