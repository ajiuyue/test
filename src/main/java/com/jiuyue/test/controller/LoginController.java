package com.jiuyue.test.controller;

import com.jiuyue.test.constants.ResultEnum;
import com.jiuyue.test.pojo.dto.UserDTO;
import com.jiuyue.test.pojo.vo.ResultVO;
import com.jiuyue.test.utils.web.ResultVOUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Create bySeptember
 * 2019/1/27
 * 21:15
 */
@Controller
@RequestMapping(value = "/user")
public class LoginController {
    @RequestMapping(value = "/gotoLogin")
    public String gotoLogin(){
        return "login";
    }

    @RequestMapping(value = "/login")
    @ResponseBody
    public ResultVO login(UserDTO userDTO){
        System.out.println("userDTO："+userDTO.getUsername());
        if (userDTO.getUsername().equals("jiuyue")&userDTO.getPassword().equals("aaa")){
            return ResultVOUtil.success();
        }else {
            return ResultVOUtil.error(ResultEnum.PASSWPRD_INCORRECT);
        }

    }
}
