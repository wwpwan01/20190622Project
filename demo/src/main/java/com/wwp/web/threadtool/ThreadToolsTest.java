package com.wwp.web.threadtool;

import com.wwp.web.common.ThreadPoolConfig;
import com.wwp.web.common.WangPo;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author wwp
 * @version 1.0.0
 * @ClassName ThreadToolsTest.java
 * @Description 线程池调用
 * @createTime 2021年02月26日 09:36:00
 */
public class ThreadToolsTest {
    public static void main(String[] args) {

        int count = 10;

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ThreadPoolConfig.class);
        WangPo task = context.getBean(WangPo.class);
        // 直接调用即可
        for (int i = 0; i < count; i++) {
            task.palyWithMan();
            task.pomeiyan();
        }

        context.close();
    }
}
