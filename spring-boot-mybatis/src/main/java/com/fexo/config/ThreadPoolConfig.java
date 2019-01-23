package com.fexo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

/**
 * @author F1yBear
 */
@Configuration
public class ThreadPoolConfig {
    @Bean
    ThreadPoolTaskExecutor getSpringThreadPool(){
        ThreadPoolTaskExecutor taskExecutor = new ThreadPoolTaskExecutor();
        taskExecutor.setCorePoolSize(10);
        taskExecutor.setMaxPoolSize(1000);
        taskExecutor.setThreadNamePrefix("spring-task-");
        return taskExecutor;
    }
}
