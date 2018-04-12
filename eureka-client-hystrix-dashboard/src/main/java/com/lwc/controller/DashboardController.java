package com.lwc.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author eddie.lee
 * @Package com.lwc.controller
 * @ClassName DashboardController
 * @description
 * @date created in 2018-04-12 15:00
 * @modified by
 */
@RestController
@RequestMapping("/eureka")
public class DashboardController {

    @Value("${server.port}")
    private String port;

    @HystrixCommand(fallbackMethod  = "homeError")
    @GetMapping("/client")
    public String home(@RequestParam String name) {
        return "i am " + name + " , server prot: " + port;
    }

    public String homeError(String name) {
        return "sorry " + name + " , system error 2 Detected";
    }

}
