package com.example.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Properties;

//@ResponseBody
//@Controller
@RestController
public class HelloController {

    @Autowired
    StringRedisTemplate redisTemplate;

    @GetMapping("/hello")
    public String hello() {

        return "Hello, Spring Boot 3!";
    }

    @GetMapping("/incr")
    public String incr() {
        Long haha = redisTemplate.opsForValue().increment("haha");
        return "增加後的值為: " + haha;
    }

    @GetMapping("/redis/info")
    public String getRedisInfo() {
        Properties infoProperties = redisTemplate.execute((RedisConnection connection) -> connection.info());
        StringBuilder infoBuilder = new StringBuilder();
        for (String propertyName: infoProperties.stringPropertyNames()) {
            String propertyValue = infoProperties.getProperty(propertyName);
            infoBuilder.append(propertyName).append(": ").append(propertyValue).append("\n");
        }
        return infoBuilder.toString().replace("\n", "<br>");
    }
}
