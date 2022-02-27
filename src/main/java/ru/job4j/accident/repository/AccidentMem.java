package ru.job4j.accident.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.springframework.stereotype.Repository;
import ru.job4j.accident.model.Accident;
import ru.job4j.accident.model.AccidentType;

@Repository
public class AccidentMem {
    private final HashMap<Integer, Accident> accidents = new HashMap<>();
    private final HashMap<Integer, AccidentType> accidentTypes = new HashMap<>();
    private final AtomicInteger key = new AtomicInteger(0);

    public AccidentMem() {
        Accident accident1 = Accident.builder().id(key.getAndIncrement()).name("first").build();
        Accident accident2 = Accident.builder().id(key.getAndIncrement()).name("second").build();
        accidents.put(accident1.getId(), accident1);
        accidents.put(accident2.getId(), accident2);

        accidentTypes.put(1, AccidentType.of(1,"Две машины"));
        accidentTypes.put(2, AccidentType.of(2, "Машина и человек"));
        accidentTypes.put(3, AccidentType.of(3, "Машина и велосипед"));
    }

    public List<Accident> getAccidents() {
        return new ArrayList<>(accidents.values());
    }

    public List<AccidentType> getAccidentTypes() {
        return new ArrayList<>(accidentTypes.values());
    }

    public void create(Accident accident) {
        accidents.put(key.getAndIncrement(), accident);
    }

    public Accident findById(int id) {
        return accidents.get(id);
    }
}
