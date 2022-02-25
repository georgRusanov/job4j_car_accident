package ru.job4j.accident.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import ru.job4j.accident.model.Accident;
import ru.job4j.accident.repository.AccidentMem;

@Service
public class AccidentService {
    private final AccidentMem accidentMem;

    public AccidentService(AccidentMem accidentMem) {
        this.accidentMem = accidentMem;
    }

    public List<Accident> getAccidents() {
        return new ArrayList<>(accidentMem.getAccidents());
    }

    public void create(Accident accident) {
        accidentMem.create(accident);
    }
}
