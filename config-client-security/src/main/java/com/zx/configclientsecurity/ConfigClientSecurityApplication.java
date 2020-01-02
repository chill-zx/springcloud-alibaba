package com.zx.configclientsecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ConfigClientSecurityApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigClientSecurityApplication.class, args);
    }

}
