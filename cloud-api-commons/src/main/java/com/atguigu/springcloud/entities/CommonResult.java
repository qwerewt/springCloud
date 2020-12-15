package com.atguigu.springcloud.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Auther:http://www.bjsxt.com
 * @Date: 2020/11/16
 * @Description: com.atguigu.springcloud.entities
 * @Version: 1.0
 */
@Data
//@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    private Integer code;
    private String message;
    private T data;

    public CommonResult(Integer code,String message){
        this.code=code;
        this.message=message;
    }
    public CommonResult(Integer code, String message,T data) {
    this.code=code;
    this.message=message;
    this.data=data;
    }
}

