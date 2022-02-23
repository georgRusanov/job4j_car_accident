package ru.job4j.accident.control;

import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexControl {
    @GetMapping("/")
    public String index(Model model) {
        List<String> users = List.of("Petr Arsentev");
        model.addAttribute("users", users);
        return "index";
    }
}