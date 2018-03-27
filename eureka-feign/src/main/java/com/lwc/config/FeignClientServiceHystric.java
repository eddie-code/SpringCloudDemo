package com.lwc.config;

import com.lwc.service.FeignClientService;
import org.springframework.stereotype.Component;

/**
 * @author eddie.lee
 * @Package com.lwc.config
 * @ClassName FeignClientServiceHystric
 * @description
 * @date created in 2018-03-27 15:21
 * @modified by
 */
@Component
public class FeignClientServiceHystric implements FeignClientService {

    @Override
    public String feignToClientByName(String name) {
        return "Hystric Error, Sorry " + name;
    }

}
