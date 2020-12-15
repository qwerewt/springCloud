package com.atguigu.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @Auther:http://www.bjsxt.com
 * @Date: 2020/11/30
 * @Description: com.atguigu.springcloud.service
 * @Version: 1.0
 */
@Component
public class PaymentFallbackService implements PaymentHytrisService {
    public String paymentInfo_ok(Integer id) {
        return "-------PaymentFallbackService fall back-paymentInfo_ok,哈哈";
    }

    public String paymentInfo_TimeOut(Integer id) {
        return "-------PaymentFallbackService fall back-paymentInfo_TimeOut,哈哈";
    }
}
