package com.shawearn.springcloud.aoplog.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Shaw on 2017/8/8.
 */
@RestController
public class MyController {

    @GetMapping("/test/{name}")
    public String test(@PathVariable String name) {
        String services = "Hello, " + name;
        System.out.println("message: " + services);
        return services;
    }

}
