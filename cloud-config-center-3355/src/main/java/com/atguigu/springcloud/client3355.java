package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Auther:http://www.bjsxt.com
 * @Date: 2020/12/2
 * @Description: com.atguigu.springcloud
 * @Version: 1.0
 */
@SpringBootApplication
@EnableEurekaClient
public class client3355 {
    public static void main(String[] args) {
        SpringApplication.run(client3355.class,args);
    }
}
