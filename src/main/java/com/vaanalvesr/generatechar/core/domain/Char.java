package com.vaanalvesr.generatechar.core.domain;

import lombok.Data;

import java.util.List;

@Data
public class Char {

    private CharClass charClass;
    private Race race;
    private List<Weapon> weapons;
    private List<Spell> spells;
}
