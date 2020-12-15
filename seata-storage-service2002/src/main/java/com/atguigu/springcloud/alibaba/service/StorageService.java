package com.atguigu.springcloud.alibaba.service;

/**
 * @Auther:http://www.bjsxt.com
 * @Date: 2020/12/14
 * @Description: com.atguigu.springcloud.alibaba.service
 * @Version: 1.0
 */

public interface StorageService {
    void decrease(Long productId,Integer count);
}
