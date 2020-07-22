package com.my.strategy;

import com.my.strategy.payStrategy.PayStrategy;

/**
 * 可以由多个算法实现的类
 * 购物车，包含对付款方式的引用
 * 要调用付款方法
 */
public class ShopCart {
    private PayStrategy payStrategy;

    public void setPayStrategy(PayStrategy payStrategy) {
        this.payStrategy = payStrategy;
    }

    //付款
    //像是观察者模式的简单版本
    public void payment(int price){
        payStrategy.pay(price);
    }
}
