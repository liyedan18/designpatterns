package com.my.structure.proxy;

import com.my.structure.proxy.service.OrderService;
import com.my.structure.proxy.service.impl.LocalOrderServiceImpl;

public class Client {
    public static void main(String[] args) {
        //买本地水果
        OrderService orderService = new LocalOrderServiceImpl();
        orderService.saveOrder();

        //买外国水果
        orderService = new ProxyOrder();
        orderService.saveOrder();
    }
}
