package com.limo.waste.common.util;

import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Component;

import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @Author limo
 * @Description 自定义线程池
 */
@Component
public class ThreadConfig {

    @Bean(name = "pool1")
    public Executor createExecutor(){
        ThreadPoolTaskExecutor threadPoolTaskExecutor = new ThreadPoolTaskExecutor();
        threadPoolTaskExecutor.setCorePoolSize(20);
        threadPoolTaskExecutor.setMaxPoolSize(40);
        threadPoolTaskExecutor.setKeepAliveSeconds(60);
        threadPoolTaskExecutor.setQueueCapacity(100);
        threadPoolTaskExecutor.setThreadNamePrefix("handleTaskStatusThread");
        threadPoolTaskExecutor.setRejectedExecutionHandler(
                new ThreadPoolExecutor.AbortPolicy()
        );
        return threadPoolTaskExecutor;
    }

}
