package com.lwc.controller;

import com.lwc.service.FeignClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author eddie.lee
 * @Package com.lwc.controller
 * @ClassName FeignController
 * @description 服务消费者（Feign）
 * @date created in 2018-03-27 10:50
 * @modified by
 */
@RestController
@RequestMapping("/eureka")
public class FeignController {

    @Autowired
    private FeignClientService feignClientService;

    @GetMapping("/feign")
    public String feign(@RequestParam("name") String name) {
        return feignClientService.feignToClientByName(name);
    }

}
