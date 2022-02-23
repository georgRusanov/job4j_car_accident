package ru.job4j.accident.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.job4j.accident.model.Accident;
import ru.job4j.accident.repository.AccidentMem;

@Controller
public class IndexControl {
    private final AccidentMem accidentMem;

    public IndexControl(AccidentMem accidentMem) {
        this.accidentMem = accidentMem;
    }

    @GetMapping("/")
    public String index(Model model) {
        Accident accident1 = Accident.builder().id(1).name("first").build();
        Accident accident2 = Accident.builder().id(2).name("second").build();
        accidentMem.getAccidents().put(accident1.getId(), accident1);
        accidentMem.getAccidents().put(accident2.getId(), accident2);
        model.addAttribute("accidents", accidentMem.getAccidents());
        return "index";
    }
}