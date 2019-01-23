package com.redis.service;

import org.springframework.stereotype.Service;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisCluster;

import javax.annotation.Resource;


/**
 * @author F1yBear
 * @since   2018/01/22
 */
@Service
public class RedisService {
    @Resource
    private JedisCluster jedisCluster;

    public String getKey(String key) {
        return jedisCluster.get(key);
    }

}
