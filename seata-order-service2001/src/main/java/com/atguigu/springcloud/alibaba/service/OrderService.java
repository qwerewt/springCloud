package com.atguigu.springcloud.alibaba.service;

import com.atguigu.springcloud.alibaba.domain.Order;
import org.apache.ibatis.annotations.Param;

/**
 * @Auther:http://www.bjsxt.com
 * @Date: 2020/12/14
 * @Description: com.atguigu.springcloud.alibaba.service
 * @Version: 1.0
 */

public interface OrderService {
    void create(Order order);
}
