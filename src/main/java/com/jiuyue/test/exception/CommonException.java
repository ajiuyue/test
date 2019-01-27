package com.jiuyue.test.exception;

import com.jiuyue.test.constants.ResultEnum;
import lombok.Getter;

/**
 * Create bySeptember
 * 2019/1/27
 * 20:56
 */
@Getter
public class CommonException extends RuntimeException {
    private Integer code;
    public CommonException(ResultEnum resultEnum){
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }
    public CommonException(Integer code, String message){
        super(message);
        this.code = code;
    }
}
