package com.gxl.blog.redis;

import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Created by XiaoLei Guo on 2017/6/15.
 */
@Component("zSetRedis")
public class ZSetRedis {

    @Resource
    private StringRedisTemplate redisTemplate;

}
