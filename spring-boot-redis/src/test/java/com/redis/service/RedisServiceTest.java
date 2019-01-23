package com.redis.service;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisServiceTest {
    @Resource
    private RedisService redisService;

    @Test
    public  void getKeyTest(){
        System.out.println(redisService.getKey("love"));
    }

}