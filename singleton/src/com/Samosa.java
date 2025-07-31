package com;

public class Samosa {

    private static Samosa instance;

    private Samosa() {

    }

    public static Samosa getInstance() {
        // Lazy Loading
        if (instance == null) {
            instance = new Samosa();
        }
        return instance;
    }
}
