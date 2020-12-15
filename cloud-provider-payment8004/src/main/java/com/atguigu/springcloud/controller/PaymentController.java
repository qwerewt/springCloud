package com.atguigu.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @Auther:http://www.bjsxt.com
 * @Date: 2020/11/24
 * @Description: com.atguigu.springcloud.controller
 * @Version: 1.0
 */
@RestController
@Slf4j
public class PaymentController {
    @Value("${server.port}")
    private String serverPort;
    @RequestMapping("/payment/zk")
    public String paymentzk(){
   return "serverport:"+serverPort+"\t"+ UUID.randomUUID().toString();
    }
}
