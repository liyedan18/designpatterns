package com.my.structure.proxy;

import com.my.structure.proxy.service.OrderService;
import com.my.structure.proxy.service.impl.ThirdRemoteOrderServiceImpl;

/**
 * （外国/第三方）订单代理类
 *  代理类可以获取到第三方接口，也就是能找到外国水果商。
 */
public class ProxyOrder implements OrderService {
    //获取外国水果商，下订单
    private OrderService orderService = new ThirdRemoteOrderServiceImpl();

    @Override
    public void saveOrder() {
        System.out.println("买外国水果啦，我们是代理，找外国水果商下订单。。。");
        orderService.saveOrder();
    }
}
