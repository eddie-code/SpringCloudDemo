package com.lwc.controller;

import com.lwc.config.EurekaClientConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author eddie.lee
 * @Package com.lwc.controller
 * @ClassName EurekaClientController
 * @description
 * @date created in 2018-03-26 17:19
 * @modified by
 */
@RestController
@RequestMapping("/eureka")
public class EurekaClientController {

    @Autowired
    private EurekaClientConfig eurekaClientConfig;

    @GetMapping("/client")
    public String home(@RequestParam String name) {
        return "hi " + name + ", i am from port:" + eurekaClientConfig.getPort();
    }

}
