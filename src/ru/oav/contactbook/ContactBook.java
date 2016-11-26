package ru.oav.contactbook;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by antonorlov on 26/11/2016.
 */
public class ContactBook {

    private List contacts = new ArrayList();

    public ContactBook() {
        contacts.add(new Contact(
                "Иван",
                "Швайков",
                "+79210001122"
        ));
        contacts.add(new Contact(
                "Егор",
                "Токмаков",
                "+79210007122"
        ));
    }

    public List getContacts() {
        return contacts;
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
    }
}
