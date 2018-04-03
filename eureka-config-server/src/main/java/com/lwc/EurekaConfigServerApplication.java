package com.lwc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author Eddie
 */
@EnableConfigServer
@SpringBootApplication
public class EurekaConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaConfigServerApplication.class, args);
    }
}
