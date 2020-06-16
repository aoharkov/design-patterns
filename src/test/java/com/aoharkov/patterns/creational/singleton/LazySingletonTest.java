package com.aoharkov.patterns.creational.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LazySingletonTest {

    @Test
    void getInstanceShouldReturnTheSame() {
        LazySingleton expected = LazySingleton.getInstance();

        LazySingleton actual = LazySingleton.getInstance();

        assertEquals(expected, actual);
    }
}
