package ru.job4j.accident.model;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Accident {
    private int id;
    private String name;
    private String text;
    private String address;
    private AccidentType type;

    /* get set equash hashCode */
}