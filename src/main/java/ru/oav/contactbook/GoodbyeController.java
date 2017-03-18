package ru.oav.contactbook;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class GoodbyeController {

    @RequestMapping("/goodbye/")
    public String index(Model model) {

        ContactBook book = new ContactBook();
        List<Contact> contacts = book.getContacts();

        model.addAttribute("contacts", contacts);

        return "list";
    }

}
