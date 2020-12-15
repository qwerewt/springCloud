package com.atguigu.springcloud.alibaba.service.impl;

import com.atguigu.springcloud.alibaba.dao.AccountDao;
import com.atguigu.springcloud.alibaba.service.AccountService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.concurrent.TimeUnit;

/**
 * @Auther:http://www.bjsxt.com
 * @Date: 2020/12/14
 * @Description: com.atguigu.springcloud.alibaba.service.impl
 * @Version: 1.0
 */
@Service
public class AccountServiceimpl implements AccountService {
    private static final Logger LOGGER= LoggerFactory.getLogger(AccountServiceimpl.class);
    @Resource
    private AccountDao accountDao;

    public void decrease(Long userId, BigDecimal money) {
        LOGGER.info("-----account-service中扣减账户余额开始");
        try {
            TimeUnit.SECONDS.sleep(20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.accountDao.decrease(userId,money);
        LOGGER.info("-----account-service中扣减账户余额结束");
    }
}
