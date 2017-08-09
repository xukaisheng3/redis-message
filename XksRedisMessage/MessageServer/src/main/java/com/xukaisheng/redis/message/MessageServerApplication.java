package com.xukaisheng.redis.message;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author: xks
 * @date: 2017/8/9
 * @time: 14:54
 * @description:
 */
@SpringBootApplication
public class MessageServerApplication {
    private static final Logger LOGGER = LoggerFactory.getLogger(MessageServerApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(MessageServerApplication.class, args);
    }
}
