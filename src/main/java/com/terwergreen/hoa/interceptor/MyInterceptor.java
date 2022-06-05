package com.terwergreen.hoa.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 自定义拦截器
 */
public class MyInterceptor extends AbstractInterceptor {

    private static final Logger logger = LoggerFactory.getLogger(MyInterceptor.class);

    @Override
    public String intercept(ActionInvocation invocation) throws Exception {
        logger.info("进入我的自定义拦截器");
        return invocation.invoke();
    }
}
