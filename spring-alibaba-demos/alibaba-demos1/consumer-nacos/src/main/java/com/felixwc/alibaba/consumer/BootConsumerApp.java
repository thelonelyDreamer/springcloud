package com.felixwc.alibaba.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * in order to learn java!
 * created at 2022/3/3 11:53
 *
 * @author wangchao
 */
@SpringBootApplication
@EnableFeignClients
public class BootConsumerApp {
    public static void main(String[] args) {
        SpringApplication.run(BootConsumerApp.class,args);
    }
}
