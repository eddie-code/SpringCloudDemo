package com.lwc.template;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * @author eddie.lee
 * @Package com.lwc.template
 * @ClassName RestConfig
 * @description
 * @date created in 2018-03-26 19:54
 * @modified by
 */
@Component
public class RestConfig {

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

}
