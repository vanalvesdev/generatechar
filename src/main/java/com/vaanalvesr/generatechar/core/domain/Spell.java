package com.vaanalvesr.generatechar.core.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Spell {

    private String slug;
    private String name;
    private String desc;
    @JsonProperty("higher_level")
    private String higherLeve;
    private String page;
    private String range;
    private String components;
    private String material;
    private String ritual;
    private String duration;
    private String concentration;
    @JsonProperty("casting_time")
    private String castingTime;
    @JsonProperty("level_int")
    private String level;
    private String school;
    @JsonProperty("dnd_class")
    private String dndClass;
    private String archetype;
    private String circles;
}
