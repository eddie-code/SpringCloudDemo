package com.lwc.service.impl;

import com.lwc.service.RibbonService;
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

    @Override
    public String ribbonService(String name) {
        final String url = "http://eureka-client/eureka/client?name=" + name;
        return restTemplate.getForObject(url, String.class);
    }

}
