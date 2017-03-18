package ru.oav.contactbook;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by antonorlov on 26/11/2016.
 */
public class ContactBook {

    private List<Contact> contacts = new ArrayList();


    private String fileName = "/Users/antonorlov/Documents/ann/contact_book/contacts.txt";

    public ContactBook() {
        try {
            List<String> strings = Files.readAllLines(Paths.get(fileName));
            for (String line : strings) {
               Contact c =  convertLine(line);
               contacts.add(c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private Contact convertLine(String line) {
        String[] split = line.split(",");
        Contact c = new Contact(split[0], split[1], split[2]);
        return c;
    }

    private String convertContact(Contact contact){
        return contact.name + "," + contact.lastName +"," + contact.number +"\n";
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
        try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(fileName))) {
            for (Contact c : contacts) {
                writer.write(convertContact(c));
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    /**
     * Удаление контакта
     * @param index - индекс контакта в коллекции. Начинается с 0
     */
    public void deleteContact(int index){
        contacts.remove(index);
        try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(fileName))) {
            for (Contact c : contacts) {
                writer.write(convertContact(c));
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
