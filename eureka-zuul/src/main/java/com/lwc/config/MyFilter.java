package com.lwc.config;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * @author eddie.lee
 * @Package com.lwc.config
 * @ClassName MyFilter
 * @description Zuul路由过滤器
 * @date created in 2018-04-02 19:58
 * @modified by
 */
@Component
public class MyFilter extends ZuulFilter {

//    filterType：返回一个字符串代表过滤器的类型，在zuul中定义了四种不同生命周期的过滤器类型，具体如下：
//    pre：路由之前
//    routing：路由之时
//    post： 路由之后
//    error：发送错误调用
//    filterOrder：过滤的顺序
//    shouldFilter：这里可以写逻辑判断，是否要过滤，本文true,永远过滤。
//    run：过滤器的具体逻辑。可用很复杂，包括查sql，nosql去判断该请求到底有没有权限访问。

    private static Logger log = LoggerFactory.getLogger(MyFilter.class);

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        RequestContext requestContext = RequestContext.getCurrentContext();
        HttpServletRequest request = requestContext.getRequest();
        log.info(String.format("%s ==> %s", request.getMethod(), request.getRequestURL().toString()));
        Object accessToken = request.getParameter("str");
        if (accessToken == null) {
            log.warn("Please add str");
            requestContext.setSendZuulResponse(false);
            requestContext.setResponseStatusCode(401);
            try {
                requestContext.getResponse().getWriter().write("Please add str");
            } catch (Exception e) {
                //log.error("Zuul路由错误: ", e.getMessage());
            }

            return null;
        }
        log.info("Yes Eddie");
        return null;
    }
}
