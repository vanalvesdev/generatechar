package com.vaanalvesr.generatechar.data;

import com.vaanalvesr.generatechar.core.domain.CharClass;
import com.vaanalvesr.generatechar.core.domain.Race;
import com.vaanalvesr.generatechar.core.domain.Spell;
import com.vaanalvesr.generatechar.core.domain.Weapon;
import com.vaanalvesr.generatechar.data.dto.Pageable;
import feign.Param;
import feign.QueryMap;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

@FeignClient("open5e")
public interface Open5eRepository {

    @RequestMapping(method = RequestMethod.GET, value = "/races/")
    public Pageable<Race> getRaces();

    @RequestMapping(method = RequestMethod.GET, value = "/races/?page={page}")
    public Pageable<Race> getRacesByPage(@RequestParam("page") int page);

    @RequestMapping(method = RequestMethod.GET, value = "/spells/")
    Pageable<Spell> getSpells();

    @RequestMapping(method = RequestMethod.GET, value = "/spells/?page={page}")
    Pageable<Spell> getSpellsByPage(@RequestParam("page") int page);

    @RequestMapping(method = RequestMethod.GET, value = "/weapons/")
    Pageable<Weapon> getWeapons();

    @RequestMapping(method = RequestMethod.GET, value = "/weapons/?page={page}")
    Pageable<Weapon> getWeaponsByPage(@RequestParam("page") int page);

    @RequestMapping(method = RequestMethod.GET, value = "/classes/")
    Pageable<CharClass> getCharClasses();

    @RequestMapping(method = RequestMethod.GET, value = "/classes/?page={page}")
    Pageable<CharClass> getCharClassesByPage(@RequestParam("page") int page);
}
