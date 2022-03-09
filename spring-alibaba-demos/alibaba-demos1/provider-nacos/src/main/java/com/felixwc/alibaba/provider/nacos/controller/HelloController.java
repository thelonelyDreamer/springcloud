package com.felixwc.alibaba.provider.nacos.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * in order to learn java!
 * created at 2022/3/3 11:37
 *
 * @author wangchao
 */
@RestController
@RequestMapping("/hello")
public class HelloController {
    @RequestMapping("/hello/{id}")
    public String getHello(@PathVariable("id")String id){
        return "hello"+id;
    }
}
