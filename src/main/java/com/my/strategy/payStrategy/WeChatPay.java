package com.my.strategy.payStrategy;

public class WeChatPay implements PayStrategy {
    @Override
    public void pay(int price) {
        System.out.println(price + "元，用微信支付了！");
    }
}
