package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @Auther:http://www.bjsxt.com
 * @Date: 2020/12/1
 * @Description: com.atguigu.springcloud
 * @Version: 1.0
 */
@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDashload9001 {
    public static void main(String[] args) {
        SpringApplication.run(HystrixDashload9001.class,args);
    }
}
