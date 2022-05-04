package com.feliwc.nacos.config.controller;

import com.alibaba.nacos.api.config.annotation.NacosConfigurationProperties;
import com.alibaba.nacos.api.config.annotation.NacosValue;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * in order to learn java!
 * created at 2022/4/25 20:34
 *
 * @author felixwc
 */
@RestController
@RequestMapping("/hello")
@AllArgsConstructor
@Data
@NoArgsConstructor
public class HelloController {
    @Value("${my.str1:default-test}")
    private String str1;
    @NacosValue(autoRefreshed = true,value = "${my.str2:str2}")
    private String str2;
    @RequestMapping("/str1")
    public String test1(){
        return str1;
    }

    @RequestMapping("/str2")
    public String test2(){
        return str2;
    }
}
