package com.felixwc.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * in order to learn java!
 * created at 2022/5/6 15:53
 *
 * @author felixwc
 */
@RestController
@RequestMapping("/hello")
public class HelloController {
    @Value("${spring.application.name}")
    private String serviceName;
    @RequestMapping("/{msg}")
    public String test1(@PathVariable String msg){
        return serviceName+msg;
    }
}
