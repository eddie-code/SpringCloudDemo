package com.lwc.controller;

import com.lwc.service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author eddie.lee
 * @Package com.lwc.controller
 * @ClassName RibbonControler
 * @description 服务消费者
 * @date created in 2018-03-26 20:02
 * @modified by
 */
@RestController
@RequestMapping("/eureka")
public class RibbonControler {

    @Autowired
    private RibbonService ribbonService;

    @GetMapping("/ribbon")
    public String Ribbon(@RequestParam String name) {
        return ribbonService.ribbonService(name);
    }

}
