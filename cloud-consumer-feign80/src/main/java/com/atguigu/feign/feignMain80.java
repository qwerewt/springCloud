package com.atguigu.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Auther:http://www.bjsxt.com
 * @Date: 2020/11/26
 * @Description: PACKAGE_NAME
 * @Version: 1.0
 */
@SpringBootApplication
@EnableFeignClients
public class feignMain80 {
    public static void main(String[] args) {
        SpringApplication.run(feignMain80.class,args);
    }
}
