package com.my.strategy;

import com.my.strategy.payStrategy.WeChatPay;

public class Client {
    public static void main(String[] args) {
        ShopCart shopCart = new ShopCart();
        WeChatPay weChatPay = new WeChatPay();
        shopCart.setPayStrategy(weChatPay);
        shopCart.payment(200);
    }
}
