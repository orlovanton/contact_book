package ru.oav.contactbook;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        ContactBook contactBook = new ContactBook();

        List<Contact> contacts = contactBook.getContacts();

        String str = "<h1>Контакты</h1>";

        for (Contact contact : contacts) {
            str += contact.name + " <br/>";
        }

        return str;

    }

}
