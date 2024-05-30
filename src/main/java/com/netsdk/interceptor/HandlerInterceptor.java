package com.netsdk.interceptor;

import com.netsdk.webUtils.ipUtil;
import com.netsdk.webUtils.localValue;
import eu.bitwalker.useragentutils.UserAgent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * 拦截器
 */
@Slf4j
public class HandlerInterceptor extends HandlerInterceptorAdapter {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        UserAgent agent = UserAgent.parseUserAgentString(request.getHeader("user-agent"));
        localValue value = new localValue();
        value.setIp(ipUtil.getIpAddr(request));
        value.setClientType(agent.getOperatingSystem().getDeviceType().toString());  //客户端类型  手机、电脑、平板
        value.setOS(agent.getOperatingSystem().getName());   //操作系统类型
        value.setBro(agent.getBrowser().toString());  //浏览器类型
        log.info("ip:{},clientType:{},OS:{},bro:{}",value.getIp(),value.getClientType(),value.getOS(),value.getBro());
        ThreadLocal threadLocal = new ThreadLocal();
        threadLocal.set(value);
        return true;
    }
}
