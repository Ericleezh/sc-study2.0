package com.eric.eclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lzh
 * @description
 * @date 2019/11/1
 **/

@RestController
public class HiController {

    @Value("${server.port}")
    public String port;

    @RequestMapping("/hi")
    public String name(@RequestParam(value = "name", defaultValue = "eric") String name) {
        return "Hi " + name +", i am from the port :" + port;
    }

}
