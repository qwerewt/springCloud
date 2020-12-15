package com.atguigu.feign.config;


import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Auther:http://www.bjsxt.com
 * @Date: 2020/11/29
 * @Description: com.atguigu.feign.config
 * @Version: 1.0
 */
@Configuration
public class FeignConfig {
    @Bean
  Logger.Level feignLoggerLevel(){
      return Logger.Level.FULL;
  }
}
