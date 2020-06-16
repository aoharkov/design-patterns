package com.aoharkov.patterns.creational.singleton;

public class LazySingleton {
    private static volatile LazySingleton singleton;

    public static LazySingleton getInstance() {
        if (singleton == null) {
            synchronized (LazySingleton.class) {
                if (singleton == null) {
                    singleton = new LazySingleton();
                }
            }
        }
        return singleton;
    }

    private LazySingleton() {
    }
}
