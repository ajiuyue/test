package com.jiuyue.test.pojo.vo;

import lombok.Data;

/**
 * Create bySeptember
 * 2019/1/27
 * 17:20
 */
@Data
public class ResultVO {
    /** 错误码 */
    private Integer code;
    /** 提示信息 */
    private String msg;
    /** 具体数据 */
    private Object data;
/**
 * 因为上面注解了@Data相当于提供了 set/get方法
 */
}
