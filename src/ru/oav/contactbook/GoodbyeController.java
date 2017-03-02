package ru.oav.contactbook;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GoodbyeController {
    @RequestMapping("/goodbye/")
    public String index() {
        return "Пока мир";
    }

}
