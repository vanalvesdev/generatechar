package com.vaanalvesr.generatechar.core.domain;

import lombok.Data;

@Data
public class Race {

    private String name;
    private String slug;
    private String desc;
    private String age;
    private String size;
    private Speed speed;
    private String languages;
    private String vision;
    private String traits;
}
