package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.service.MessagesProvider;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Auther:http://www.bjsxt.com
 * @Date: 2020/12/4
 * @Description: com.atguigu.springcloud.controller
 * @Version: 1.0
 */
@RestController
public class SendMessageController {
    @Resource
    private MessagesProvider messagesProvider;
    @GetMapping("/sendMessage")
    public String sendMessage(){
        return messagesProvider.send();
    }
}
