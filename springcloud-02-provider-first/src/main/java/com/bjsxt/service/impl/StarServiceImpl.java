package com.bjsxt.service.impl;

import com.bjsxt.mapper.StarMapper;
import com.bjsxt.pojo.Star;
import com.bjsxt.pojo.StarExample;
import com.bjsxt.service.StarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: lixiaomi
 * @Description: com.bjsxt.service.impl
 * @Date: 2019/4/8
 * @Version: 1.0
 */
@Service
public class StarServiceImpl implements StarService {
    @Autowired
    private StarMapper starMapper;
    @Override
    public List<Star> selectAll() {
        StarExample starExample = new StarExample();
        List<Star> starList = starMapper.selectByExample(starExample);
        return starList;
    }
}
