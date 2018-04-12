package com.lwc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author Eddie
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServerHystrixDashboardApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerHystrixDashboardApplication.class, args);
    }
}
