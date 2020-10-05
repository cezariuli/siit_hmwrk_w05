package org.example;

public abstract class Apple extends Phone{

    private final String phoneModel;

    public Apple(String phoneModel, Integer batteryLife) {
        super("Apple", batteryLife);
        this.phoneModel = phoneModel;
    }
}
