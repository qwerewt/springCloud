package com.atguigu.springcloud.alibaba.service.impl;

import com.atguigu.springcloud.alibaba.dao.StorageDao;
import com.atguigu.springcloud.alibaba.service.StorageService;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Auther:http://www.bjsxt.com
 * @Date: 2020/12/14
 * @Description: com.atguigu.springcloud.alibaba.service.impl
 * @Version: 1.0
 */
@Service
public class StorageServiceImpl implements StorageService {
   private static final Logger LOGGER=LoggerFactory.getLogger(StorageServiceImpl.class);
   @Resource
    private StorageDao storageDao;
    public void decrease(Long productId, Integer count) {
        LOGGER.info("-----storage-service扣减库存开始");
        storageDao.decrease(productId,count);
        LOGGER.info("-----storage-service扣减库存结束");
    }
}
