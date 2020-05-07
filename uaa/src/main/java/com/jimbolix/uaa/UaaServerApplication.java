package com.jimbolix.uaa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author: ruihui.li
 * @Date: 2020/5/6 20:01
 * @Description:
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableHystrix
@EnableFeignClients(basePackages = {"com.jimbolix.uaa"})
public class UaaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(UaaServerApplication.class, args);
    }
}