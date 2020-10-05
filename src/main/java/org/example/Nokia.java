package org.example;

public abstract class Nokia extends Phone{

    private final String phoneModel;

    public Nokia(String phoneModel, Integer batteryLife) {
        super("Nokia", batteryLife);
        this.phoneModel = phoneModel;
    }

    //better to move it in Phone class

}
