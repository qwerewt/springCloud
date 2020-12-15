package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Auther:http://www.bjsxt.com
 * @Date: 2020/12/3
 * @Description: com.atguigu.springcloud
 * @Version: 1.0
 */
@SpringBootApplication
@EnableEurekaClient
public class ConfigCenter3366 {
    public static void main(String[] args) {
        SpringApplication.run(ConfigCenter3366.class,args);
    }
}

