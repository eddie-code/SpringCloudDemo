package com.lwc.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author eddie.lee
 * @Package com.lwc.controller
 * @ClassName ZipkinController
 * @description
 * @date created in 2018-04-09 13:55
 * @modified by
 */
@Slf4j
@RestController
public class ZipkinController {


    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/hi")
    public String callHome() {
        log.info(" callHome() ==> calling trace eureka-server-zipkin-client");
        return restTemplate.getForObject("http://localhost:8989/eddie", String.class);
    }

    @GetMapping("/info2")
    public String info2() {
        log.info(" info2() ==> calling trace eureka-server-zipkin-client");
        return "this is eureka-server-zipkin-client";

    }

}
