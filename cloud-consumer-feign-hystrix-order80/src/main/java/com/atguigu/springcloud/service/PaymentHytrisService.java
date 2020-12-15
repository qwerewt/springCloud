package com.atguigu.springcloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Auther:http://www.bjsxt.com
 * @Date: 2020/11/30
 * @Description: com.atguigu.springcloud.service
 * @Version: 1.0
 */
@Component
@FeignClient(value="cloud-provider-hystrix-payment",fallback=PaymentFallbackService.class)
public interface PaymentHytrisService {
    @GetMapping(value="/payment/hystrik/ok/{id}")
    public String paymentInfo_ok(@PathVariable("id") Integer id);
    @GetMapping(value="/payment/hystrik/timeout/{id}")
    public String paymentInfo_TimeOut(@PathVariable("id") Integer id);
}
