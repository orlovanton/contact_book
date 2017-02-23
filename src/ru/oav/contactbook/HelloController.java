package ru.oav.contactbook;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {

        return "<h1>Привет мир</h1>";
    }

}
