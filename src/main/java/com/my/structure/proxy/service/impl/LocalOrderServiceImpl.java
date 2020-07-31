package com.my.structure.proxy.service.impl;

import com.my.structure.proxy.service.OrderService;

/**
 * 本地订单实现类
 * 正常情况下，不买外国水果，都会调用这个类。
 * 水果店自己可以处理
 */
public class LocalOrderServiceImpl implements OrderService {
    @Override
    public void saveOrder() {
        System.out.println("本地水果，我们水果店自己下订单。。。自己处理。。。");
    }
}
