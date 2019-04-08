package com.bjsxt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: lixiaomi
 * @Description: com.bjsxt.controller
 * @Date: 2019/4/8
 * @Version: 1.0
 */
@Controller
public class PageController {

    @RequestMapping("/")
    public String showIndex(){
        return "login.html";
    }
}
