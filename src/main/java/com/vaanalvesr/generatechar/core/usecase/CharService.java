package com.vaanalvesr.generatechar.core.usecase;


import com.vaanalvesr.generatechar.core.domain.*;

public interface CharService {
    Char generate();
    Race getRace();
    Spell getSpell();
    Weapon getWeapon();
    CharClass getCharClass();
}
