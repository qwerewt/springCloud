package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Auther:http://www.bjsxt.com
 * @Date: 2020/12/5
 * @Description: com.atguigu.springcloud
 * @Version: 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMent9001 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMent9001.class,args);
    }
}
