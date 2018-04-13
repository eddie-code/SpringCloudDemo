package com.lwc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * @author Eddie
 */
@EnableTurbine
@SpringBootApplication
public class EurekaClientHystrixTurbineApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientHystrixTurbineApplication.class, args);
    }
}
