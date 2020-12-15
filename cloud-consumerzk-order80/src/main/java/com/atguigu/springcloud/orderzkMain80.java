package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Auther:http://www.bjsxt.com
 * @Date: 2020/11/25
 * @Description: com.atguigu.springcloud
 * @Version: 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class orderzkMain80 {
    public static void main(String[] args) {
        SpringApplication.run(orderzkMain80.class,args);
    }
}
