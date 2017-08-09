package com.xukaisheng.redis.message;

import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author: xks
 * @date: 2017/8/9
 * @time: 16:57
 * @description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = MessageServerApplication.class)
@ActiveProfiles("test")
public class JunitTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(JunitTest.class);
    @Autowired
    private StringRedisTemplate template;
    @Autowired
    private CountDownLatch latch;
    @Test
    public void exampleTest() throws InterruptedException {
            template.convertAndSend("xukaisheng", "广播方式");
            latch.await();
        System.exit(0);
    }
}
