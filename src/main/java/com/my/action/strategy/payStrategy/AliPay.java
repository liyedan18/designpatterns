package com.my.action.strategy.payStrategy;

public class AliPay implements PayStrategy {
    @Override
    public void pay(int price) {
        System.out.println(price + "元，用支付宝支付了！");
    }
}
