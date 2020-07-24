package com.my.action.strategy.payStrategy;

public class QQPay implements PayStrategy {
    @Override
    public void pay(int price) {
        System.out.println(price + "元，用QQ支付了！");
    }
}
