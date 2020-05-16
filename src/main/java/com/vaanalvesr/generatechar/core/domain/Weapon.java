package com.vaanalvesr.generatechar.core.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class Weapon {

    private String name;
    private String slug;
    private String category;
    @JsonProperty("damage_dice")
    private String damage;
    @JsonProperty("damage_type")
    private String damageType;
    private String weight;
    private List<String> properties;
}
