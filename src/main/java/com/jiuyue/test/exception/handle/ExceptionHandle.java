package com.jiuyue.test.exception.handle;

import com.jiuyue.test.constants.ResultEnum;
import com.jiuyue.test.exception.CommonException;
import com.jiuyue.test.pojo.vo.ResultVO;
import com.jiuyue.test.utils.web.ResultVOUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Create bySeptember
 * 2019/1/27
 * 20:59
 */
@ControllerAdvice
@Slf4j
public class ExceptionHandle{
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public ResultVO handle(Exception e){
        //如果是我们自定义的异常
        //instanceof判断value是不是属于这个Class类的
        if (e instanceof CommonException){
            CommonException commonException = (CommonException) e;
            return ResultVOUtil.error(commonException.getCode(),commonException.getMessage());
        }else {
            log.error("【系统异常】{}",e);
            return ResultVOUtil.error(ResultEnum.UNKNOWWN_ERROR.getCode(),e.getMessage());
        }

    }
}
