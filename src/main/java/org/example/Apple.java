package org.example;

public abstract class Apple extends Phone{

    private final String phoneModel;

    public Apple(String phoneModel) {
        super("Apple");
        this.phoneModel = phoneModel;
    }
}
