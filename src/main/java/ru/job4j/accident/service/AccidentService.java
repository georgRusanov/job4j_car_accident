package ru.job4j.accident.service;

import java.util.List;
import org.springframework.stereotype.Service;
import ru.job4j.accident.model.Accident;
import ru.job4j.accident.model.AccidentType;
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

    public void create(Accident accident) {
        accidentMem.create(accident);
    }

    public Accident findById(int id) {
       return accidentMem.findById(id);
    }
}
