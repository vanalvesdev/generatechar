package com.vaanalvesr.generatechar.core.usecase.impl;

import com.vaanalvesr.generatechar.core.domain.Char;
import com.vaanalvesr.generatechar.core.domain.Race;
import com.vaanalvesr.generatechar.core.usecase.CharService;
import com.vaanalvesr.generatechar.data.Open5eRepository;
import com.vaanalvesr.generatechar.data.dto.Pageable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

@Service
public class CharServiceImpl  implements CharService {

    @Autowired
    private Open5eRepository repository;

    private int maxPerPage = 50;

    @Override
    public Char generate() {
        return null;
    }

    public Race getRace() {
        Pageable<Race> results = repository.getRaces();
        int count = results.getCount();
        if (count <= maxPerPage)
            return getItem(results.getResults());

        Integer page = getRandomNumberInts(2, count / maxPerPage);
        Map<String, String> param = new LinkedHashMap<>();
        param.put("page", page.toString());
        results = repository.getRacesByPage(param);
        return getItem(results.getResults());
    }

    public <T> T getItem(List<T> list) {
        int index = getRandomNumberInts(0, list.size() - 1);
        return list.get(index);
    }

    public int getRandomNumberInts(int min, int max){
        Random random = new Random();
        return random.ints(min,(max+1)).findFirst().getAsInt();
    }
}
