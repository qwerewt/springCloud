package com.atguigu.feign.controller;

import com.atguigu.feign.service.PaymentFeigentService;
import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Auther:http://www.bjsxt.com
 * @Date: 2020/11/29
 * @Description: com.atguigu.feign.controller
 * @Version: 1.0
 */
@RestController
@Slf4j
public class OrderFeignController {
    @Resource
    private PaymentFeigentService paymentFeigentService;
    @GetMapping(value="/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentId(@PathVariable("id") Long id){
    return paymentFeigentService.getPaymentId(id);
    }
}
