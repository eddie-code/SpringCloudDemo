package com.lwc.controller;

import com.lwc.dto.GitDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author eddie.lee
 * @Package com.lwc.controller
 * @ClassName AppController
 * @description 获取配置中心属性
 * @date created in 2018-04-03 14:22
 * @modified by
 */
@RestController
public class AppController {

    @Autowired
    private GitDto gitDto;

    @Value("${eddie}")
    private String eddie;

    @Value("${url}")
    private String url;

    @GetMapping("/url")
    public String url() {
        return this.url;
    }

    @GetMapping("/eddie")
    public String eddie() {
        return this.eddie;
    }

    @GetMapping("/configs")
    public String configs() {
        return "This is " + gitDto.getEddie() + " Blog: " + gitDto.getUrl();
    }

}
