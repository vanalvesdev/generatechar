package com.vaanalvesr.generatechar.core.usecase.impl;

import com.vaanalvesr.generatechar.core.domain.*;
import com.vaanalvesr.generatechar.core.usecase.CharService;
import com.vaanalvesr.generatechar.data.Open5eRepository;
import com.vaanalvesr.generatechar.data.dto.Pageable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class CharServiceImpl  implements CharService {

    @Autowired
    private Open5eRepository repository;

    private int maxPerPage = 50;

    @Override
    public Char generate() {
        Char character = new Char();
        int numeroWeapons = getRandomNumberInts(1, 3);
        int numeroSpells = getRandomNumberInts(1, 3);

        character.setCharClass(getCharClass());
        character.setRace(getRace());
        List<Spell> spells = new ArrayList<>();
        List<Weapon> weapons = new ArrayList<>();

        for (int x = 0; x < numeroWeapons; x++) {
            weapons.add(getWeapon());
        }

        for (int y = 0; y < numeroSpells; y++) {
            spells.add(getSpell());
        }

        character.setSpells(spells);
        character.setWeapons(weapons);
        return character;
    }

    @Override
    public Race getRace() {
        Pageable<Race> results = repository.getRaces();
        int count = results.getCount();
        if (count <= maxPerPage)
            return getItem(results.getResults());

        Integer page = getRandomNumberInts(2, count / maxPerPage);
        results = repository.getRacesByPage(page);
        return getItem(results.getResults());
    }

    @Override
    public Spell getSpell() {
        Pageable<Spell> results = repository.getSpells();
        int count = results.getCount();
        if (count <= maxPerPage)
            return getItem(results.getResults());

        Integer page = getRandomNumberInts(2, count / maxPerPage);
        results = repository.getSpellsByPage(page);
        return getItem(results.getResults());
    }

    @Override
    public Weapon getWeapon() {
        Pageable<Weapon> results = repository.getWeapons();
        int count = results.getCount();
        if (count <= maxPerPage)
            return getItem(results.getResults());

        Integer page = getRandomNumberInts(2, count / maxPerPage);
        results = repository.getWeaponsByPage(page);
        return getItem(results.getResults());
    }

    @Override
    public CharClass getCharClass() {
        Pageable<CharClass> results = repository.getCharClasses();
        int count = results.getCount();
        if (count <= maxPerPage)
            return getItem(results.getResults());

        Integer page = getRandomNumberInts(2, count / maxPerPage);
        results = repository.getCharClassesByPage(page);
        return getItem(results.getResults());
    }

    public <T> T getItem(List<T> list) {
        int index = getRandomNumberInts(0, list.size() - 1);
        return list.get(index);
    }

    public int getRandomNumberInts(int min, int max){
        Random random = new Random();
        return random.ints(min,(max+1)).findFirst().getAsInt();
    }
}
