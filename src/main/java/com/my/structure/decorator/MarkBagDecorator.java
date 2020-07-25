package com.my.structure.decorator;

import com.my.structure.entity.Bag;

public class MarkBagDecorator extends BagDecorator {
    //为了形成链式装饰
    public MarkBagDecorator(Bag bag) {
        super(bag);
    }

    //装饰防伪标志
    @Override
    public void pack(){
        super.pack();
        System.out.println("打包增加了防伪标志！！不怕假冒！！");
    }
}
