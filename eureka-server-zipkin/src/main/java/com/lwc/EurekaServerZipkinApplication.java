package com.lwc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin.server.EnableZipkinServer;


/**
 * @author Eddie
 */
@EnableZipkinServer
@SpringBootApplication
public class EurekaServerZipkinApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerZipkinApplication.class, args);
    }
}
