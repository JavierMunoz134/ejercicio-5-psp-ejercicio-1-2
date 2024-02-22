package com.example.practica5php.ejercicio1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Observable;
import java.util.Observer;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Downloader implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        if (arg instanceof String) {
            String url = (String) arg;
            CompletableFuture.runAsync(() -> downloadAndSave(url));
        }
    }

    private void downloadAndSave(String url) {
        try {
            URL website = new URL(url);
            String fileName = getFileName(url);
            Path filePath = Path.of(fileName);

            String content = new String(website.openStream().readAllBytes());

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath.toString()))) {
                writer.write(content);
            }

            System.out.println("Descarga y guardado completados para: " + url);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String getFileName(String url) {
        String[] parts = url.split("/");
        return parts[parts.length - 1];
    }
}
