package ru.oav.contactbook;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.List;

/**
 * Created by antonorlov on 03/02/2017.
 */
public class ContactBookService {

    private String fileName = "/Users/antonorlov/Documents/ann/contact_book/contacts.txt";

    public ContactBook getContactBook(){
        ContactBook contactBook = new ContactBook();
        try {
            List<String> strings = Files.readAllLines(Paths.get(fileName));
            for (String line : strings) {
                Contact c =  convertLine(line);
                contactBook.contacts.add(c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return contactBook;
    }


    /**
     * Добавить контакт
     *
     * @param contact контакт для добавления
     */
    public void addContact(Contact contact) {
        ContactBook contactBook  = getContactBook();
        contactBook.contacts.add(contact);
        try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(fileName))) {
            for (Contact c : contactBook.contacts) {
                writer.write(convertContact(c));
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    /**
     * Удалить контакт
     *
     * @param name номер
     */
    public void deleteContact(String name){

        ContactBook contactBook = getContactBook();

        Iterator<Contact> iterator = contactBook.contacts.iterator();

        while (iterator.hasNext()){
            Contact next = iterator.next();
            if(next.name.equals(name)){
                iterator.remove();
            }
        }

        try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(fileName))) {
            for (Contact c : contactBook.contacts) {
                writer.write(convertContact(c));
            }
        } catch (IOException ex) {
            ex.printStackTrace();
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


}
