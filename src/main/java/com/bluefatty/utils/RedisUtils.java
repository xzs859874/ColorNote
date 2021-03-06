package com.bluefatty.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * Redis常用的操作
 *
 * @author PomZWJ
 * @github https://github.com/PomZWJ
 * @date 2019-10-15
 */
@Component
public class RedisUtils {
    @Autowired
    private RedisTemplate<Object, Object> redisTemplate;

    public void cacheString(String key, String value, long expire, TimeUnit timeUnit) {
        this.redisTemplate.opsForValue().set(key, value, expire, timeUnit);
    }

    public String getCacheString(String key) {
        Object value = this.redisTemplate.opsForValue().get(key);
        return StringUtils.getValue(value);
    }

    public void deleteCache(String key) {
        this.redisTemplate.delete(key);
    }

    public void cacheMap(String key, Map value, long expire, TimeUnit timeUnit) {
        redisTemplate.opsForValue().set(key,value,expire,timeUnit);
    }

    public Map getCacheMap(String key) {
        Object value = this.redisTemplate.opsForValue().get(key);
        return (Map)value;
    }

}
