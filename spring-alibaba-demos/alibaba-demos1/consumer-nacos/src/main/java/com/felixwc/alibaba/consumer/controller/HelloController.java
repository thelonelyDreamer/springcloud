package com.felixwc.alibaba.consumer.controller;

import com.felixwc.alibaba.consumer.feign.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * in order to learn java!
 * created at 2022/3/3 11:55
 *
 * @author wangchao
 */
@RestController
@RequestMapping("/test")
public class HelloController {
    @Autowired
    private ProviderService providerService;

    @GetMapping("/test/{id}")
    public String getString(@PathVariable("id")String id){
        String hello = providerService.getHello(id);
        return hello;
    }
}
