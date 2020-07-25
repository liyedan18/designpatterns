package com.my.structure.decorator;

import com.my.structure.entity.Bag;

/**
 * 装饰器类的父类
 * 内部维护了被装饰类的引用，同时实现了被装饰类
 *
 * 用于装饰bag中的pack()方法
 */
public class BagDecorator implements Bag {
    private Bag bag;

    public BagDecorator(Bag bag){
        this.bag = bag;
    }

    @Override
    public void pack() {
        bag.pack();
    }
}
