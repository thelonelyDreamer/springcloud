package com.feliwc.nacos.config;

import com.alibaba.nacos.api.config.annotation.NacosConfigurationProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * in order to learn java!
 * created at 2022/3/3 14:00
 *
 * @author wangchao
 */
@SpringBootApplication
@NacosConfigurationProperties(dataId = "nacos-config",autoRefreshed = true)
public class BootNacosConfig {
    public static void main(String[] args) {
        SpringApplication.run(BootNacosConfig.class,args);
    }
}
