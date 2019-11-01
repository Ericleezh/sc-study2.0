package com.eric.sribbon.controller;

import com.eric.sribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lzh
 * @description TODO
 * @date 2019/11/1
 **/

@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @GetMapping(value = "/hi")
    public String hello(@RequestParam(value = "name", defaultValue = "eric") String name) {
        return helloService.hiService(name);
    }
}
