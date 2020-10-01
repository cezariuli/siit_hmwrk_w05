package org.example;

import java.util.ArrayList;
import java.util.List;

public class Phone {

    private final String manufacturer;
    private final Integer batteryLife;

    public List<Contact> contacts = new ArrayList<Contact>();

    public Phone(String manufacturer, Integer batteryLife) {
        this.manufacturer = manufacturer;
        this.batteryLife = batteryLife;
    }
    public void addContact(Integer index, String phoneNumber, String firstName, String lastName){
        
        contacts.add((index -1), new Contact(phoneNumber, firstName, lastName));

    }
    public void listContacts();
    public void sendMessage();
    public void listMessages(String contact);
    public void call(String number);
    public void viewHistory();
}
