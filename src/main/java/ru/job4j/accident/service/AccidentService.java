package ru.job4j.accident.service;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import org.springframework.stereotype.Service;
import ru.job4j.accident.model.Accident;
import ru.job4j.accident.model.AccidentType;
import ru.job4j.accident.model.Rule;
import ru.job4j.accident.repository.AccidentMem;

@Service
public class AccidentService {
    private final AccidentMem accidentMem;

    public AccidentService(AccidentMem accidentMem) {
        this.accidentMem = accidentMem;
    }

    public List<Accident> getAccidents() {
        return accidentMem.getAccidents();
    }

    public List<AccidentType> getAccidentTypes() {
        return accidentMem.getAccidentTypes();
    }

    public List<Rule> getRules() {
        return accidentMem.getRules();
    }

    public void create(Accident accident, String[] ids) {
        accident.setRules(new HashSet<>());
        if (ids != null) {
            Arrays.stream(ids).forEach(id -> accident.getRules().add(accidentMem.getRuleById(Integer.parseInt(id))));
        }
        accidentMem.create(accident);
    }

    public Accident findById(int id) {
       return accidentMem.findById(id);
    }
}
