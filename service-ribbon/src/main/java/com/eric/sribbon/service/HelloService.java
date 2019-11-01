package com.eric.sribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author lzh
 * @description TODO
 * @date 2019/11/1
 **/

@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    public String hiService(String name) {
        return restTemplate.getForObject("http://EUREKA-CLIENT/hi?name=" + name, String.class);
    }
}
