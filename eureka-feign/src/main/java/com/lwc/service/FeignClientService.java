package com.lwc.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author eddie.lee
 * @Package com.lwc.service
 * @ClassName FeignClientService
 * @description
 * @date created in 2018-03-27 10:43
 * @modified by
 */
@FeignClient("eureka-client")
public interface FeignClientService {

    @GetMapping("/eureka/client")
    String feignToClientByName(@RequestParam("name") String name);

}
