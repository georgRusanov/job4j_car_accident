package ru.job4j.accident.repository;

import java.util.HashMap;
import lombok.Getter;
import org.springframework.stereotype.Repository;
import ru.job4j.accident.model.Accident;

@Getter
@Repository
public class AccidentMem {
    private final HashMap<Integer, Accident> accidents = new HashMap<>();
}
