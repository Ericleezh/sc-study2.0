package com.eric.sfeign.controller;

import com.eric.sfeign.service.SchedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lzh
 * @description TODO
 * @date 2019/11/1
 **/

@RestController
public class HiController {

    @Autowired
    SchedualServiceHi schedualServiceHi;

    @RequestMapping(value = "/hi")
    public String sayHello(@RequestParam(value = "name", defaultValue = "evelyn") String name) {
        return schedualServiceHi.sayHiFromClientOne(name);
    }
}
