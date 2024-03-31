package com.zzw.gulimall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class GuliMallWareApplication {

    public static void main(String[] args) {
        SpringApplication.run(GuliMallWareApplication.class, args);
    }

}
