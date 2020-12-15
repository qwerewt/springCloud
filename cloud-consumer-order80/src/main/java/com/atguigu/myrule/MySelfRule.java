package com.atguigu.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Auther:http://www.bjsxt.com
 * @Date: 2020/11/25
 * @Description: com.atguigu.myrule
 * @Version: 1.0
 */
@Configuration
public class MySelfRule {
    @Bean
    public IRule myRule(){
      return new RandomRule();
    }
}
