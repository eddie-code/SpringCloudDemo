package com.lwc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author Eddie
 */
@EnableDiscoveryClient
@EnableEurekaClient
@SpringBootApplication
public class EurekaConfigClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaConfigClientApplication.class, args);
    }
}
