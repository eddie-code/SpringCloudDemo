package com.lwc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author Eddie
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServerPeer2Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerPeer2Application.class, args);
    }
}
