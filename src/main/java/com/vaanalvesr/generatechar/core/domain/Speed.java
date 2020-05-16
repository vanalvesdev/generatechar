package com.vaanalvesr.generatechar.core.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Speed {

    @JsonProperty("speed_desc")
    private String speedDesc;

    private Integer walk;
}
