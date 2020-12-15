package com.atguigu.springcloud.alibaba.service;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import org.springframework.stereotype.Component;

/**
 * @Auther:http://www.bjsxt.com
 * @Date: 2020/12/11
 * @Description: com.atguigu.springcloud.alibaba.service
 * @Version: 1.0
 */
@Component
public class PaymentFallbackService implements PaymentService {
    public CommonResult<Payment> paymentSQL(Long id) {
        return new CommonResult<Payment>(44444,"服务降级返回,....PaymentFallbackService",new Payment(id,"serfw13"));
    }
}
