package com.felixwc.sentinel.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * in order to learn java!
 * created at 2022/3/13 11:56
 *
 * @author wangchao
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping("/test")
    public String test1(){
        return "hello";
    }
}
