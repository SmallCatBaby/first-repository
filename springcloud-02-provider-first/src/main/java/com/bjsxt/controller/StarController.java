package com.bjsxt.controller;


import com.bjsxt.feign.service.StarService;
import com.bjsxt.pojo.Star;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: lixiaomi
 * @Description: com.bjsxt.controller
 * @Date: 2019/4/8
 * @Version: 1.0
 */
@RestController
public class StarController implements StarService {
    @Autowired
    private com.bjsxt.service.StarService starService;
    @Override
    public List<Star> selectAll() {
        return starService.selectAll();
    }
}
