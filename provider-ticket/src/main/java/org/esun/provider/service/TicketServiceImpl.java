package org.esun.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

/**
 * @author cjhstart
 * @create 2018-09-16 9:16
 */



@Service(interfaceClass = TicketService.class) //将服务发布出去
@Component
public class TicketServiceImpl implements TicketService {
    @Override
    public String getTicket() {
        return "《厉害了，我的国》";
    }
}
