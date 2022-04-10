package com.fancy.autoconfigure;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

/**
 * @author fancy
 * @date 2022/4/9 21:19
 */
@Configuration(proxyBeanMethods = false)
@EnableFeignClients(basePackages = {"com.fancy.api"})
public class feignStudyAutoConfigure {

//    @Bean
//    public String feignStudyUrl(Environment environment) {
//
//        return "";
//    }
}