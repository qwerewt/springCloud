package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @Auther:http://www.bjsxt.com
 * @Date: 2020/11/16
 * @Description: com.atguigu.springcloud.service
 * @Version: 1.0
 */

public interface PaymentService {
    public int create(Payment payment);
    public Payment getPaymentId(@Param("id") Long id);
}
