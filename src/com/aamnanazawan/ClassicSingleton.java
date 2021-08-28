package com.aamnanazawan;

public class ClassicSingleton {

    private static ClassicSingleton instance = null;
    ClassicSingleton() {
        // Exists only to defeat instantiation.
    }

    public static ClassicSingleton getInstance() {
        if(instance == null) {
            instance = new ClassicSingleton();
        }
        return instance;
    }
}
