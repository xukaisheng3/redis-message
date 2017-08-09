package com.xukaisheng.redis.message.vo;

import java.util.concurrent.CountDownLatch;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.xukaisheng.redis.message.config.RedisMessageConfig;

/**
 * @author: xks
 * @date: 2017/8/9
 * @time: 16:52
 * @description:
 */
public class Receiver {
    private static final Logger LOGGER = LoggerFactory.getLogger(RedisMessageConfig.class);

    private CountDownLatch countDownLatch;

    public Receiver(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }

    public void receiverMessage(String message){
        LOGGER.info("receiver server message <"+message+" >");
        countDownLatch.countDown();
    }
}
