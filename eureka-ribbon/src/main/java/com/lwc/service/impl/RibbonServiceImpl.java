package com.lwc.service.impl;

import com.lwc.service.RibbonService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author eddie.lee
 * @Package com.lwc.service.impl
 * @ClassName RibbonServiceImpl
 * @description
 * @date created in 2018-03-26 19:57
 * @modified by
 */
@Service
public class RibbonServiceImpl implements RibbonService {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hystrixError")
    @Override
    public String ribbonService(String name) {
        final String url = "http://eureka-client/eureka/client?name=" + name;
        return restTemplate.getForObject(url, String.class);
    }

    @Override
    public String hystrixError(String name) {
        return "hi, " + name + " ,sorry, hystrix error!";
    }
}
