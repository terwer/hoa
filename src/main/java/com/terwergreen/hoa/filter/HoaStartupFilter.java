package com.terwergreen.hoa.filter;

import org.apache.struts2.dispatcher.filter.StrutsPrepareAndExecuteFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;

/**
 * 自定义过滤器
 *
 * @name: HoaStartupFilter
 * @author: terwer
 * @date: 2022-05-06 10:06
 **/
public class HoaStartupFilter extends StrutsPrepareAndExecuteFilter {
    private static final Logger logger = LoggerFactory.getLogger(HoaStartupFilter.class);

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        super.init(filterConfig);
        logger.info("struts2 inited");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        super.doFilter(servletRequest, servletResponse, filterChain);
    }

    @Override
    public void destroy() {
        super.destroy();
        logger.info("hoa stoped");
    }
}
