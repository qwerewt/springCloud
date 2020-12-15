package com.atguigu.springcloud.imple;

import com.atguigu.springcloud.service.MessagesProvider;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * @Auther:http://www.bjsxt.com
 * @Date: 2020/12/4
 * @Description: com.atguigu.springcloud.imple
 * @Version: 1.0
 */
@EnableBinding(Source.class)
public class MessageProviderImpl implements MessagesProvider {
    @Resource
    private MessageChannel output;
    public String send() {
        String serial= UUID.randomUUID().toString();
        output.send(MessageBuilder.withPayload(serial).build());
        System.out.println("*********serial:"+serial);
        return null;
    }
}
