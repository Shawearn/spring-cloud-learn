package com.shawearn.springcloud.eurekaprovider.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Shaw on 2017/8/8.
 */
@RestController
public class MyController {

    @Autowired
    DiscoveryClient discoveryClient;

    @GetMapping("/provider")
    public String provider() {
        String services = "Services: " + discoveryClient.getServices();
        System.out.println(services);
        return services;
    }

}
