package com.eric.sfeign.service;

import org.springframework.stereotype.Component;

/**
 * @author lzh
 * @description TODO
 * @date 2019/11/1
 **/

@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}