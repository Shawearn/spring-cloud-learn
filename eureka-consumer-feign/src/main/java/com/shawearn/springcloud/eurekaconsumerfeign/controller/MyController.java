package com.shawearn.springcloud.eurekaconsumerfeign.controller;

import com.shawearn.springcloud.eurekaconsumerfeign.remote.RemoteClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Shaw on 2017/8/8.
 */
@RestController
public class MyController {

    @Autowired
    RemoteClient remoteClient;

    @GetMapping("/remoteProvider")
    public String remoteProvider() {
        return remoteClient.provider();
    }
}
