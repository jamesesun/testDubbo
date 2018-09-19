package org.esun.consumer;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


// https://github.com/alibaba/dubbo-spring-boot-starter/blob/master/README_zh.md

@SpringBootApplication
@EnableDubboConfiguration
public class ConsumerUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerUserApplication.class, args);

    }
}
