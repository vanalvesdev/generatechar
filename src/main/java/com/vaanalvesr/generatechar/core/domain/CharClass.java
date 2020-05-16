package com.vaanalvesr.generatechar.core.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class CharClass {

    private String name;
    private String slug;
    private String desc;
    @JsonProperty("hit_dice")
    private String hitDice;
    @JsonProperty("hp_at_1st_level")
    private String hpBase;
    @JsonProperty("hp_at_higher_levels")
    private String hpMax;
    private String armor;
    private String weapons;
    private String tools;
    private String skills;
    private String equipment;
}
