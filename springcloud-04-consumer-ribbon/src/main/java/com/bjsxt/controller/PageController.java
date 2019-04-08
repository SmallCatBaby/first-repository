package com.bjsxt.controller;

import com.bjsxt.pojo.Star;
import com.bjsxt.service.StarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Author: lixiaomi
 * @Description: com.bjsxt.controller
 * @Date: 2019/4/8
 * @Version: 1.0
 */
@Controller
public class PageController {
    @Autowired
    private StarService starService;
    @RequestMapping("/")
    public String showIndex(Model model){
        List<Star> starList = starService.selectAll();
        model.addAttribute("starList", starList);
        return "/WEB-INF/jsp/index.jsp";
    }
}
