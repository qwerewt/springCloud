package com.atguigu.feign.service;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import feign.Param;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Auther:http://www.bjsxt.com
 * @Date: 2020/11/29
 * @Description: com.atguigu.feign.service
 * @Version: 1.0
 */
@Component
@FeignClient(value="CLOUD-PAYMENT-SERVICE")
public interface PaymentFeigentService {
    @GetMapping(value="/payment/get/{id}")
    public CommonResult getPaymentId(@PathVariable("id") Long id);
}
