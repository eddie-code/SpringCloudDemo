package com.lwc.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author eddie.lee
 * @Package com.lwc.controller
 * @ClassName EddieController
 * @description
 * @date created in 2018-04-09 15:56
 * @modified by
 */
@Slf4j
@RestController
public class EddieController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/hi")
    public String home(){
        log.info("==> hi is being called");
        return "hi i'm eddie.lee!";
    }

    @GetMapping("/eddie")
    public String info(){
        log.info("==> info is being called");
        return restTemplate.getForObject("http://localhost:8988/info2",String.class);
    }
}
