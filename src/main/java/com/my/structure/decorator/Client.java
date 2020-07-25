package com.my.structure.decorator;

import com.my.structure.entity.AppleBag;
import com.my.structure.entity.Bag;

public class Client {
    public static void main(String[] args) {
        //开始打包苹果
        Bag bag = new AppleBag();
        //只打包，不加特技装饰
        BagDecorator bagDecorator = new BagDecorator(bag);
//        bagDecorator.pack();
        //注意这里不是bag，要传入装饰器才能形成装饰链或者相互装饰
//        bagDecorator = new MarkBagDecorator(bag);
        //防伪标记
        bagDecorator = new MarkBagDecorator(bagDecorator);
        //加固
        bagDecorator = new ReinforceBagDecorator(bagDecorator);
        //加急
        bagDecorator = new SpeedBagDecorator(bagDecorator);
        bagDecorator.pack();
    }
}
