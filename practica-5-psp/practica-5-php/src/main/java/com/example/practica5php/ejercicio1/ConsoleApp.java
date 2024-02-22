package com.example.practica5php.ejercicio1;

import java.util.Scanner;

public class ConsoleApp {
    public static void main(String[] args) {
        URLSubject urlSubject = new URLSubject();
        Downloader downloader = new Downloader();
        urlSubject.addObserver(downloader);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Introduce una URL (o escribe 'exit' para salir): ");
            String input = scanner.nextLine();

            if ("exit".equalsIgnoreCase(input)) {
                break;
            }

            urlSubject.addURL(input);
        }

        System.out.println("Saliendo de la aplicación.");
        scanner.close();
    }
}

