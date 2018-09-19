package org.esun.consumer.service;

import com.alibaba.dubbo.config.annotation.Reference;
import org.esun.provider.service.TicketService;
import org.springframework.stereotype.Service;

/**
 * @author cjhstart
 * @create 2018-09-16 9:18
 */

//reference标注的对象不会被spring容器管理，是无法通过factory.getBean获取的
//reference注解生成的实例就没有交给spring容器去管理，而只是作为spring管理bean的一个属性赋值操作，通过反射来实现
@Service
public class UserService {

    @Reference(url = "dubbo://127.0.0.1:20880")
    TicketService ticketService;

    public void  hello(){
        System.out.println("--------------> test 1 ");

        String ticket = ticketService.getTicket();
        System.out.println("买到票了 ："+ticket);

    }



}
