package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Auther:http://www.bjsxt.com
 * @Date: 2020/11/16
 * @Description: com.atguigu.springcloud.dao
 * @Version: 1.0
 */
@Mapper
public interface PaymentDao {
    public int create(Payment payment);
    public Payment getPaymentId(@Param("id") Long id);
}
