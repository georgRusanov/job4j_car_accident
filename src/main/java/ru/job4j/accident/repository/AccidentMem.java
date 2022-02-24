package ru.job4j.accident.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.springframework.stereotype.Repository;
import ru.job4j.accident.model.Accident;

@Repository
public class AccidentMem {
    private final HashMap<Integer, Accident> accidents = new HashMap<>();

    public AccidentMem() {
        Accident accident1 = Accident.builder().id(1).name("first").build();
        Accident accident2 = Accident.builder().id(2).name("second").build();
        accidents.put(accident1.getId(), accident1);
        accidents.put(accident2.getId(), accident2);
    }

    public List<Accident> getAccidents() {
        return new ArrayList<>(accidents.values());
    }
}
