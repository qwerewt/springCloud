package com.atguigu.springcloud.alibaba.dao;

import com.atguigu.springcloud.alibaba.domain.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Auther:http://www.bjsxt.com
 * @Date: 2020/12/14
 * @Description: com.atguigu.springcloud.alibaba.dao
 * @Version: 1.0
 */
@Mapper
public interface OrderDao {
    void create(Order order);
    void update(@Param("userId") Long userId,@Param("status") Integer status);

}
