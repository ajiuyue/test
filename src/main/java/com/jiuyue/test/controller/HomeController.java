package com.jiuyue.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Create bySeptember
 * 2019/1/27
 * 21:25
 */
@Controller
public class HomeController {
    @RequestMapping("/")
    public String home(){
        return "home";
    }

}
