package com.jiuyue.test.controller;

import com.jiuyue.test.pojo.dto.UserDTO;
import com.jiuyue.test.pojo.vo.ResultVO;
import com.jiuyue.test.utils.web.ResultVOUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Create bySeptember
 * 2019/1/27
 * 16:47
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {
    @RequestMapping(value = "/getUserByUserName")
    @ResponseBody
    public ResultVO getUserByUserName(String username){
        System.out.println("username:"+username);
        if (!username.isEmpty()){
            UserDTO userDTO = new UserDTO();
            userDTO.setId(1);
            userDTO.setUsername(username);
            userDTO.setPassword(username);
            return ResultVOUtil.success(userDTO);
        }
        return ResultVOUtil.success();
    }
}
