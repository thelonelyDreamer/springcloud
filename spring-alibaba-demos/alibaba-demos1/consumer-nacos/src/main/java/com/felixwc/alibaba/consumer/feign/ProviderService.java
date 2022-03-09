package com.felixwc.alibaba.consumer.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "provider-nacos",path = "/hello")
public interface ProviderService {
    @RequestMapping("/hello/{id}")
    String getHello(@PathVariable("id") String id);
}
