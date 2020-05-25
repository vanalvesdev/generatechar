package com.vaanalvesr.generatechar.entrypoint.controller;

import com.vaanalvesr.generatechar.entrypoint.dto.CharResponse;
import com.vaanalvesr.generatechar.core.usecase.CharService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.vaanalvesr.generatechar.adapter.CharConvert.toDto;

@RestController("generate")
public class GenerateCharController {

    @Autowired
    private CharService charService;

    @GetMapping
    private CharResponse generate() {
        return toDto(charService.generate());
    }

    @GetMapping("/race")
    private void getRace() {
        charService.getRace();
    }
}
