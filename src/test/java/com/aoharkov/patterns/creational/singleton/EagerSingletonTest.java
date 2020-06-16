package com.aoharkov.patterns.creational.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EagerSingletonTest {

    @Test
    void getInstanceShouldReturnTheSame() {
        EagerSingleton expected = EagerSingleton.getInstance();

        EagerSingleton actual = EagerSingleton.getInstance();

        assertEquals(expected, actual);
    }
}
