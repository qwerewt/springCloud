package com.atguigu.springcloud.alibaba.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;

/**
 * @Auther:http://www.bjsxt.com
 * @Date: 2020/12/14
 * @Description: com.atguigu.springcloud.alibaba.dao
 * @Version: 1.0
 */
@Mapper
public interface AccountDao {
    void decrease(@Param("userId") Long userId, @Param("money")BigDecimal money);
}
