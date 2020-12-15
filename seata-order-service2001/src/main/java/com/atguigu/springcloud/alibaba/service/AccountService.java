package com.atguigu.springcloud.alibaba.service;

import com.atguigu.springcloud.alibaba.domain.CommonResult;
import org.apache.ibatis.annotations.Param;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * @Auther:http://www.bjsxt.com
 * @Date: 2020/12/14
 * @Description: com.atguigu.springcloud.alibaba.service
 * @Version: 1.0
 */
@FeignClient(value="seata-account-service")
public interface AccountService {
    @PostMapping("/account/decrease")
   public CommonResult decrease(@RequestParam("userId") Long userId, @RequestParam("money") BigDecimal money);
}
