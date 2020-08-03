package com.my.structure.facade;

import com.my.structure.decorator.BagDecorator;
import com.my.structure.decorator.MarkBagDecorator;
import com.my.structure.decorator.ReinforceBagDecorator;
import com.my.structure.decorator.SpeedBagDecorator;
import com.my.structure.entity.AppleBag;
import com.my.structure.entity.Bag;

/**
 * 打包服务
 */
public class PackService {
    public void doPack(){
        //用苹果箱子
        Bag bag = new AppleBag();
        BagDecorator bagDecorator = new BagDecorator(bag);
        //打防伪标记
        bagDecorator = new MarkBagDecorator(bagDecorator);
        //加固
        bagDecorator = new ReinforceBagDecorator(bagDecorator);
        //加急
        bagDecorator = new SpeedBagDecorator(bagDecorator);
        //开始打包
        bagDecorator.pack();
    }

    public void doOther(){
        System.out.println("一些其他服务");
    }
}
