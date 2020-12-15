package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.service.PaymentHytrisService;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

/**
 * @Auther:http://www.bjsxt.com
 * @Date: 2020/11/30
 * @Description: com.atguigu.springcloud.controller
 * @Version: 1.0
 */
@RestController
@Slf4j
@DefaultProperties(defaultFallback = "payment_Global_FallbackMethod")
public class OrderHyetrixController {
    @Resource
    private PaymentHytrisService paymentHytrisService;
    @GetMapping(value="/consumer/payment/hystrik/ok/{id}")
    public String paymentInfo_ok(@PathVariable("id") Integer id){
        String result=paymentHytrisService.paymentInfo_ok(id);
        return result;
    }
    @GetMapping(value="/consumer/payment/hystrik/timeout/{id}")
   /* @HystrixCommand(fallbackMethod = "paymentInfo_TimeOutHandler",commandProperties = {
            @HystrixProperty(name="execution.isolation.thread.timeoutInMilliseconds",value="1500")
    })*/
   @HystrixCommand
    public String paymentInfo_TimeOut(Integer id) {
        int age=10/0;
        String result = paymentHytrisService.paymentInfo_TimeOut(id);
        return result;
    }

    public String paymentInfo_TimeOutHandler(Integer id) {
        return "我是消费者80，对方支付系统繁忙请10秒钟在试";
    }
    //下面是全局fallback
    public String payment_Global_FallbackMethod(){
        return "Global异常处理信息，请稍后再试";
    }
}
