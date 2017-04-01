package ru.oav.contactbook;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by antonorlov on 01/04/2017.
 */
@Controller
public class TestController {

    @RequestMapping("/test")
    public String test(Model model){

        //1. добавить строку
        model.addAttribute("str", "10 дней");
        //2 Придумать и добавить объект 1-2поля в объекте

        RacoonTest racoonTest = new RacoonTest("Мафусаил", "Енотовидный");
        model.addAttribute("racoon", racoonTest);

        //3. Добавить массив/лист

        List<String> list = new ArrayList<>();
        list.add("шаверма");
        list.add("пирог");
        list.add("пита");

        model.addAttribute("food",list);

        return "testTemplate";

    }


    public static class RacoonTest {
        private String name;
        private String type;

        public RacoonTest(String name, String type) {
            this.name = name;
            this.type = type;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }
    }
}
