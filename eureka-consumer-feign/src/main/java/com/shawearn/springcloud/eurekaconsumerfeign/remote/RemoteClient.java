package com.shawearn.springcloud.eurekaconsumerfeign.remote;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by Shaw on 2017/8/8.
 */
@FeignClient("eureka-provider")
public interface RemoteClient {

    @GetMapping("/provider")
    String provider();

}
