package com.felixwc.consul.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * in order to learn java!
 * created at 2022/3/2 03:29
 *
 * @author wangchao
 */
@SpringBootApplication
@RestController
public class BootStartApp {
    @GetMapping("/")
    public String home() {
        return "Hello World!";
    }
    public static void main(String[] args) {
        SpringApplication.run(BootStartApp.class,args);
    }
}
