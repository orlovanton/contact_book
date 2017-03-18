package ru.oav.contactbook;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Random;

@Controller
public class HelloController {

    @RequestMapping("/")
    public String index(Model model) {

        Random r = new Random();
        int i = r.nextInt(10);

        model.addAttribute("number", i);

        return "index";

    }

}
