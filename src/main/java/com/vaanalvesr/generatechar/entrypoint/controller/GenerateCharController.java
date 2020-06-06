package com.vaanalvesr.generatechar.entrypoint.controller;

import com.vaanalvesr.generatechar.core.domain.*;
import com.vaanalvesr.generatechar.core.usecase.CharService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("generate")
public class GenerateCharController {

    @Autowired
    private CharService charService;

    @GetMapping
    private Char generate() {
        return charService.generate();
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
