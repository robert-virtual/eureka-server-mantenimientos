package com.example.eurekaservermantenimientos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerMantenimientosApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerMantenimientosApplication.class, args);
    }

}
