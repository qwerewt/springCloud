package com.atguigu.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther:http://www.bjsxt.com
 * @Date: 2020/12/2
 * @Description: com.atguigu.springcloud.controller
 * @Version: 1.0
 */
@RestController
@RefreshScope
public class ConfigControlller3355 {
    @Value("${config.info}")
    private String configInfo;
    @GetMapping("/configInfo")
    public String getConfigInfo() {
        return configInfo;
    }
}
