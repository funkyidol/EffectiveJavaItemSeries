package com.practice.effectivejava.item3;

public class TraditionalSingleton {
    private static final TraditionalSingleton INSTANCE = new TraditionalSingleton();

    public static TraditionalSingleton getInstance() {
        return INSTANCE;
    }

    private TraditionalSingleton() {
    }

    public void taskMethod() {
        System.out.println("This is the traditional Singelton");
    }
}
