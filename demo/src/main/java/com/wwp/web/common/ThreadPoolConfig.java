package com.wwp.web.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

@Configuration
/** 开启异步支持 */
@EnableAsync
@ComponentScan("com.wwp.web.common")
public class ThreadPoolConfig implements AsyncConfigurer {

    private static final Logger logger = LoggerFactory.getLogger(ThreadPoolConfig.class);

//    @Value("${thread.CORE_POOL_SIZE}")
    private int corePoolSize = 4;

//    @Value("${thread.MAX_POOL_SIZE}")
    private int maxPoolSize = 8;

//    @Value("${thread.QUEUE_CAPACITY}")
    private int queueCapacity = 10;

//    @Value("${thread.TASK_NAME}")
    private String taskName = "task-";

    @Override
    @Bean
    public ThreadPoolTaskExecutor getAsyncExecutor() {
        logger.info("start asyncServiceExecutor ====================  ");
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();

        //配置核心线程数
        executor.setCorePoolSize(corePoolSize);
        //配置最大线程数
        executor.setMaxPoolSize(maxPoolSize);
        //配置队列最大长度
        executor.setQueueCapacity(queueCapacity);

        executor.setThreadNamePrefix(taskName);
        // rejection-policy：当pool已经达到max size的时候，如何处理新任务
        // CALLER_RUNS：不在新线程中执行任务，而是有调用者所在的线程来执行
        //自定义拒绝策略
        executor.setRejectedExecutionHandler(new MyHandler());
        //执行初始化
        executor.initialize();
        return executor;
    }
 }
class MyHandler implements RejectedExecutionHandler {

    @Override
    public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
        if (!executor.isShutdown()) {
            System.out.println(Thread.currentThread().getName());
            executor.getQueue().poll();
            executor.execute(r);
        }
    }
}
