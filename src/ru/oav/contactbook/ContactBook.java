package ru.oav.contactbook;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by antonorlov on 18/11/16.
 */
public class ContactBook {

//    private Contact[] contacts = {
//            new Contact("Anton", "Orlov", "+79219518963"),
//            new Contact("Alex", "Grebenyuk", "+79219993322")
//    };

    private List<Contact> contacts = new ArrayList<Contact>();

    public ContactBook() {
        contacts.add(new Contact("Anton", "Orlov", "+79219518963"));
        contacts.add(new Contact("Alex", "Grebenyuk", "+79219993322"));
    }

//    public Contact[] getContacts() {
//        return contacts;
//    }

    public List<Contact> getContacts() {
        return contacts;
    }


    public void addContact(Contact contact) {
        contacts.add(contact);
//        System.out.println("Пока не умею");
    }
}
