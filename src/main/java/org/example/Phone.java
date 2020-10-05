package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class Phone {

    private final String manufacturer;
    private Integer batteryLife;

    // this ArrayList contains the contact list of a phone
    public List<Contact> contacts = new ArrayList<Contact>();
    //this List contains the call history
    public List<String> callHistory = new ArrayList<String>();
    // this Map will store the message history for a phone number;
    public Map<String, ArrayList<String>> messages = new HashMap<String, ArrayList<String>>();

    public Phone(String manufacturer, Integer batteryLife) {
        this.manufacturer = manufacturer;
        this.batteryLife = batteryLife;
    }
    public void addContact(String index, String phoneNumber, String firstName, String lastName){

        contacts.add((Integer.parseInt(index)-1), new Contact(phoneNumber, firstName, lastName));

    }

    public void listContacts() {
        if (contacts.isEmpty()) {
            System.out.println("There phone book is empty in this phone");
        }
        else {

            for (Contact contact: contacts) {
                System.out.println( (contacts.indexOf(contact) + 1) + ". " + contact.getPhoneNumber() +
                        " " + contact.getLastName() + " " + contact.getFirstName());
            }
        }
    }

    public void sendMessage(String phoneNumber, String message) {

        if ( message.length() <= 500 && getBatteryLife() >= 1 ) {

            ArrayList<String> messagesList = messages.get(phoneNumber);

            if ( messagesList == null ) {
                messagesList = new ArrayList<String>();
            }
            messagesList.add(message);
            messages.put(phoneNumber, messagesList);
            decreaseBatteryLife(1);
        }
        else {
            System.out.println("Cannot send. Message too long or not enough battery.");
        }
    }

    public void listMessages(String contact){
        Integer cnt = 1;
        System.out.println("Messages of " + contact);
        for (String message: messages.get(contact) ) {
            System.out.println("\tMessage #" + cnt + ": " + message);
            cnt += 1;
        }
    }

    public void call(String phoneNumber) {
        if (getBatteryLife() >= 2) {
            callHistory.add(phoneNumber);
            decreaseBatteryLife(2);
        }
        else {
            System.out.println("Not enough battery to make a call.");
        }
    }

    public void viewHistory() {
        Integer cnt = 1;
        System.out.println("Call History: ");
        for (String call: callHistory) {
            System.out.println("call #" + cnt + ": " + call);
            cnt++;
        }
    }

    public Integer getBatteryLife() {
        return batteryLife;
    }

    public void decreaseBatteryLife(Integer hours) {
        this.batteryLife = this.batteryLife - hours;
    }
}
