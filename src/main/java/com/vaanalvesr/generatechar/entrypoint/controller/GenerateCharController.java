package com.vaanalvesr.generatechar.entrypoint.controller;

import com.vaanalvesr.generatechar.core.domain.CharClass;
import com.vaanalvesr.generatechar.core.domain.Race;
import com.vaanalvesr.generatechar.core.domain.Spell;
import com.vaanalvesr.generatechar.core.domain.Weapon;
import com.vaanalvesr.generatechar.entrypoint.dto.CharResponse;
import com.vaanalvesr.generatechar.core.usecase.CharService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.vaanalvesr.generatechar.adapter.CharConvert.toDto;

@RestController
@RequestMapping("generate")
public class GenerateCharController {

    @Autowired
    private CharService charService;

    @GetMapping
    private CharResponse generate() {
        return toDto(charService.generate());
    }

    @GetMapping("/race")
    private Race getRace() {
        return charService.getRace();
    }

    @GetMapping("/spell")
    private Spell getSpell() {
        return charService.getSpell();
    }

    @GetMapping("/weapon")
    private Weapon getWeapon() {
        return charService.getWeapon();
    }

    @GetMapping("/class")
    private CharClass getCharClass() {
        return charService.getCharClass();
    }
}
