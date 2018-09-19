package org.esun.provider;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 *
 * 将服务提供者注册到注册中心
 *   1、引入dubbo和zkclient相关依赖
 *   2、配置dubbo的扫描包和注册中心地址
 *   3、使用@Service发布服务
 *
 *
 *
 *
 * 1）,将服务provider注册到注册中心，需要在pom文件中引入dubbo
 *    https://github.com/apache/incubator-dubbo-spring-boot-project-->
 *         <dependency>
 *             <groupId>com.alibaba.boot</groupId>
 *             <artifactId>dubbo-spring-boot-starter</artifactId>
 *             <version>0.2.0</version>
 *         </dependency>
 *
 * 2）,由于dubbo 要用到zookeeper，所以要引入zookeeper的客户端工具 zkclient
 *         https://mvnrepository.com/artifact/com.101tec/zkclient
 *         <dependency>
 *             <groupId>com.101tec</groupId>
 *             <artifactId>zkclient</artifactId>
 *             <version>0.10</version>
 *         </dependency>
 *
 * 3）, application.properties中配置：
 *      dubbo.application.name=provider-ticket
 *      dubbo.registry.address=zookeeper://localhsot:2181
 *      dubbo.scan.base-packages=org.esun.provider.service
 *
 *
 * 4）, 在TicketServiceImpl上打注解@Service  ，将服务发布出去
 *    是这个com.alibaba.dubbo.config.annotation.Service
 *
 *
 *
 *
 *
 */


//看说明  https://github.com/alibaba/dubbo-spring-boot-starter/blob/master/README_zh.md

@SpringBootApplication
@EnableDubboConfiguration
public class ProviderTicketApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderTicketApplication.class, args);
    }
}
