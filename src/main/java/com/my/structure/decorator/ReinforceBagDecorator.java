package com.my.structure.decorator;

import com.my.structure.entity.Bag;

public class ReinforceBagDecorator extends BagDecorator {
    public ReinforceBagDecorator(Bag bag) {
        super(bag);
    }

    @Override
    public void pack(){
        super.pack();
        System.out.println("打包的时候进行了加固！！不怕摔啦！！");
    }
}
