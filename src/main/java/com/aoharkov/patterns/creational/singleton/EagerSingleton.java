package com.aoharkov.patterns.creational.singleton;

public class EagerSingleton {
    private static final EagerSingleton singleton = new EagerSingleton();

    public static EagerSingleton getInstance() {
        return singleton;
    }

    private EagerSingleton() {
    }
}
