package com.liuxu.demo_eureka2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class DemoEureka2Application {

    public static void main(String[] args) {
        SpringApplication.run(DemoEureka2Application.class, args);
    }

}
