package com.vaanalvesr.generatechar.core.usecase;


import com.vaanalvesr.generatechar.core.domain.Char;
import com.vaanalvesr.generatechar.core.domain.Race;

public interface CharService {
    Char generate();
    Race getRace();
}
