package com.atguigu.springcloud.alibaba.service;

import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * @Auther:http://www.bjsxt.com
 * @Date: 2020/12/14
 * @Description: com.atguigu.springcloud.alibaba.service
 * @Version: 1.0
 */

public interface AccountService {
    void decrease(@RequestParam("userId") Long userId, @RequestParam("money")BigDecimal money);
}
