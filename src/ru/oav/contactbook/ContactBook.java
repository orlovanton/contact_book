package ru.oav.contactbook;

/**
 * Created by antonorlov on 18/11/16.
 */
public class ContactBook {

    public static Contact[] getContacts() {
        Contact anton = new Contact();
        anton.name = "Anton";
        anton.lastName = "Orlov";
        anton.number = "+79219518963";

        Contact alex = new Contact();
        alex.name = "Alex";
        alex.lastName = "Grebenyuk";
        alex.number = "79219993322";

        return new Contact[]{anton, alex};


    }
}
