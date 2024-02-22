package com.example.practica5php.ejercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class URLSubject extends Observable {
    private List<String> urlList = new ArrayList<>();

    public void addURL(String url) {
        urlList.add(url);
        setChanged();
        notifyObservers(url);
    }

    public List<String> getURLList() {
        return urlList;
    }
}
