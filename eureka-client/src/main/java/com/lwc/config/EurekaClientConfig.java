package com.lwc.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author eddie.lee
 * @Package com.lwc.config
 * @ClassName EurekaClientConfig
 * @description
 * @date created in 2018-03-26 17:16
 * @modified by
 */
@Data
@Component
@ConfigurationProperties(prefix = "server")
public class EurekaClientConfig {

    private String port;

}
