package ru.oav.contactbook;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by antonorlov on 01/04/2017.
 */
@Controller
public class DeleteController {


    /**
     * Удаление контакта из тел-ой книги
     * @param index
     * @return
     */
    @RequestMapping("/delete/{index}")
    public String deleteContact(@PathVariable Integer index){
        ContactBook contactBook = new ContactBook();

        //удалить по Индексу
        contactBook.deleteContact(index-1);

        return "redirect:/";
    }
}
