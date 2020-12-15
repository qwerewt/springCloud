package com.atguigu.springcloud.service;

import cn.hutool.core.util.IdUtil;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.concurrent.TimeUnit;

/**
 * @Auther:http://www.bjsxt.com
 * @Date: 2020/11/30
 * @Description: com.atguigu.springcloud.service
 * @Version: 1.0
 */
@Service
public class PaymentService {
    public String paymentInfo_ok(Integer id) {
        return "线程池：" + Thread.currentThread().getName() + " paymentInfo_ok,id: " + id + "\t" + "哈哈";
    }

    @HystrixCommand(fallbackMethod = "paymentInfo_TimeOutHandler",commandProperties = {
            @HystrixProperty(name="execution.isolation.thread.timeoutInMilliseconds",value="5000")
    })
    public String paymentInfo_TimeOut(Integer id) {
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "线程池：" + Thread.currentThread().getName() + " paymentInfo_TimeOut,id: " + id + "\t" + "哈哈" + " 耗时" + "秒钟";
    }

    public String paymentInfo_TimeOutHandler(Integer id) {
        return "线程池：" +Thread.currentThread().getName() + " 8001系统繁忙或运行出错，请稍候再试 " + id + "\t" + "IJj";
    }
//服务熔断
@HystrixCommand(fallbackMethod ="paymentCircuitBreaker_fallback",commandProperties ={
        //是否开启断路器
        @HystrixProperty(name="circuitBreaker.enabled",value="true"),
        //请求次数
        @HystrixProperty(name="circuitBreaker.requestVolumeThreshold",value="10"),
        //时间窗口期
        @HystrixProperty(name="circuitBreaker.sleepWindowInMilliseconds",value="10000"),
        //失败率达到多少后跳闸
        @HystrixProperty(name="circuitBreaker.errorThresholdPercentage",value="60")
} )
public String paymentCircuitBreaker(@PathVariable("id") Integer id){
    if(id<0){
        throw new RuntimeException("......id不能为负数");
    }
    String serialNumber= IdUtil.simpleUUID();
    return Thread.currentThread().getName()+"\t"+"调用成功，流水号："+serialNumber;
}
    public String paymentCircuitBreaker_fallback(@PathVariable("id") Integer id){
        return "id不能为负数，请稍后再试 id:"+id;
    }
}
