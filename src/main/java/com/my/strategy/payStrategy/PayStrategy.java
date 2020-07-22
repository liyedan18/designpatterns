package com.my.strategy.payStrategy;

/**
 * 支付策略接口，包含所有支付方式的通用方法
 */
public interface PayStrategy {
    void pay(int price);
}
