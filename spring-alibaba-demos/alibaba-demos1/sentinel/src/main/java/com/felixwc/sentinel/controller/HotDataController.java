package com.felixwc.sentinel.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * in order to learn java!
 * created at 2022/3/13 13:55
 *
 * @author wangchao
 */
@RestController
@RequestMapping("/hot")
public class HotDataController {

    @GetMapping("/get/{id}")
    @SentinelResource(value = "getById",blockHandler = "HotBlockHandler")
    public String getById(@PathVariable int id) throws InterruptedException {
        Thread.sleep(50);
        return String.valueOf(id);
    }

    public String HotBlockHandler(@PathVariable int id, BlockException e){
        return "热点处理异常";
    }
}
