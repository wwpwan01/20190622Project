package com.wwp.util;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.util.HashMap;
import java.util.Map;

public class IpServiceConfig implements ServletContextListener {

    private final Map<String,Object> ipServiceConfig = new HashMap<>();

    public void contextDestroyed(ServletContextEvent sce){}
    public void contextInitialized(ServletContextEvent sce){
        System.out.println("加载微服务地址！");
    }
}
