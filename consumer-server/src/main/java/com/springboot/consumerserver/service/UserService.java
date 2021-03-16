package com.springboot.consumerserver.service;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

@Service
public class UserService {
   //要拿到provider提供的票,要去注册中心拿到服务
    @Reference
   com.springboot.providerserver.service.TicketService TicketService;

   public void  buyTicket(){
        System.out.println("在注册中心拿到"+TicketService.getTiket());
    }

}
