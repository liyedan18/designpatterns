package com.my.structure.decorator;

import com.my.structure.entity.Bag;

public class SpeedBagDecorator extends BagDecorator {
    public SpeedBagDecorator(Bag bag) {
        super(bag);
    }

    @Override
    public void pack(){
        super.pack();
        System.out.println("打包的时候贴上了加急标签！！快递小哥快点送！！");
    }
}
