package com.learn.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author zhangyugu
 * @Date 2020/9/17 5:52 上午
 * @Version 1.0
 */
//@EnableDiscoveryClient
@SpringBootApplication
public class GatewaySimpleApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewaySimpleApplication.class, args);
    }

//    @Bean
//    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
//        return builder.routes()
//                .route("path_route", r -> r.path("/csdn")
//                .uri("https://blog.csdn.net"))
//                .build();
//    }
}
