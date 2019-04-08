package com.bjsxt.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author: lixiaomi
 * @Description: com.bjsxt.filter
 * @Date: 2019/4/8
 * @Version: 1.0
 */
@Component
public class LoginFilter extends ZuulFilter {
    /*拦截器类型pre routing post error*/
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 1;
    }
    /*是否开启拦截器*/
    @Override
    public boolean shouldFilter() {
        return true;
    }
    /*具体的业务逻辑*/
    @Override
    public Object run() throws ZuulException {
        HttpServletRequest request = RequestContext.getCurrentContext().getRequest();
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println(username+":"+password);
        if ("lisi".equals(username)&&"123".equals(password)){
            System.out.println("ok");
        }else{
            RequestContext.getCurrentContext().setSendZuulResponse(false);
        }
        return null;

    }
}
