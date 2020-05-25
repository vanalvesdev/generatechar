package com.vaanalvesr.generatechar.data;

import com.vaanalvesr.generatechar.core.domain.Race;
import com.vaanalvesr.generatechar.data.dto.Pageable;
import feign.QueryMap;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.Map;

@FeignClient("open5e")
public interface Open5eRepository {

    @RequestMapping(method = RequestMethod.GET, value = "/races/")
    public Pageable<Race> getRaces();

    @RequestMapping(method = RequestMethod.GET, value = "/races/?{param}")
    public Pageable<Race> getRacesByPage(@QueryMap Map<String, String> param);
}
