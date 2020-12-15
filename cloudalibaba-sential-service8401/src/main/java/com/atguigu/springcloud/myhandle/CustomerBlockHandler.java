package com.atguigu.springcloud.myhandle;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.atguigu.springcloud.entities.CommonResult;

/**
 * @Auther:http://www.bjsxt.com
 * @Date: 2020/12/11
 * @Description: com.atguigu.springcloud.myhandle
 * @Version: 1.0
 */

public class CustomerBlockHandler {
    public static CommonResult handlerException(BlockException exception)
    {
        return new CommonResult(4444,"按客戶自定义,global handlerException----1");
    }
    public static CommonResult handlerException2(BlockException exception)
    {
        return new CommonResult(4444,"按客戶自定义,global handlerException----2");
    }
}
