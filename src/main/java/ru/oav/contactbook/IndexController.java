package ru.oav.contactbook;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Random;

/**
 * Created by antonorlov on 24/03/2017.
 */
@Controller
public class IndexController {

    @RequestMapping("/")
    public String index(Model model) {


        Random random = new Random();
        int number = random.nextInt(10);

        model.addAttribute("number", number);

        return "index";
    }
}
