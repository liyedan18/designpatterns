package com.my.structure.proxy.service.impl;

import com.my.structure.proxy.service.OrderService;

/**
 * 第三方（外国）订单实现类。
 * 顾客买了外国水果，我们就找外国水果商下订单，然后打包好寄回给我们
 * 本地自己获取不到这个类。因为我们自己没有外国水果。只能代理。
 */

public class ThirdRemoteOrderServiceImpl implements OrderService {
    @Override
    public void saveOrder() {
        System.out.println("收到订单了。。俺们泰国水果商已经在处理订单了。。");
    }
}
