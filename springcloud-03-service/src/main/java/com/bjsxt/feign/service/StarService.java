package com.bjsxt.feign.service;

import com.bjsxt.pojo.Star;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Author: lixiaomi
 * @Description: com.bjsxt.service
 * @Date: 2019/4/8
 * @Version: 1.0
 */
public interface StarService {
    @RequestMapping("/showStar")
    public List<Star> selectAll();
}
