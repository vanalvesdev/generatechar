package com.vaanalvesr.generatechar.data.dto;

import lombok.Data;

import java.util.List;

@Data
public class Pageable<T> {

    private int count;
    private String next;
    private String previous;
    private List<T> results;
}
