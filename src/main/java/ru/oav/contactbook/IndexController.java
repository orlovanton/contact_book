package ru.oav.contactbook;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by antonorlov on 24/03/2017.
 */
@Controller
public class IndexController {

    @RequestMapping("/")
    public String index(Model model) {

        ContactBook contactBook = new ContactBook();
        List<Contact> contacts = contactBook.getContacts();
        model.addAttribute("contacts",contacts);

        return "index";
    }
}
